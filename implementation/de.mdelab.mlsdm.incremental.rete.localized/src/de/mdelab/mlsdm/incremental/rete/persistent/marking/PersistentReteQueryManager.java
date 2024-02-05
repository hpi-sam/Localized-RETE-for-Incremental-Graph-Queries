package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.mdelab.mlsdm.incremental.ChangeListener;
import de.mdelab.mlsdm.incremental.change.SDMAttributeChange;
import de.mdelab.mlsdm.incremental.change.SDMEdgeChange;
import de.mdelab.mlsdm.incremental.change.SDMNodeChange;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.util.MarkingSensitiveReteUtil;
import de.mdelab.mlsdm.incremental.change.SDMChangeEvent.SDMChangeEnum;

public class PersistentReteQueryManager extends ReteQueryManager {
	
	private boolean dynamicLoading;
	
	private Map<EObject, Set<ChangeListener>> changeListeners;
	
	public PersistentReteQueryManager() {
		this.dynamicLoading = true;
		this.changeListeners = new LinkedHashMap<EObject, Set<ChangeListener>>();
	}
	
	@Override
	public void registerReteNet(ReteNet net) {
		for(ReteNode node:net.getNodes().values()) {
			if(MarkingSensitiveReteUtil.isDynamicChangeListener(node)) {
				((DynamicChangeListener) node).setQueryManager(this);
			}
		}
		
		super.registerReteNet(net);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(Notification notification) {
		EObject source = (EObject) notification.getNotifier();
		
		if((notification.getFeature() instanceof EReference)) {
			EReference reference = (EReference) notification.getFeature();
			Collection<EObject> newTargets = Collections.emptySet();
			Collection<EObject> oldTargets = Collections.emptySet();
			switch(notification.getEventType()) {
				case Notification.ADD:
					newTargets = Collections.singleton((EObject) notification.getNewValue());
					break;
				case Notification.REMOVE:
					oldTargets = Collections.singleton((EObject) notification.getOldValue());
					break;
				case Notification.SET:
					if(notification.getOldValue() != null) {
						oldTargets = Collections.singleton((EObject) notification.getOldValue());
					}
					
					if(notification.getNewValue() != null) {
						newTargets = Collections.singleton((EObject) notification.getNewValue());
					}
					break;
				case Notification.UNSET:
					if(notification.getOldValue() != null) {
						oldTargets = Collections.singleton((EObject) notification.getOldValue());
					}
					break;
				case Notification.ADD_MANY:
					newTargets = (Collection<EObject>) notification.getNewValue();
					break;
				case Notification.REMOVE_MANY:
					oldTargets = (Collection<EObject>) notification.getOldValue();
					break;
				default:
					break;
			}
			
			for(EObject object:newTargets) {
				if(dynamicLoading && reference.isContainment()) {
					registerEObject(object);
				}
				addReference(source, reference, object);
			}
			for(EObject object:oldTargets) {
				removeReference(source, reference, object);
			}
		}
		else if (notification.getFeature() instanceof EAttribute) {
			registerChange(new SDMAttributeChange((EObject) source, (EAttribute) notification.getFeature()));
		}
	}

	public void registerEObjects(Collection<EObject> eObjects) {
		for(EObject o:eObjects) {
			if(!registeredObjects.contains(o)) {
				addEObject(o);
			}
		}
	}

	public void unregisterEObjects(Collection<EObject> eObjects) {
		for(EObject o:eObjects) {
			removeEObject(o);
		}
	}
	
	@Override
	public void removeEObject(EObject eObject) {
		registeredObjects.remove(eObject);
		if(!changeListeners.containsKey(eObject)) {
			eObject.eAdapters().remove(this);
		}
		
		doRemoveEObject(eObject);
	}

	@Override
	protected void doAddEObject(EObject eObject) {
		modelIndex.addEObject(eObject);
		registerChange(new SDMNodeChange(eObject, SDMChangeEnum.CREATE));
	}
	
	@Override
	protected void doRemoveEObject(EObject eObject) {
		modelIndex.removeEObject(eObject);
		registerChange(new SDMNodeChange(eObject, SDMChangeEnum.DELETE));
	}
	
	@Override
	protected void doAddReference(EObject source, EReference reference, EObject target) {
		registerChange(new SDMEdgeChange(source, reference, target, SDMChangeEnum.CREATE));
	}
	
	@Override
	protected void doRemoveReference(EObject source, EReference reference, EObject target) {
		registerChange(new SDMEdgeChange(source, reference, target, SDMChangeEnum.DELETE));
	}
	
	public void setDynamicLoading(boolean value) {
		this.dynamicLoading = value;
	}

	public void requestNotifications(EObject sourceVertex, ChangeListener listener) {
		if(!changeListeners.containsKey(sourceVertex)) {
			if(!registeredObjects.contains(sourceVertex)) {
				sourceVertex.eAdapters().add(this);
			}
			
			changeListeners.put(sourceVertex, new LinkedHashSet<ChangeListener>());
		}
		
		changeListeners.get(sourceVertex).add(listener);
	}

	public void unrequestNotifications(EObject sourceVertex, ChangeListener listener) {
		changeListeners.get(sourceVertex).remove(listener);
		
		if(changeListeners.get(sourceVertex).isEmpty()) {
			changeListeners.remove(sourceVertex);
			
			if(!registeredObjects.contains(sourceVertex)) {
				sourceVertex.eAdapters().remove(this);
			}
		}
		
	}
	
}
	