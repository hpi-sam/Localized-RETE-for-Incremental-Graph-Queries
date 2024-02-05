/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Continent;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
import de.mdelab.ldbc_snb.University;
import de.mdelab.ldbc_snb.WorkAtLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ldbc SNB Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedPersons <em>Owned Persons</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedUniversities <em>Owned Universities</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedCompanies <em>Owned Companies</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedCities <em>Owned Cities</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedCountries <em>Owned Countries</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedContinents <em>Owned Continents</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedForums <em>Owned Forums</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedPosts <em>Owned Posts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedComments <em>Owned Comments</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedTagClasses <em>Owned Tag Classes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedKnowsLinks <em>Owned Knows Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedStudyAtLinks <em>Owned Study At Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedWorkAtLinks <em>Owned Work At Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedHasMemberLinks <em>Owned Has Member Links</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl#getOwnedLikesLinks <em>Owned Likes Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LdbcSNBModelImpl extends MinimalEObjectImpl.Container implements LdbcSNBModel {
	/**
	 * The cached value of the '{@link #getOwnedPersons() <em>Owned Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> ownedPersons;
	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> organisations;
	/**
	 * The cached value of the '{@link #getOwnedUniversities() <em>Owned Universities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUniversities()
	 * @generated
	 * @ordered
	 */
	protected EList<University> ownedUniversities;
	/**
	 * The cached value of the '{@link #getOwnedCompanies() <em>Owned Companies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCompanies()
	 * @generated
	 * @ordered
	 */
	protected EList<Company> ownedCompanies;
	/**
	 * The cached value of the '{@link #getOwnedCities() <em>Owned Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> ownedCities;
	/**
	 * The cached value of the '{@link #getOwnedCountries() <em>Owned Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> ownedCountries;
	/**
	 * The cached value of the '{@link #getOwnedContinents() <em>Owned Continents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContinents()
	 * @generated
	 * @ordered
	 */
	protected EList<Continent> ownedContinents;
	/**
	 * The cached value of the '{@link #getOwnedForums() <em>Owned Forums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedForums()
	 * @generated
	 * @ordered
	 */
	protected EList<Forum> ownedForums;
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;
	/**
	 * The cached value of the '{@link #getOwnedPosts() <em>Owned Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> ownedPosts;
	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComments;
	/**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTags;
	/**
	 * The cached value of the '{@link #getOwnedTagClasses() <em>Owned Tag Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTagClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TagClass> ownedTagClasses;
	/**
	 * The cached value of the '{@link #getOwnedKnowsLinks() <em>Owned Knows Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKnowsLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<KnowsLink> ownedKnowsLinks;
	/**
	 * The cached value of the '{@link #getOwnedStudyAtLinks() <em>Owned Study At Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStudyAtLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyAtLink> ownedStudyAtLinks;
	/**
	 * The cached value of the '{@link #getOwnedWorkAtLinks() <em>Owned Work At Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWorkAtLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkAtLink> ownedWorkAtLinks;
	/**
	 * The cached value of the '{@link #getOwnedHasMemberLinks() <em>Owned Has Member Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHasMemberLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<HasMemberLink> ownedHasMemberLinks;
	/**
	 * The cached value of the '{@link #getOwnedLikesLinks() <em>Owned Likes Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLikesLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LikesLink> ownedLikesLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LdbcSNBModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.LDBC_SNB_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getOwnedPersons() {
		if (ownedPersons == null) {
			ownedPersons = new EObjectContainmentEList<Person>(Person.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS);
		}
		return ownedPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Organisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectResolvingEList<Organisation>(Organisation.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__ORGANISATIONS);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<University> getOwnedUniversities() {
		if (ownedUniversities == null) {
			ownedUniversities = new EObjectContainmentEList<University>(University.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES);
		}
		return ownedUniversities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Company> getOwnedCompanies() {
		if (ownedCompanies == null) {
			ownedCompanies = new EObjectContainmentEList<Company>(Company.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES);
		}
		return ownedCompanies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<City> getOwnedCities() {
		if (ownedCities == null) {
			ownedCities = new EObjectContainmentEList<City>(City.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES);
		}
		return ownedCities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Country> getOwnedCountries() {
		if (ownedCountries == null) {
			ownedCountries = new EObjectContainmentEList<Country>(Country.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES);
		}
		return ownedCountries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Continent> getOwnedContinents() {
		if (ownedContinents == null) {
			ownedContinents = new EObjectContainmentEList<Continent>(Continent.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS);
		}
		return ownedContinents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Forum> getOwnedForums() {
		if (ownedForums == null) {
			ownedForums = new EObjectContainmentEList<Forum>(Forum.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS);
		}
		return ownedForums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectResolvingEList<Message>(Message.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Post> getOwnedPosts() {
		if (ownedPosts == null) {
			ownedPosts = new EObjectContainmentEList<Post>(Post.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS);
		}
		return ownedPosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Comment> getOwnedComments() {
		if (ownedComments == null) {
			ownedComments = new EObjectContainmentEList<Comment>(Comment.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS);
		}
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tag> getOwnedTags() {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList<Tag>(Tag.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS);
		}
		return ownedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TagClass> getOwnedTagClasses() {
		if (ownedTagClasses == null) {
			ownedTagClasses = new EObjectContainmentEList<TagClass>(TagClass.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES);
		}
		return ownedTagClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowsLink> getOwnedKnowsLinks() {
		if (ownedKnowsLinks == null) {
			ownedKnowsLinks = new EObjectContainmentEList<KnowsLink>(KnowsLink.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS);
		}
		return ownedKnowsLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StudyAtLink> getOwnedStudyAtLinks() {
		if (ownedStudyAtLinks == null) {
			ownedStudyAtLinks = new EObjectContainmentEList<StudyAtLink>(StudyAtLink.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS);
		}
		return ownedStudyAtLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkAtLink> getOwnedWorkAtLinks() {
		if (ownedWorkAtLinks == null) {
			ownedWorkAtLinks = new EObjectContainmentEList<WorkAtLink>(WorkAtLink.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS);
		}
		return ownedWorkAtLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HasMemberLink> getOwnedHasMemberLinks() {
		if (ownedHasMemberLinks == null) {
			ownedHasMemberLinks = new EObjectContainmentEList<HasMemberLink>(HasMemberLink.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS);
		}
		return ownedHasMemberLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LikesLink> getOwnedLikesLinks() {
		if (ownedLikesLinks == null) {
			ownedLikesLinks = new EObjectContainmentEList<LikesLink>(LikesLink.class, this, Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS);
		}
		return ownedLikesLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS:
				return ((InternalEList<?>)getOwnedPersons()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES:
				return ((InternalEList<?>)getOwnedUniversities()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES:
				return ((InternalEList<?>)getOwnedCompanies()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES:
				return ((InternalEList<?>)getOwnedCities()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES:
				return ((InternalEList<?>)getOwnedCountries()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS:
				return ((InternalEList<?>)getOwnedContinents()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS:
				return ((InternalEList<?>)getOwnedForums()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS:
				return ((InternalEList<?>)getOwnedPosts()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS:
				return ((InternalEList<?>)getOwnedTags()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES:
				return ((InternalEList<?>)getOwnedTagClasses()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS:
				return ((InternalEList<?>)getOwnedKnowsLinks()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS:
				return ((InternalEList<?>)getOwnedStudyAtLinks()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS:
				return ((InternalEList<?>)getOwnedWorkAtLinks()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS:
				return ((InternalEList<?>)getOwnedHasMemberLinks()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS:
				return ((InternalEList<?>)getOwnedLikesLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS:
				return getOwnedPersons();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__ORGANISATIONS:
				return getOrganisations();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES:
				return getOwnedUniversities();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES:
				return getOwnedCompanies();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES:
				return getOwnedCities();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES:
				return getOwnedCountries();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS:
				return getOwnedContinents();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS:
				return getOwnedForums();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__MESSAGES:
				return getMessages();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS:
				return getOwnedPosts();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS:
				return getOwnedComments();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS:
				return getOwnedTags();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES:
				return getOwnedTagClasses();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS:
				return getOwnedKnowsLinks();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS:
				return getOwnedStudyAtLinks();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS:
				return getOwnedWorkAtLinks();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS:
				return getOwnedHasMemberLinks();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS:
				return getOwnedLikesLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS:
				getOwnedPersons().clear();
				getOwnedPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends Organisation>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES:
				getOwnedUniversities().clear();
				getOwnedUniversities().addAll((Collection<? extends University>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES:
				getOwnedCompanies().clear();
				getOwnedCompanies().addAll((Collection<? extends Company>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES:
				getOwnedCities().clear();
				getOwnedCities().addAll((Collection<? extends City>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES:
				getOwnedCountries().clear();
				getOwnedCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS:
				getOwnedContinents().clear();
				getOwnedContinents().addAll((Collection<? extends Continent>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS:
				getOwnedForums().clear();
				getOwnedForums().addAll((Collection<? extends Forum>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS:
				getOwnedPosts().clear();
				getOwnedPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS:
				getOwnedTags().clear();
				getOwnedTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES:
				getOwnedTagClasses().clear();
				getOwnedTagClasses().addAll((Collection<? extends TagClass>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS:
				getOwnedKnowsLinks().clear();
				getOwnedKnowsLinks().addAll((Collection<? extends KnowsLink>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS:
				getOwnedStudyAtLinks().clear();
				getOwnedStudyAtLinks().addAll((Collection<? extends StudyAtLink>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS:
				getOwnedWorkAtLinks().clear();
				getOwnedWorkAtLinks().addAll((Collection<? extends WorkAtLink>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS:
				getOwnedHasMemberLinks().clear();
				getOwnedHasMemberLinks().addAll((Collection<? extends HasMemberLink>)newValue);
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS:
				getOwnedLikesLinks().clear();
				getOwnedLikesLinks().addAll((Collection<? extends LikesLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS:
				getOwnedPersons().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES:
				getOwnedUniversities().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES:
				getOwnedCompanies().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES:
				getOwnedCities().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES:
				getOwnedCountries().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS:
				getOwnedContinents().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS:
				getOwnedForums().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__MESSAGES:
				getMessages().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS:
				getOwnedPosts().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS:
				getOwnedTags().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES:
				getOwnedTagClasses().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS:
				getOwnedKnowsLinks().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS:
				getOwnedStudyAtLinks().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS:
				getOwnedWorkAtLinks().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS:
				getOwnedHasMemberLinks().clear();
				return;
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS:
				getOwnedLikesLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_PERSONS:
				return ownedPersons != null && !ownedPersons.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_UNIVERSITIES:
				return ownedUniversities != null && !ownedUniversities.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMPANIES:
				return ownedCompanies != null && !ownedCompanies.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CITIES:
				return ownedCities != null && !ownedCities.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COUNTRIES:
				return ownedCountries != null && !ownedCountries.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_CONTINENTS:
				return ownedContinents != null && !ownedContinents.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_FORUMS:
				return ownedForums != null && !ownedForums.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__MESSAGES:
				return messages != null && !messages.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_POSTS:
				return ownedPosts != null && !ownedPosts.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAGS:
				return ownedTags != null && !ownedTags.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_TAG_CLASSES:
				return ownedTagClasses != null && !ownedTagClasses.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_KNOWS_LINKS:
				return ownedKnowsLinks != null && !ownedKnowsLinks.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS:
				return ownedStudyAtLinks != null && !ownedStudyAtLinks.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS:
				return ownedWorkAtLinks != null && !ownedWorkAtLinks.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS:
				return ownedHasMemberLinks != null && !ownedHasMemberLinks.isEmpty();
			case Ldbc_snbPackage.LDBC_SNB_MODEL__OWNED_LIKES_LINKS:
				return ownedLikesLinks != null && !ownedLikesLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LdbcSNBModelImpl
