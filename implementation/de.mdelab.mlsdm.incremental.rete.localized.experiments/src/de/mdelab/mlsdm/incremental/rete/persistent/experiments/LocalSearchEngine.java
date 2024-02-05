package de.mdelab.mlsdm.incremental.rete.persistent.experiments;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.MLSDMExpressionInterpreterManager;
import de.mdelab.mlsdm.interpreter.facade.MLSDMMetamodelFacadeFactory;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.SearchModelBasedMatcher;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class LocalSearchEngine {

	protected StoryPattern pattern;
	protected MLSDMSearchModelBasedMatcher matcher;
	protected Set<EObject> changedVertices;

	protected NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope;
	
	public LocalSearchEngine(StoryPattern pattern) {
		this.pattern = pattern;
		this.matcher = createMatcher();
		this.changedVertices = new LinkedHashSet<EObject>();
		this.variablesScope = matcher.getVariablesScope();
	}

	public void registerModel(Collection<EObject> model) {
		Adapter adapter = createAdapter();
		for(EObject root:model) {
			adapter.setTarget(root);
		}
	}
	
	protected Adapter createAdapter() {
		return new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification)
			{
				super.notifyChanged(notification);
				
				changedVertices.add((EObject) notification.getNotifier());
			}
		};
	}

	public void initializeWithSubgraph(Collection<EObject> relevantSubgraph) {
		findMatches(relevantSubgraph);
	}

	public void processUpdate() {
		findMatches(changedVertices);
		changedVertices.clear();
	}
	
	protected void findMatches(Collection<EObject> anchor) {
		for(EObject vertex:anchor) {
			findMatches(vertex);
		}
	}

	protected void findMatches(EObject vertex) {
		try {
			for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
				if(EMFUtil.matchesSuperType(vertex.eClass(), (EClass) spo.getType())) {
					matcher.setVariablesScope(variablesScope);
					variablesScope.createVariable(spo.getName(), spo.getType(), vertex);
					
					while(matcher.findNextMatch()) {
					}
					
					matcher.reset();
					variablesScope.clear();
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
	}

	private MLSDMSearchModelBasedMatcher createMatcher() {
		MLSDMNotificationEmitter notificationEmitter = new MLSDMNotificationEmitter();
		Map<String, Object> parameters = new LinkedHashMap<String, Object>();
		parameters.put(SearchModelBasedMatcher.DISCARD_MATCH_STATES, false);
		try {
			return new MLSDMSearchModelBasedMatcher(pattern, new NotifierVariablesScope<>(notificationEmitter),
					MLSDMMetamodelFacadeFactory.INSTANCE,
					new MLSDMExpressionInterpreterManager(Experiment.class.getClassLoader()),
					new ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression>(MLSDMMetamodelFacadeFactory.INSTANCE.getExpressionFacade()),
					null,
					notificationEmitter,
					parameters) {
				
				@Override
				public boolean checkIsomorphism(Object instanceObject, Set<Object> newlyBoundInstanceObjects) {
					return true;
				}
			};
//			return new MLSDMPatternPartBasedMatcher(pattern, new NotifierVariablesScope<>(notificationEmitter),
//					MLSDMMetamodelFacadeFactory.INSTANCE, new MLSDMExpressionInterpreterManager(Experiment.class.getClassLoader()),
//					notificationEmitter);
		} catch (SDMException e) {
			e.printStackTrace();
		}
		return null;
	}

}
