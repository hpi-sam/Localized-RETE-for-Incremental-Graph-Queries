package de.mdelab.mlsdm.incremental.rete.nodes.execute;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteKeyProjection;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class ReteKeyProjectionExecutor extends ReteNodeExecutor {

	private ReteKeyProjection node;
	private Iterator<List<Object>> keyIterator;

	public ReteKeyProjectionExecutor(ReteKeyProjection node,
			ReteIndexer inputIndexer) {
		this.node = node;
		this.keyIterator = inputIndexer.getAllTuples().keySet().iterator();
	}

	@Override
	public boolean hasNextTuple() {
		return keyIterator.hasNext();
	}

	@Override
	public void generateNextTuple() {
		if(!hasNextTuple()) {
            throw new NoSuchElementException();
		}
		ReteTuple tuple = new ReteTuple(keyIterator.next());
		node.propagateAddition(tuple);
	}

}
