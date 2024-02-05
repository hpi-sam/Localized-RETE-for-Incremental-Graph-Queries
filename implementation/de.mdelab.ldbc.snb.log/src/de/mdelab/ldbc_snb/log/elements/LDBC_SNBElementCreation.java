package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

public abstract class LDBC_SNBElementCreation<T> {

	private long creationTime;

	public LDBC_SNBElementCreation(long creationTime) {
		this.creationTime = creationTime;
	}
	
	public abstract T createElement(EObject model);

	public abstract void removeElement(EObject model);
	
	public long getCreationTime() {
		return creationTime;
	}

}
