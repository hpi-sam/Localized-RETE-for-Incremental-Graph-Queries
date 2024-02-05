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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.CompilationUnit;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ClassFileImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ClassFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ClassFileImpl#getAttachedSource <em>Attached Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ClassFileImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassFileImpl extends NamedElementImpl implements ClassFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getClassFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return (String)eGet(JavaPackage.eINSTANCE.getClassFile_OriginalFilePath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		eSet(JavaPackage.eINSTANCE.getClassFile_OriginalFilePath(), newOriginalFilePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getType() {
		return (AbstractTypeDeclaration)eGet(JavaPackage.eINSTANCE.getClassFile_Type(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractTypeDeclaration newType) {
		eSet(JavaPackage.eINSTANCE.getClassFile_Type(), newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getAttachedSource() {
		return (CompilationUnit)eGet(JavaPackage.eINSTANCE.getClassFile_AttachedSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedSource(CompilationUnit newAttachedSource) {
		eSet(JavaPackage.eINSTANCE.getClassFile_AttachedSource(), newAttachedSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package getPackage() {
		return (org.eclipse.modisco.java.Package)eGet(JavaPackage.eINSTANCE.getClassFile_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.modisco.java.Package newPackage) {
		eSet(JavaPackage.eINSTANCE.getClassFile_Package(), newPackage);
	}

} //ClassFileImpl
