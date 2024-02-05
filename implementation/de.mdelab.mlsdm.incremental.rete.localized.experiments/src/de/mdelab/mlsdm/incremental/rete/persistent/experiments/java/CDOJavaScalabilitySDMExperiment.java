package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.EdgeBasedLocalSearchEngine;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.LocalSearchEngine;
import de.mdelab.mlstorypatterns.StoryPattern;

public class CDOJavaScalabilitySDMExperiment extends CDOJavaScalabilityExperiment<StoryPattern> {

	protected LocalSearchEngine engine;
	
	public CDOJavaScalabilitySDMExperiment(int packageNumber, boolean measureMemory) {
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
	protected void initializeReteNet(List<EObject> model) {
		engine.registerModel(model);
		
		Collection<EObject> relevantSubgraph = getRelevantSubgraph(model);
		engine.initializeWithSubgraph(relevantSubgraph);
	}

	@Override
	protected void processUpdate() {
		super.processUpdate();
		
		engine.processUpdate();
	}

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: packageNumber, pattern, measureMemory");
			return;
		}
		
		int packageNumber = Integer.parseInt(args[0]);
		String patternFile = args[1];
		boolean measureMemory = Boolean.parseBoolean(args[2]);
		
		CDOJavaScalabilitySDMExperiment experiment = new CDOJavaScalabilitySDMExperiment(packageNumber, measureMemory);
		experiment.run("dummy", patternFile);
	}

}
