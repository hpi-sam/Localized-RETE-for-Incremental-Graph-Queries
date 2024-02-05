package de.mdelab.mlsdm.incremental.rete;

import org.eclipse.emf.ecore.EClassifier;

import de.mdelab.mlsdm.incremental.rete.util.FeatureSpecification;

public interface EMFMetaData {

	public double getDomainSize(EClassifier type);

	double getDomainSize(FeatureSpecification feature);

	public Iterable<EClassifier> getRegisteredClassifiers();
	
	public Iterable<FeatureSpecification> getRegisteredFeatures();

}
