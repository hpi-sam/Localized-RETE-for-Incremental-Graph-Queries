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
 * A representation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.InstanceofExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.InstanceofExpression#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getInstanceofExpression()
 * @model
 * @generated
 */
public interface InstanceofExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(TypeAccess)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getInstanceofExpression_RightOperand()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TypeAccess getRightOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.InstanceofExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(Expression)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getInstanceofExpression_LeftOperand()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.InstanceofExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression value);

} // InstanceofExpression
