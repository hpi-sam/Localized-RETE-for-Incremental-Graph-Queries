package de.mdelab.mlsdm.incremental.rete.nodes;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import de.mdelab.mlsdm.incremental.change.SDMChangeEvent;
import de.mdelab.mlsdm.incremental.change.SDMNodeChange;
import de.mdelab.mlsdm.incremental.change.SDMChangeEvent.SDMChangeEnum;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeInputExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;

public class ReteNodeInput extends ReteInput {

	private AbstractStoryPatternObject spo;
	
	public ReteNodeInput(AbstractStoryPatternObject spo) {
		this.spo = spo;
	}
	
	@Override
	public void registerChange(SDMChangeEvent change) {
		if(isMatchingChange(change)) {
			if(change.getModifier() == SDMChangeEnum.CREATE) {
				propagateAddition(createTuple(Collections.singletonList(((SDMNodeChange) change).getObject())));
			}
			else if(change.getModifier() == SDMChangeEnum.DELETE) {
				propagateRemoval(createTuple(Collections.singletonList(((SDMNodeChange) change).getObject())));
			}
		}
	}

	private boolean isMatchingChange(SDMChangeEvent change) {
		return change.getType() == spo.getType() ||
				(change.getType() instanceof EClass && ((EClass) change.getType()).getEAllSuperTypes().contains(spo.getType()));
	}

	@Override
	public ReteNodeExecutor createExecutor() {
		return new ReteNodeInputExecutor(this, modelIndex.getDomain(spo).iterator());
	}
	
	public AbstractStoryPatternObject getSPO() {
		return spo;
	}

	public ReteTuple createTuple(List<Object> tupleValue) {
		return new ReteTuple(tupleValue);
	}

	@Override
	public boolean isNode() {
		return true;
	}

	@Override
	public boolean acceptsEvent(SDMChangeEvent change) {
		return isMatchingChange(change);
	}

}
