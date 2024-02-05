package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import java.util.LinkedHashSet;
import java.util.Set;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;

public class ReteSubStructure {

	private Set<ReteNode> nodes = new LinkedHashSet<ReteNode>();
	
	public Set<ReteNode> getNodes() {
		return nodes;
	}

	public void addNode(ReteNode node) {
		nodes.add(node);
	}

	public void removeNode(ReteNode node) {
		nodes.remove(node);
	}
	
}
