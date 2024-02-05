package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteEdgeInput;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteInput;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteJoin;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteBackwardNavigation;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteDomainFilter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteIndexer;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteNavigation;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteJoin;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteKeyProjection;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteMarkingAssignment;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteMarkingFilter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteVertexInput;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteResultProvider;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteUnion;
import de.mdelab.mlsdm.incremental.rete.util.ReteUtil;
import de.mdelab.mlstorypatterns.StoryPatternLink;

public class LocalizedReteAdapter {

	public static final boolean FILTER_RESULTS = false;
	
	public ReteNet adaptReteNet(ReteNet r) {
		Map<ReteNode, Integer> heights = computeHeights(r);
		Set<ReteJoin> joins = getJoins(r);
		Set<ReteEdgeInput> edgeInputs = getEdgeInputs(r);
		
		//create persistent RETE structure
		Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses = createLNSes(edgeInputs, heights.get(r.getRoot()) + 1);
		Map<ReteJoin, MarkingSensitiveReteJoin> markingSensitiveJoins = createJoins(joins);
		Set<MarkingSensitiveReteIndexer> dependencyIndexers = createDependencyIndexers(lnses, markingSensitiveJoins);
		Set<ReteRequestProjectionStructure> rpses = createRPSes(lnses, markingSensitiveJoins, heights);
		createDomainFilters(lnses);
		
		//create ReteNet and add nodes
		ReteNet persistentRete = new ReteNet();
		for(ReteLocalNavigationStructure lns:lnses.values()) {
			persistentRete.addNodes(lns.getNodes());
		}
		persistentRete.addNodes(markingSensitiveJoins.values());
		persistentRete.addNodes(dependencyIndexers);
		for(ReteRequestProjectionStructure rps:rpses) {
			persistentRete.addNodes(rps.getNodes());
		}
		
		//set ReteNet root
		ReteNode effectiveRoot = getEffectiveDependency(r.getRoot());
		ReteNode persistentRoot = markingSensitiveJoins.containsKey(effectiveRoot) ?
				markingSensitiveJoins.get(effectiveRoot) :
				lnses.get(effectiveRoot).getUnion();
		
		MarkingSensitiveReteResultProvider resultProvider = new MarkingSensitiveReteResultProvider();
		resultProvider.setTableMask(persistentRoot.getTableMask());
		persistentRete.setRoot(resultProvider);
		
		if(FILTER_RESULTS) {
			MarkingSensitiveReteMarkingFilter resultFilter = new MarkingSensitiveReteMarkingFilter(heights.get(r.getRoot()));
			resultFilter.setTableMask(persistentRoot.getTableMask());
			persistentRoot.addSuccessor(resultFilter);
			resultFilter.addSuccessor(resultProvider);
		}
		else {
			persistentRoot.addSuccessor(resultProvider);
		}
		
		return persistentRete;
	}

	private Map<ReteNode, Integer> computeHeights(ReteNet r) {
		Map<ReteNode, Integer> heights = new LinkedHashMap<ReteNode, Integer>();
		computeHeights(r.getRoot(), heights);
		return heights;
	}

	private void computeHeights(ReteNode root, Map<ReteNode, Integer> heights) {
		int ownHeight = root.isJoin() ? 1 : 0;
		int maxPredecessorHeight = 0;
		
		for(ReteNode predecessor:root.getPredecessors()) {
			computeHeights(predecessor, heights);
			maxPredecessorHeight = Math.max(maxPredecessorHeight, heights.get(predecessor));
		}
		
		heights.put(root, maxPredecessorHeight + ownHeight);
	}

	private Map<ReteEdgeInput, ReteLocalNavigationStructure> createLNSes(Collection<ReteEdgeInput> edgeInputs, Integer pseudoInfinity) {
		Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses = new LinkedHashMap<ReteEdgeInput, ReteLocalNavigationStructure>();
		for(ReteEdgeInput node:edgeInputs) {
			ReteLocalNavigationStructure lns = createLNS((ReteEdgeInput) node, pseudoInfinity);
			lnses.put((ReteEdgeInput) node, lns);
		}
		return lnses;
	}

	private ReteLocalNavigationStructure createLNS(ReteEdgeInput edgeInput, int pseudoInfinity) {
		StoryPatternLink link = edgeInput.getLink();
		
		int sourceIndex = findVertex(0, edgeInput.getTableMask());
		int targetIndex = findVertex(1, edgeInput.getTableMask());

		//create table masks
		int[] sourceTableMask = ReteUtil.createEmptyTableMask(edgeInput.getTableMask().length);
		sourceTableMask[sourceIndex] = 0;
		
		int[] targetTableMask = ReteUtil.createEmptyTableMask(edgeInput.getTableMask().length);
		targetTableMask[targetIndex] = 0;
		
		int[] navigationTableMask = ReteUtil.createEmptyTableMask(edgeInput.getTableMask().length);
		navigationTableMask[sourceIndex] = 0;
		navigationTableMask[targetIndex] = 1;
		
		//forward navigation
		MarkingSensitiveReteVertexInput sourceInput = new MarkingSensitiveReteVertexInput(link.getSource(), pseudoInfinity);
		sourceInput.setTableMask(sourceTableMask);

		int[] sourceMask = {0};
		MarkingSensitiveReteIndexer sourceIndexer = new MarkingSensitiveReteIndexer(sourceMask, 1);
		sourceInput.setTableMask(sourceTableMask);
		sourceInput.addSuccessor(sourceIndexer);

		MarkingSensitiveReteNavigation forwardNavigation = new MarkingSensitiveReteNavigation(link, sourceIndexer);
		forwardNavigation.setTableMask(navigationTableMask);
		sourceIndexer.addSuccessor(forwardNavigation);

		int[] navigationMask = {0, 1};
		MarkingSensitiveReteIndexer forwardNavigationIndexer = new MarkingSensitiveReteIndexer(navigationMask, 2);
		forwardNavigationIndexer.setTableMask(navigationTableMask);
		forwardNavigation.addSuccessor(forwardNavigationIndexer);
		
		//backward navigation
		MarkingSensitiveReteVertexInput targetInput = new MarkingSensitiveReteVertexInput(link.getTarget(), pseudoInfinity);
		targetInput.setTableMask(targetTableMask);
		
		int[] targetMask = {0};
		MarkingSensitiveReteIndexer targetIndexer = new MarkingSensitiveReteIndexer(targetMask, 1);
		targetIndexer.setTableMask(targetTableMask);
		targetInput.addSuccessor(targetIndexer);
		
		MarkingSensitiveReteBackwardNavigation backwardNavigation = new MarkingSensitiveReteBackwardNavigation(link, targetIndexer);
		backwardNavigation.setTableMask(navigationTableMask);
		targetIndexer.addSuccessor(backwardNavigation);

		MarkingSensitiveReteIndexer backwardNavigationIndexer = new MarkingSensitiveReteIndexer(navigationMask, 2);
		backwardNavigationIndexer.setTableMask(navigationTableMask);
		backwardNavigation.addSuccessor(backwardNavigationIndexer);
		
		//union
		MarkingSensitiveReteUnion union = new MarkingSensitiveReteUnion(forwardNavigationIndexer, backwardNavigationIndexer);
		union.setTableMask(navigationTableMask);
		forwardNavigationIndexer.addSuccessor(union);
		backwardNavigationIndexer.addSuccessor(union);

		//LNS
		ReteLocalNavigationStructure lns = new ReteLocalNavigationStructure();
		
		lns.setSourceInput(sourceInput);
		lns.setTargetInput(targetInput);
		lns.setForwardNavigation(forwardNavigation);
		lns.setBackwardNavigation(backwardNavigation);
		lns.setUnion(union);
		
		lns.addNode(sourceIndexer);
		lns.addNode(targetIndexer);
		lns.addNode(forwardNavigationIndexer);
		lns.addNode(backwardNavigationIndexer);

		return lns;
	}

	private Map<ReteJoin, MarkingSensitiveReteJoin> createJoins(Set<ReteJoin> joins) {
		Map<ReteJoin, MarkingSensitiveReteJoin> markingSensitiveJoins = new LinkedHashMap<ReteJoin, MarkingSensitiveReteJoin>();
		for(ReteJoin join:joins) {
			MarkingSensitiveReteJoin markingSensitiveJoin = new MarkingSensitiveReteJoin(join.getJoinSize());
			markingSensitiveJoin.setTableMask(join.getTableMask());
			markingSensitiveJoins.put(join, markingSensitiveJoin);
		}
		return markingSensitiveJoins;
	}

	private Set<MarkingSensitiveReteIndexer> createDependencyIndexers(Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses,
			Map<ReteJoin, MarkingSensitiveReteJoin> markingSensitiveJoins) {
		Set<MarkingSensitiveReteIndexer> indexers = new LinkedHashSet<MarkingSensitiveReteIndexer>();
		for(Entry<ReteJoin, MarkingSensitiveReteJoin> entry:markingSensitiveJoins.entrySet()) {
			ReteJoin join = entry.getKey();
			MarkingSensitiveReteJoin markingSensitiveJoin = entry.getValue();

			//connect left dependency
			MarkingSensitiveReteIndexer leftIndexer = createDependencyIndexer(join, join.getLeftIndexer(), markingSensitiveJoin, lnses, markingSensitiveJoins);
			markingSensitiveJoin.setLeftIndexer(leftIndexer);
			indexers.add(leftIndexer);

			//connect right dependency
			MarkingSensitiveReteIndexer rightIndexer = createDependencyIndexer(join, join.getRightIndexer(), markingSensitiveJoin, lnses, markingSensitiveJoins);
			markingSensitiveJoin.setRightIndexer(rightIndexer);
			indexers.add(rightIndexer);
		}
		return indexers;
	}

	private MarkingSensitiveReteIndexer createDependencyIndexer(ReteJoin join, ReteIndexer indexer, MarkingSensitiveReteJoin markingSensitiveJoin,
			Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses,
			Map<ReteJoin, MarkingSensitiveReteJoin> markingSensitiveJoins) {
		ReteNode dependency = getEffectiveDependency(indexer);
		ReteNode newDependency = dependency.isJoin() ?
				markingSensitiveJoins.get(dependency) :
				lnses.get(dependency).getUnion();
		
		MarkingSensitiveReteIndexer newIndexer = new MarkingSensitiveReteIndexer(indexer.getMask(), indexer.getKeySize());
		newIndexer.setTableMask(indexer.getTableMask());
		newDependency.addSuccessor(newIndexer);
		
		return newIndexer;
	}

	private Set<ReteRequestProjectionStructure> createRPSes(Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses,
			Map<ReteJoin, MarkingSensitiveReteJoin> markingSensitiveJoins, Map<ReteNode, Integer> heights) {
		Set<ReteRequestProjectionStructure> rpses = new LinkedHashSet<ReteRequestProjectionStructure>();
		for(Entry<ReteJoin, MarkingSensitiveReteJoin> entry:markingSensitiveJoins.entrySet()) {
			MarkingSensitiveReteJoin markingSensitiveJoin = entry.getValue();
			
			ReteJoin join = entry.getKey();
			int junctionVertex = findJunctionVertex(join);
			
			ReteEdgeInput rightInput = findKeyPredecessorInput(junctionVertex, join.getRightIndexer());
			ReteRequestProjectionStructure leftRPS = createRPS(junctionVertex, lnses.get(rightInput),
					(MarkingSensitiveReteIndexer) markingSensitiveJoin.getLeftIndexer(), heights.get(join));
			rpses.add(leftRPS);
			
			ReteEdgeInput leftInput = findKeyPredecessorInput(junctionVertex, join.getLeftIndexer());
			ReteRequestProjectionStructure rightRPS = createRPS(junctionVertex, lnses.get(leftInput),
					(MarkingSensitiveReteIndexer) markingSensitiveJoin.getRightIndexer(), heights.get(join));
			rpses.add(rightRPS);
		}
		return rpses;
	}

	private ReteRequestProjectionStructure createRPS(int junctionVertex,
			ReteLocalNavigationStructure lns, MarkingSensitiveReteIndexer indexer, int height) {
		int[] projectionTableMask = ReteUtil.createEmptyTableMask(indexer.getTableMask().length);
		projectionTableMask[junctionVertex] = 0;
		
		MarkingSensitiveReteMarkingFilter filter = new MarkingSensitiveReteMarkingFilter(height);
		filter.setTableMask(indexer.getTableMask());
		indexer.addSuccessor(filter);
		
		MarkingSensitiveReteIndexer filterIndexer = new MarkingSensitiveReteIndexer(ReteUtil.createIdentityMask(indexer.getMask().length), 1);
		filterIndexer.setTableMask(indexer.getTableMask());
		filter.addSuccessor(filterIndexer);
		
		MarkingSensitiveReteKeyProjection projection = new MarkingSensitiveReteKeyProjection(filterIndexer);
		projection.setTableMask(projectionTableMask);
		filterIndexer.addSuccessor(projection);
		
		int[] projectionMask = {0};
		MarkingSensitiveReteIndexer projectionIndexer = new MarkingSensitiveReteIndexer(projectionMask, 1);
		projectionIndexer.setTableMask(projectionTableMask);
		projection.addSuccessor(projectionIndexer);
		
		MarkingSensitiveReteMarkingAssignment assignment = new MarkingSensitiveReteMarkingAssignment(height, projectionIndexer);
		assignment.setTableMask(projectionTableMask);
		projectionIndexer.addSuccessor(assignment);
		
		MarkingSensitiveReteIndexer assignmentIndexer = new MarkingSensitiveReteIndexer(projectionMask, 1);
		assignmentIndexer.setTableMask(projectionTableMask);
		assignment.addSuccessor(assignmentIndexer);
		
		MarkingSensitiveReteIndexer inputIndexer = getInputIndexer(junctionVertex, lns);
		MarkingSensitiveReteNavigation navigation = (MarkingSensitiveReteNavigation) inputIndexer.getSuccessors().get(0);
		
		MarkingSensitiveReteUnion union = new MarkingSensitiveReteUnion(assignmentIndexer, inputIndexer);
		union.setTableMask(projectionTableMask);
		assignmentIndexer.addSuccessor(union);
		inputIndexer.removeSuccessor(navigation);
		inputIndexer.addSuccessor(union);
		
		MarkingSensitiveReteIndexer unionIndexer = new MarkingSensitiveReteIndexer(projectionMask, 1);
		unionIndexer.setTableMask(projectionTableMask);
		union.addSuccessor(unionIndexer);
		
		unionIndexer.addSuccessor(navigation);
		navigation.setInputIndexer(unionIndexer);
		
		ReteRequestProjectionStructure rps = new ReteRequestProjectionStructure();
		rps.addNode(filterIndexer);
		rps.addNode(projectionIndexer);
		rps.addNode(assignmentIndexer);
		rps.addNode(unionIndexer);
		rps.addNode(union);
		
		rps.setFilter(filter);
		rps.setProjection(projection);
		rps.setAssignment(assignment);
		
		return rps;
	}

	private void createDomainFilters(Map<ReteEdgeInput, ReteLocalNavigationStructure> lnses) {
		for(Entry<ReteEdgeInput, ReteLocalNavigationStructure> entry:lnses.entrySet()) {
			ReteLocalNavigationStructure lns = entry.getValue();
			
			StoryPatternLink link = entry.getKey().getLink();
			
			//account for type inheritance
			EClass sourceClass = (EClass) link.getSource().getType();
			EClass targetClass = (EClass) link.getTarget().getType();

			ReteNode targetIndexer = lns.getBackwardNavigation().getInputIndexer();

			createDomainFilter(targetClass, 0, targetIndexer.getPredecessors().get(0), lns);
			createDomainFilter(targetClass, 1, lns.getUnion(), lns);
				
			ReteNode sourceIndexer = lns.getForwardNavigation().getInputIndexer();
				
			createDomainFilter(sourceClass, 0, sourceIndexer.getPredecessors().get(0), lns);
			createDomainFilter(sourceClass, 0, lns.getUnion(), lns);
		}
		
	}
	
	private void createDomainFilter(EClass classifier, int index, ReteNode predecessor, ReteLocalNavigationStructure lns) {
		MarkingSensitiveReteDomainFilter filter = new MarkingSensitiveReteDomainFilter(classifier, index);
		filter.setTableMask(predecessor.getTableMask());
		
		for(ReteNode successor:new ArrayList<ReteNode>(predecessor.getSuccessors())) {
			predecessor.removeSuccessor(successor);
			filter.addSuccessor(successor);
		}
		
		predecessor.addSuccessor(filter);
		
		lns.addNode(filter);
	}

	private int findJunctionVertex(ReteJoin join) {
		return findVertex(0, join.getTableMask());
	}

	private int findVertex(int index, int[] tableMask) {
		for(int i = 0; i < tableMask.length; i++) {
			if(tableMask[i] == index) {
				return i;
			}
		}
		return -1;
	}

	private ReteNode getPredecessorForVertex(int vertex, ReteNode node) {
		for(ReteNode predecessor:node.getPredecessors()) {
			if(predecessor.getTableMask()[vertex] != ReteUtil.NO_MAPPING) {
				return predecessor;
			}
		}
		return null;
	}

	private MarkingSensitiveReteIndexer getInputIndexer(int junctionVertex, ReteLocalNavigationStructure lns) {
		return lns.getSourceInput().getTableMask()[junctionVertex] != ReteUtil.NO_MAPPING ?
				(MarkingSensitiveReteIndexer) lns.getForwardNavigation().getPredecessors().get(0) :
				(MarkingSensitiveReteIndexer) lns.getBackwardNavigation().getPredecessors().get(0);
	}

	private ReteNode getEffectiveDependency(ReteNode candidate) {
		while(!candidate.isJoin() && !isEdgeInput(candidate)) {
			candidate = candidate.getPredecessors().get(0);
		}
		return candidate;
	}

	private boolean isEdgeInput(ReteNode node) {
		return node.isInput() && ((ReteInput) node).isEdge();
	}

	private Set<ReteJoin> getJoins(ReteNet r) {
		Set<ReteJoin> joins = new LinkedHashSet<ReteJoin>();
		for(ReteNode node:r.getNodes().values()) {
			if(node.isJoin()) {
				joins.add((ReteJoin) node);
			}
		}
		return joins;
	}

	private Set<ReteEdgeInput> getEdgeInputs(ReteNet r) {
		Set<ReteEdgeInput> edgeInputs = new LinkedHashSet<ReteEdgeInput>();
		for(ReteNode node:r.getNodes().values()) {
			if(isEdgeInput(node)) {
				edgeInputs.add((ReteEdgeInput) node);
			}
		}
		return edgeInputs;
	}

	private ReteEdgeInput findKeyPredecessorInput(int junctionVertex, ReteIndexer indexer) {
		ReteNode candidate = indexer;
		while(!isEdgeInput(candidate)) {
			candidate = getPredecessorForVertex(junctionVertex, candidate);
		}
		return (ReteEdgeInput) candidate;
	}

}
