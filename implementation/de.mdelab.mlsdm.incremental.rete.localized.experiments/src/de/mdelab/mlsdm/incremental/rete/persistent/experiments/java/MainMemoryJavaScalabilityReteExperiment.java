package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.modisco.java.Model;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.StaticEMFMetaData;
import de.mdelab.mlstorypatterns.StoryPattern;

public abstract class MainMemoryJavaScalabilityReteExperiment extends MainMemoryJavaScalabilityExperiment<StoryPattern> {

	protected String metaDataPath;
	protected ReteNet rete;
	protected ReteQueryManager queryManager;
	protected StoryPattern pattern;

	public MainMemoryJavaScalabilityReteExperiment(String metaDataPath, int packageNumber, boolean measureMemory) {
		super(packageNumber, measureMemory);
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
	protected void initializeReteNet(Model model) {
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

	protected abstract ReteQueryManager createQueryManager(Model  model);

}
