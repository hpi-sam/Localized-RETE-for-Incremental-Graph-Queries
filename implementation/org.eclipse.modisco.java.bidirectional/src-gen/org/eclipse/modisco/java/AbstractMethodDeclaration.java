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
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMethodDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Block#getOppMethodBody <em>Opp Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_Body()
	 * @see org.eclipse.modisco.java.Block#getOppMethodBody
	 * @model opposite="oppMethodBody" containment="true" ordered="false"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_Parameters()
	 * @see org.eclipse.modisco.java.SingleVariableDeclaration#getMethodDeclaration
	 * @model opposite="methodDeclaration" containment="true"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameters();

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_ThrownExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAccess> getThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.MethodRef}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.MethodRef#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Doc Comments</em>' reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_UsagesInDocComments()
	 * @see org.eclipse.modisco.java.MethodRef#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<MethodRef> getUsagesInDocComments();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AbstractMethodInvocation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AbstractMethodInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractMethodDeclaration_Usages()
	 * @see org.eclipse.modisco.java.AbstractMethodInvocation#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<AbstractMethodInvocation> getUsages();

} // AbstractMethodDeclaration
