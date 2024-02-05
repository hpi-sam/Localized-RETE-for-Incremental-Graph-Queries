package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteTupleGenerator;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute.MarkingSensitiveReteMarkingAssignmentExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteMarkingAssignment extends ReteTupleGenerator implements MarkingSensitiveReteNode {

	private int marking;
	private ReteIndexer inputIndexer;

	public MarkingSensitiveReteMarkingAssignment(int marking, ReteIndexer inputIndexer) {
		this.marking = marking;
		this.inputIndexer = inputIndexer;
	}
	
	@Override
	public ReteNodeExecutor createExecutor() {
		return new MarkingSensitiveReteMarkingAssignmentExecutor(this);
	}

	@Override
	public void doAddTuple(ReteTuple tuple, ReteNode source) {
		propagateAddition(createMarkedReteTuple(tuple));
	}
	
	@Override
	public void doRemoveTuple(ReteTuple tuple, ReteNode source) {
		propagateRemoval(createMarkedReteTuple(tuple));
	}
	
	public MarkedReteTuple createMarkedReteTuple(ReteTuple tuple) {
		return new MarkedReteTuple(tuple.getTupleValue(), marking);
	}
	
	public ReteIndexer getInputIndexer() {
		return inputIndexer;
	}
	
	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		
	}
}
