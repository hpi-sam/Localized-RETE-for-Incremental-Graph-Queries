package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.List;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteJoin;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.incremental.util.CompositeList;

public class MarkingSensitiveReteJoin extends ReteJoin implements MarkingSensitiveReteNode {

	public MarkingSensitiveReteJoin(int joinSize) {
		super(joinSize);
	}

	public MarkingSensitiveReteJoin(ReteIndexer leftIndexer, ReteIndexer rightIndexer, int joinSize) {
		super(leftIndexer, rightIndexer, joinSize);
	}

	@Override
	public ReteTuple constructJoin(ReteTuple left, ReteTuple right) {
		int marking = computeMarking(left, right);
		ReteTuple join = new MarkedReteTuple(new CompositeList<Object>(left, right.subList(joinSize, right.size())), marking);
		return join;
	}

	protected int computeMarking(ReteTuple left, ReteTuple right) {
		int leftMarking = MarkedReteTuple.getMarking(left);
		int rightMarking = MarkedReteTuple.getMarking(right);
		return Math.max(leftMarking, rightMarking);
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		List<Object> key = tuple.subList(0, joinSize);
		if(source == leftIndexer) {
			for(ReteTuple opposite:rightIndexer.getTuples(key)) {
				ReteTuple join = constructJoin(tuple, opposite);
				
				if(MarkedReteTuple.getMarking(opposite) < oldMarking || MarkedReteTuple.getMarking(opposite) < newMarking) {	//TODO is this condition guaranteed to be correct?
					for(ReteNode successor:successors) {
						((MarkingSensitiveReteNode) successor).changeMarking(this, join, oldMarking, MarkedReteTuple.getMarking(join));
					}
				}
			}
		}
		else {
			for(ReteTuple opposite:leftIndexer.getTuples(key)) {
				ReteTuple join = constructJoin(opposite, tuple);
				
				if(MarkedReteTuple.getMarking(opposite) < oldMarking || MarkedReteTuple.getMarking(opposite) < newMarking) {
					for(ReteNode successor:successors) {
						((MarkingSensitiveReteNode) successor).changeMarking(this, join, oldMarking, MarkedReteTuple.getMarking(join));
					}
				}
			}
		}
	}
	
}
