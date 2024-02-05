package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.sample.modisco.delta.MoDiscoDeltaReader;
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

public class MainMemoryJavaIncrementalGlobalExperiment extends MainMemoryJavaIncrementalReteExperiment {

	protected ReteSubgraphFilter subgraphFilter;
	
	public MainMemoryJavaIncrementalGlobalExperiment(String metaDataPath, boolean measureMemory) {
		super(metaDataPath, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(MoDiscoDeltaReader model) {
		ReteQueryManager queryManager = new ReteQueryManager();
		queryManager.observePatternStatistics(pattern);
		for(EObject root:model.getModelRoots()) {
			queryManager.registerEObject(root);
		}

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
	
	protected void initializeSubgraphFilter(MoDiscoDeltaReader model) {
		if(Experiment.FILTER_RESULTS) {
			subgraphFilter.addSubgraph(getRelevantSubgraph(model));
		}
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
		
		MainMemoryJavaIncrementalGlobalExperiment experiment = new MainMemoryJavaIncrementalGlobalExperiment(metaDataFile, measureMemory);
		experiment.run(modelFile, patternFile);
	}

}
