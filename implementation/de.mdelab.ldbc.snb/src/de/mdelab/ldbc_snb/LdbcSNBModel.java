/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ldbc SNB Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPersons <em>Owned Persons</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedUniversities <em>Owned Universities</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCompanies <em>Owned Companies</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCities <em>Owned Cities</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCountries <em>Owned Countries</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedContinents <em>Owned Continents</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedForums <em>Owned Forums</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPosts <em>Owned Posts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedComments <em>Owned Comments</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTagClasses <em>Owned Tag Classes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedKnowsLinks <em>Owned Knows Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedStudyAtLinks <em>Owned Study At Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedWorkAtLinks <em>Owned Work At Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedHasMemberLinks <em>Owned Has Member Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedLikesLinks <em>Owned Likes Links</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel()
 * @model
 * @generated
 */
public interface LdbcSNBModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Persons</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Persons</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedPersons()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Person> getOwnedPersons();

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Organisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_Organisations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Organisation> getOrganisations();

	/**
	 * Returns the value of the '<em><b>Owned Universities</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.University}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Universities</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedUniversities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<University> getOwnedUniversities();

	/**
	 * Returns the value of the '<em><b>Owned Companies</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Company}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Companies</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedCompanies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Company> getOwnedCompanies();

	/**
	 * Returns the value of the '<em><b>Owned Cities</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Cities</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedCities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<City> getOwnedCities();

	/**
	 * Returns the value of the '<em><b>Owned Countries</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Countries</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedCountries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Country> getOwnedCountries();

	/**
	 * Returns the value of the '<em><b>Owned Continents</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Continent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Continents</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedContinents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Continent> getOwnedContinents();

	/**
	 * Returns the value of the '<em><b>Owned Forums</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Forum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Forums</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedForums()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Forum> getOwnedForums();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_Messages()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Owned Posts</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Posts</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedPosts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Post> getOwnedPosts();

	/**
	 * Returns the value of the '<em><b>Owned Comments</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comments</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedComments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Comment> getOwnedComments();

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedTags()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

	/**
	 * Returns the value of the '<em><b>Owned Tag Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.TagClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tag Classes</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedTagClasses()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TagClass> getOwnedTagClasses();

	/**
	 * Returns the value of the '<em><b>Owned Knows Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.KnowsLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Knows Links</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedKnowsLinks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KnowsLink> getOwnedKnowsLinks();

	/**
	 * Returns the value of the '<em><b>Owned Study At Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.StudyAtLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Study At Links</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedStudyAtLinks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StudyAtLink> getOwnedStudyAtLinks();

	/**
	 * Returns the value of the '<em><b>Owned Work At Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.WorkAtLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Work At Links</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedWorkAtLinks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<WorkAtLink> getOwnedWorkAtLinks();

	/**
	 * Returns the value of the '<em><b>Owned Has Member Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.HasMemberLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Has Member Links</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedHasMemberLinks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<HasMemberLink> getOwnedHasMemberLinks();

	/**
	 * Returns the value of the '<em><b>Owned Likes Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.LikesLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Likes Links</em>' containment reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getLdbcSNBModel_OwnedLikesLinks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LikesLink> getOwnedLikesLinks();

} // LdbcSNBModel
