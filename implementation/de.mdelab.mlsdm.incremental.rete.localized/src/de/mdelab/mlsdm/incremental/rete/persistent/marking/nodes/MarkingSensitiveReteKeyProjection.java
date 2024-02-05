package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteKeyProjection;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute.MarkingSensitiveReteKeyProjectionExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.mlindices.util.DynamicArray;

public class MarkingSensitiveReteKeyProjection extends ReteKeyProjection implements MarkingSensitiveReteNode {

	private static final int INITIAL_ARRAY_CAPACITY = 4;
	
	private Map<List<Object>, DynamicArray<Set<ReteTuple>>> tuplesByMarking;
	
	public MarkingSensitiveReteKeyProjection(ReteIndexer inputIndexer) {
		super(inputIndexer);
		this.tuplesByMarking = new LinkedHashMap<List<Object>, DynamicArray<Set<ReteTuple>>>();
	}

	@Override
	public void doAddTuple(ReteTuple tuple, ReteNode source) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		
		ReteTuple oldProjectionSource = getCurrentProjectionSource(key);
		registerTuple(tuple);
		
		if(oldProjectionSource != null) {
			int oldMarking = MarkedReteTuple.getMarking(oldProjectionSource); 
			int newMarking = MarkedReteTuple.getMarking(tuple);
			if(newMarking > oldMarking) {
				// replace old marking
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, createProjection(tuple), oldMarking, newMarking);
				}
			}
		}
		else {
			ReteTuple projection = createProjection(tuple);
			propagateAddition(projection);
		}
	}

	@Override
	public void doRemoveTuple(ReteTuple tuple, ReteNode source) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		ReteTuple oldProjectionSource = getCurrentProjectionSource(key);
		
		unregisterTuple(tuple);

		ReteTuple newProjectionSource = getCurrentProjectionSource(key);
		if(newProjectionSource == null) {
			ReteTuple projection = createProjection(oldProjectionSource);
			propagateRemoval(projection);
		}
		else if(oldProjectionSource != newProjectionSource) {
			for(ReteNode successor:successors) {
				((MarkingSensitiveReteNode) successor).changeMarking(this, createProjection(newProjectionSource), MarkedReteTuple.getMarking(oldProjectionSource), MarkedReteTuple.getMarking(newProjectionSource));
			}
		}
	}

	private void registerTuple(ReteTuple tuple) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		if(!tuplesByMarking.containsKey(key)) {
			tuplesByMarking.put(key, new DynamicArray<>(INITIAL_ARRAY_CAPACITY));
		}
		
		DynamicArray<Set<ReteTuple>> matchingTuples = tuplesByMarking.get(key);
		int marking = MarkedReteTuple.getMarking(tuple);
		int markingIndex = getMarkingIndex(marking);
		if(matchingTuples.get(markingIndex) == null) {
			matchingTuples.set(markingIndex, new LinkedHashSet<ReteTuple>());
		}
		
		matchingTuples.get(markingIndex).add(tuple);
	}

	private void unregisterTuple(ReteTuple tuple) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		DynamicArray<Set<ReteTuple>> matchingTuples = tuplesByMarking.get(key);
		if(matchingTuples != null) {
			int marking = MarkedReteTuple.getMarking(tuple);
			int markingIndex = getMarkingIndex(marking);	
			Set<ReteTuple> markedTuples = matchingTuples.get(markingIndex);
			if(markedTuples != null) {
				markedTuples.remove(tuple);
			}
		}
	}

	private int getMarkingIndex(int marking) {
		return marking - MarkedReteTuple.NO_MARKING;
	}

	public ReteTuple getCurrentProjectionSource(List<Object> key) {
		DynamicArray<Set<ReteTuple>> matchingTuples = tuplesByMarking.get(key);
		if(matchingTuples != null) {
			for(int i = matchingTuples.length() - 1; i >= 0; i--) {
				Set<ReteTuple> tuples = matchingTuples.get(i);
				if(tuples != null && tuples.size() > 0) {
					return tuples.iterator().next();
				}
			}
		}
		return null;
	}

	@Override
	public ReteNodeExecutor createExecutor() {
		return new MarkingSensitiveReteKeyProjectionExecutor(this, inputIndexer);
	}

	private ReteTuple createProjection(ReteTuple projectionSource) {
		List<Object> key = projectionSource.subList(0, inputIndexer.getKeySize());
		return new MarkedReteTuple(key, MarkedReteTuple.getMarking(projectionSource));
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		ReteTuple oldTuple = new MarkedReteTuple(tuple, oldMarking);
		ReteTuple newTuple = new MarkedReteTuple(tuple, newMarking);
		
		ReteTuple oldProjectionSource = getCurrentProjectionSource(key);
		
		unregisterTuple(oldTuple);
		registerTuple(newTuple);
		
		ReteTuple newProjectionSource = getCurrentProjectionSource(key);
		
		if(oldProjectionSource != newProjectionSource) {
			for(ReteNode successor:successors) {
				((MarkingSensitiveReteNode) successor).changeMarking(this, createProjection(newProjectionSource), oldMarking, MarkedReteTuple.getMarking(newProjectionSource));
			}
		}
	}
}
