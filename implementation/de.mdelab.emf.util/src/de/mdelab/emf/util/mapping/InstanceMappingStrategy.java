package de.mdelab.emf.util.mapping;

import org.eclipse.emf.ecore.EObject;

public interface InstanceMappingStrategy {

	public InstanceMapping createInstanceMapping(EObject source, EObject target);

}
