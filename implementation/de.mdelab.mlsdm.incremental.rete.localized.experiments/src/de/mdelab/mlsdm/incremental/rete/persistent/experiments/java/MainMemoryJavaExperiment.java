package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.modisco.java.emf.JavaPackage;

import de.mdelab.mlsdm.incremental.rete.persistent.experiments.MainMemoryExperiment;

public abstract class MainMemoryJavaExperiment<ModelType, Query> extends MainMemoryExperiment<ModelType, Query> {

	public MainMemoryJavaExperiment(boolean measureMemory) {
		super(measureMemory);
	}

	@Override
	protected void registerEPackages() {
		super.registerEPackages();
		JavaPackage.eINSTANCE.getName();
	}

}
