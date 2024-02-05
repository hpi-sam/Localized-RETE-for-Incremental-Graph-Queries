package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.execute;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteNavigation;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteUtil;

public class MarkingSensitiveReteNavigationExecutor extends ReteNodeExecutor {

	private MarkingSensitiveReteNavigation node;
	private Iterator<Map<ReteTuple, ReteTuple>> inputIterator;
	private Iterator<Object> targetIterator;
	private ReteTuple sourceTuple;

	public MarkingSensitiveReteNavigationExecutor(
			MarkingSensitiveReteNavigation node) {
		this.node = node;
		this.inputIterator = node.getInputIndexer().getAllTuples().values().iterator();
	}

	private Iterator<Object> getNextTargetIterator() {
		sourceTuple = inputIterator.next().keySet().iterator().next();
		return ReteUtil.getReferenceTargets((EObject) sourceTuple.get(0), node.getEReference()).iterator();
	}

	@Override
	public boolean hasNextTuple() {
		return (targetIterator != null && targetIterator.hasNext()) || inputIterator.hasNext();
	}

	@Override
	public void generateNextTuple() {
		while((targetIterator == null || !targetIterator.hasNext()) && inputIterator.hasNext()) {
			targetIterator = getNextTargetIterator();
		}
		
		if(targetIterator != null && targetIterator.hasNext()) {
			node.propagateAddition(node.createMarkedReteTuple(sourceTuple.get(0), targetIterator.next(), MarkedReteTuple.getMarking(sourceTuple)));
		}
	}

}
