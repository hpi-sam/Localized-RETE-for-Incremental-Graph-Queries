package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteKeyProjection;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteKeyProjectionExecutor extends ReteNodeExecutor {

	private MarkingSensitiveReteKeyProjection node;
	private Iterator<List<Object>> keyIterator;

	public MarkingSensitiveReteKeyProjectionExecutor(MarkingSensitiveReteKeyProjection node,
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
		List<Object> key = keyIterator.next();
		ReteTuple currentSource = node.getCurrentProjectionSource(key);
		node.propagateAddition(new MarkedReteTuple(key, MarkedReteTuple.getMarking(currentSource)));
	}

}
