package de.mdelab.mlsdm.incremental.rete.nodes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class ReteSubgraphFilter extends ReteImmutableFilter {

	private Set<Object> subgraph;
	
	public ReteSubgraphFilter() {
		this.subgraph = new LinkedHashSet<Object>();
	}
	
	public void addSubgraph(Collection<? extends Object> newSubgraph) {
		for(Object vertex:newSubgraph) {
			subgraph.add(vertex);
		}
	}
	
	@Override
	protected boolean filter(ReteTuple tuple) {
		for(Object member:tuple) {
			if(subgraph.contains(member)) {
				return false;
			}
		}
		return true;
	}

}
