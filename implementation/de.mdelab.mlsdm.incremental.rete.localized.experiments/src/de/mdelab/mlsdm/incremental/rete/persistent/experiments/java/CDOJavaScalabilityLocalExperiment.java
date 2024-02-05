package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.LocalizedReteAdapter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class CDOJavaScalabilityLocalExperiment extends CDOJavaScalabilityReteExperiment {

	public CDOJavaScalabilityLocalExperiment(String metaDataPath, int packageNumber, boolean measureMemory) {
		super(metaDataPath, packageNumber, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(List<EObject>  model) {
		ReteQueryManager queryManager = new PersistentReteQueryManager();
		queryManager.observePatternStatistics(pattern);
		for(EObject vertex:getRelevantSubgraph(model)) {
			queryManager.registerEObject(vertex);
		}
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
		if(args.length < 4) {
			System.out.println("4 arguments: packageNumber, pattern, metaData, measureMemory");
			return;
		}
		
		int packageNumber = Integer.parseInt(args[0]);
		String patternFile = args[1];
		String metaDataFile = args[2];
		boolean measureMemory = Boolean.parseBoolean(args[3]);
		
		CDOJavaScalabilityLocalExperiment experiment = new CDOJavaScalabilityLocalExperiment(metaDataFile, packageNumber, measureMemory);
		experiment.run("dummy", patternFile);
	}

}
