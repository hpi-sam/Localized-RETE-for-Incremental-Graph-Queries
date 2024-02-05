package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import java.io.IOException;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.log.LDBC_SNBBidirectionalLogReader;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.MainMemoryExperiment;

public abstract class MainMemoryLDBCExperiment<Query> extends MainMemoryExperiment<LDBC_SNBLogReader, Query> {

	public MainMemoryLDBCExperiment(boolean measureMemory) {
		super(measureMemory);
		this.outputFrequencyMemory = 10000;
		this.outputFrequencyTime = 1000;
	}

	@Override
	protected void registerEPackages() {
		super.registerEPackages();
		Ldbc_snbPackage.eINSTANCE.getName();
	}

	@Override
	protected LDBC_SNBLogReader readModel(String modelFile) {
		try {
			return new LDBC_SNBBidirectionalLogReader(modelFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
