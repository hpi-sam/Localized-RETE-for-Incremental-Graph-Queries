package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute;

import java.util.Iterator;
import java.util.Map;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteUnion;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteUnionExecutor extends ReteNodeExecutor {

	private MarkingSensitiveReteUnion node;
	private Iterator<Map<ReteTuple, ReteTuple>> leftIterator;
	private Iterator<Map<ReteTuple, ReteTuple>> rightIterator;
	
	private Iterator<Map<ReteTuple, ReteTuple>> currentIterator;

	public MarkingSensitiveReteUnionExecutor(MarkingSensitiveReteUnion node) {
		this.node = node;

		this.leftIterator = node.getLeftIndexer().getAllTuples().values().iterator();
		this.rightIterator = node.getRightIndexer().getAllTuples().values().iterator();
		
		currentIterator = leftIterator;
	}
	
	@Override
	public boolean hasNextTuple() {
		return leftIterator.hasNext() || rightIterator.hasNext();
	}

	@Override
	public void generateNextTuple() {
		if(!currentIterator.hasNext()) {
			currentIterator = rightIterator;
		}
		
		ReteTuple nextSource = getNextSource();
		ReteTuple opposite = getOpposite(nextSource);
		
		if(opposite != null) {
			if(MarkedReteTuple.getMarking(opposite) < MarkedReteTuple.getMarking(nextSource) ||
					(currentIterator == leftIterator && MarkedReteTuple.getMarking(opposite) == MarkedReteTuple.getMarking(nextSource))) {
				node.propagateAddition(nextSource);
			}
		}
		else {
			node.propagateAddition(nextSource);
		}
	}

	private ReteTuple getNextSource() {
		return currentIterator.next().keySet().iterator().next();
	}

	private ReteTuple getOpposite(ReteTuple nextSource) {
		ReteIndexer oppositeIndexer;
		if(currentIterator == leftIterator) {
			oppositeIndexer = node.getRightIndexer();
		}
		else {
			oppositeIndexer = node.getLeftIndexer();
		}
		return oppositeIndexer.getTuples(nextSource).iterator().next();
	}

}
