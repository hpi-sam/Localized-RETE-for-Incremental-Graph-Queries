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
package org.eclipse.modisco.java.emf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.modisco.java.Archive;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.UnresolvedItem;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ModelImpl#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends CDOObjectImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(JavaPackage.eINSTANCE.getModel_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JavaPackage.eINSTANCE.getModel_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.modisco.java.Package> getOwnedElements() {
		return (EList<org.eclipse.modisco.java.Package>)eGet(JavaPackage.eINSTANCE.getModel_OwnedElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getOrphanTypes() {
		return (EList<Type>)eGet(JavaPackage.eINSTANCE.getModel_OrphanTypes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UnresolvedItem> getUnresolvedItems() {
		return (EList<UnresolvedItem>)eGet(JavaPackage.eINSTANCE.getModel_UnresolvedItems(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompilationUnit> getCompilationUnits() {
		return (EList<CompilationUnit>)eGet(JavaPackage.eINSTANCE.getModel_CompilationUnits(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClassFile> getClassFiles() {
		return (EList<ClassFile>)eGet(JavaPackage.eINSTANCE.getModel_ClassFiles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Archive> getArchives() {
		return (EList<Archive>)eGet(JavaPackage.eINSTANCE.getModel_Archives(), true);
	}

} //ModelImpl
