/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.DynamicElement#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.DynamicElement#getDts <em>Dts</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getDynamicElement()
 * @model
 * @generated
 */
public interface DynamicElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cts</em>' attribute.
	 * @see #setCts(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getDynamicElement_Cts()
	 * @model
	 * @generated
	 */
	long getCts();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.DynamicElement#getCts <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cts</em>' attribute.
	 * @see #getCts()
	 * @generated
	 */
	void setCts(long value);

	/**
	 * Returns the value of the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dts</em>' attribute.
	 * @see #setDts(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getDynamicElement_Dts()
	 * @model
	 * @generated
	 */
	long getDts();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.DynamicElement#getDts <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dts</em>' attribute.
	 * @see #getDts()
	 * @generated
	 */
	void setDts(long value);

} // DynamicElement
