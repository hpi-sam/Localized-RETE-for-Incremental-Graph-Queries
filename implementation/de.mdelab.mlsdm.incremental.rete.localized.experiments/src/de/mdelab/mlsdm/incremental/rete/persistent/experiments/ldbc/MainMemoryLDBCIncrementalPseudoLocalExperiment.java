package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;

public class MainMemoryLDBCIncrementalPseudoLocalExperiment extends MainMemoryLDBCIncrementalLocalExperiment {

	public MainMemoryLDBCIncrementalPseudoLocalExperiment(String metaDataPath, double startPortion, boolean measureMemory) {
		super(metaDataPath, startPortion, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(LDBC_SNBLogReader model) {
		PersistentReteQueryManager queryManager = new PersistentReteQueryManager();
		queryManager.setDynamicLoading(true);
		queryManager.observePatternStatistics(pattern);
		queryManager.registerEObject(model.getModel());
		for(Iterator<EObject> it = model.getModel().eAllContents(); it.hasNext();) {
			EObject o = it.next();
			queryManager.registerEObject(o);
		}
		return queryManager;
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
		
		MainMemoryLDBCIncrementalPseudoLocalExperiment experiment = new MainMemoryLDBCIncrementalPseudoLocalExperiment(metaDataFile, startPortion, measureMemory);
		experiment.run(modelFile, patternFile);
	}
}
