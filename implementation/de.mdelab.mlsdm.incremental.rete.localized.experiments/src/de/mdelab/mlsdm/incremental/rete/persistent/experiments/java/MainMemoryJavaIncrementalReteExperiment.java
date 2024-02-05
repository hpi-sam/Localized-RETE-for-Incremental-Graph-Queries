package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.sample.modisco.delta.MoDiscoDeltaReader;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.StaticEMFMetaData;
import de.mdelab.mlstorypatterns.StoryPattern;

public abstract class MainMemoryJavaIncrementalReteExperiment extends MainMemoryJavaIncrementalExperiment<StoryPattern> {

	protected String metaDataPath;
	protected ReteNet rete;
	protected ReteQueryManager queryManager;
	protected StoryPattern pattern;

	public MainMemoryJavaIncrementalReteExperiment(String metaDataPath, boolean measureMemory) {
		super(measureMemory);
		this.metaDataPath = metaDataPath;
	}

	@Override
	protected StoryPattern getQuery(String queryURI) {
		return (StoryPattern) EMFUtil.loadXmi(queryURI);
	}

	@Override
	protected void createReteNet(StoryPattern query) {
		EMFMetaData metaData = StaticEMFMetaData.parseMetaData(metaDataPath);
		rete = createReteNet(query, metaData);
		pattern = query;
	}

	@Override
	protected void initializeReteNet(MoDiscoDeltaReader model) {
		queryManager = createQueryManager(model);
		queryManager.flushUnhandledEvents();
		queryManager.registerReteNet(rete);
	}

	@Override
	protected void processUpdate() {
		super.processUpdate();
		if(queryManager != null) {
			queryManager.flushUnhandledEvents();
		}
	}

	protected abstract ReteNet createReteNet(StoryPattern query, EMFMetaData metaData);

	protected abstract ReteQueryManager createQueryManager(MoDiscoDeltaReader  model);
}
