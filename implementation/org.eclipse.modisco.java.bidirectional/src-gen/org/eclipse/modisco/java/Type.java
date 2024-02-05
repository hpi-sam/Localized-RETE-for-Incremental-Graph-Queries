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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usages In Type Access</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeAccess}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.TypeAccess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Type Access</em>' reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getType_UsagesInTypeAccess()
	 * @see org.eclipse.modisco.java.TypeAccess#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getUsagesInTypeAccess();

} // Type
