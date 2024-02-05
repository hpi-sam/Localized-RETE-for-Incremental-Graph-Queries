package de.mdelab.mlsdm.incremental.rete.nodes;

import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;

public abstract class ReteTupleGenerator extends ReteDistributor {

	public abstract ReteNodeExecutor createExecutor();

	public boolean isTupleGenerator() {
		return true;
	}

}
