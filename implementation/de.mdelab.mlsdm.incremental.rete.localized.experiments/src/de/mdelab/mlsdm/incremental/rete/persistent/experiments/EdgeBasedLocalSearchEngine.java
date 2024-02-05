package de.mdelab.mlsdm.incremental.rete.persistent.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.mlstorypatterns.StoryPatternLink;
import de.mdelab.sdm.interpreter.core.SDMException;

public class EdgeBasedLocalSearchEngine extends LocalSearchEngine {

	protected List<Notification> changeNotifications;

	public EdgeBasedLocalSearchEngine(StoryPattern pattern) {
		super(pattern);
		this.changeNotifications = new ArrayList<Notification>();
	}

	@Override
	public void processUpdate() {
		findMatches(changeNotifications);
		changeNotifications.clear();
	}

	@SuppressWarnings("unchecked")
	private void findMatches(List<Notification> notifications) {
		for(Notification notification:notifications) {
			if(notification.getFeature() instanceof EReference) {
				EReference reference = (EReference) notification.getFeature();
				EObject source = (EObject) notification.getNotifier();
				Collection<EObject> newTargets = Collections.emptySet();
				Collection<EObject> oldTargets = Collections.emptySet();
				switch (notification.getEventType()) {
					case Notification.ADD:
						newTargets = Collections.singleton((EObject) notification.getNewValue());
						break;
					case Notification.ADD_MANY:
						newTargets = (Collection<EObject>) notification.getNewValue();
						break;
					case Notification.REMOVE:
						oldTargets = Collections.singleton((EObject) notification.getOldValue());
						break;
					case Notification.REMOVE_MANY:
						oldTargets = (Collection<EObject>) notification.getOldValue();
						break;
					case Notification.SET:
						if(reference.isMany()) {
							newTargets = (Collection<EObject>) notification.getNewValue();
							oldTargets = (Collection<EObject>) notification.getOldValue();
						}
						else {
							newTargets = Collections.singleton((EObject) notification.getNewValue());
							oldTargets = Collections.singleton((EObject) notification.getOldValue());
						}
						break;
					case Notification.UNSET:
						if(reference.isMany()) {
							oldTargets = (Collection<EObject>) notification.getOldValue();
						}
						else {
							oldTargets = Collections.singleton((EObject) notification.getOldValue());
						}
						break;
				}
				
				for(EObject newTarget:newTargets) {
					findMatches(source, reference, newTarget);
				}
				for(@SuppressWarnings("unused") EObject oldTarget:oldTargets) {
					//check existing matches
				}
			}
		}
	}

	private void findMatches(EObject source, EReference reference, EObject target) {
		try {
			for(AbstractStoryPatternLink link:pattern.getStoryPatternLinks()) {
				if(link instanceof StoryPatternLink &&
						((StoryPatternLink) link).getFeature() == reference) {
					AbstractStoryPatternObject sourceSPO = link.getSource();
					AbstractStoryPatternObject targetSPO = link.getTarget();
					
					matcher.setVariablesScope(variablesScope);
					variablesScope.createVariable(sourceSPO.getName(), sourceSPO.getType(), source);
					variablesScope.createVariable(targetSPO.getName(), targetSPO.getType(), target);
					
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
	
	@Override
	protected Adapter createAdapter() {
		return new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification)
			{
				super.notifyChanged(notification);
				
				if(isRelevant(notification)) {
					changeNotifications.add(notification);
				}
			}

			private boolean isRelevant(Notification notification) {
				for(AbstractStoryPatternLink link:pattern.getStoryPatternLinks()) {
					if(link instanceof StoryPatternLink &&
							((StoryPatternLink) link).getFeature() == notification.getFeature()) {
						return true;
					}
				}
				return false;
			}
		};
	}
}
