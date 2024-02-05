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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.CompilationUnit;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ASTNodeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ASTNodeImpl#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.ASTNodeImpl#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ASTNodeImpl extends CDOObjectImpl implements ASTNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getASTNode();
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
	@SuppressWarnings("unchecked")
	public EList<Comment> getComments() {
		return (EList<Comment>)eGet(JavaPackage.eINSTANCE.getASTNode_Comments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getOriginalCompilationUnit() {
		return (CompilationUnit)eGet(JavaPackage.eINSTANCE.getASTNode_OriginalCompilationUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalCompilationUnit(CompilationUnit newOriginalCompilationUnit) {
		eSet(JavaPackage.eINSTANCE.getASTNode_OriginalCompilationUnit(), newOriginalCompilationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassFile getOriginalClassFile() {
		return (ClassFile)eGet(JavaPackage.eINSTANCE.getASTNode_OriginalClassFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalClassFile(ClassFile newOriginalClassFile) {
		eSet(JavaPackage.eINSTANCE.getASTNode_OriginalClassFile(), newOriginalClassFile);
	}

} //ASTNodeImpl
