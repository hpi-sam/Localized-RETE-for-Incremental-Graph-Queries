/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ldbc_snbFactoryImpl extends EFactoryImpl implements Ldbc_snbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ldbc_snbFactory init() {
		try {
			Ldbc_snbFactory theLdbc_snbFactory = (Ldbc_snbFactory)EPackage.Registry.INSTANCE.getEFactory(Ldbc_snbPackage.eNS_URI);
			if (theLdbc_snbFactory != null) {
				return theLdbc_snbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ldbc_snbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ldbc_snbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ldbc_snbPackage.IDENTIFIED_ELEMENT: return createIdentifiedElement();
			case Ldbc_snbPackage.DYNAMIC_ELEMENT: return createDynamicElement();
			case Ldbc_snbPackage.PERSON: return createPerson();
			case Ldbc_snbPackage.ORGANISATION: return createOrganisation();
			case Ldbc_snbPackage.UNIVERSITY: return createUniversity();
			case Ldbc_snbPackage.COMPANY: return createCompany();
			case Ldbc_snbPackage.PLACE: return createPlace();
			case Ldbc_snbPackage.CITY: return createCity();
			case Ldbc_snbPackage.COUNTRY: return createCountry();
			case Ldbc_snbPackage.CONTINENT: return createContinent();
			case Ldbc_snbPackage.FORUM: return createForum();
			case Ldbc_snbPackage.MESSAGE: return createMessage();
			case Ldbc_snbPackage.POST: return createPost();
			case Ldbc_snbPackage.COMMENT: return createComment();
			case Ldbc_snbPackage.TAG: return createTag();
			case Ldbc_snbPackage.TAG_CLASS: return createTagClass();
			case Ldbc_snbPackage.KNOWS_LINK: return createKnowsLink();
			case Ldbc_snbPackage.STUDY_AT_LINK: return createStudyAtLink();
			case Ldbc_snbPackage.WORK_AT_LINK: return createWorkAtLink();
			case Ldbc_snbPackage.HAS_MEMBER_LINK: return createHasMemberLink();
			case Ldbc_snbPackage.LIKES_LINK: return createLikesLink();
			case Ldbc_snbPackage.LDBC_SNB_MODEL: return createLdbcSNBModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiedElement createIdentifiedElement() {
		IdentifiedElementImpl identifiedElement = new IdentifiedElementImpl();
		return identifiedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicElement createDynamicElement() {
		DynamicElementImpl dynamicElement = new DynamicElementImpl();
		return dynamicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Continent createContinent() {
		ContinentImpl continent = new ContinentImpl();
		return continent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forum createForum() {
		ForumImpl forum = new ForumImpl();
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagClass createTagClass() {
		TagClassImpl tagClass = new TagClassImpl();
		return tagClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnowsLink createKnowsLink() {
		KnowsLinkImpl knowsLink = new KnowsLinkImpl();
		return knowsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyAtLink createStudyAtLink() {
		StudyAtLinkImpl studyAtLink = new StudyAtLinkImpl();
		return studyAtLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkAtLink createWorkAtLink() {
		WorkAtLinkImpl workAtLink = new WorkAtLinkImpl();
		return workAtLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasMemberLink createHasMemberLink() {
		HasMemberLinkImpl hasMemberLink = new HasMemberLinkImpl();
		return hasMemberLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LikesLink createLikesLink() {
		LikesLinkImpl likesLink = new LikesLinkImpl();
		return likesLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LdbcSNBModel createLdbcSNBModel() {
		LdbcSNBModelImpl ldbcSNBModel = new LdbcSNBModelImpl();
		return ldbcSNBModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ldbc_snbPackage getLdbc_snbPackage() {
		return (Ldbc_snbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ldbc_snbPackage getPackage() {
		return Ldbc_snbPackage.eINSTANCE;
	}

} //Ldbc_snbFactoryImpl
