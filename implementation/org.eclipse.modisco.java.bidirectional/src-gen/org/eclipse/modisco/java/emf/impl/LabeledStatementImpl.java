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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.BreakStatement;
import org.eclipse.modisco.java.ContinueStatement;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.LabeledStatement;
import org.eclipse.modisco.java.Statement;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.LabeledStatementImpl#getOppStatement <em>Opp Statement</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.LabeledStatementImpl#getOppBody <em>Opp Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.LabeledStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.LabeledStatementImpl#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.LabeledStatementImpl#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatementImpl extends NamedElementImpl implements LabeledStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getLabeledStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getOppStatement() {
		return (Block)eGet(JavaPackage.eINSTANCE.getStatement_OppStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppStatement(Block newOppStatement) {
		eSet(JavaPackage.eINSTANCE.getStatement_OppStatement(), newOppStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement getOppBody() {
		return (ForStatement)eGet(JavaPackage.eINSTANCE.getStatement_OppBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppBody(ForStatement newOppBody) {
		eSet(JavaPackage.eINSTANCE.getStatement_OppBody(), newOppBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eGet(JavaPackage.eINSTANCE.getLabeledStatement_Body(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eSet(JavaPackage.eINSTANCE.getLabeledStatement_Body(), newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BreakStatement> getUsagesInBreakStatements() {
		return (EList<BreakStatement>)eGet(JavaPackage.eINSTANCE.getLabeledStatement_UsagesInBreakStatements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ContinueStatement> getUsagesInContinueStatements() {
		return (EList<ContinueStatement>)eGet(JavaPackage.eINSTANCE.getLabeledStatement_UsagesInContinueStatements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case JavaPackage.LABELED_STATEMENT__OPP_STATEMENT: return JavaPackage.STATEMENT__OPP_STATEMENT;
				case JavaPackage.LABELED_STATEMENT__OPP_BODY: return JavaPackage.STATEMENT__OPP_BODY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case JavaPackage.STATEMENT__OPP_STATEMENT: return JavaPackage.LABELED_STATEMENT__OPP_STATEMENT;
				case JavaPackage.STATEMENT__OPP_BODY: return JavaPackage.LABELED_STATEMENT__OPP_BODY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LabeledStatementImpl
