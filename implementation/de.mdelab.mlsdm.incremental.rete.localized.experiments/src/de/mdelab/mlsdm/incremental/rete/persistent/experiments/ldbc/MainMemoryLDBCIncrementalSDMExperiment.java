package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.EdgeBasedLocalSearchEngine;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.LocalSearchEngine;
import de.mdelab.mlstorypatterns.StoryPattern;

public class MainMemoryLDBCIncrementalSDMExperiment extends MainMemoryLDBCIncrementalExperiment<StoryPattern> {

	protected LocalSearchEngine engine;
	
	public MainMemoryLDBCIncrementalSDMExperiment(double startPortion, boolean measureMemory) {
		super(startPortion, measureMemory);
	}

	@Override
	protected StoryPattern getQuery(String queryURI) {
		return (StoryPattern) EMFUtil.loadXmi(queryURI);
	}

	@Override
	protected void createReteNet(StoryPattern query) {
		engine = new EdgeBasedLocalSearchEngine(query);
	}

	@Override
	protected void initializeReteNet(LDBC_SNBLogReader model) {
		engine.registerModel(Collections.singleton(model.getModel()));
		
		Collection<EObject> relevantSubgraph = getRelevantSubgraph(model);
		engine.initializeWithSubgraph(relevantSubgraph);
	}

	@Override
	protected void processUpdate() {
		super.processUpdate();
		
		engine.processUpdate();
	}


	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("4 arguments: modelFile, patternFile, startPortion, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		String patternFile = args[1];
		double startPortion = Double.parseDouble(args[2]);
		boolean measureMemory = Boolean.parseBoolean(args[3]);
		
		MainMemoryLDBCIncrementalSDMExperiment experiment = new MainMemoryLDBCIncrementalSDMExperiment(startPortion, measureMemory);
		experiment.run(modelFile, patternFile);
	}

}
