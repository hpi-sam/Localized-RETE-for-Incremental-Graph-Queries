package de.mdelab.ldbc_snb.log.elements;

import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class LDBC_SNBElementDeletion
		extends
			LDBC_SNBElementAction<EObject> {

	protected EObject element;
	protected final MLSDMReferenceIndex referenceIndex;

	public LDBC_SNBElementDeletion(long timestamp, EObject element, MLSDMReferenceIndex referenceIndex) {
		super(timestamp);
		this.element = element;
		this.referenceIndex = referenceIndex;
	}

	@Override
	public EObject executeAction(EObject model) {
		Collection<Entry<EReference, Set<EObject>>> deletedInverseReferences = new ArrayList<Entry<EReference, Set<EObject>>>(referenceIndex.getInverseReferences(element).entrySet());
		for(Entry<EReference, Set<EObject>> incomingEntry:deletedInverseReferences) {
			for(EObject source:new ArrayList<EObject>(incomingEntry.getValue())) {
				EStructuralFeature feature = incomingEntry.getKey();
				if(!feature.isMany()) {
					source.eSet(feature, null);
				}
				else {
					((Collection<?>) source.eGet(feature)).remove(element);
				}
			}
		}

		for(EStructuralFeature feature:element.eClass().getEAllReferences()) {
			if(!feature.isMany()) {
				element.eSet(feature, null);
			}
			else {
				((Collection<?>) element.eGet(feature)).clear();
			}
		}
		return element;
	}

	@Override
	public void undoAction(EObject model) {
		throw new UnsupportedOperationException();
	}

	public EObject getElement() {
		return element;
	}

	public void setElement(EObject element) {
		this.element = element;
	}
}
