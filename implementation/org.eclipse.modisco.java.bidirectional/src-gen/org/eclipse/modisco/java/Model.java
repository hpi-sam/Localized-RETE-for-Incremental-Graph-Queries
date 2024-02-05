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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Model#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Model extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Package#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_OwnedElements()
	 * @see org.eclipse.modisco.java.Package#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.modisco.java.Package> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Orphan Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Types</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_OrphanTypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Type> getOrphanTypes();

	/**
	 * Returns the value of the '<em><b>Unresolved Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.UnresolvedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Items</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_UnresolvedItems()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UnresolvedItem> getUnresolvedItems();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_CompilationUnits()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.ClassFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_ClassFiles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ClassFile> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Archives</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Archive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archives</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getModel_Archives()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Archive> getArchives();

} // Model
