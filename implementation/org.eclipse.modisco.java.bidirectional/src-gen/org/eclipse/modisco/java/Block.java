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
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Block#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Block#getOppMethodBody <em>Opp Method Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Statement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Statement#getOppStatement <em>Opp Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getBlock_Statements()
	 * @see org.eclipse.modisco.java.Statement#getOppStatement
	 * @model opposite="oppStatement" containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Opp Method Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Method Body</em>' container reference.
	 * @see #setOppMethodBody(AbstractMethodDeclaration)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getBlock_OppMethodBody()
	 * @see org.eclipse.modisco.java.AbstractMethodDeclaration#getBody
	 * @model opposite="body" transient="false"
	 * @generated
	 */
	AbstractMethodDeclaration getOppMethodBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Block#getOppMethodBody <em>Opp Method Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Method Body</em>' container reference.
	 * @see #getOppMethodBody()
	 * @generated
	 */
	void setOppMethodBody(AbstractMethodDeclaration value);

} // Block
