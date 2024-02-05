package de.mdelab.mlsdm.incremental.rete.persistent.experiments;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

import de.mdelab.mlsdm.incremental.rete.persistent.marking.LocalizedReteAdapter;
import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

public abstract class Experiment<ModelType, Query> {

	private static final int REDUNDANT_MEMORY_MEASUREMENTS = 1;
	
	protected static final boolean FILTER_RESULTS = LocalizedReteAdapter.FILTER_RESULTS;
	
	protected boolean measureMemory = false;
	protected boolean print = false;
	protected int outputFrequencyTime = 1;
	protected int outputFrequencyMemory = 1;

	public Experiment(boolean measureMemory) {
		this.measureMemory = measureMemory;
	}

	protected void doPerformExperiment(ModelType model, Query query) {
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
			performUpdate(model);
			long gcTimeStart = getGarbageCollectionTime();
			long start = System.nanoTime();
			processUpdate();
			long end = System.nanoTime();
			long gcTimeEnd = getGarbageCollectionTime();
			updateTime += (end - start);
			gcTime += (gcTimeEnd - gcTimeStart);
			

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
	
	protected abstract Query getQuery(String queryURI);

	protected abstract void initializeModel(ModelType model);

	protected abstract boolean hasNextUpdate(ModelType model);

	protected abstract void performUpdate(ModelType model);

	protected abstract void createReteNet(Query query);

	protected abstract void initializeReteNet(ModelType model);

	protected abstract void processUpdate();

	protected void println(String string) {
		if(print) {
			System.out.println(string);
		}
	}

	protected long getMemoryConsumption() {
		long memory = doGetMemoryConsumption();
		for(int i = 0; i < REDUNDANT_MEMORY_MEASUREMENTS; i++) {
			memory = doGetMemoryConsumption();
		}
		return memory;
	}

	protected long doGetMemoryConsumption() {
		System.gc();
		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}

	protected void registerEPackages() {
		MlstorypatternsPackage.eINSTANCE.getName();
	}

	protected static long getGarbageCollectionTime() {
	    long collectionTime = 0;
	    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
	        collectionTime += garbageCollectorMXBean.getCollectionTime();
	    }
	    return collectionTime;
	}
}
