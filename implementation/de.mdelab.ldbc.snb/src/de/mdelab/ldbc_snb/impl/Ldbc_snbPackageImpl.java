/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Continent;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.IdentifiedElement;
import de.mdelab.ldbc_snb.IntegerIdentifiedElement;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
import de.mdelab.ldbc_snb.University;
import de.mdelab.ldbc_snb.WorkAtLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ldbc_snbPackageImpl extends EPackageImpl implements Ldbc_snbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowsLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyAtLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workAtLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasMemberLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass likesLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerIdentifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldbcSNBModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ldbc_snbPackageImpl() {
		super(eNS_URI, Ldbc_snbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Ldbc_snbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ldbc_snbPackage init() {
		if (isInited) return (Ldbc_snbPackage)EPackage.Registry.INSTANCE.getEPackage(Ldbc_snbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLdbc_snbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ldbc_snbPackageImpl theLdbc_snbPackage = registeredLdbc_snbPackage instanceof Ldbc_snbPackageImpl ? (Ldbc_snbPackageImpl)registeredLdbc_snbPackage : new Ldbc_snbPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLdbc_snbPackage.createPackageContents();

		// Initialize created meta-data
		theLdbc_snbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLdbc_snbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ldbc_snbPackage.eNS_URI, theLdbc_snbPackage);
		return theLdbc_snbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedElement_ID() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicElement() {
		return dynamicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicElement_Cts() {
		return (EAttribute)dynamicElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicElement_Dts() {
		return (EAttribute)dynamicElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_CreationDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Birthday() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Speaks() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_BrowserUsed() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LocationIP() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Knows() {
		return (EReference)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_HasInterest() {
		return (EReference)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Likes() {
		return (EReference)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_WorkAt() {
		return (EReference)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_StudyAt() {
		return (EReference)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_IsLocatedIn() {
		return (EReference)personEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_OppHasMember() {
		return (EReference)personEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_OppHasCreator() {
		return (EReference)personEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_OppKnows() {
		return (EReference)personEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_OppHasModerator() {
		return (EReference)personEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganisation_Name() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_IsLocatedIn() {
		return (EReference)universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_OppStudyAt() {
		return (EReference)universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompany() {
		return companyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompany_IsLocatedIn() {
		return (EReference)companyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompany_OppWorkAt() {
		return (EReference)companyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlace_Name() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCity_IsPartOf() {
		return (EReference)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCity_OppPersonIsLocatedIn() {
		return (EReference)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCity_OppUniversityIsLocatedIn() {
		return (EReference)cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_IsPartOf() {
		return (EReference)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_OppIsPartOf() {
		return (EReference)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_OppCompanyIsLocatedIn() {
		return (EReference)countryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_OppMessageIsLocatedIn() {
		return (EReference)countryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinent() {
		return continentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContinent_OppIsPartOf() {
		return (EReference)continentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForum() {
		return forumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForum_Title() {
		return (EAttribute)forumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForum_CreationDate() {
		return (EAttribute)forumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_HasModerator() {
		return (EReference)forumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_HasTag() {
		return (EReference)forumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_HasMember() {
		return (EReference)forumEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForum_OppContainer() {
		return (EReference)forumEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_CreationDate() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_BrowserUsed() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_LocationIP() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Content() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Length() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_IsLocatedIn() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_HasTag() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_HasCreator() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_OppLikes() {
		return (EReference)messageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_OppReplyOf() {
		return (EReference)messageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPost() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPost_Language() {
		return (EAttribute)postEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPost_ImageFile() {
		return (EAttribute)postEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_Successor() {
		return (EReference)postEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_LinkedPosts() {
		return (EReference)postEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_Container() {
		return (EReference)postEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_OppSuccessor() {
		return (EReference)postEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPost_OppLinkedPosts() {
		return (EReference)postEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_ReplyOf() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_HasType() {
		return (EReference)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_OppMessageHasTag() {
		return (EReference)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_OppHasInterest() {
		return (EReference)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_OppForumHasTag() {
		return (EReference)tagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagClass() {
		return tagClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagClass_Name() {
		return (EAttribute)tagClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagClass_IsSubclassOf() {
		return (EReference)tagClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagClass_OppHasType() {
		return (EReference)tagClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagClass_OppIsSubclassOf() {
		return (EReference)tagClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnowsLink() {
		return knowsLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKnowsLink_CreationDate() {
		return (EAttribute)knowsLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowsLink_Knows() {
		return (EReference)knowsLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKnowsLink_OppKnows() {
		return (EReference)knowsLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudyAtLink() {
		return studyAtLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudyAtLink_ClassYear() {
		return (EAttribute)studyAtLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyAtLink_StudyAt() {
		return (EReference)studyAtLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudyAtLink_OppStudyAt() {
		return (EReference)studyAtLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkAtLink() {
		return workAtLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkAtLink_WorkFrom() {
		return (EAttribute)workAtLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkAtLink_WorkAt() {
		return (EReference)workAtLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkAtLink_OppWorkAt() {
		return (EReference)workAtLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasMemberLink() {
		return hasMemberLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasMemberLink_JoinDate() {
		return (EAttribute)hasMemberLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasMemberLink_HasMember() {
		return (EReference)hasMemberLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasMemberLink_OppHasMember() {
		return (EReference)hasMemberLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLikesLink() {
		return likesLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLikesLink_CreationDate() {
		return (EAttribute)likesLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLikesLink_Likes() {
		return (EReference)likesLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLikesLink_OppLikes() {
		return (EReference)likesLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerIdentifiedElement() {
		return integerIdentifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerIdentifiedElement_IntId() {
		return (EAttribute)integerIdentifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLdbcSNBModel() {
		return ldbcSNBModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedPersons() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_Organisations() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedUniversities() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedCompanies() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedCities() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedCountries() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedContinents() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedForums() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_Messages() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedPosts() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedComments() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedTags() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedTagClasses() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedKnowsLinks() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedStudyAtLinks() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedWorkAtLinks() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedHasMemberLinks() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLdbcSNBModel_OwnedLikesLinks() {
		return (EReference)ldbcSNBModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ldbc_snbFactory getLdbc_snbFactory() {
		return (Ldbc_snbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		dynamicElementEClass = createEClass(DYNAMIC_ELEMENT);
		createEAttribute(dynamicElementEClass, DYNAMIC_ELEMENT__CTS);
		createEAttribute(dynamicElementEClass, DYNAMIC_ELEMENT__DTS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__CREATION_DATE);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__BIRTHDAY);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEAttribute(personEClass, PERSON__SPEAKS);
		createEAttribute(personEClass, PERSON__BROWSER_USED);
		createEAttribute(personEClass, PERSON__LOCATION_IP);
		createEReference(personEClass, PERSON__KNOWS);
		createEReference(personEClass, PERSON__HAS_INTEREST);
		createEReference(personEClass, PERSON__LIKES);
		createEReference(personEClass, PERSON__WORK_AT);
		createEReference(personEClass, PERSON__STUDY_AT);
		createEReference(personEClass, PERSON__IS_LOCATED_IN);
		createEReference(personEClass, PERSON__OPP_HAS_MEMBER);
		createEReference(personEClass, PERSON__OPP_HAS_CREATOR);
		createEReference(personEClass, PERSON__OPP_KNOWS);
		createEReference(personEClass, PERSON__OPP_HAS_MODERATOR);

		organisationEClass = createEClass(ORGANISATION);
		createEAttribute(organisationEClass, ORGANISATION__NAME);

		universityEClass = createEClass(UNIVERSITY);
		createEReference(universityEClass, UNIVERSITY__IS_LOCATED_IN);
		createEReference(universityEClass, UNIVERSITY__OPP_STUDY_AT);

		companyEClass = createEClass(COMPANY);
		createEReference(companyEClass, COMPANY__IS_LOCATED_IN);
		createEReference(companyEClass, COMPANY__OPP_WORK_AT);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__NAME);

		cityEClass = createEClass(CITY);
		createEReference(cityEClass, CITY__IS_PART_OF);
		createEReference(cityEClass, CITY__OPP_PERSON_IS_LOCATED_IN);
		createEReference(cityEClass, CITY__OPP_UNIVERSITY_IS_LOCATED_IN);

		countryEClass = createEClass(COUNTRY);
		createEReference(countryEClass, COUNTRY__IS_PART_OF);
		createEReference(countryEClass, COUNTRY__OPP_IS_PART_OF);
		createEReference(countryEClass, COUNTRY__OPP_COMPANY_IS_LOCATED_IN);
		createEReference(countryEClass, COUNTRY__OPP_MESSAGE_IS_LOCATED_IN);

		continentEClass = createEClass(CONTINENT);
		createEReference(continentEClass, CONTINENT__OPP_IS_PART_OF);

		forumEClass = createEClass(FORUM);
		createEAttribute(forumEClass, FORUM__TITLE);
		createEAttribute(forumEClass, FORUM__CREATION_DATE);
		createEReference(forumEClass, FORUM__HAS_MODERATOR);
		createEReference(forumEClass, FORUM__HAS_TAG);
		createEReference(forumEClass, FORUM__HAS_MEMBER);
		createEReference(forumEClass, FORUM__OPP_CONTAINER);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__CREATION_DATE);
		createEAttribute(messageEClass, MESSAGE__BROWSER_USED);
		createEAttribute(messageEClass, MESSAGE__LOCATION_IP);
		createEAttribute(messageEClass, MESSAGE__CONTENT);
		createEAttribute(messageEClass, MESSAGE__LENGTH);
		createEReference(messageEClass, MESSAGE__IS_LOCATED_IN);
		createEReference(messageEClass, MESSAGE__HAS_TAG);
		createEReference(messageEClass, MESSAGE__HAS_CREATOR);
		createEReference(messageEClass, MESSAGE__OPP_LIKES);
		createEReference(messageEClass, MESSAGE__OPP_REPLY_OF);

		postEClass = createEClass(POST);
		createEAttribute(postEClass, POST__LANGUAGE);
		createEAttribute(postEClass, POST__IMAGE_FILE);
		createEReference(postEClass, POST__SUCCESSOR);
		createEReference(postEClass, POST__LINKED_POSTS);
		createEReference(postEClass, POST__CONTAINER);
		createEReference(postEClass, POST__OPP_SUCCESSOR);
		createEReference(postEClass, POST__OPP_LINKED_POSTS);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__REPLY_OF);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEReference(tagEClass, TAG__HAS_TYPE);
		createEReference(tagEClass, TAG__OPP_MESSAGE_HAS_TAG);
		createEReference(tagEClass, TAG__OPP_HAS_INTEREST);
		createEReference(tagEClass, TAG__OPP_FORUM_HAS_TAG);

		tagClassEClass = createEClass(TAG_CLASS);
		createEAttribute(tagClassEClass, TAG_CLASS__NAME);
		createEReference(tagClassEClass, TAG_CLASS__IS_SUBCLASS_OF);
		createEReference(tagClassEClass, TAG_CLASS__OPP_HAS_TYPE);
		createEReference(tagClassEClass, TAG_CLASS__OPP_IS_SUBCLASS_OF);

		knowsLinkEClass = createEClass(KNOWS_LINK);
		createEAttribute(knowsLinkEClass, KNOWS_LINK__CREATION_DATE);
		createEReference(knowsLinkEClass, KNOWS_LINK__KNOWS);
		createEReference(knowsLinkEClass, KNOWS_LINK__OPP_KNOWS);

		studyAtLinkEClass = createEClass(STUDY_AT_LINK);
		createEAttribute(studyAtLinkEClass, STUDY_AT_LINK__CLASS_YEAR);
		createEReference(studyAtLinkEClass, STUDY_AT_LINK__STUDY_AT);
		createEReference(studyAtLinkEClass, STUDY_AT_LINK__OPP_STUDY_AT);

		workAtLinkEClass = createEClass(WORK_AT_LINK);
		createEAttribute(workAtLinkEClass, WORK_AT_LINK__WORK_FROM);
		createEReference(workAtLinkEClass, WORK_AT_LINK__WORK_AT);
		createEReference(workAtLinkEClass, WORK_AT_LINK__OPP_WORK_AT);

		hasMemberLinkEClass = createEClass(HAS_MEMBER_LINK);
		createEAttribute(hasMemberLinkEClass, HAS_MEMBER_LINK__JOIN_DATE);
		createEReference(hasMemberLinkEClass, HAS_MEMBER_LINK__HAS_MEMBER);
		createEReference(hasMemberLinkEClass, HAS_MEMBER_LINK__OPP_HAS_MEMBER);

		likesLinkEClass = createEClass(LIKES_LINK);
		createEAttribute(likesLinkEClass, LIKES_LINK__CREATION_DATE);
		createEReference(likesLinkEClass, LIKES_LINK__LIKES);
		createEReference(likesLinkEClass, LIKES_LINK__OPP_LIKES);

		integerIdentifiedElementEClass = createEClass(INTEGER_IDENTIFIED_ELEMENT);
		createEAttribute(integerIdentifiedElementEClass, INTEGER_IDENTIFIED_ELEMENT__INT_ID);

		ldbcSNBModelEClass = createEClass(LDBC_SNB_MODEL);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_PERSONS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__ORGANISATIONS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_UNIVERSITIES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_COMPANIES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_CITIES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_COUNTRIES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_CONTINENTS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_FORUMS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__MESSAGES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_POSTS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_COMMENTS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_TAGS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_TAG_CLASSES);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_KNOWS_LINKS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS);
		createEReference(ldbcSNBModelEClass, LDBC_SNB_MODEL__OWNED_LIKES_LINKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(this.getIntegerIdentifiedElement());
		personEClass.getESuperTypes().add(this.getIdentifiedElement());
		personEClass.getESuperTypes().add(this.getDynamicElement());
		organisationEClass.getESuperTypes().add(this.getIdentifiedElement());
		universityEClass.getESuperTypes().add(this.getOrganisation());
		companyEClass.getESuperTypes().add(this.getOrganisation());
		placeEClass.getESuperTypes().add(this.getIdentifiedElement());
		cityEClass.getESuperTypes().add(this.getPlace());
		countryEClass.getESuperTypes().add(this.getPlace());
		continentEClass.getESuperTypes().add(this.getPlace());
		forumEClass.getESuperTypes().add(this.getIdentifiedElement());
		forumEClass.getESuperTypes().add(this.getDynamicElement());
		messageEClass.getESuperTypes().add(this.getIdentifiedElement());
		messageEClass.getESuperTypes().add(this.getDynamicElement());
		postEClass.getESuperTypes().add(this.getMessage());
		postEClass.getESuperTypes().add(this.getIntegerIdentifiedElement());
		commentEClass.getESuperTypes().add(this.getMessage());
		tagEClass.getESuperTypes().add(this.getIntegerIdentifiedElement());
		tagEClass.getESuperTypes().add(this.getIdentifiedElement());
		tagClassEClass.getESuperTypes().add(this.getIdentifiedElement());
		knowsLinkEClass.getESuperTypes().add(this.getDynamicElement());
		hasMemberLinkEClass.getESuperTypes().add(this.getDynamicElement());
		likesLinkEClass.getESuperTypes().add(this.getDynamicElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_ID(), ecorePackage.getELong(), "ID", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicElementEClass, DynamicElement.class, "DynamicElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicElement_Cts(), ecorePackage.getELong(), "cts", null, 0, 1, DynamicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicElement_Dts(), ecorePackage.getELong(), "dts", null, 0, 1, DynamicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_CreationDate(), ecorePackage.getELong(), "creationDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), ecorePackage.getEString(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Birthday(), ecorePackage.getELong(), "birthday", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 1, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Speaks(), ecorePackage.getEString(), "speaks", null, 1, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_BrowserUsed(), ecorePackage.getEString(), "browserUsed", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LocationIP(), ecorePackage.getEString(), "locationIP", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Knows(), this.getKnowsLink(), this.getKnowsLink_OppKnows(), "knows", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_HasInterest(), this.getTag(), this.getTag_OppHasInterest(), "hasInterest", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_Likes(), this.getLikesLink(), this.getLikesLink_OppLikes(), "likes", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_WorkAt(), this.getWorkAtLink(), this.getWorkAtLink_OppWorkAt(), "workAt", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_StudyAt(), this.getStudyAtLink(), this.getStudyAtLink_OppStudyAt(), "studyAt", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_IsLocatedIn(), this.getCity(), this.getCity_OppPersonIsLocatedIn(), "isLocatedIn", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_OppHasMember(), this.getHasMemberLink(), this.getHasMemberLink_HasMember(), "oppHasMember", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_OppHasCreator(), this.getMessage(), this.getMessage_HasCreator(), "oppHasCreator", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_OppKnows(), this.getKnowsLink(), this.getKnowsLink_Knows(), "oppKnows", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_OppHasModerator(), this.getForum(), this.getForum_HasModerator(), "oppHasModerator", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversity_IsLocatedIn(), this.getCity(), this.getCity_OppUniversityIsLocatedIn(), "isLocatedIn", null, 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_OppStudyAt(), this.getStudyAtLink(), this.getStudyAtLink_StudyAt(), "oppStudyAt", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(companyEClass, Company.class, "Company", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_IsLocatedIn(), this.getCountry(), this.getCountry_OppCompanyIsLocatedIn(), "isLocatedIn", null, 1, 1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompany_OppWorkAt(), this.getWorkAtLink(), this.getWorkAtLink_WorkAt(), "oppWorkAt", null, 0, -1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCity_IsPartOf(), this.getCountry(), this.getCountry_OppIsPartOf(), "isPartOf", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_OppPersonIsLocatedIn(), this.getPerson(), this.getPerson_IsLocatedIn(), "oppPersonIsLocatedIn", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_OppUniversityIsLocatedIn(), this.getUniversity(), this.getUniversity_IsLocatedIn(), "oppUniversityIsLocatedIn", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountry_IsPartOf(), this.getContinent(), this.getContinent_OppIsPartOf(), "isPartOf", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_OppIsPartOf(), this.getCity(), this.getCity_IsPartOf(), "oppIsPartOf", null, 0, -1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_OppCompanyIsLocatedIn(), this.getCompany(), this.getCompany_IsLocatedIn(), "oppCompanyIsLocatedIn", null, 0, -1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_OppMessageIsLocatedIn(), this.getMessage(), this.getMessage_IsLocatedIn(), "oppMessageIsLocatedIn", null, 0, -1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continentEClass, Continent.class, "Continent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinent_OppIsPartOf(), this.getCountry(), this.getCountry_IsPartOf(), "oppIsPartOf", null, 0, -1, Continent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forumEClass, Forum.class, "Forum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForum_Title(), ecorePackage.getEString(), "title", null, 0, 1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForum_CreationDate(), ecorePackage.getELong(), "creationDate", null, 0, 1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_HasModerator(), this.getPerson(), this.getPerson_OppHasModerator(), "hasModerator", null, 1, 1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_HasTag(), this.getTag(), this.getTag_OppForumHasTag(), "hasTag", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForum_HasMember(), this.getHasMemberLink(), this.getHasMemberLink_OppHasMember(), "hasMember", null, 0, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForum_OppContainer(), this.getPost(), this.getPost_Container(), "oppContainer", null, 1, -1, Forum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_CreationDate(), ecorePackage.getELong(), "creationDate", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_BrowserUsed(), ecorePackage.getEString(), "browserUsed", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_LocationIP(), ecorePackage.getEString(), "locationIP", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Content(), ecorePackage.getEString(), "content", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_IsLocatedIn(), this.getCountry(), this.getCountry_OppMessageIsLocatedIn(), "isLocatedIn", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_HasTag(), this.getTag(), this.getTag_OppMessageHasTag(), "hasTag", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_HasCreator(), this.getPerson(), this.getPerson_OppHasCreator(), "hasCreator", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_OppLikes(), this.getLikesLink(), this.getLikesLink_Likes(), "oppLikes", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_OppReplyOf(), this.getComment(), this.getComment_ReplyOf(), "oppReplyOf", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postEClass, Post.class, "Post", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPost_Language(), ecorePackage.getEString(), "language", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPost_ImageFile(), ecorePackage.getEString(), "imageFile", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_Successor(), this.getPost(), this.getPost_OppSuccessor(), "successor", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_LinkedPosts(), this.getPost(), this.getPost_OppLinkedPosts(), "linkedPosts", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPost_Container(), this.getForum(), this.getForum_OppContainer(), "container", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_OppSuccessor(), this.getPost(), this.getPost_Successor(), "oppSuccessor", null, 0, 1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPost_OppLinkedPosts(), this.getPost(), this.getPost_LinkedPosts(), "oppLinkedPosts", null, 0, -1, Post.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_ReplyOf(), this.getMessage(), this.getMessage_OppReplyOf(), "replyOf", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_HasType(), this.getTagClass(), this.getTagClass_OppHasType(), "hasType", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTag_OppMessageHasTag(), this.getMessage(), this.getMessage_HasTag(), "oppMessageHasTag", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_OppHasInterest(), this.getPerson(), this.getPerson_HasInterest(), "oppHasInterest", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_OppForumHasTag(), this.getForum(), this.getForum_HasTag(), "oppForumHasTag", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagClassEClass, TagClass.class, "TagClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, TagClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagClass_IsSubclassOf(), this.getTagClass(), this.getTagClass_OppIsSubclassOf(), "isSubclassOf", null, 0, -1, TagClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTagClass_OppHasType(), this.getTag(), this.getTag_HasType(), "oppHasType", null, 0, -1, TagClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagClass_OppIsSubclassOf(), this.getTagClass(), this.getTagClass_IsSubclassOf(), "oppIsSubclassOf", null, 0, -1, TagClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowsLinkEClass, KnowsLink.class, "KnowsLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnowsLink_CreationDate(), ecorePackage.getELong(), "creationDate", null, 0, 1, KnowsLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowsLink_Knows(), this.getPerson(), this.getPerson_OppKnows(), "knows", null, 1, 1, KnowsLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowsLink_OppKnows(), this.getPerson(), this.getPerson_Knows(), "oppKnows", null, 1, 1, KnowsLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyAtLinkEClass, StudyAtLink.class, "StudyAtLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudyAtLink_ClassYear(), ecorePackage.getEInt(), "classYear", null, 0, 1, StudyAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyAtLink_StudyAt(), this.getUniversity(), this.getUniversity_OppStudyAt(), "studyAt", null, 1, 1, StudyAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyAtLink_OppStudyAt(), this.getPerson(), this.getPerson_StudyAt(), "oppStudyAt", null, 1, 1, StudyAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workAtLinkEClass, WorkAtLink.class, "WorkAtLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkAtLink_WorkFrom(), ecorePackage.getEInt(), "workFrom", null, 0, 1, WorkAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkAtLink_WorkAt(), this.getCompany(), this.getCompany_OppWorkAt(), "workAt", null, 1, 1, WorkAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkAtLink_OppWorkAt(), this.getPerson(), this.getPerson_WorkAt(), "oppWorkAt", null, 1, 1, WorkAtLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasMemberLinkEClass, HasMemberLink.class, "HasMemberLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasMemberLink_JoinDate(), ecorePackage.getELong(), "joinDate", null, 0, 1, HasMemberLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasMemberLink_HasMember(), this.getPerson(), this.getPerson_OppHasMember(), "hasMember", null, 1, 1, HasMemberLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasMemberLink_OppHasMember(), this.getForum(), this.getForum_HasMember(), "oppHasMember", null, 1, 1, HasMemberLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(likesLinkEClass, LikesLink.class, "LikesLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLikesLink_CreationDate(), ecorePackage.getELong(), "creationDate", null, 0, 1, LikesLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLikesLink_Likes(), this.getMessage(), this.getMessage_OppLikes(), "likes", null, 1, 1, LikesLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLikesLink_OppLikes(), this.getPerson(), this.getPerson_Likes(), "oppLikes", null, 0, 1, LikesLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerIdentifiedElementEClass, IntegerIdentifiedElement.class, "IntegerIdentifiedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerIdentifiedElement_IntId(), ecorePackage.getEInt(), "intId", null, 1, 1, IntegerIdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldbcSNBModelEClass, LdbcSNBModel.class, "LdbcSNBModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLdbcSNBModel_OwnedPersons(), this.getPerson(), null, "ownedPersons", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_Organisations(), this.getOrganisation(), null, "organisations", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedUniversities(), this.getUniversity(), null, "ownedUniversities", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedCompanies(), this.getCompany(), null, "ownedCompanies", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedCities(), this.getCity(), null, "ownedCities", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedCountries(), this.getCountry(), null, "ownedCountries", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedContinents(), this.getContinent(), null, "ownedContinents", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedForums(), this.getForum(), null, "ownedForums", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_Messages(), this.getMessage(), null, "messages", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedPosts(), this.getPost(), null, "ownedPosts", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedComments(), this.getComment(), null, "ownedComments", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedTags(), this.getTag(), null, "ownedTags", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedTagClasses(), this.getTagClass(), null, "ownedTagClasses", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedKnowsLinks(), this.getKnowsLink(), null, "ownedKnowsLinks", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedStudyAtLinks(), this.getStudyAtLink(), null, "ownedStudyAtLinks", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedWorkAtLinks(), this.getWorkAtLink(), null, "ownedWorkAtLinks", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedHasMemberLinks(), this.getHasMemberLink(), null, "ownedHasMemberLinks", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLdbcSNBModel_OwnedLikesLinks(), this.getLikesLink(), null, "ownedLikesLinks", null, 0, -1, LdbcSNBModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Ldbc_snbPackageImpl
