package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.LocalizedReteAdapter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class MainMemoryLDBCIncrementalLocalExperiment extends MainMemoryLDBCIncrementalReteExperiment {

	public MainMemoryLDBCIncrementalLocalExperiment(String metaDataPath, double startPortion, boolean measureMemory) {
		super(metaDataPath, startPortion, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(LDBC_SNBLogReader model) {
		PersistentReteQueryManager queryManager = new PersistentReteQueryManager();
		queryManager.setDynamicLoading(false);
		queryManager.observePatternStatistics(pattern);
		queryManager.registerEObjects(getRelevantSubgraph(model));
		return queryManager;
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

	public static void main(String[] args) {
		if(args.length < 5) {
			System.out.println("5 arguments: modelFile, patternFile, metaData, startPortion, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		String patternFile = args[1];
		String metaDataFile = args[2];
		double startPortion = Double.parseDouble(args[3]);
		boolean measureMemory = Boolean.parseBoolean(args[4]);
		
		MainMemoryLDBCIncrementalLocalExperiment experiment = new MainMemoryLDBCIncrementalLocalExperiment(metaDataFile, startPortion, measureMemory);
		experiment.run(modelFile, patternFile);
	}
}
