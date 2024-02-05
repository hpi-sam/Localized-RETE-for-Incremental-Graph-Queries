package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class LDBC_SNBBidirectionalElementDeletion
		extends
			LDBC_SNBElementDeletion {

	public LDBC_SNBBidirectionalElementDeletion(long timestamp, EObject element) {
		super(timestamp, element, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EObject executeAction(EObject model) {
		for(EStructuralFeature feature:element.eClass().getEAllReferences()) {
			if(!feature.isMany()) {
				element.eSet(feature, null);
			}
			else {
				((Collection<?>) element.eGet(feature)).clear();
			}
		}
		
		EObject container = element.eContainer();
		
		if(container != null) {
			EStructuralFeature containingFeature = element.eContainingFeature();
			if(containingFeature.isMany()) {
				((List<EObject>) container.eGet(containingFeature)).remove(element);
			}
			else {
				container.eSet(containingFeature, null);
			}
		}
		return element;
	}

}
