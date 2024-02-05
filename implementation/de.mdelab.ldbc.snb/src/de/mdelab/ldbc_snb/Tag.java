/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Tag#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Tag#getHasType <em>Has Type</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Tag#getOppMessageHasTag <em>Opp Message Has Tag</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Tag#getOppHasInterest <em>Opp Has Interest</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Tag#getOppForumHasTag <em>Opp Forum Has Tag</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends IntegerIdentifiedElement, IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.TagClass}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.TagClass#getOppHasType <em>Opp Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag_HasType()
	 * @see de.mdelab.ldbc_snb.TagClass#getOppHasType
	 * @model opposite="oppHasType" ordered="false"
	 * @generated
	 */
	EList<TagClass> getHasType();

	/**
	 * Returns the value of the '<em><b>Opp Message Has Tag</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Message}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Message#getHasTag <em>Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Message Has Tag</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag_OppMessageHasTag()
	 * @see de.mdelab.ldbc_snb.Message#getHasTag
	 * @model opposite="hasTag"
	 * @generated
	 */
	EList<Message> getOppMessageHasTag();

	/**
	 * Returns the value of the '<em><b>Opp Has Interest</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Person}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getHasInterest <em>Has Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Interest</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag_OppHasInterest()
	 * @see de.mdelab.ldbc_snb.Person#getHasInterest
	 * @model opposite="hasInterest"
	 * @generated
	 */
	EList<Person> getOppHasInterest();

	/**
	 * Returns the value of the '<em><b>Opp Forum Has Tag</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Forum}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Forum#getHasTag <em>Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Forum Has Tag</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getTag_OppForumHasTag()
	 * @see de.mdelab.ldbc_snb.Forum#getHasTag
	 * @model opposite="hasTag"
	 * @generated
	 */
	EList<Forum> getOppForumHasTag();

} // Tag
