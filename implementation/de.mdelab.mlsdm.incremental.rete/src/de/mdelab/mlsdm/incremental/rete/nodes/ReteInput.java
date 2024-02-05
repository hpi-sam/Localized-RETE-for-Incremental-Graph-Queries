package de.mdelab.mlsdm.incremental.rete.nodes;

import de.mdelab.mlsdm.incremental.ChangeListener;
import de.mdelab.mlsdm.incremental.rete.StoryPatternModelIndex;

public abstract class ReteInput extends ReteTupleGenerator implements ChangeListener {

	protected StoryPatternModelIndex modelIndex;
	
	public boolean isInput() {
		return true;
	}

	public boolean isEdge() {
		return false;
	}

	public boolean isNode() {
		return false;
	}

	public void setModelIndex(StoryPatternModelIndex modelIndex) {
		this.modelIndex = modelIndex;
	}

}
