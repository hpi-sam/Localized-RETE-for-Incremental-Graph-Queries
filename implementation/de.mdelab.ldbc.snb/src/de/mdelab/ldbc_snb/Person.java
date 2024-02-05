/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getSpeaks <em>Speaks</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getBrowserUsed <em>Browser Used</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getLocationIP <em>Location IP</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getKnows <em>Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getHasInterest <em>Has Interest</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getLikes <em>Likes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getWorkAt <em>Work At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getStudyAt <em>Study At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getOppHasMember <em>Opp Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getOppHasCreator <em>Opp Has Creator</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getOppKnows <em>Opp Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Person#getOppHasModerator <em>Opp Has Moderator</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends IntegerIdentifiedElement, IdentifiedElement, DynamicElement {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_CreationDate()
	 * @model
	 * @generated
	 */
	long getCreationDate();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(long value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Birthday()
	 * @model
	 * @generated
	 */
	long getBirthday();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(long value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Email()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getEmail();

	/**
	 * Returns the value of the '<em><b>Speaks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaks</em>' attribute list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Speaks()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSpeaks();

	/**
	 * Returns the value of the '<em><b>Browser Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Used</em>' attribute.
	 * @see #setBrowserUsed(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_BrowserUsed()
	 * @model
	 * @generated
	 */
	String getBrowserUsed();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getBrowserUsed <em>Browser Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Used</em>' attribute.
	 * @see #getBrowserUsed()
	 * @generated
	 */
	void setBrowserUsed(String value);

	/**
	 * Returns the value of the '<em><b>Location IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location IP</em>' attribute.
	 * @see #setLocationIP(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_LocationIP()
	 * @model
	 * @generated
	 */
	String getLocationIP();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getLocationIP <em>Location IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location IP</em>' attribute.
	 * @see #getLocationIP()
	 * @generated
	 */
	void setLocationIP(String value);

	/**
	 * Returns the value of the '<em><b>Knows</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.KnowsLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.KnowsLink#getOppKnows <em>Opp Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knows</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Knows()
	 * @see de.mdelab.ldbc_snb.KnowsLink#getOppKnows
	 * @model opposite="oppKnows" ordered="false"
	 * @generated
	 */
	EList<KnowsLink> getKnows();

	/**
	 * Returns the value of the '<em><b>Has Interest</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Tag}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Tag#getOppHasInterest <em>Opp Has Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interest</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_HasInterest()
	 * @see de.mdelab.ldbc_snb.Tag#getOppHasInterest
	 * @model opposite="oppHasInterest" ordered="false"
	 * @generated
	 */
	EList<Tag> getHasInterest();

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.LikesLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.LikesLink#getOppLikes <em>Opp Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_Likes()
	 * @see de.mdelab.ldbc_snb.LikesLink#getOppLikes
	 * @model opposite="oppLikes" ordered="false"
	 * @generated
	 */
	EList<LikesLink> getLikes();

	/**
	 * Returns the value of the '<em><b>Work At</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.WorkAtLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt <em>Opp Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work At</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_WorkAt()
	 * @see de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt
	 * @model opposite="oppWorkAt" ordered="false"
	 * @generated
	 */
	EList<WorkAtLink> getWorkAt();

	/**
	 * Returns the value of the '<em><b>Study At</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.StudyAtLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt <em>Opp Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study At</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_StudyAt()
	 * @see de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt
	 * @model opposite="oppStudyAt" ordered="false"
	 * @generated
	 */
	EList<StudyAtLink> getStudyAt();

	/**
	 * Returns the value of the '<em><b>Is Located In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.City#getOppPersonIsLocatedIn <em>Opp Person Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Located In</em>' reference.
	 * @see #setIsLocatedIn(City)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_IsLocatedIn()
	 * @see de.mdelab.ldbc_snb.City#getOppPersonIsLocatedIn
	 * @model opposite="oppPersonIsLocatedIn" required="true"
	 * @generated
	 */
	City getIsLocatedIn();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Person#getIsLocatedIn <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Located In</em>' reference.
	 * @see #getIsLocatedIn()
	 * @generated
	 */
	void setIsLocatedIn(City value);

	/**
	 * Returns the value of the '<em><b>Opp Has Member</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.HasMemberLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.HasMemberLink#getHasMember <em>Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Member</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_OppHasMember()
	 * @see de.mdelab.ldbc_snb.HasMemberLink#getHasMember
	 * @model opposite="hasMember"
	 * @generated
	 */
	EList<HasMemberLink> getOppHasMember();

	/**
	 * Returns the value of the '<em><b>Opp Has Creator</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Message}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Message#getHasCreator <em>Has Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Creator</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_OppHasCreator()
	 * @see de.mdelab.ldbc_snb.Message#getHasCreator
	 * @model opposite="hasCreator" ordered="false"
	 * @generated
	 */
	EList<Message> getOppHasCreator();

	/**
	 * Returns the value of the '<em><b>Opp Knows</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.KnowsLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.KnowsLink#getKnows <em>Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Knows</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_OppKnows()
	 * @see de.mdelab.ldbc_snb.KnowsLink#getKnows
	 * @model opposite="knows"
	 * @generated
	 */
	EList<KnowsLink> getOppKnows();

	/**
	 * Returns the value of the '<em><b>Opp Has Moderator</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Forum}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Forum#getHasModerator <em>Has Moderator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Has Moderator</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPerson_OppHasModerator()
	 * @see de.mdelab.ldbc_snb.Forum#getHasModerator
	 * @model opposite="hasModerator"
	 * @generated
	 */
	EList<Forum> getOppHasModerator();

} // Person
