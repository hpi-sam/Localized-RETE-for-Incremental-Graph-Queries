/**
 * *******************************************************************************
 * Copyright (c) 2009, 2018 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - Bug 533168 - (releng) OutOfMemory during quality postprocessing because large number of checkstyle warnings
 * *******************************************************************************
 */
package org.eclipse.modisco.java.emf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractTypeDeclarationImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends BodyDeclarationImpl implements AbstractTypeDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getAbstractTypeDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeAccess> getUsagesInTypeAccess() {
		return (EList<TypeAccess>)eGet(JavaPackage.eINSTANCE.getType_UsagesInTypeAccess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> getBodyDeclarations() {
		return (EList<BodyDeclaration>)eGet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getCommentsBeforeBody() {
		return (EList<Comment>)eGet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_CommentsBeforeBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getCommentsAfterBody() {
		return (EList<Comment>)eGet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_CommentsAfterBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package getPackage() {
		return (org.eclipse.modisco.java.Package)eGet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.modisco.java.Package newPackage) {
		eSet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeAccess> getSuperInterfaces() {
		return (EList<TypeAccess>)eGet(JavaPackage.eINSTANCE.getAbstractTypeDeclaration_SuperInterfaces(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS: return JavaPackage.TYPE__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPE__USAGES_IN_TYPE_ACCESS: return JavaPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractTypeDeclarationImpl
