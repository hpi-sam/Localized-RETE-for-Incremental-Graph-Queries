package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.Collection;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteTupleGenerator;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute.MarkingSensitiveReteUnionExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteUnion extends ReteTupleGenerator implements MarkingSensitiveReteNode {

	
	protected final ReteIndexer leftIndexer;
	protected final ReteIndexer rightIndexer;
	
	public MarkingSensitiveReteUnion(ReteIndexer leftIndexer, ReteIndexer rightIndexer) {
		this.leftIndexer = leftIndexer;
		this.rightIndexer = rightIndexer;
	}
	
	@Override
	public void doAddTuple(ReteTuple tuple, ReteNode source) {
		Collection<ReteTuple> oppositeTuples;
		if(source == leftIndexer) {
			oppositeTuples = rightIndexer.getTuples(tuple);
		}
		else {
			oppositeTuples = leftIndexer.getTuples(tuple);
		}
		
		if(oppositeTuples.isEmpty()) {
			propagateAddition(tuple);
		}
		else {
			ReteTuple opposite = oppositeTuples.iterator().next();
			if(MarkedReteTuple.getMarking(opposite) < MarkedReteTuple.getMarking(tuple)) {
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, MarkedReteTuple.getMarking(opposite), MarkedReteTuple.getMarking(tuple));
				}
			}
		}
	}

	@Override
	public void doRemoveTuple(ReteTuple tuple, ReteNode source) {
		if(source == leftIndexer) {
			if(rightIndexer.getTuples(tuple).isEmpty()) {
				propagateRemoval(tuple);
			}
			else {
				ReteTuple opposite = rightIndexer.getTuples(tuple).iterator().next();
				if(MarkedReteTuple.getMarking(opposite) < MarkedReteTuple.getMarking(tuple)) {
					propagateRemoval(tuple);
					propagateAddition(opposite);
				}
			}
		}
		else {
			if(leftIndexer.getTuples(tuple).isEmpty()) {
				propagateRemoval(tuple);
			}
			else {
				ReteTuple opposite = leftIndexer.getTuples(tuple).iterator().next();
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, opposite, MarkedReteTuple.getMarking(tuple), MarkedReteTuple.getMarking(opposite));
				}
			}
		}
	}

	public ReteIndexer getLeftIndexer() {
		return leftIndexer;
	}

	public ReteIndexer getRightIndexer() {
		return rightIndexer;
	}
	
	@Override
	public ReteNodeExecutor createExecutor() {
		return new MarkingSensitiveReteUnionExecutor(this);
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		if(source == leftIndexer) {
			if(rightIndexer.getTuples(tuple).isEmpty()) {
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
				}
			}
			else {
				ReteTuple opposite = rightIndexer.getTuples(tuple).iterator().next();
				if(MarkedReteTuple.getMarking(opposite) < oldMarking || MarkedReteTuple.getMarking(opposite) < newMarking) { //TODO ensure this constraint is correct
					for(ReteNode successor:successors) {
						((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
					}
				}
			}
		}
		else {
			if(leftIndexer.getTuples(tuple).isEmpty()) {
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
				}
			}
			else {
				ReteTuple opposite = leftIndexer.getTuples(tuple).iterator().next();
				if(MarkedReteTuple.getMarking(opposite) < oldMarking || MarkedReteTuple.getMarking(opposite) < newMarking) { //TODO ensure this constraint is correct
					for(ReteNode successor:successors) {
						((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
					}
				}
			}
		}
	}

}
