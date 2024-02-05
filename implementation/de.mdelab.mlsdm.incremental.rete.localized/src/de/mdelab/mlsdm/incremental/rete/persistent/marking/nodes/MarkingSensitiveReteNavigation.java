package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.mdelab.mlsdm.incremental.change.SDMChangeEvent;
import de.mdelab.mlsdm.incremental.change.SDMEdgeChange;
import de.mdelab.mlsdm.incremental.change.SDMChangeEvent.SDMChangeEnum;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteTupleGenerator;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.DynamicChangeListener;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute.MarkingSensitiveReteNavigationExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteUtil;
import de.mdelab.mlstorypatterns.StoryPatternLink;

public class MarkingSensitiveReteNavigation extends ReteTupleGenerator implements DynamicChangeListener, MarkingSensitiveReteNode {

	protected StoryPatternLink link;
	protected ReteIndexer inputIndexer;
	
	protected PersistentReteQueryManager queryManager;
	
	public MarkingSensitiveReteNavigation(StoryPatternLink link, ReteIndexer inputIndexer) {
		this.link = link;
		this.inputIndexer = inputIndexer;
	}
	
	@Override
	public void doAddTuple(ReteTuple tuple, ReteNode source) {
		EObject sourceVertex = (EObject) tuple.get(0);
		for(Object targetVertex:ReteUtil.getReferenceTargets(sourceVertex, getEReference())) {
			propagateAddition(createMarkedReteTuple(sourceVertex, targetVertex, MarkedReteTuple.getMarking(tuple)));
		}
		
		requestNotifications(sourceVertex);
	}
	
	@Override
	public void doRemoveTuple(ReteTuple tuple, ReteNode source) {
		EObject sourceVertex = (EObject) tuple.get(0);
		for(Object targetVertex:ReteUtil.getReferenceTargets(sourceVertex, getEReference())) {
			propagateRemoval(createMarkedReteTuple(sourceVertex, targetVertex, MarkedReteTuple.getMarking(tuple)));
		}
		
		unrequestNotifications(sourceVertex);
	}
	
	@Override
	public void registerChange(SDMChangeEvent change) {
		if(isMatchingChange(change)) {
			Collection<ReteTuple> inputTuples = inputIndexer.getTuples(Collections.singletonList(((SDMEdgeChange) change).getSource()));
			if(!inputTuples.isEmpty()) {
				ReteTuple sourceTuple = inputTuples.iterator().next();
				if(change.getModifier() == SDMChangeEnum.CREATE) {
					propagateAddition(createMarkedReteTuple(((SDMEdgeChange) change).getSource(), ((SDMEdgeChange) change).getTarget(), MarkedReteTuple.getMarking(sourceTuple)));
				}
				else if(change.getModifier() == SDMChangeEnum.DELETE) {
					propagateRemoval(createMarkedReteTuple(((SDMEdgeChange) change).getSource(), ((SDMEdgeChange) change).getTarget(), MarkedReteTuple.getMarking(sourceTuple)));
				}
			}
		}
	}
	
	private boolean isMatchingChange(SDMChangeEvent change) {
		return change.getType() == getEReference();
	}

	public ReteTuple createMarkedReteTuple(Object sourceVertex, Object targetVertex, int marking) {
		List<Object> tupleValue = new ArrayList<Object>();
		tupleValue.add(sourceVertex);
		tupleValue.add(targetVertex);
		return new MarkedReteTuple(tupleValue, marking);
	}

	@Override
	public ReteNodeExecutor createExecutor() {
		return new MarkingSensitiveReteNavigationExecutor(this);
	}

	public ReteIndexer getInputIndexer() {
		return inputIndexer;
	}

	public void setInputIndexer(ReteIndexer value) {
		this.inputIndexer = value;
	}
	
	public EReference getEReference() {
		return (EReference) link.getFeature();
	}
	
	public StoryPatternLink getLink() {
		return link;
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		EObject sourceVertex = (EObject) tuple.get(0);
		for(Object targetVertex:ReteUtil.getReferenceTargets(sourceVertex, getEReference())) {
			for(ReteNode successor:successors) {
				((MarkingSensitiveReteNode) successor).changeMarking(this, createMarkedReteTuple(sourceVertex, targetVertex, MarkedReteTuple.getMarking(tuple)), oldMarking, newMarking);
			}
		}
	}

	private void requestNotifications(EObject sourceVertex) {
		queryManager.requestNotifications(sourceVertex, this);
	}

	private void unrequestNotifications(EObject sourceVertex) {
		queryManager.unrequestNotifications(sourceVertex, this);
	}

	@Override
	public void setQueryManager(PersistentReteQueryManager queryManager) {
		this.queryManager = queryManager;
	}

	@Override
	public boolean acceptsEvent(SDMChangeEvent change) {
		return isMatchingChange(change);
	}

}
