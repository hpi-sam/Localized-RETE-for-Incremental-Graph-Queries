package de.mdelab.mlsdm.incremental.rete.nodes.execute;

public abstract class ReteNodeExecutor {

	public abstract boolean hasNextTuple();
	
	public abstract void generateNextTuple();
	
}
