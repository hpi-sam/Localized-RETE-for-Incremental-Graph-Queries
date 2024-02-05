package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteBackwardNavigation;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteNavigation;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteVertexInput;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteUnion;

public class ReteLocalNavigationStructure extends ReteSubStructure {

	private MarkingSensitiveReteVertexInput sourceInput;
	private MarkingSensitiveReteVertexInput targetInput;

	private MarkingSensitiveReteNavigation forwardNavigation;
	private MarkingSensitiveReteBackwardNavigation backwardNavigation;
	
	private MarkingSensitiveReteUnion union;

	public MarkingSensitiveReteVertexInput getSourceInput() {
		return sourceInput;
	}

	public void setSourceInput(MarkingSensitiveReteVertexInput value) {
		if(sourceInput != null) {
			removeNode(sourceInput);
		}
		
		this.sourceInput = value;
		addNode(sourceInput);
	}

	public MarkingSensitiveReteVertexInput getTargetInput() {
		return targetInput;
	}

	public void setTargetInput(MarkingSensitiveReteVertexInput value) {
		if(targetInput != null) {
			removeNode(targetInput);
		}
		
		this.targetInput = value;
		addNode(targetInput);
	}

	public MarkingSensitiveReteNavigation getForwardNavigation() {
		return forwardNavigation;
	}

	public void setForwardNavigation(MarkingSensitiveReteNavigation value) {
		if(forwardNavigation != null) {
			removeNode(forwardNavigation);
		}
		
		this.forwardNavigation = value;
		addNode(forwardNavigation);
	}

	public MarkingSensitiveReteBackwardNavigation getBackwardNavigation() {
		return backwardNavigation;
	}

	public void setBackwardNavigation(MarkingSensitiveReteBackwardNavigation value) {
		if(backwardNavigation != null) {
			removeNode(backwardNavigation);
		}
		
		this.backwardNavigation = value;
		addNode(backwardNavigation);
	}

	public MarkingSensitiveReteUnion getUnion() {
		return union;
	}

	public void setUnion(MarkingSensitiveReteUnion value) {
		if(union != null) {
			removeNode(union);
		}
		
		this.union = value;
		addNode(union);
	}
}
