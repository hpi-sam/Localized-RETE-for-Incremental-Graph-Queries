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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.NamespaceAccess;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.TypeAccessImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.TypeAccessImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.TypeAccessImpl#getOppType <em>Opp Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.TypeAccessImpl#getOppTypeArguments <em>Opp Type Arguments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.TypeAccessImpl#getOppSuperClass <em>Opp Super Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeAccessImpl extends ExpressionImpl implements TypeAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getTypeAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(JavaPackage.eINSTANCE.getTypeAccess_Type(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(JavaPackage.eINSTANCE.getTypeAccess_Type(), newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceAccess getQualifier() {
		return (NamespaceAccess)eGet(JavaPackage.eINSTANCE.getTypeAccess_Qualifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(NamespaceAccess newQualifier) {
		eSet(JavaPackage.eINSTANCE.getTypeAccess_Qualifier(), newQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariablesContainer getOppType() {
		return (AbstractVariablesContainer)eGet(JavaPackage.eINSTANCE.getTypeAccess_OppType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppType(AbstractVariablesContainer newOppType) {
		eSet(JavaPackage.eINSTANCE.getTypeAccess_OppType(), newOppType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType getOppTypeArguments() {
		return (ParameterizedType)eGet(JavaPackage.eINSTANCE.getTypeAccess_OppTypeArguments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppTypeArguments(ParameterizedType newOppTypeArguments) {
		eSet(JavaPackage.eINSTANCE.getTypeAccess_OppTypeArguments(), newOppTypeArguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration getOppSuperClass() {
		return (ClassDeclaration)eGet(JavaPackage.eINSTANCE.getTypeAccess_OppSuperClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppSuperClass(ClassDeclaration newOppSuperClass) {
		eSet(JavaPackage.eINSTANCE.getTypeAccess_OppSuperClass(), newOppSuperClass);
	}

} //TypeAccessImpl
