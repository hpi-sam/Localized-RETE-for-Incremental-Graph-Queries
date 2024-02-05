package de.mdelab.mlsdm.incremental.rete.dynamic;

import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;

public class DynamicReteNet extends ReteNet {

	private DynamicReteQueryManager manager;

	public DynamicReteNet(DynamicReteQueryManager manager) {
		this.manager = manager;
	}
	
	@Override
	public void addNode(Object key, ReteNode node) {
		super.addNode(key, node);
		manager.registerReteNode(node);
	}

	@Override
	public void removeNode(ReteNode node) {
		manager.unregisterReteNode(node);
		super.removeNode(node);
	}

	public void setManager(DynamicReteQueryManager manager) {
		this.manager = manager;
	}
	
}
