package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteKeyProjection;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteMarkingAssignment;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteMarkingFilter;

public class ReteRequestProjectionStructure extends ReteSubStructure {

	private MarkingSensitiveReteMarkingFilter filter;
	private MarkingSensitiveReteKeyProjection projection;
	private MarkingSensitiveReteMarkingAssignment assignment;
	
	public MarkingSensitiveReteMarkingFilter getFilter() {
		return filter;
	}
	
	public void setFilter(MarkingSensitiveReteMarkingFilter value) {
		if(filter != null) {
			removeNode(filter);
		}
		
		this.filter = value;
		addNode(filter);
	}

	public MarkingSensitiveReteKeyProjection getProjection() {
		return projection;
	}

	public void setProjection(MarkingSensitiveReteKeyProjection value) {
		if(projection != null) {
			removeNode(projection);
		}
		
		this.projection = value;
		addNode(projection);
	}

	public MarkingSensitiveReteMarkingAssignment getAssignment() {
		return assignment;
	}

	public void setAssignment(MarkingSensitiveReteMarkingAssignment value) {
		if(assignment != null) {
			removeNode(assignment);
		}
		
		this.assignment = value;
		addNode(assignment);
	}
	
}
