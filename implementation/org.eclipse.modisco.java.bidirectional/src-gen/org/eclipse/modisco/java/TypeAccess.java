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
 * A representation of the model object '<em><b>Type Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.TypeAccess#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.TypeAccess#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.TypeAccess#getOppType <em>Opp Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.TypeAccess#getOppTypeArguments <em>Opp Type Arguments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.TypeAccess#getOppSuperClass <em>Opp Super Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess()
 * @model
 * @generated
 */
public interface TypeAccess extends Expression, NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess_Type()
	 * @see org.eclipse.modisco.java.Type#getUsagesInTypeAccess
	 * @model opposite="usagesInTypeAccess" required="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.TypeAccess#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(NamespaceAccess)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NamespaceAccess getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.TypeAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamespaceAccess value);

	/**
	 * Returns the value of the '<em><b>Opp Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AbstractVariablesContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Type</em>' container reference.
	 * @see #setOppType(AbstractVariablesContainer)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess_OppType()
	 * @see org.eclipse.modisco.java.AbstractVariablesContainer#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	AbstractVariablesContainer getOppType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.TypeAccess#getOppType <em>Opp Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Type</em>' container reference.
	 * @see #getOppType()
	 * @generated
	 */
	void setOppType(AbstractVariablesContainer value);

	/**
	 * Returns the value of the '<em><b>Opp Type Arguments</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.ParameterizedType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Type Arguments</em>' container reference.
	 * @see #setOppTypeArguments(ParameterizedType)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess_OppTypeArguments()
	 * @see org.eclipse.modisco.java.ParameterizedType#getTypeArguments
	 * @model opposite="typeArguments" transient="false"
	 * @generated
	 */
	ParameterizedType getOppTypeArguments();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.TypeAccess#getOppTypeArguments <em>Opp Type Arguments</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Type Arguments</em>' container reference.
	 * @see #getOppTypeArguments()
	 * @generated
	 */
	void setOppTypeArguments(ParameterizedType value);

	/**
	 * Returns the value of the '<em><b>Opp Super Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.ClassDeclaration#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Super Class</em>' container reference.
	 * @see #setOppSuperClass(ClassDeclaration)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getTypeAccess_OppSuperClass()
	 * @see org.eclipse.modisco.java.ClassDeclaration#getSuperClass
	 * @model opposite="superClass" transient="false"
	 * @generated
	 */
	ClassDeclaration getOppSuperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.TypeAccess#getOppSuperClass <em>Opp Super Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Super Class</em>' container reference.
	 * @see #getOppSuperClass()
	 * @generated
	 */
	void setOppSuperClass(ClassDeclaration value);

} // TypeAccess
