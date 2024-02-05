package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.StaticEMFMetaData;
import de.mdelab.mlstorypatterns.StoryPattern;

public abstract class MainMemoryLDBCIncrementalReteExperiment extends MainMemoryLDBCIncrementalExperiment<StoryPattern> {

	protected String metaDataPath;
	protected ReteNet rete;
	protected ReteQueryManager queryManager;
	protected StoryPattern pattern;

	public MainMemoryLDBCIncrementalReteExperiment(String metaDataPath, double startPortion, boolean measureMemory) {
		super(startPortion, measureMemory);
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
	protected void initializeReteNet(LDBC_SNBLogReader model) {
		queryManager = createQueryManager(model);
		queryManager.flushUnhandledEvents();
		queryManager.registerReteNet(rete);
	}

	@Override
	protected void processUpdate() {
		super.processUpdate();
		queryManager.flushUnhandledEvents();
	}

	protected abstract ReteNet createReteNet(StoryPattern query, EMFMetaData metaData);

	protected abstract ReteQueryManager createQueryManager(LDBC_SNBLogReader model);
}
