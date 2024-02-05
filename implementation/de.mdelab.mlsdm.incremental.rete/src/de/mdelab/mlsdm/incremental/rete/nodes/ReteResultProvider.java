package de.mdelab.mlsdm.incremental.rete.nodes;

import de.mdelab.mlsdm.incremental.rete.util.ReteResultTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class ReteResultProvider extends ReteIndexer {
	
	public ReteResultProvider() {
		super(new int[0], 0, "RESULT");
		this.index = new ReteCollectionIndex();
	}

	@Override
	protected ReteTuple fitToMask(ReteTuple tuple) {
		return new ReteResultTuple(tuple, getTableMask());
	}

}
