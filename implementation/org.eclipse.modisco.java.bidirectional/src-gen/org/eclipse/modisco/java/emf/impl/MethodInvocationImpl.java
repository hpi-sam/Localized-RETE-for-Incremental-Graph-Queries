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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.MethodInvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.MethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.MethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.MethodInvocationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationImpl extends ExpressionImpl implements MethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getMethodInvocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodDeclaration getMethod() {
		return (AbstractMethodDeclaration)eGet(JavaPackage.eINSTANCE.getAbstractMethodInvocation_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(AbstractMethodDeclaration newMethod) {
		eSet(JavaPackage.eINSTANCE.getAbstractMethodInvocation_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eGet(JavaPackage.eINSTANCE.getAbstractMethodInvocation_Arguments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeAccess> getTypeArguments() {
		return (EList<TypeAccess>)eGet(JavaPackage.eINSTANCE.getAbstractMethodInvocation_TypeArguments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(JavaPackage.eINSTANCE.getMethodInvocation_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(JavaPackage.eINSTANCE.getMethodInvocation_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (derivedFeatureID) {
				case JavaPackage.METHOD_INVOCATION__METHOD: return JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD;
				case JavaPackage.METHOD_INVOCATION__ARGUMENTS: return JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS;
				case JavaPackage.METHOD_INVOCATION__TYPE_ARGUMENTS: return JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;
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
		if (baseClass == AbstractMethodInvocation.class) {
			switch (baseFeatureID) {
				case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD: return JavaPackage.METHOD_INVOCATION__METHOD;
				case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS: return JavaPackage.METHOD_INVOCATION__ARGUMENTS;
				case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS: return JavaPackage.METHOD_INVOCATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MethodInvocationImpl
