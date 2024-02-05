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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Assignment#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Assignment#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #setLeftHandSide(Expression)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAssignment_LeftHandSide()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getLeftHandSide();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Assignment#getLeftHandSide <em>Left Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #getLeftHandSide()
	 * @generated
	 */
	void setLeftHandSide(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.java.AssignmentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.modisco.java.AssignmentKind
	 * @see #setOperator(AssignmentKind)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAssignment_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AssignmentKind getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Assignment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.modisco.java.AssignmentKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssignmentKind value);

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #setRightHandSide(Expression)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAssignment_RightHandSide()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getRightHandSide();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Assignment#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Expression value);

} // Assignment
