package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

public abstract class LDBC_SNBElementAction<T> {

	private long timestamp;

	public LDBC_SNBElementAction(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public abstract T executeAction(EObject model);

	public abstract void undoAction(EObject model);
	
	public long getTimestamp() {
		return timestamp;
	}

}
