package de.mdelab.mlsdm.incremental.rete.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.MlsdmPackage;
import de.mdelab.mlsdm.interpreter.MLSDMExpressionInterpreterManager;
import de.mdelab.mlsdm.interpreter.facade.MLSDMMetamodelFacadeFactory;
import de.mdelab.mlsdm.incremental.rete.dynamic.DynamicReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.dynamic.NetSizeBasedQueryManager;
import de.mdelab.mlsdm.incremental.rete.dynamic.StaticNetQueryManager;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.model.MLSDMSearchModel;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.MlstorypatternsPackage;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.PatternNode;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class QueryTest {

	protected void testBatchQuery(String queryName, String dataSet) {
		StoryPattern pattern = readPattern("resource/patterns/" + queryName);
		EObject model = getFullModel(dataSet);
		
		Set<Map<String, Object>> result = null;
		try {
			result = findMatchesHostGraphSensitiveRete(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		Set<Map<String, Object>> reference = null;
		try {
			reference = findMatchesReference(pattern, model);
		} catch (SDMException e) {
			fail();
		}

		assertEquals(result, reference);
	}

	protected void testIncrementalQueryStatic(String queryName, String dataSet) {
		StoryPattern pattern = readPattern("resource/patterns/" + queryName);
		LDBC_SNBLogReader logReader = getLogReader(dataSet);
		
		//replay prefix
		
		for(int i = 0; i < logReader.getLogSize() - 1000; i++) {
			logReader.executeNextAction();
		}
		EObject model = logReader.getModel();
		
		//test correctness of result after prefix
		
		DynamicReteQueryManager queryManager = null;
		try {
			queryManager = createStaticReteQueryManager(pattern, model);
		} catch (SDMException e1) {
			fail();
		}
		
		Set<Map<String, Object>> result = getMatches(queryManager);
		
		Set<Map<String, Object>> reference = null;
		try {
			reference = findMatchesReference(pattern, model);
		} catch (SDMException e) {
			fail();
		}

		assertEquals(result, reference);
		
		//replay remaining log
		
		while(logReader.hasNextElement()) {
			logReader.executeNextAction();
		}

		//test correctness of result for final model
		
		queryManager.flushUnhandledEvents();
		result = getMatches(queryManager);
		
		try {
			reference = findMatchesReference(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		assertEquals(result, reference);
	}

	protected void testIncrementalQueryDynamic(String queryName, String dataSet) {
		StoryPattern pattern = readPattern("resource/patterns/" + queryName);
		LDBC_SNBLogReader logReader = getLogReader(dataSet);
		EObject model = logReader.getModel();

		DynamicReteQueryManager queryManager = null;
		try {
			queryManager = createDynamicReteQueryManager(pattern, model);
		} catch (SDMException e1) {
			fail();
		}
		
		//replay prefix

		for(int i = 0; i < logReader.getLogSize() - 1000; i++) {
			logReader.executeNextAction();
		}
		
		//test correctness of result after prefix
		
		queryManager.flushUnhandledEvents();
		Set<Map<String, Object>> result = getMatches(queryManager);
		
		Set<Map<String, Object>> reference = null;
		try {
			reference = findMatchesReference(pattern, model);
		} catch (SDMException e) {
			fail();
		}

		assertEquals(result, reference);
		
		//replay remaining log
		
		while(logReader.hasNextElement()) {
			logReader.executeNextAction();
		}

		//test correctness of result for final model
		
		queryManager.flushUnhandledEvents();
		result = getMatches(queryManager);
		
		try {
			reference = findMatchesReference(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		assertEquals(result, reference);
	}

	protected EObject getFullModel(String dataSet) {
		LDBC_SNBLogReader logReader = getLogReader(dataSet);
		while(logReader.hasNextElement()) {
			logReader.executeNextAction();
		}
		return logReader.getModel();
	}

	protected LDBC_SNBLogReader getLogReader(String dataSet) {
		try {
			LDBC_SNBLogReader logReader = new LDBC_SNBLogReader("resource/instances/" + dataSet);
			return logReader;
		} catch (IOException e1) {
			fail();
		}
		return null;
	}

	protected DynamicReteQueryManager createStaticReteQueryManager(StoryPattern pattern, EObject host) throws SDMException {
		StaticNetQueryManager queryManager = new StaticNetQueryManager(pattern, host);
		return queryManager;
	}

	protected DynamicReteQueryManager createDynamicReteQueryManager(StoryPattern pattern, EObject host) throws SDMException {
		DynamicReteQueryManager queryManager = new NetSizeBasedQueryManager(pattern, host);
		return queryManager;
	}
	
	protected Set<Map<String, Object>> findMatchesHostGraphSensitiveRete(StoryPattern pattern, EObject host) throws SDMException {
		DynamicReteQueryManager manager = createStaticReteQueryManager(pattern, host);
		return getMatches(manager);
	}

	private Set<Map<String, Object>> getMatches(
			DynamicReteQueryManager manager) {
		String[] tupleNames = getTupleNames(manager);
		Set<Map<String, Object>> matches = new HashSet<Map<String, Object>>();
		for(ReteTuple tuple:manager.getResultProvider().getTuples(Collections.emptyList())) {
			Map<String, Object> match = new HashMap<String, Object>();
			for(int i = 0; i < tupleNames.length; i++) {
				match.put(tupleNames[i], tuple.get(i));
			}
			matches.add(match);
		}
		return matches;
	}

	protected Set<Map<String, Object>> findMatchesReference(StoryPattern pattern, EObject host) throws SDMException {
		MLSDMReferenceIndex referenceIndex = new MLSDMReferenceIndex();
		referenceIndex.registerEObject(host);
		
		Set<Map<String, Object>> matches = new HashSet<Map<String, Object>>();
		MLSDMSearchModelBasedMatcher matcher = createHomomorphismMatcher(pattern, referenceIndex);
		
		while(matcher.findNextMatch()) {
			Map<String, Object> match = new HashMap<String, Object>();
			for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
				match.put(spo.getName(), matcher.getVariable(spo.getName()).getValue());
			}
			matches.add(match);
		}
		return matches;
	}
	
	protected MLSDMSearchModelBasedMatcher createHomomorphismMatcher(StoryPattern pattern, MLSDMReferenceIndex referenceIndex) throws SDMException {
		return new MLSDMSearchModelBasedMatcher(pattern,
				new NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(new MLSDMNotificationEmitter()),
				new MLSDMExpressionInterpreterManager(QueryTest.class.getClassLoader()),
				new ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression>(MLSDMMetamodelFacadeFactory.INSTANCE.getExpressionFacade()),
				referenceIndex,
				new MLSDMNotificationEmitter()) {
			
			@Override
			public boolean checkIsomorphism(Object targetInstance) {
				return true;
			}
			
			@Override
			public boolean checkIsomorphism(Object instanceObject, Set<Object> newlyBoundInstanceObjects) {
				return true;
			}
		};
	}

	private String[] getTupleNames(DynamicReteQueryManager manager) {
		MLSDMSearchModel searchModel = manager.getReteBuilder().getSearchModel();
		String[] names = new String[searchModel.getPatternNodes().size()];
		for(PatternNode<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> node:searchModel.getPatternNodes()) {
			names[node.getId()] = node.getSpo().getName();
		}
		return names;
	}
	
	public static void registerEPackages() {
		registerEPackage(EcorePackage.eINSTANCE);
		registerEPackage(MlstorypatternsPackage.eINSTANCE);
		registerEPackage(MlsdmPackage.eINSTANCE);
		registerEPackage(Ldbc_snbPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
	}
	
	public static void registerEPackage(EPackage pkg) {
		//register ResourceFactory for loading models
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(pkg.getName().toLowerCase(), new XMIResourceFactoryImpl());
	}
	
	public static StoryPattern readPattern(String ruleFile) {
		return (StoryPattern) readEObject(ruleFile);
	}
	
	public static EObject readEObject(String file) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(file), true);
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r.getContents().get(0);
	}

}
