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
 * A representation of the model object '<em><b>Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.VariableDeclarationStatement#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.VariableDeclarationStatement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getVariableDeclarationStatement()
 * @model
 * @generated
 */
public interface VariableDeclarationStatement extends Statement, AbstractVariablesContainer {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #setExtraArrayDimensions(int)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getVariableDeclarationStatement_ExtraArrayDimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getExtraArrayDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #getExtraArrayDimensions()
	 * @generated
	 */
	void setExtraArrayDimensions(int value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(Modifier)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getVariableDeclarationStatement_Modifier()
	 * @see org.eclipse.modisco.java.Modifier#getVariableDeclarationStatement
	 * @model opposite="variableDeclarationStatement" containment="true" ordered="false"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.VariableDeclarationStatement#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getVariableDeclarationStatement_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // VariableDeclarationStatement
