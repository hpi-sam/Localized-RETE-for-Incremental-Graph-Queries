package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.sample.modisco.delta.MoDiscoDeltaReader;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.LocalizedReteAdapter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class MainMemoryJavaIncrementalLocalExperiment extends MainMemoryJavaIncrementalReteExperiment {

	public MainMemoryJavaIncrementalLocalExperiment(String metaDataPath, boolean measureMemory) {
		super(metaDataPath, measureMemory);
	}

	@Override
	protected ReteNet createReteNet(StoryPattern pattern, EMFMetaData metaData) {
		try {
			ReteNet regularRete = new DiameterBasedReteBuilder(pattern, metaData).createReteNet().e1;
			ReteNet localizedRete = new LocalizedReteAdapter().adaptReteNet(regularRete);
			
			return localizedRete;
		} catch (SDMException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected ReteQueryManager createQueryManager(MoDiscoDeltaReader model) {
		PersistentReteQueryManager queryManager = new PersistentReteQueryManager();
		queryManager.setDynamicLoading(false);
		queryManager.observePatternStatistics(pattern);
		for(EObject vertex:getRelevantSubgraph(model)) {
			queryManager.registerEObject(vertex);
		}
		return queryManager;
	}

	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("4 arguments: model, pattern, metaData, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		String patternFile = args[1];
		String metaDataFile = args[2];
		boolean measureMemory = Boolean.parseBoolean(args[3]);
		
		MainMemoryJavaIncrementalLocalExperiment experiment = new MainMemoryJavaIncrementalLocalExperiment(metaDataFile, measureMemory);
		experiment.run(modelFile, patternFile);
	}
}
