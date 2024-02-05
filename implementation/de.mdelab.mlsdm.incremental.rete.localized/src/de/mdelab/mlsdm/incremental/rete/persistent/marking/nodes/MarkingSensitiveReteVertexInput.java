package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import java.util.List;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteNodeInput;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkedReteTuple;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;

public class MarkingSensitiveReteVertexInput extends ReteNodeInput {

	private final int pseudoInfinity;

	public MarkingSensitiveReteVertexInput(AbstractStoryPatternObject spo, int pseudoInfinity) {
		super(spo);
		this.pseudoInfinity = pseudoInfinity;
	}

	@Override
	public ReteTuple createTuple(List<Object> tupleValue) {
		return new MarkedReteTuple(tupleValue, pseudoInfinity);
	}

	public boolean isNode() {
		return true;
	}

}
