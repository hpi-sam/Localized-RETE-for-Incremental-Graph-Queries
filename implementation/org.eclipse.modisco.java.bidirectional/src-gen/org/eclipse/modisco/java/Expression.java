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
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Expression#getOppExpression <em>Opp Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Opp Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Expression</em>' container reference.
	 * @see #setOppExpression(ExpressionStatement)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getExpression_OppExpression()
	 * @see org.eclipse.modisco.java.ExpressionStatement#getExpression
	 * @model opposite="expression" transient="false"
	 * @generated
	 */
	ExpressionStatement getOppExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Expression#getOppExpression <em>Opp Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Expression</em>' container reference.
	 * @see #getOppExpression()
	 * @generated
	 */
	void setOppExpression(ExpressionStatement value);

} // Expression
