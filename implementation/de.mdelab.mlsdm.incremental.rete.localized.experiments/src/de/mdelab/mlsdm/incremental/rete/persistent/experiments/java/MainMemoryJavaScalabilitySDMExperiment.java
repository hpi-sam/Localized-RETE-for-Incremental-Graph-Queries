package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Model;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.EdgeBasedLocalSearchEngine;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.LocalSearchEngine;
import de.mdelab.mlstorypatterns.StoryPattern;

public class MainMemoryJavaScalabilitySDMExperiment extends MainMemoryJavaScalabilityExperiment<StoryPattern> {

	protected LocalSearchEngine engine;
	
	public MainMemoryJavaScalabilitySDMExperiment(int packageNumber, boolean measureMemory) {
		super(packageNumber, measureMemory);
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
	protected void initializeReteNet(Model model) {
		engine.registerModel(Collections.singleton(model));
		
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
			System.out.println("3 arguments: packageNumber, pattern, measureMemory");
			return;
		}
		
		int packageNumber = Integer.parseInt(args[0]);
		String patternFile = args[1];
		boolean measureMemory = Boolean.parseBoolean(args[2]);
		
		MainMemoryJavaScalabilitySDMExperiment experiment = new MainMemoryJavaScalabilitySDMExperiment(packageNumber, measureMemory);
		experiment.run("dummy", patternFile);
	}

}
