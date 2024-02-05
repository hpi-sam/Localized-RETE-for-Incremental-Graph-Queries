/**
 */
package de.mdelab.ldbc_snb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Likes Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.LikesLink#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LikesLink#getLikes <em>Likes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LikesLink#getOppLikes <em>Opp Likes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLikesLink()
 * @model
 * @generated
 */
public interface LikesLink extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLikesLink_CreationDate()
	 * @model
	 * @generated
	 */
	long getCreationDate();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.LikesLink#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(long value);

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Message#getOppLikes <em>Opp Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference.
	 * @see #setLikes(Message)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLikesLink_Likes()
	 * @see de.mdelab.ldbc_snb.Message#getOppLikes
	 * @model opposite="oppLikes" required="true"
	 * @generated
	 */
	Message getLikes();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.LikesLink#getLikes <em>Likes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likes</em>' reference.
	 * @see #getLikes()
	 * @generated
	 */
	void setLikes(Message value);

	/**
	 * Returns the value of the '<em><b>Opp Likes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Likes</em>' reference.
	 * @see #setOppLikes(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLikesLink_OppLikes()
	 * @see de.mdelab.ldbc_snb.Person#getLikes
	 * @model opposite="likes"
	 * @generated
	 */
	Person getOppLikes();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.LikesLink#getOppLikes <em>Opp Likes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Likes</em>' reference.
	 * @see #getOppLikes()
	 * @generated
	 */
	void setOppLikes(Person value);

} // LikesLink
