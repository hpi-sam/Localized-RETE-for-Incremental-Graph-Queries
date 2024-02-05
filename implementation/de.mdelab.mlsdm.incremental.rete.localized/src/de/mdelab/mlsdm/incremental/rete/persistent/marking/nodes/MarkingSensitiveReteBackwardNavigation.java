package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlstorypatterns.StoryPatternLink;

public class MarkingSensitiveReteBackwardNavigation extends MarkingSensitiveReteNavigation {

	public MarkingSensitiveReteBackwardNavigation(StoryPatternLink link, ReteIndexer inputIndexer) {
		super(link, inputIndexer);
	}

	@Override
	public EReference getEReference() {
		return super.getEReference().getEOpposite();
	}

	@Override
	public ReteTuple createMarkedReteTuple(Object sourceVertex, Object targetVertex, int marking) {
		List<Object> tupleValue = new ArrayList<Object>();
		tupleValue.add(targetVertex);
		tupleValue.add(sourceVertex);
		return new MarkedReteTuple(tupleValue, marking);
	}

}
