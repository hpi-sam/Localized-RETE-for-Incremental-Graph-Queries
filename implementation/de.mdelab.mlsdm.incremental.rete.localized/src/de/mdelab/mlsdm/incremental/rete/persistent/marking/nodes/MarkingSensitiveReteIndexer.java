package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.Arrays;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteIndexer extends ReteIndexer implements MarkingSensitiveReteNode {

	public MarkingSensitiveReteIndexer(int[] mask, int keySize) {
		super(mask, keySize);
	}

	@Override
	protected ReteTuple fitToMask(ReteTuple tuple) {
		Object[] newTuple = new Object[mask.length];
		for(int i = 0; i < mask.length; i++) {
			newTuple[i] = tuple.get(mask[i]);
		}
		return new MarkedReteTuple(Arrays.asList(newTuple), MarkedReteTuple.getMarking(tuple));
	}


	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		MarkedReteTuple oldIndexedTuple = (MarkedReteTuple) fitToMask(tuple);
		oldIndexedTuple.setMarking(oldMarking);
		
		MarkedReteTuple newIndexedTuple = (MarkedReteTuple) fitToMask(tuple);
		newIndexedTuple.setMarking(newMarking);
		
		index.removeTuple(oldIndexedTuple);
		index.addTuple(newIndexedTuple);
		
		for(ReteNode successor:successors) {
			((MarkingSensitiveReteNode) successor).changeMarking(this, newIndexedTuple, oldMarking, newMarking);
		}
	}


}
