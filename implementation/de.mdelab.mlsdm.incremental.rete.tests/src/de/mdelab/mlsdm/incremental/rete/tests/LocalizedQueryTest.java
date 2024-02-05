package de.mdelab.mlsdm.incremental.rete.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.StaticEMFMetaData;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.LocalizedReteAdapter;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.PersistentReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes.MarkingSensitiveReteResultProvider;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class LocalizedQueryTest extends QueryTest {


	protected void testBatchQueryPersistent(String queryName, String dataSet, String metaData) {
		StoryPattern pattern = readPattern("resource/patterns/" + queryName);
		EObject model = getFullModel(dataSet);
		
		Set<EObject> partialModel = getPartialModel(model);
		
		//test completeness of result after prefix
		ReteNet persistentRete = null;
		try {
			persistentRete = createPersistentRete(pattern, model, metaData);
		} catch (SDMException e1) {
			fail();
		}

		createPersistentQueryManager(persistentRete, partialModel, pattern, false);
		Set<Map<String, Object>> result = getMatches(persistentRete, pattern);
		
		Set<Map<String, Object>> reference = null;
		try {
			reference = findMatchesReference(pattern, model, partialModel);
		} catch (SDMException e) {
			fail();
		}

		for(Map<String, Object> r:reference) {
			if(!result.contains(r)) {
				System.out.println(r);
			}
		}
		assertSuperSet(result, reference);
	}
	
	protected void testIncrementalQueryPersistent(String queryName, String dataSet, String metaData) {
		StoryPattern pattern = readPattern("resource/patterns/" + queryName);
		LDBC_SNBLogReader logReader = getLogReader(dataSet);
		
		//replay prefix
		
		for(int i = 0; i < logReader.getLogSize() - 1000; i++) {
			logReader.executeNextAction();
		}
		EObject model = logReader.getModel();
		
		Set<EObject> partialModel = getPartialModel(model);
		
		//test completeness of result after prefix
		ReteNet persistentRete = null;
		try {
			persistentRete = createPersistentRete(pattern, model, metaData);
		} catch (SDMException e1) {
			fail();
		}

		PersistentReteQueryManager queryManager = createPersistentQueryManager(persistentRete, partialModel, pattern, false);
		Set<Map<String, Object>> result = getMatches(persistentRete, pattern);
		
		Set<Map<String, Object>> reference = null;
		try {
			reference = findMatchesReference(pattern, model, partialModel);
		} catch (SDMException e) {
			fail();
		}

		assertSuperSet(result, reference);
		
		//replay remaining log
		
		while(logReader.hasNextElement()) {
			logReader.executeNextAction();
		}

		//test completeness of result for final model
		
		queryManager.flushUnhandledEvents();
		result = getMatches(persistentRete, pattern);
		
		try {
			reference = findMatchesReference(pattern, model, partialModel);
		} catch (SDMException e) {
			fail();
		}
		
		assertSuperSet(result, reference);
	}

	private PersistentReteQueryManager createPersistentQueryManager(ReteNet persistentRete, Set<EObject> partialModel,
			StoryPattern pattern, boolean dynamicLoading) {
		PersistentReteQueryManager queryManager = new PersistentReteQueryManager();
		queryManager.setDynamicLoading(false);
		queryManager.observePatternStatistics(pattern);
		queryManager.registerEObjects(partialModel);
		queryManager.registerReteNet(persistentRete);
		return queryManager;
	}

	private Set<Map<String, Object>> findMatchesReference(StoryPattern pattern, EObject model,
			Set<EObject> partialModel) throws SDMException {
		MLSDMReferenceIndex referenceIndex = new MLSDMReferenceIndex();
		referenceIndex.registerEObject(model);
		
		Set<Map<String, Object>> matches = new LinkedHashSet<Map<String, Object>>();
		MLSDMSearchModelBasedMatcher matcher = createHomomorphismMatcher(pattern, referenceIndex);
		
		NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> vs =
				new NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(new MLSDMNotificationEmitter());
		for(EObject element:partialModel) {
			for(AbstractStoryPatternObject boundSPO:pattern.getStoryPatternObjects()) {
				if(EMFUtil.matchesSuperType(element.eClass(), (EClass) boundSPO.getType())) {
					vs.clear();
					vs.createVariable(boundSPO.getName(), boundSPO.getType(), element);
					matcher.setVariablesScope(vs);

					while(matcher.findNextMatch()) {
						Map<String, Object> match = new LinkedHashMap<String, Object>();
						for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
							match.put(spo.getName(), matcher.getVariable(spo.getName()).getValue());
						}
						matches.add(match);
					}
					
					matcher.reset();
				}
			}
		}
		
		return matches;
	}

	private Set<EObject> getPartialModel(EObject model) {
		Set<EObject> partialModel = new LinkedHashSet<EObject>();
		partialModel.add(((LdbcSNBModel) model).getOwnedPersons().get(0));
		return partialModel;
	}

	private Set<Map<String, Object>> getMatches(ReteNet r, StoryPattern pattern) {
		Set<Map<String, Object>> matches = new LinkedHashSet<Map<String, Object>>();
		
		MarkingSensitiveReteResultProvider resultProvider = (MarkingSensitiveReteResultProvider) r.getRoot();
		for(ReteTuple result:resultProvider.getTuples(Collections.emptyList())) {
			Map<String, Object> match = new LinkedHashMap<String, Object>();
			for(int i = 0; i < pattern.getStoryPatternObjects().size(); i++) {
				String name = pattern.getStoryPatternObjects().get(i).getName();
				Object image = result.get(i);
				match.put(name, image);
			}
			matches.add(match);
		}
		return matches;
	}

	protected ReteNet createPersistentRete(StoryPattern pattern, EObject host, String metaDataName) throws SDMException {
		EMFMetaData metaData = StaticEMFMetaData.parseMetaData("resource/instances/" + metaDataName);
		DiameterBasedReteBuilder builder = new DiameterBasedReteBuilder(pattern, metaData);
		ReteNet r = builder.createReteNet().e1;
		
		ReteNet persistentRete = new LocalizedReteAdapter().adaptReteNet(r);
		return persistentRete;
	}

	private void assertSuperSet(Set<Map<String, Object>> superSet, Set<Map<String, Object>> set) {
		for(Map<String, Object> element:set) {
			if(!superSet.contains(element)) {
				System.out.println(element);
			}
		}
		assertTrue(superSet.containsAll(set));
	}

}
