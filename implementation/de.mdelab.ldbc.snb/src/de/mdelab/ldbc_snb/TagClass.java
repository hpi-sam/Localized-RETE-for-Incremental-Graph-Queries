/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.TagClass#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.TagClass#getIsSubclassOf <em>Is Subclass Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.TagClass#getOppHasType <em>Opp Has Type</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.TagClass#getOppIsSubclassOf <em>Opp Is Subclass Of</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTagClass()
 * @model
 * @generated
 */
public interface TagClass extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTagClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.TagClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Subclass Of</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.TagClass}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.TagClass#getOppIsSubclassOf <em>Opp Is Subclass Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subclass Of</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTagClass_IsSubclassOf()
	 * @see de.mdelab.ldbc_snb.TagClass#getOppIsSubclassOf
	 * @model opposite="oppIsSubclassOf" ordered="false"
	 * @generated
	 */
	EList<TagClass> getIsSubclassOf();

	/**
	 * Returns the value of the '<em><b>Opp Has Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Tag}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Tag#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Type</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTagClass_OppHasType()
	 * @see de.mdelab.ldbc_snb.Tag#getHasType
	 * @model opposite="hasType"
	 * @generated
	 */
	EList<Tag> getOppHasType();

	/**
	 * Returns the value of the '<em><b>Opp Is Subclass Of</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.TagClass}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.TagClass#getIsSubclassOf <em>Is Subclass Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Is Subclass Of</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTagClass_OppIsSubclassOf()
	 * @see de.mdelab.ldbc_snb.TagClass#getIsSubclassOf
	 * @model opposite="isSubclassOf"
	 * @generated
	 */
	EList<TagClass> getOppIsSubclassOf();

} // TagClass
