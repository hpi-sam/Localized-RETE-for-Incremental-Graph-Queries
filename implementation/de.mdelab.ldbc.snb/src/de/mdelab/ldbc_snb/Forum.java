/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getTitle <em>Title</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getHasModerator <em>Has Moderator</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getHasTag <em>Has Tag</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Forum#getOppContainer <em>Opp Container</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum()
 * @model
 * @generated
 */
public interface Forum extends IdentifiedElement, DynamicElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Forum#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_CreationDate()
	 * @model
	 * @generated
	 */
	long getCreationDate();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Forum#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(long value);

	/**
	 * Returns the value of the '<em><b>Has Moderator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getOppHasModerator <em>Opp Has Moderator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Moderator</em>' reference.
	 * @see #setHasModerator(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_HasModerator()
	 * @see de.mdelab.ldbc_snb.Person#getOppHasModerator
	 * @model opposite="oppHasModerator" required="true"
	 * @generated
	 */
	Person getHasModerator();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Forum#getHasModerator <em>Has Moderator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Moderator</em>' reference.
	 * @see #getHasModerator()
	 * @generated
	 */
	void setHasModerator(Person value);

	/**
	 * Returns the value of the '<em><b>Has Tag</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Tag}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Tag#getOppForumHasTag <em>Opp Forum Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Tag</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_HasTag()
	 * @see de.mdelab.ldbc_snb.Tag#getOppForumHasTag
	 * @model opposite="oppForumHasTag" ordered="false"
	 * @generated
	 */
	EList<Tag> getHasTag();

	/**
	 * Returns the value of the '<em><b>Has Member</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.HasMemberLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember <em>Opp Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Member</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_HasMember()
	 * @see de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember
	 * @model opposite="oppHasMember"
	 * @generated
	 */
	EList<HasMemberLink> getHasMember();

	/**
	 * Returns the value of the '<em><b>Opp Container</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Post}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Post#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Container</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getForum_OppContainer()
	 * @see de.mdelab.ldbc_snb.Post#getContainer
	 * @model opposite="container" required="true" ordered="false"
	 * @generated
	 */
	EList<Post> getOppContainer();

} // Forum
