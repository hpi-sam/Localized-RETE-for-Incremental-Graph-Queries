package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.mdelab.mlsdm.incremental.rete.persistent.experiments.CDOExperiment;

public abstract class CDOJavaExperiment<Query> extends CDOExperiment<Model, Query> {

	public CDOJavaExperiment(boolean measureMemory) {
		super(measureMemory);
	}

	@Override
	protected void registerEPackages() {
		super.registerEPackages();
		JavaPackage.eINSTANCE.getName();
	}

}
