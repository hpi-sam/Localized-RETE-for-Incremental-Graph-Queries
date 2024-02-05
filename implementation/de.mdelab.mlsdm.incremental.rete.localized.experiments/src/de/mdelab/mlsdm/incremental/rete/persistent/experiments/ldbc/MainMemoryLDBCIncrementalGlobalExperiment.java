package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteResultProvider;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteSubgraphFilter;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.Experiment;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class MainMemoryLDBCIncrementalGlobalExperiment extends MainMemoryLDBCIncrementalReteExperiment {

	protected ReteSubgraphFilter subgraphFilter;

	public MainMemoryLDBCIncrementalGlobalExperiment(String metaDataPath, double startPortion, boolean measureMemory) {
		super(metaDataPath, startPortion, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(LDBC_SNBLogReader model) {
		ReteQueryManager queryManager = new ReteQueryManager();
		queryManager.observePatternStatistics(pattern);
		queryManager.registerEObject(model.getModel());
		
		initializeSubgraphFilter(model);
		return queryManager;
	}

	@Override
	protected ReteNet createReteNet(StoryPattern pattern, EMFMetaData metaData) {
		try {
			ReteNet rete = new DiameterBasedReteBuilder(pattern, metaData).createReteNet().e1;
			ReteNode root = rete.getRoot();

			ReteResultProvider resultProvider = new ReteResultProvider();
			resultProvider.setTableMask(root.getTableMask());
			rete.setRoot(resultProvider);
			
			if(Experiment.FILTER_RESULTS) {
				subgraphFilter = new ReteSubgraphFilter();
				subgraphFilter.setTableMask(root.getTableMask());
				subgraphFilter.addSuccessor(resultProvider);
				root.addSuccessor(subgraphFilter);
			}
			else {
				root.addSuccessor(resultProvider);
			}
			
			return rete;
		} catch (SDMException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	protected void initializeSubgraphFilter(LDBC_SNBLogReader model) {
		if(Experiment.FILTER_RESULTS) {
			subgraphFilter.addSubgraph(getRelevantSubgraph(model));
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 5) {
			System.out.println("5 arguments: model, pattern, metaData, startPortion, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		String patternFile = args[1];
		String metaDataFile = args[2];
		double startPortion = Double.parseDouble(args[3]);
		boolean measureMemory = Boolean.parseBoolean(args[4]);
		
		MainMemoryLDBCIncrementalGlobalExperiment experiment = new MainMemoryLDBCIncrementalGlobalExperiment(metaDataFile, startPortion, measureMemory);
		experiment.run(modelFile, patternFile);
	}

}
