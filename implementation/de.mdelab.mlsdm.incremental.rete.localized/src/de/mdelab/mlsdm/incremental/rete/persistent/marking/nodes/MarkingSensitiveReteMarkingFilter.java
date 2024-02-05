package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteImmutableFilter;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteMarkingFilter extends ReteImmutableFilter implements MarkingSensitiveReteNode {

	private int minimum;
	
	public MarkingSensitiveReteMarkingFilter(int minimum) {
		this.minimum = minimum;
	}
	
	@Override
	protected boolean filter(ReteTuple tuple) {
		return MarkedReteTuple.getMarking(tuple) <= minimum;
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		if(oldMarking > minimum) {
			if(newMarking > minimum) {
				for(ReteNode successor:successors) {
					((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
				}
			}
			else {
				ReteTuple oldTuple = new MarkedReteTuple(tuple, oldMarking);
				propagateRemoval(oldTuple);
			}
		}
		else {
			if(newMarking > minimum) {
				propagateAddition(tuple);
			}
		}
	}

}
