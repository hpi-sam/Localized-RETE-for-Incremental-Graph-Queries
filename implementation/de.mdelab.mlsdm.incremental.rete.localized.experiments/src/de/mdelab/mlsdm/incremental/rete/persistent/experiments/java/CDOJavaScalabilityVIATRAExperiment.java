package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;

public class CDOJavaScalabilityVIATRAExperiment extends CDOJavaScalabilityExperiment<JavaQueryID> {

	protected JavaQueryID queryID;

	private AdvancedViatraQueryEngine engine;

	private long lastUpdateEnd;
	private long lastUpdateGCTimeEnd;

	public CDOJavaScalabilityVIATRAExperiment(int packageNumber, boolean measureMemory) {
		super(packageNumber, measureMemory);
	}

	@Override
	protected void doPerformExperiment(List<EObject> model, JavaQueryID query) {
		initializeModel(model);
		createReteNet(query);
		
		int outputFrequency;
		int timeout;
		if(measureMemory) {
			outputFrequency = outputFrequencyMemory ;
			timeout = 18000000;
		}
		else {
			outputFrequency = outputFrequencyTime;
			timeout = 180000000;
		}

		long experimentStart = System.currentTimeMillis();
		
		int updateCount = 0;
		long startMeasurement = measureMemory ? 0 : System.nanoTime();
		long gcStart = getGarbageCollectionTime();
		initializeReteNet(model);
		long gcEnd = getGarbageCollectionTime();
		long endMeasurement = measureMemory ? getMemoryConsumption() : System.nanoTime();
		
		if(measureMemory) {
			println("MEMORY;" + updateCount + "\t" + (endMeasurement - startMeasurement));
		}
		else {
			println("UPDATE;" + updateCount + "\t" + (endMeasurement - startMeasurement));
			println("GC;" + updateCount + "\t" + (gcEnd - gcStart));
		}

		long updateTime = 0;
		long gcTime = 0;
		while(hasNextUpdate(model)) {
			updateCount++;
			try {
				engine.delayUpdatePropagation(new Callable<Void>() {

					@Override
					public Void call() throws Exception {
						performUpdate(model);
						lastUpdateGCTimeEnd = getGarbageCollectionTime();
						lastUpdateEnd = System.nanoTime();
						return null;
					}
					
				});
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			processUpdate();
			long end = System.nanoTime();
			long gcTimeEnd = getGarbageCollectionTime();
			updateTime += (end - lastUpdateEnd);
			gcTime += (gcTimeEnd - lastUpdateGCTimeEnd);
			
			if(updateCount % outputFrequency == 0) {
				String logEntry;
				if(measureMemory) {
			        logEntry = updateCount + "\t" + (getMemoryConsumption() - startMeasurement);
					println("MEMORY;" + logEntry);
				}
				else {
					logEntry = updateCount + "\t" + updateTime;
					println("UPDATE;" + logEntry);
					println("GC;" + updateCount + "\t" + gcTime);
					updateTime = 0;
					gcTime = 0;
				}
			}
			
			if(System.currentTimeMillis() - experimentStart >= timeout) {
				break;
			}
		}
	}
	
	@Override
	protected JavaQueryID getQuery(String queryURI) {
		return JavaQueryID.valueOf(queryURI);
	}
	
	@Override
	protected void createReteNet(JavaQueryID query) {
		queryID = query;
	}
	
	@Override
	protected void initializeReteNet(List<EObject> model) {
		engine = createEngine(model);
		VIATRAJavaQueryProvider.registerQueries(engine, queryID);
	}
	
	@Override
	protected void processUpdate() {
		super.processUpdate();
	}

	public static AdvancedViatraQueryEngine createEngine(List<EObject> roots) throws ViatraQueryException {
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE);
		EMFScope scope = new EMFScope(new LinkedHashSet<EObject>(roots), new BaseIndexOptions());
		ViatraQueryEngine engine = ViatraQueryEngine.on(scope);
		return AdvancedViatraQueryEngine.from(engine);
	}

	public static void main(String[] args) throws ViatraQueryException, IOException {
		if(args.length < 3) {
			System.out.println("3 arguments: packageNumber, queryID, measureMemory");
			return;
		}

		int packageNumber = Integer.parseInt(args[0]);
		String queryID = args[1];
		boolean measureMemory = Boolean.parseBoolean(args[2]);
		
		CDOJavaScalabilityVIATRAExperiment experiment = new CDOJavaScalabilityVIATRAExperiment(packageNumber, measureMemory);
		experiment.run("dummy", queryID);
	}

}
