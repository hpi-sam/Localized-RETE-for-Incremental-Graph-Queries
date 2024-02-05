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
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Statement#getOppStatement <em>Opp Statement</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Statement#getOppBody <em>Opp Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Opp Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Statement</em>' container reference.
	 * @see #setOppStatement(Block)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getStatement_OppStatement()
	 * @see org.eclipse.modisco.java.Block#getStatements
	 * @model opposite="statements" transient="false"
	 * @generated
	 */
	Block getOppStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Statement#getOppStatement <em>Opp Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Statement</em>' container reference.
	 * @see #getOppStatement()
	 * @generated
	 */
	void setOppStatement(Block value);

	/**
	 * Returns the value of the '<em><b>Opp Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Body</em>' container reference.
	 * @see #setOppBody(ForStatement)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getStatement_OppBody()
	 * @see org.eclipse.modisco.java.ForStatement#getBody
	 * @model opposite="body" transient="false"
	 * @generated
	 */
	ForStatement getOppBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Statement#getOppBody <em>Opp Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Body</em>' container reference.
	 * @see #getOppBody()
	 * @generated
	 */
	void setOppBody(ForStatement value);

} // Statement
