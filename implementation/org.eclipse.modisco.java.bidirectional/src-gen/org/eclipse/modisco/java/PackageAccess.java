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
 * A representation of the model object '<em><b>Package Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.PackageAccess#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.PackageAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackageAccess()
 * @model
 * @generated
 */
public interface PackageAccess extends NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(org.eclipse.modisco.java.Package)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackageAccess_Package()
	 * @see org.eclipse.modisco.java.Package#getUsagesInPackageAccess
	 * @model opposite="usagesInPackageAccess" required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.PackageAccess#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(PackageAccess)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackageAccess_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PackageAccess getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.PackageAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(PackageAccess value);

} // PackageAccess
