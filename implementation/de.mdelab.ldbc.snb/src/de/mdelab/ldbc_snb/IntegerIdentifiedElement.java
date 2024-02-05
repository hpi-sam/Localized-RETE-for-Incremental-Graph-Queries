/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement#getIntId <em>Int Id</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getIntegerIdentifiedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IntegerIdentifiedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Id</em>' attribute.
	 * @see #setIntId(int)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getIntegerIdentifiedElement_IntId()
	 * @model required="true"
	 * @generated
	 */
	int getIntId();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement#getIntId <em>Int Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Id</em>' attribute.
	 * @see #getIntId()
	 * @generated
	 */
	void setIntId(int value);

} // IntegerIdentifiedElement
