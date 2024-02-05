package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteCollectionIndex;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteResultTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteResultProvider extends MarkingSensitiveReteIndexer {

	public MarkingSensitiveReteResultProvider() {
		super(new int[0], 0);
		this.index = new ReteCollectionIndex();
	}

	@Override
	protected ReteTuple fitToMask(ReteTuple tuple) {
		return new MarkedReteResultTuple(tuple, getTableMask(), MarkedReteTuple.getMarking(tuple));
	}
}
