package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute;

import java.util.Iterator;
import java.util.Map;

import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteMarkingAssignment;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteMarkingAssignmentExecutor extends ReteNodeExecutor {

	private MarkingSensitiveReteMarkingAssignment node;
	private Iterator<Map<ReteTuple, ReteTuple>> indexIterator;
	private Iterator<ReteTuple> tupleIterator;
	
	public MarkingSensitiveReteMarkingAssignmentExecutor(
			MarkingSensitiveReteMarkingAssignment node) {
		this.node = node;
		this.indexIterator = node.getInputIndexer().getAllTuples().values().iterator();
	}

	@Override
	public boolean hasNextTuple() {
		return (tupleIterator != null && tupleIterator.hasNext()) || indexIterator.hasNext();
	}

	@Override
	public void generateNextTuple() {
		while((tupleIterator == null || !tupleIterator.hasNext()) && indexIterator.hasNext()) {
			tupleIterator = indexIterator.next().keySet().iterator();
		}
		
		if(tupleIterator != null && tupleIterator.hasNext()) {
			ReteTuple sourceTuple = tupleIterator.next();
			node.propagateAddition(node.createMarkedReteTuple(sourceTuple));
		}
	}

}
