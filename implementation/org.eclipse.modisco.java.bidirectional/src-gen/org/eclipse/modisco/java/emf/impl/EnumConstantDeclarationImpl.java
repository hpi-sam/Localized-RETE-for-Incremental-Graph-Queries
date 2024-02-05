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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.VariableDeclaration;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.EnumConstantDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.EnumConstantDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.EnumConstantDeclarationImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.EnumConstantDeclarationImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.EnumConstantDeclarationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclarationImpl extends BodyDeclarationImpl implements EnumConstantDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getEnumConstantDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraArrayDimensions() {
		return (Integer)eGet(JavaPackage.eINSTANCE.getVariableDeclaration_ExtraArrayDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		eSet(JavaPackage.eINSTANCE.getVariableDeclaration_ExtraArrayDimensions(), newExtraArrayDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializer() {
		return (Expression)eGet(JavaPackage.eINSTANCE.getVariableDeclaration_Initializer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		eSet(JavaPackage.eINSTANCE.getVariableDeclaration_Initializer(), newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SingleVariableAccess> getUsageInVariableAccess() {
		return (EList<SingleVariableAccess>)eGet(JavaPackage.eINSTANCE.getVariableDeclaration_UsageInVariableAccess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclaration() {
		return (AnonymousClassDeclaration)eGet(JavaPackage.eINSTANCE.getEnumConstantDeclaration_AnonymousClassDeclaration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration newAnonymousClassDeclaration) {
		eSet(JavaPackage.eINSTANCE.getEnumConstantDeclaration_AnonymousClassDeclaration(), newAnonymousClassDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eGet(JavaPackage.eINSTANCE.getEnumConstantDeclaration_Arguments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case JavaPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER: return JavaPackage.VARIABLE_DECLARATION__INITIALIZER;
				case JavaPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return JavaPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
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
		if (baseClass == VariableDeclaration.class) {
			switch (baseFeatureID) {
				case JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return JavaPackage.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case JavaPackage.VARIABLE_DECLARATION__INITIALIZER: return JavaPackage.ENUM_CONSTANT_DECLARATION__INITIALIZER;
				case JavaPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return JavaPackage.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EnumConstantDeclarationImpl
