package de.mdelab.mlsdm.incremental.rete.nodes;

import java.util.ArrayList;
import java.util.List;

import de.mdelab.mlsdm.incremental.change.SDMChangeEvent;
import de.mdelab.mlsdm.incremental.change.SDMEdgeChange;
import de.mdelab.mlsdm.incremental.change.SDMChangeEvent.SDMChangeEnum;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteEdgeInputExecutor;
import de.mdelab.mlsdm.incremental.rete.nodes.execute.ReteNodeExecutor;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlstorypatterns.StoryPatternLink;

public class ReteEdgeInput extends ReteInput {

	protected StoryPatternLink link;

	public ReteEdgeInput(StoryPatternLink link) {
		this.link = link;
	}

	@Override
	public void registerChange(SDMChangeEvent change) {
		if(isMatchingChange(change) && change.getModifier() == SDMChangeEnum.CREATE) {
			List<Object> tuple = new ArrayList<Object>(2);
			tuple.add(((SDMEdgeChange)change).getSource());
			tuple.add(((SDMEdgeChange)change).getTarget());
			propagateAddition(new ReteTuple(tuple));
		}
		else if(isMatchingChange(change) && change.getModifier() == SDMChangeEnum.DELETE) {
			List<Object> tuple = new ArrayList<Object>(2);
			tuple.add(((SDMEdgeChange)change).getSource());
			tuple.add(((SDMEdgeChange)change).getTarget());
			propagateRemoval(new ReteTuple(tuple));
		}
	}

	private boolean isMatchingChange(SDMChangeEvent change) {
		return change.getType() == link.getFeature();
	}

	@Override
	public ReteNodeExecutor createExecutor() {
		return new ReteEdgeInputExecutor(this, modelIndex.getReferences(link).iterator());
	}

	public StoryPatternLink getLink() {
		return link;
	}
	
	@Override
	public boolean isEdge() {
		return true;
	}

	@Override
	public boolean acceptsEvent(SDMChangeEvent change) {
		return isMatchingChange(change);
	}

	@Override
	public String toString() {
		return "INPUT <" + link.getSource().getName() + " -" + link.getFeature().getName() + "-> " + link.getTarget().getName() + ">";
	}
}
