/**
 */
package de.mdelab.ldbc_snb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Member Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.HasMemberLink#getJoinDate <em>Join Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.HasMemberLink#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember <em>Opp Has Member</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getHasMemberLink()
 * @model
 * @generated
 */
public interface HasMemberLink extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Date</em>' attribute.
	 * @see #setJoinDate(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getHasMemberLink_JoinDate()
	 * @model
	 * @generated
	 */
	long getJoinDate();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.HasMemberLink#getJoinDate <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Date</em>' attribute.
	 * @see #getJoinDate()
	 * @generated
	 */
	void setJoinDate(long value);

	/**
	 * Returns the value of the '<em><b>Has Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getOppHasMember <em>Opp Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Member</em>' reference.
	 * @see #setHasMember(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getHasMemberLink_HasMember()
	 * @see de.mdelab.ldbc_snb.Person#getOppHasMember
	 * @model opposite="oppHasMember" required="true"
	 * @generated
	 */
	Person getHasMember();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.HasMemberLink#getHasMember <em>Has Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Member</em>' reference.
	 * @see #getHasMember()
	 * @generated
	 */
	void setHasMember(Person value);

	/**
	 * Returns the value of the '<em><b>Opp Has Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Forum#getHasMember <em>Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Member</em>' reference.
	 * @see #setOppHasMember(Forum)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getHasMemberLink_OppHasMember()
	 * @see de.mdelab.ldbc_snb.Forum#getHasMember
	 * @model opposite="hasMember" required="true"
	 * @generated
	 */
	Forum getOppHasMember();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember <em>Opp Has Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Has Member</em>' reference.
	 * @see #getOppHasMember()
	 * @generated
	 */
	void setOppHasMember(Forum value);

} // HasMemberLink
