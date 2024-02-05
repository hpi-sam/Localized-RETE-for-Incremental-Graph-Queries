package de.mdelab.mlsdm.incremental.rete.sdm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import de.mdelab.mlsdm.incremental.SDMInterfaceIndex;
import de.mdelab.mlsdm.incremental.SDMQuery;
import de.mdelab.mlsdm.incremental.SDMQueryManager;
import de.mdelab.mlsdm.incremental.SDMQueryMatch;
import de.mdelab.mlsdm.incremental.change.SDMChangeEvent;
import de.mdelab.mlsdm.incremental.util.CompositeList;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex.MLSDMReferenceAdapterTuple;
import de.mdelab.mlsdm.mlindices.Index;
import de.mdelab.mlsdm.mlindices.IndexChangeNotification;
import de.mdelab.mlsdm.mlindices.IndexEntry;
import de.mdelab.mlsdm.mlindices.IndexNotificationReceiver;
import de.mdelab.mlsdm.mlindices.IndexNotificationType;

public class SDMJoinQuery extends SDMQuery implements IndexNotificationReceiver {

	protected SDMInterfaceIndex leftInterface;
	protected SDMInterfaceIndex rightInterface;
	protected Map<String, Integer> parameterToIndex;
	protected int joinCardinality;

	protected List<Object> leftIndexQuery;
	protected List<Object> rightIndexQuery;
	
	protected List<MLSDMReferenceAdapterTuple<Integer>> uniquenessChecks;
	
	public SDMJoinQuery(
			SDMQueryManager manager,
			SDMInterfaceIndex leftInterface, SDMInterfaceIndex rightInterface,
			Map<String, Integer> parameterToIndex,
			int joinCardinality, int leftInterfaceSize, int rightInterfaceSize) {
		super(manager);
		
		this.leftInterface = leftInterface;
		this.rightInterface = rightInterface;
		this.parameterToIndex = parameterToIndex;
		this.joinCardinality = joinCardinality;
		
		this.uniquenessChecks = new ArrayList<MLSDMReferenceAdapterTuple<Integer>>();

		this.leftIndexQuery = createUndefinedIndexQuery(leftInterfaceSize);
		this.rightIndexQuery = createUndefinedIndexQuery(rightInterfaceSize);
	}
	
	public SDMJoinQuery(
			SDMQueryManager manager,
			SDMInterfaceIndex leftInterface, SDMInterfaceIndex rightInterface) {
		super(manager);
		
		this.leftInterface = leftInterface;
		this.rightInterface = rightInterface;
		this.joinCardinality = computeJoinCardinality();
		this.parameterToIndex = createParameterToIndex();
		
		this.uniquenessChecks = new ArrayList<MLSDMReferenceAdapterTuple<Integer>>();

		this.leftIndexQuery = createUndefinedIndexQuery(leftInterface.getParameterPositions().size());
		this.rightIndexQuery = createUndefinedIndexQuery(rightInterface.getParameterPositions().size());
	}


	private int computeJoinCardinality() {
		Set<String> commonNames = new LinkedHashSet<String>(leftInterface.getParameterPositions().keySet());
		commonNames.retainAll(rightInterface.getParameterPositions().keySet());
		return commonNames.size();
	}

	private Map<String, Integer> createParameterToIndex() {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(Entry<String, Integer> leftEntry:leftInterface.getParameterPositions().entrySet()) {
			map.put(leftEntry.getKey(), leftEntry.getValue());
		}
		for(Entry<String, Integer> rightEntry:rightInterface.getParameterPositions().entrySet()) {
			if(map.containsKey(rightEntry.getKey())) {
				continue;
			}
			
			map.put(rightEntry.getKey(), rightEntry.getValue() + leftInterface.getParameterPositions().size() - joinCardinality);
		}
		return map;
	}
	private List<Object> createUndefinedIndexQuery(int size) {
		List<Object> query = new ArrayList<Object>(size * 2);
		for(int i = 0; i < size * 2; i++) {
			query.add(Index.UNDEFINED_PARAMETER);
		}
		return query;
	}

	@Override
	public void findInitialMatches() {

	}

	protected void addIndexEntry(IndexEntry indexEntry, IndexEntry leftParent, IndexEntry rightParent) {
		for(SDMInterfaceIndex index:interfaceIndices) {
			((SDMJoinInterfaceIndex) index).addEntry(new SDMQueryMatch(indexEntry, parameterToIndex), leftParent, rightParent);
		}
	}

	protected IndexEntry createCompositeEntry(IndexEntry leftEntry,
			IndexEntry rightEntry) {
		List<Object> leftList = leftEntry.getKey();
		List<Object> rightList = rightEntry.getKey().subList(joinCardinality, rightEntry.getKey().size());
		EList<Object> compositeList = new CompositeList<Object>(leftList, rightList);
		return new SDMIndexEntry(compositeList);
	}

	@Override
	public Iterator<SDMQueryMatch> getMatches() {
		updateMatches();
		
		final Iterator<IndexEntry> leftIt = leftInterface.getEntries(leftIndexQuery);
		return new SDMJoinResultIterator(leftIt, this);
	}

	public List<Object> completeQuery(List<Object> query, List<Object> reference) {
		return new CompositeList<Object>(query, reference.subList(query.size(), reference.size()));
	}

	public List<Object> createPointQuery(List<Object> key) {
		List<Object> query = new ArrayList<Object>(key.size() * 2);
		for(Object keyPart:key) {
			query.add(keyPart);
			query.add(keyPart);
		}
		return query;
	}

	@Override
	public void registerChange(SDMChangeEvent change) {
		
	}

	@Override
	protected void populateInterfaceIndex(SDMInterfaceIndex interfaceIndex) {
		for(SDMJoinResultIterator it = (SDMJoinResultIterator) getMatches(); it.hasNext();) {
			SDMQueryMatch match = it.next();
			((SDMJoinInterfaceIndex) interfaceIndex).addEntry(match, it.getCurrentLeft(), it.getCurrentRight());
		}
	}
	
	protected void removeIndexEntries(IndexEntry entry) {
		for(SDMInterfaceIndex interfaceIndex:interfaceIndices) {
			((SDMJoinInterfaceIndex) interfaceIndex).removeChildEntries(entry);
		}
	}
	
	public boolean passesUniquenessChecks(IndexEntry joinedEntry) {
		for(MLSDMReferenceAdapterTuple<Integer> uniquenessCheck:uniquenessChecks) {
			Object o1 = joinedEntry.getKey().get(uniquenessCheck.e1);
			Object o2 = joinedEntry.getKey().get(uniquenessCheck.e2);
			if(o1 == o2) {
				return false;
			}
		}
		return true;
	}

	public void addUniquenessChecks(
			Collection<MLSDMReferenceAdapterTuple<Integer>> uniquenessChecks) {
		this.uniquenessChecks.addAll(uniquenessChecks);
	}

	public int getCardinality() {
		return joinCardinality;
	}

	public SDMInterfaceIndex getRightInterface() {
		return rightInterface;
	}

	public List<Object> getRightIndexQuery() {
		return rightIndexQuery;
	}

	public Map<String, Integer> getSPONameToIndex() {
		return parameterToIndex;
	}

	@Override
	public void notifyIndexChanged(IndexChangeNotification notification) {
		if(notification.getIndex() == leftInterface.getWrappedIndex() || notification.getIndex() == rightInterface.getWrappedIndex()) {
			if(notification.getType() == IndexNotificationType.ADD) {
				List<Object> key = notification.getEntry().getKey();
				List<Object> query = createPointQuery(key.subList(0, joinCardinality));
				if(notification.getIndex() == leftInterface.getWrappedIndex()) {
					IndexEntry leftParent = notification.getEntry();
					for(Iterator<IndexEntry> it = rightInterface.getEntries(completeQuery(query, rightIndexQuery)); it.hasNext();) {
						IndexEntry rightParent = it.next();
						IndexEntry joinedEntry = createCompositeEntry(leftParent, rightParent);
						if(passesUniquenessChecks(joinedEntry)) {
							addIndexEntry(joinedEntry, leftParent, rightParent);
						}
					}
				}
				else if(notification.getIndex() == rightInterface.getWrappedIndex()) {
					IndexEntry rightParent = notification.getEntry();
					for(Iterator<IndexEntry> it = leftInterface.getEntries(completeQuery(query, leftIndexQuery)); it.hasNext();) {
						IndexEntry leftParent = it.next();
						IndexEntry joinedEntry = createCompositeEntry(leftParent, rightParent);
						if(passesUniquenessChecks(joinedEntry)) {
							addIndexEntry(joinedEntry, leftParent, rightParent);
						}
					}
				}
			}
			else if(notification.getType() == IndexNotificationType.DELETE) {
				removeIndexEntries(notification.getEntry()); 
			}
		}
	}

	@Override
	protected void doUpdateMatches() {
		
	}

	@Override
	protected boolean isRelevant(SDMChangeEvent change) {
		return false;
	}

	@Override
	public boolean acceptsEvent(SDMChangeEvent change) {
		return true;
	}
}
