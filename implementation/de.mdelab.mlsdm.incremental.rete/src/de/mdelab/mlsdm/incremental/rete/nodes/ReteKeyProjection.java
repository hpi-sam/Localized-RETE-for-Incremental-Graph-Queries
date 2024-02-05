package de.mdelab.mlsdm.incremental.rete.nodes;

import java.util.Collection;
import java.util.List;

import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteKeyProjectionExecutor;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class ReteKeyProjection extends ReteTupleGenerator  {

	protected ReteIndexer inputIndexer;

	public ReteKeyProjection(ReteIndexer inputIndexer) {
		this.inputIndexer = inputIndexer;
	}

	@Override
	public void doAddTuple(ReteTuple tuple, ReteNode source) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		Collection<ReteTuple> tuples = inputIndexer.getTuples(key);
		if(tuples.size() == 1) {
			ReteTuple projection = new ReteTuple(key);
			projection.setIsPreliminary(tuple.isPreliminary());
			propagateAddition(projection);
		}
	}

	@Override
	public void doRemoveTuple(ReteTuple tuple, ReteNode source) {
		List<Object> key = tuple.subList(0, inputIndexer.getKeySize());
		Collection<ReteTuple> tuples = inputIndexer.getTuples(key);
		if(tuples.size() == 0) {
			propagateRemoval(new ReteTuple(key));
		}
	}

	@Override
	public ReteNodeExecutor createExecutor() {
		return new ReteKeyProjectionExecutor(this, inputIndexer);
	}

}
