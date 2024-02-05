/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.IdentifiedElement#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getIdentifiedElement()
 * @model
 * @generated
 */
public interface IdentifiedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getIdentifiedElement_ID()
	 * @model required="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.IdentifiedElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

} // IdentifiedElement
