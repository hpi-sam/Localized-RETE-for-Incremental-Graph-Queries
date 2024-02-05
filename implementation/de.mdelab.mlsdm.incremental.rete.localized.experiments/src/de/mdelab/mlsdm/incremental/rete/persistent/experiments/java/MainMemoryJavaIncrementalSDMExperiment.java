package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.sample.modisco.delta.MoDiscoDeltaReader;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.EdgeBasedLocalSearchEngine;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.LocalSearchEngine;
import de.mdelab.mlstorypatterns.StoryPattern;

public class MainMemoryJavaIncrementalSDMExperiment extends MainMemoryJavaIncrementalExperiment<StoryPattern> {

	protected LocalSearchEngine engine;
	
	public MainMemoryJavaIncrementalSDMExperiment(boolean measureMemory) {
		super(measureMemory);
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
	protected void initializeReteNet(MoDiscoDeltaReader model) {
		engine.registerModel(model.getModelRoots());
		
		Collection<EObject> relevantSubgraph = getRelevantSubgraph(model);
		engine.initializeWithSubgraph(relevantSubgraph);
	}

	@Override
	protected void processUpdate() {
		super.processUpdate();
		
		if(engine != null) {
			engine.processUpdate();
		}
	}

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: model, pattern, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		String patternFile = args[1];
		boolean measureMemory = Boolean.parseBoolean(args[2]);
		
		MainMemoryJavaIncrementalSDMExperiment experiment = new MainMemoryJavaIncrementalSDMExperiment(measureMemory);
		experiment.run(modelFile, patternFile);
	}

}
