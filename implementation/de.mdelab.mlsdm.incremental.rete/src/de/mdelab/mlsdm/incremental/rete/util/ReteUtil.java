package de.mdelab.mlsdm.incremental.rete.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import de.mdelab.mlsdm.interpreter.searchModel.model.MLSDMSearchModel;

public class ReteUtil {

	public static final int NO_MAPPING = -1;

	public static boolean typesMatch(EClassifier type, EClassifier type2) {
		return type == type2 ||
				(type.eClass() == EcorePackage.Literals.ECLASS && ((EClass) type).getEAllSuperTypes().contains(type2)) ||
				(type2.eClass() == EcorePackage.Literals.ECLASS && ((EClass) type2).getEAllSuperTypes().contains(type));
	}

	public static Collection<String> getNamesForIndices(MLSDMSearchModel searchModel, int[] nodeMask) {
		Collection<String> names = new ArrayList<String>();
		for(int id = 0; id < nodeMask.length; id++) {
			if(nodeMask[id] != NO_MAPPING) {
				names.add(searchModel.getNodeForId(id).getSpo().getName());
			}
		}
		return names;
	}

	public static <T> LinkedHashSet<T> intersect(
			Collection<? extends T> collection1,
			Collection<? extends T> collection2) {
		LinkedHashSet<T> intersection = new LinkedHashSet<T>();
		intersection.addAll(collection1);
		intersection.retainAll(collection2);
		return intersection;
	}

	public static <NodeType> List<NodeType> collectNodeValues (WeightedGraph<NodeType, ?> partition) {
		List<NodeType> values = new ArrayList<NodeType>();
		for(Node<NodeType, ?> node:partition.nodes) {
			values.add(node.value);
		}
		return values;
	}

	@SuppressWarnings("unchecked")
	public static Iterable<Object> getReferenceTargets(EObject source, EReference reference) {
		if(reference.isMany()) {
			return (EList<Object>) source.eGet(reference);
		}
		else {
			return Collections.singleton(source.eGet(reference));
		}
	}

	public static int[] createEmptyTableMask(int length) {
		int[] tableMask = new int[length];
		for(int i = 0; i < length; i++) {
			tableMask[i] = NO_MAPPING;
		}
		return tableMask;
	}

	public static int[] createIdentityMask(int length) {
		int[] mask = new int[length];
		for(int i = 0; i < length; i++) {
			mask[i] = i;
		}
		return mask;
	}

}
