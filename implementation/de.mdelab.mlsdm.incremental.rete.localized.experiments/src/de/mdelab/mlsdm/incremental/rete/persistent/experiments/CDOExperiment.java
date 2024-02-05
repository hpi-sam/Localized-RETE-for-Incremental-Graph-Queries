package de.mdelab.mlsdm.incremental.rete.persistent.experiments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.examples.embedded.CDOFacade;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class CDOExperiment<SourceModelType, Query> extends Experiment<List<EObject>, Query> {

	protected static final String CDO_RESOURCE_URI = "cdo_db";
	protected static final String CDO_WARM_UP_URI = "cdo_warmup_db";
	protected static final String CDO_DATA_SOURCE_PATH = "models";

	protected CDOTransaction transaction;

	public CDOExperiment(boolean measureMemory) {
		super(measureMemory);
	}
	
	public void run(String modelFile, String queryURI) {
		if(!measureMemory) {
			//warm up
			performExperiment(modelFile, queryURI, CDO_WARM_UP_URI);
			System.gc();
		}
		
		//run experiment
		print = true;
		performExperiment(modelFile, queryURI, CDO_RESOURCE_URI);
		
		deleteDatabaseFiles();
	}

	public void performExperiment(String modelFile, String queryURI, String resourceURI) {
		registerEPackages();
		
		setUpResource(resourceURI, readModel(modelFile));

		CDOFacade.INSTANCE.activate();
		startTransaction();
		
		Resource r = createCDOResource(resourceURI);
		Query query = getQuery(queryURI);
		doPerformExperiment(r.getContents(), query);
		
		commitTransaction();
		CDOFacade.INSTANCE.deactivate();
	}

	private void setUpResource(String resourceURI, SourceModelType model) {
		CDOFacade.INSTANCE.activate();
		startTransaction();
		
		CDOResource resource = createCDOResource(resourceURI);
		addModel(resource, model);
		
		commitTransaction();
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		resource.unload();
		CDOFacade.INSTANCE.deactivate();
	}

	protected abstract SourceModelType readModel(String modelFile);

	protected abstract void addModel(Resource resource, SourceModelType model);

	public CDOResource createCDOResource(String resourceURI) {
		CDOResource r = transaction.getOrCreateResource(resourceURI);
		return r;
	}

	protected void startTransaction() {
		transaction = CDOFacade.INSTANCE.getTransaction();
	}

	protected void commitTransaction() {
		try {
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		transaction = null;
	}

	private void deleteDatabaseFiles() {
		deleteFile(CDOFacade.DB_FOLDER);
	}

	private void deleteFile(File file) {
		if(file.isDirectory()) {
			for(File child:file.listFiles()) {
				deleteFile(child);
			}
		}
		file.delete();
	}

//	public void performExperiment(String modelFile, String queryURI, String resourceURI) {
//		registerEPackages();
//		
//		setUpResource(resourceURI, readModel(modelFile));
//		Resource r = createCDOResource(resourceURI);
//
//		Query query = getQuery(queryURI);
//		
//		doPerformExperiment(r.getContents(), query);
//		
//		tearDownResourceConnection();
//
//		deleteDatabaseFiles(resourceURI);
//	}

//	protected void setUpResource(String resourceURI, SourceModelType model) {
//		Resource resource = createCDOResource(resourceURI);
//		
//		addModel(resource, model);
//		commitTransaction();
//		
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		resource.unload();
//		
//		tearDownResourceConnection();
//	}
//	
//	public CDOResource createCDOResource(String uri) {
//		JdbcDataSource dataSource = createDataSource("jdbc:h2:" + CDO_DATA_SOURCE_PATH + "/" + uri);
//		IStore store = createStore(dataSource);
//		IRepository repository = createRepository(store, uri);
//		IManagedContainer container = createContainer();
//		CDOServerUtil.addRepository(container, repository);
//		IJVMAcceptor acceptor = JVMUtil.getAcceptor(container, uri);
//		IJVMConnector connector = JVMUtil.getConnector(container, uri);
//		
//		CDOSession session = getSession(connector, uri);
//		session.options().setCollectionLoadingPolicy (CDOUtil.createCollectionLoadingPolicy(0, 300));
//		
//		transaction = session.openTransaction();
//
//		activeCloseables.add(transaction);
//		activeCloseables.add(session);
//		activeCloseables.add(connector);
//		activeCloseables.add(acceptor);
//		
//		activeLifecycles.add(container);
//		activeLifecycles.add(repository);
//		
//		CDOResource r = transaction.getOrCreateResource(uri);
//		return r;
//	}
//	
//	protected JdbcDataSource createDataSource(String url) {
//		JdbcDataSource dataSource = new JdbcDataSource();
//		dataSource.setURL(url);
//		return dataSource;
//	}
//
//	private IStore createStore(JdbcDataSource dataSource) {
//		IMappingStrategy strategy = CDODBUtil.createHorizontalMappingStrategy(true);
//		strategy.getProperties().put(IMappingStrategy.Props.QUALIFIED_NAMES, Boolean.TRUE.toString());
//		IDBAdapter adapter = new H2Adapter();
//		IDBConnectionProvider provider = DBUtil.createConnectionProvider(dataSource);
//		return CDODBUtil.createStore(strategy, adapter, provider);
//	}
//
//	private IRepository createRepository(IStore store, String name) {
//		Map<String, String> properties = new LinkedHashMap<String, String>();
//		properties.put(IRepository.Props.OVERRIDE_UUID, name);
//		properties.put(IRepository.Props.SUPPORTING_AUDITS, Boolean.FALSE.toString());
//		properties.put(IRepository.Props.SUPPORTING_BRANCHES, Boolean.FALSE.toString());
//		
//		return CDOServerUtil.createRepository(name, store, properties);
//	}
//
//	private IManagedContainer createContainer() {
//		IManagedContainer container = ContainerUtil.createContainer();
//		
//		Net4jUtil.prepareContainer(container);
//		JVMUtil.prepareContainer(container);
//		CDONet4jUtil.prepareContainer(container);
//		CDONet4jServerUtil.prepareContainer(container);
//		
//		container.activate();
//		return container;
//	}
//	
//	private CDOSession getSession(IJVMConnector connector, String name) {
//		CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
//		config.setConnector(connector);
//		config.setRepositoryName(name);
//		CDONet4jSession session = config.openNet4jSession();
//		session.options().getNet4jProtocol().setTimeout(1000000);
//		return session;
//	}
//	
//	protected void commitTransaction() {
//		try {
//			transaction.commit();
//		} catch (ConcurrentAccessException e) {
//			e.printStackTrace();
//		} catch (CommitException e) {
//			e.printStackTrace();
//		}
//		transaction = null;
//	}
//
//	protected void tearDownResourceConnection() {
//		while(!activeCloseables.isEmpty()) {
//			activeCloseables.removeFirst().close();
//		}
//
//		while(!activeLifecycles.isEmpty()) {
//			activeLifecycles.removeFirst().deactivate();
//		}
//	}
//
//	protected void deleteDatabaseFiles(String resourceURI) {
//		File oldH2File = new File(CDO_DATA_SOURCE_PATH + "/" + resourceURI + ".h2.db");
//		if(oldH2File.exists()) {
//			deleteFile(oldH2File);
//		}
//		File oldTraceFile = new File(CDO_DATA_SOURCE_PATH + "/" + resourceURI + ".trace.db");
//		if(oldTraceFile.exists()) {
//			deleteFile(oldTraceFile);
//		}
//	}
//
	
}
