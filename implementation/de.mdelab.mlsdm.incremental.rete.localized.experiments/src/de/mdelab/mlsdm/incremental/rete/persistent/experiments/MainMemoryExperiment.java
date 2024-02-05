package de.mdelab.mlsdm.incremental.rete.persistent.experiments;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

public abstract class MainMemoryExperiment<ModelType, Query> extends Experiment<ModelType, Query> {

	public MainMemoryExperiment(boolean measureMemory) {
		super(measureMemory);
	}

	public void run(String modelFile, String queryURI) {
		if(!measureMemory) {
			//warm up
			performExperiment(modelFile, queryURI);
			System.gc();
		}
		
		//run experiment
		print = true;
		performExperiment(modelFile, queryURI);
	}
	
	public void performExperiment(String modelFile, String queryURI) {
		registerEPackages();

		Query query = getQuery(queryURI);
		
		ModelType model = readModel(modelFile);

		doPerformExperiment(model, query);
	}
	
	protected void registerEPackages() {
		MlstorypatternsPackage.eINSTANCE.getName();
	}

	protected abstract ModelType readModel(String modelFile);

}
