package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import de.mdelab.modisco.viatra.patterns.plain.Composite;
import de.mdelab.modisco.viatra.patterns.plain.Observer;
import de.mdelab.modisco.viatra.patterns.plain.Path1;
import de.mdelab.modisco.viatra.patterns.plain.Path2;
import de.mdelab.modisco.viatra.patterns.plain.Path3;
import de.mdelab.modisco.viatra.patterns.plain.Path4;
import de.mdelab.modisco.viatra.patterns.plain.Singleton;
import de.mdelab.modisco.viatra.patterns.plain.Strategy;

public class VIATRAJavaQueryProvider {

	public static BaseMatcher<?> registerQueries(ViatraQueryEngine engine, JavaQueryID queryID) throws ViatraQueryException {
		switch(queryID) {
		case COMPOSITE:
			return registerComposite(engine);
		case OBSERVER:
			return registerObserver(engine);
		case PATH1:
			return registerPath1(engine);
		case PATH2:
			return registerPath2(engine);
		case PATH3:
			return registerPath3(engine);
		case PATH4:
			return registerPath4(engine);
		case SINGLETON:
			return registerSingleton(engine);
		case STRATEGY:
			return registerStrategy(engine);
		default:
			break;
		}
		return null;
	}

	private static BaseMatcher<?> registerComposite(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Composite.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerObserver(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Observer.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}
	
	private static BaseMatcher<?> registerSingleton(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Singleton.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerStrategy(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Strategy.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerPath1(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Path1.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerPath2(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Path2.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerPath3(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Path3.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}

	private static BaseMatcher<?> registerPath4(ViatraQueryEngine engine) throws ViatraQueryException {
		BaseMatcher<?> matcher = engine.getMatcher(Path4.Matcher.querySpecification());
		matcher.countMatches();
		return matcher;
	}
	
}
