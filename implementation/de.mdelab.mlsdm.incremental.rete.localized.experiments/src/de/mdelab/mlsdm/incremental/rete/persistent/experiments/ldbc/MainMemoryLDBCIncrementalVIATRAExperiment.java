package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;

import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive1;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive10;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive11;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive12;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive2;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive3;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive3nac;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive4;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive4nac;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive4ngc_nested;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive5;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive6;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive7;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive8;
import de.mdelab.ldbc.snb.viatra.patterns.plain.Interactive9;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;

public class MainMemoryLDBCIncrementalVIATRAExperiment extends MainMemoryLDBCIncrementalExperiment<LDBCQueryID> {

	protected LDBCQueryID queryID;
	private AdvancedViatraQueryEngine engine;
	
	private long lastUpdateEnd;
	private long lastUpdateGCTimeEnd;
	
	public MainMemoryLDBCIncrementalVIATRAExperiment(double startPortion, boolean measureMemory) {
		super(startPortion, measureMemory);
	}

	@Override
	protected void doPerformExperiment(LDBC_SNBLogReader model, LDBCQueryID query) {
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
	protected LDBCQueryID getQuery(String queryURI) {
		return LDBCQueryID.valueOf(queryURI);
	}
	
	@Override
	protected void createReteNet(LDBCQueryID query) {
		queryID = query;
	}
	
	@Override
	protected void initializeReteNet(LDBC_SNBLogReader model) {
		engine = createEngine(model.getModel());
		registerQueries(engine, queryID);
	}

	@Override
	protected void processUpdate() {
		
	}
	
	public static AdvancedViatraQueryEngine createEngine(EObject model) throws ViatraQueryException {
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE);
		EMFScope scope = new EMFScope(model);
		ViatraQueryEngine engine = ViatraQueryEngine.on(scope);
		return AdvancedViatraQueryEngine.from(engine);
	}

	private BaseMatcher<?> registerQueries(ViatraQueryEngine engine, LDBCQueryID queryID) throws ViatraQueryException {
		switch(queryID) {
		case INTERACTIVE_1:
			return registerQuery1(engine);
		case INTERACTIVE_2:
			return registerQuery2(engine);
		case INTERACTIVE_3:
			return registerQuery3(engine);
		case INTERACTIVE_4:
			return registerQuery4(engine);
		case INTERACTIVE_5:
			return registerQuery5(engine);
		case INTERACTIVE_6:
			return registerQuery6(engine);
		case INTERACTIVE_7:
			return registerQuery7(engine);
		case INTERACTIVE_8:
			return registerQuery8(engine);
		case INTERACTIVE_9:
			return registerQuery9(engine);
		case INTERACTIVE_10:
			return registerQuery10(engine);
		case INTERACTIVE_11:
			return registerQuery11(engine);
		case INTERACTIVE_12:
			return registerQuery12(engine);
		case INTERACTIVE_3_NGC:
			return registerQuery3NAC(engine);
		case INTERACTIVE_4_NGC:
			return registerQuery4NAC(engine);
		case INTERACTIVE_4_NGC_NESTED:
			return registerQuery4NGCNested(engine);
		}
		return null;
	}

	private static BaseMatcher<?> registerQuery1(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher1 = engine.getMatcher(Interactive1.Matcher.querySpecification());
		matcher1.countMatches();
		return matcher1;
	}

	private static BaseMatcher<?> registerQuery2(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher2 = engine.getMatcher(Interactive2.Matcher.querySpecification());
		matcher2.countMatches();
		return matcher2;
	}

	private static BaseMatcher<?> registerQuery3(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher3 = engine.getMatcher(Interactive3.Matcher.querySpecification());
		matcher3.countMatches();
		return matcher3;
	}

	private static BaseMatcher<?> registerQuery4(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher4 = engine.getMatcher(Interactive4.Matcher.querySpecification());
		matcher4.countMatches();
		return matcher4;
	}

	private static BaseMatcher<?> registerQuery5(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher5 = engine.getMatcher(Interactive5.Matcher.querySpecification());
		matcher5.countMatches();
		return matcher5;
	}

	private static BaseMatcher<?> registerQuery6(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher6 = engine.getMatcher(Interactive6.Matcher.querySpecification());
		matcher6.countMatches();
		return matcher6;
	}

	private static BaseMatcher<?> registerQuery7(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher7 = engine.getMatcher(Interactive7.Matcher.querySpecification());
		matcher7.countMatches();
		return matcher7;
	}

	private static BaseMatcher<?> registerQuery8(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher8 = engine.getMatcher(Interactive8.Matcher.querySpecification());
		matcher8.countMatches();
		return matcher8;
	}
	
	private static BaseMatcher<?> registerQuery9(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher9 = engine.getMatcher(Interactive9.Matcher.querySpecification());
		matcher9.countMatches();
		return matcher9;
	}
	
	private static BaseMatcher<?> registerQuery10(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher10 = engine.getMatcher(Interactive10.Matcher.querySpecification());
		matcher10.countMatches();
		return matcher10;
	}
	
	private static BaseMatcher<?> registerQuery11(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher11 = engine.getMatcher(Interactive11.Matcher.querySpecification());
		matcher11.countMatches();
		return matcher11;
	}

	private static BaseMatcher<?> registerQuery12(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher12 = engine.getMatcher(Interactive12.Matcher.querySpecification());
		matcher12.countMatches();
		return matcher12;
	}

	private static BaseMatcher<?> registerQuery3NAC(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher3NAC = engine.getMatcher(Interactive3nac.Matcher.querySpecification());
		matcher3NAC.countMatches();
		return matcher3NAC;
	}

	private static BaseMatcher<?> registerQuery4NAC(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher4NAC = engine.getMatcher(Interactive4nac.Matcher.querySpecification());
		matcher4NAC.countMatches();
		return matcher4NAC;
	}

	private static BaseMatcher<?> registerQuery4NGCNested(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher4NGCNested = engine.getMatcher(Interactive4ngc_nested.Matcher.querySpecification());
		matcher4NGCNested.countMatches();
		return matcher4NGCNested;
	}
	
	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("4 arguments: modelFile, queryID, startPortion, measureMemory");
			return;
		}

		String modelFile = args[0];
		String queryID = args[1];
		double startPortion = Double.parseDouble(args[2]);
		boolean measureMemory = Boolean.parseBoolean(args[3]);
		
		MainMemoryLDBCIncrementalVIATRAExperiment experiment = new MainMemoryLDBCIncrementalVIATRAExperiment(startPortion, measureMemory);
		experiment.run(modelFile, queryID);
	}

}
