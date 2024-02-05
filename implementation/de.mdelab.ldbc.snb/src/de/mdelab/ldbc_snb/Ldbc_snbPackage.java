/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.mdelab.ldbc_snb.Ldbc_snbFactory
 * @model kind="package"
 * @generated
 */
public interface Ldbc_snbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ldbc_snb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.mdelab.ldbc_snb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.mdelab.ldbc_snb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ldbc_snbPackage eINSTANCE = de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.IdentifiedElementImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.DynamicElementImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getDynamicElement()
	 * @generated
	 */
	int DYNAMIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT__CTS = 0;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT__DTS = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement <em>Integer Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.IntegerIdentifiedElement
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getIntegerIdentifiedElement()
	 * @generated
	 */
	int INTEGER_IDENTIFIED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Int Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_IDENTIFIED_ELEMENT__INT_ID = 0;

	/**
	 * The number of structural features of the '<em>Integer Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Integer Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.PersonImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Int Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INT_ID = INTEGER_IDENTIFIED_ELEMENT__INT_ID;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CTS = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DTS = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATION_DATE = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTHDAY = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Speaks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SPEAKS = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Browser Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BROWSER_USED = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATION_IP = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Knows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KNOWS = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Has Interest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HAS_INTEREST = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIKES = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Work At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WORK_AT = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Study At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STUDY_AT = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_LOCATED_IN = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Opp Has Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OPP_HAS_MEMBER = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Opp Has Creator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OPP_HAS_CREATOR = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Opp Knows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OPP_KNOWS = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Opp Has Moderator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OPP_HAS_MODERATOR = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = INTEGER_IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.OrganisationImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.UniversityImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ID = ORGANISATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__IS_LOCATED_IN = ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opp Study At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__OPP_STUDY_AT = ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.CompanyImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ID = ORGANISATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__IS_LOCATED_IN = ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opp Work At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__OPP_WORK_AT = ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.PlaceImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.CityImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__IS_PART_OF = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opp Person Is Located In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__OPP_PERSON_IS_LOCATED_IN = PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp University Is Located In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__OPP_UNIVERSITY_IS_LOCATED_IN = PLACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = PLACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.CountryImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IS_PART_OF = PLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opp Is Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__OPP_IS_PART_OF = PLACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp Company Is Located In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__OPP_COMPANY_IS_LOCATED_IN = PLACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opp Message Is Located In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__OPP_MESSAGE_IS_LOCATED_IN = PLACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = PLACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.ContinentImpl <em>Continent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.ContinentImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getContinent()
	 * @generated
	 */
	int CONTINENT = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__ID = PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__NAME = PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Opp Is Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__OPP_IS_PART_OF = PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT_FEATURE_COUNT = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.ForumImpl <em>Forum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.ForumImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getForum()
	 * @generated
	 */
	int FORUM = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__CTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__DTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__TITLE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__CREATION_DATE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Moderator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__HAS_MODERATOR = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__HAS_TAG = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__HAS_MEMBER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Opp Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__OPP_CONTAINER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.MessageImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CREATION_DATE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Browser Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BROWSER_USED = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__LOCATION_IP = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__LENGTH = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IS_LOCATED_IN = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HAS_TAG = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HAS_CREATOR = IDENTIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Opp Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPP_LIKES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Opp Reply Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPP_REPLY_OF = IDENTIFIED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.PostImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPost()
	 * @generated
	 */
	int POST = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CTS = MESSAGE__CTS;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__DTS = MESSAGE__DTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CREATION_DATE = MESSAGE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Browser Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__BROWSER_USED = MESSAGE__BROWSER_USED;

	/**
	 * The feature id for the '<em><b>Location IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LOCATION_IP = MESSAGE__LOCATION_IP;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONTENT = MESSAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LENGTH = MESSAGE__LENGTH;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IS_LOCATED_IN = MESSAGE__IS_LOCATED_IN;

	/**
	 * The feature id for the '<em><b>Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__HAS_TAG = MESSAGE__HAS_TAG;

	/**
	 * The feature id for the '<em><b>Has Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__HAS_CREATOR = MESSAGE__HAS_CREATOR;

	/**
	 * The feature id for the '<em><b>Opp Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OPP_LIKES = MESSAGE__OPP_LIKES;

	/**
	 * The feature id for the '<em><b>Opp Reply Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OPP_REPLY_OF = MESSAGE__OPP_REPLY_OF;

	/**
	 * The feature id for the '<em><b>Int Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__INT_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LANGUAGE = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__IMAGE_FILE = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__SUCCESSOR = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Linked Posts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LINKED_POSTS = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONTAINER = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opp Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OPP_SUCCESSOR = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Opp Linked Posts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__OPP_LINKED_POSTS = MESSAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.CommentImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CTS = MESSAGE__CTS;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DTS = MESSAGE__DTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATION_DATE = MESSAGE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Browser Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BROWSER_USED = MESSAGE__BROWSER_USED;

	/**
	 * The feature id for the '<em><b>Location IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LOCATION_IP = MESSAGE__LOCATION_IP;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = MESSAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LENGTH = MESSAGE__LENGTH;

	/**
	 * The feature id for the '<em><b>Is Located In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__IS_LOCATED_IN = MESSAGE__IS_LOCATED_IN;

	/**
	 * The feature id for the '<em><b>Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__HAS_TAG = MESSAGE__HAS_TAG;

	/**
	 * The feature id for the '<em><b>Has Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__HAS_CREATOR = MESSAGE__HAS_CREATOR;

	/**
	 * The feature id for the '<em><b>Opp Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OPP_LIKES = MESSAGE__OPP_LIKES;

	/**
	 * The feature id for the '<em><b>Opp Reply Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OPP_REPLY_OF = MESSAGE__OPP_REPLY_OF;

	/**
	 * The feature id for the '<em><b>Reply Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REPLY_OF = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.TagImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 14;

	/**
	 * The feature id for the '<em><b>Int Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__INT_ID = INTEGER_IDENTIFIED_ELEMENT__INT_ID;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__HAS_TYPE = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opp Message Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__OPP_MESSAGE_HAS_TAG = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opp Has Interest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__OPP_HAS_INTEREST = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Opp Forum Has Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__OPP_FORUM_HAS_TAG = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = INTEGER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = INTEGER_IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.TagClassImpl <em>Tag Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.TagClassImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getTagClass()
	 * @generated
	 */
	int TAG_CLASS = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Subclass Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS__IS_SUBCLASS_OF = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp Has Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS__OPP_HAS_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opp Is Subclass Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS__OPP_IS_SUBCLASS_OF = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tag Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tag Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CLASS_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.KnowsLinkImpl <em>Knows Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.KnowsLinkImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getKnowsLink()
	 * @generated
	 */
	int KNOWS_LINK = 16;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK__CTS = DYNAMIC_ELEMENT__CTS;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK__DTS = DYNAMIC_ELEMENT__DTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK__CREATION_DATE = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Knows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK__KNOWS = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp Knows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK__OPP_KNOWS = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Knows Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Knows Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWS_LINK_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.StudyAtLinkImpl <em>Study At Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.StudyAtLinkImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getStudyAtLink()
	 * @generated
	 */
	int STUDY_AT_LINK = 17;

	/**
	 * The feature id for the '<em><b>Class Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_AT_LINK__CLASS_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Study At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_AT_LINK__STUDY_AT = 1;

	/**
	 * The feature id for the '<em><b>Opp Study At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_AT_LINK__OPP_STUDY_AT = 2;

	/**
	 * The number of structural features of the '<em>Study At Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_AT_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study At Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_AT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.WorkAtLinkImpl <em>Work At Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.WorkAtLinkImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getWorkAtLink()
	 * @generated
	 */
	int WORK_AT_LINK = 18;

	/**
	 * The feature id for the '<em><b>Work From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_AT_LINK__WORK_FROM = 0;

	/**
	 * The feature id for the '<em><b>Work At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_AT_LINK__WORK_AT = 1;

	/**
	 * The feature id for the '<em><b>Opp Work At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_AT_LINK__OPP_WORK_AT = 2;

	/**
	 * The number of structural features of the '<em>Work At Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_AT_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work At Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_AT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.HasMemberLinkImpl <em>Has Member Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.HasMemberLinkImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getHasMemberLink()
	 * @generated
	 */
	int HAS_MEMBER_LINK = 19;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK__CTS = DYNAMIC_ELEMENT__CTS;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK__DTS = DYNAMIC_ELEMENT__DTS;

	/**
	 * The feature id for the '<em><b>Join Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK__JOIN_DATE = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK__HAS_MEMBER = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp Has Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK__OPP_HAS_MEMBER = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Has Member Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Has Member Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEMBER_LINK_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.LikesLinkImpl <em>Likes Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.LikesLinkImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getLikesLink()
	 * @generated
	 */
	int LIKES_LINK = 20;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK__CTS = DYNAMIC_ELEMENT__CTS;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK__DTS = DYNAMIC_ELEMENT__DTS;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK__CREATION_DATE = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK__LIKES = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opp Likes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK__OPP_LIKES = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Likes Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Likes Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKES_LINK_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl <em>Ldbc SNB Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl
	 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getLdbcSNBModel()
	 * @generated
	 */
	int LDBC_SNB_MODEL = 22;

	/**
	 * The feature id for the '<em><b>Owned Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__ORGANISATIONS = 1;

	/**
	 * The feature id for the '<em><b>Owned Universities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_UNIVERSITIES = 2;

	/**
	 * The feature id for the '<em><b>Owned Companies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_COMPANIES = 3;

	/**
	 * The feature id for the '<em><b>Owned Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_CITIES = 4;

	/**
	 * The feature id for the '<em><b>Owned Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_COUNTRIES = 5;

	/**
	 * The feature id for the '<em><b>Owned Continents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_CONTINENTS = 6;

	/**
	 * The feature id for the '<em><b>Owned Forums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_FORUMS = 7;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__MESSAGES = 8;

	/**
	 * The feature id for the '<em><b>Owned Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_POSTS = 9;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_COMMENTS = 10;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_TAGS = 11;

	/**
	 * The feature id for the '<em><b>Owned Tag Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_TAG_CLASSES = 12;

	/**
	 * The feature id for the '<em><b>Owned Knows Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_KNOWS_LINKS = 13;

	/**
	 * The feature id for the '<em><b>Owned Study At Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS = 14;

	/**
	 * The feature id for the '<em><b>Owned Work At Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS = 15;

	/**
	 * The feature id for the '<em><b>Owned Has Member Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS = 16;

	/**
	 * The feature id for the '<em><b>Owned Likes Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL__OWNED_LIKES_LINKS = 17;

	/**
	 * The number of structural features of the '<em>Ldbc SNB Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Ldbc SNB Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDBC_SNB_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see de.mdelab.ldbc_snb.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.IdentifiedElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.mdelab.ldbc_snb.IdentifiedElement#getID()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_ID();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.DynamicElement <em>Dynamic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Element</em>'.
	 * @see de.mdelab.ldbc_snb.DynamicElement
	 * @generated
	 */
	EClass getDynamicElement();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.DynamicElement#getCts <em>Cts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cts</em>'.
	 * @see de.mdelab.ldbc_snb.DynamicElement#getCts()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_Cts();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.DynamicElement#getDts <em>Dts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dts</em>'.
	 * @see de.mdelab.ldbc_snb.DynamicElement#getDts()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_Dts();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.mdelab.ldbc_snb.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getCreationDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getBirthday <em>Birthday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getBirthday()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Birthday();

	/**
	 * Returns the meta object for the attribute list '{@link de.mdelab.ldbc_snb.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute list '{@link de.mdelab.ldbc_snb.Person#getSpeaks <em>Speaks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Speaks</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getSpeaks()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Speaks();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getBrowserUsed <em>Browser Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser Used</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getBrowserUsed()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BrowserUsed();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Person#getLocationIP <em>Location IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location IP</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getLocationIP()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LocationIP();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getKnows <em>Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knows</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getKnows()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Knows();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getHasInterest <em>Has Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Interest</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getHasInterest()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_HasInterest();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Likes</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getLikes()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Likes();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getWorkAt <em>Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work At</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getWorkAt()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_WorkAt();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getStudyAt <em>Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Study At</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getStudyAt()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_StudyAt();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Person#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getIsLocatedIn()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getOppHasMember <em>Opp Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Has Member</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getOppHasMember()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OppHasMember();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getOppHasCreator <em>Opp Has Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Has Creator</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getOppHasCreator()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OppHasCreator();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getOppKnows <em>Opp Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Knows</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getOppKnows()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OppKnows();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Person#getOppHasModerator <em>Opp Has Moderator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Has Moderator</em>'.
	 * @see de.mdelab.ldbc_snb.Person#getOppHasModerator()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OppHasModerator();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see de.mdelab.ldbc_snb.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Organisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.ldbc_snb.Organisation#getName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Name();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see de.mdelab.ldbc_snb.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.University#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.University#getIsLocatedIn()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_IsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.University#getOppStudyAt <em>Opp Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Study At</em>'.
	 * @see de.mdelab.ldbc_snb.University#getOppStudyAt()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_OppStudyAt();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see de.mdelab.ldbc_snb.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Company#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.Company#getIsLocatedIn()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_IsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Company#getOppWorkAt <em>Opp Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Work At</em>'.
	 * @see de.mdelab.ldbc_snb.Company#getOppWorkAt()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_OppWorkAt();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see de.mdelab.ldbc_snb.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.ldbc_snb.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see de.mdelab.ldbc_snb.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.City#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of</em>'.
	 * @see de.mdelab.ldbc_snb.City#getIsPartOf()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_IsPartOf();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.City#getOppPersonIsLocatedIn <em>Opp Person Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Person Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.City#getOppPersonIsLocatedIn()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_OppPersonIsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.City#getOppUniversityIsLocatedIn <em>Opp University Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp University Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.City#getOppUniversityIsLocatedIn()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_OppUniversityIsLocatedIn();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see de.mdelab.ldbc_snb.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Country#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of</em>'.
	 * @see de.mdelab.ldbc_snb.Country#getIsPartOf()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_IsPartOf();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Country#getOppIsPartOf <em>Opp Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Is Part Of</em>'.
	 * @see de.mdelab.ldbc_snb.Country#getOppIsPartOf()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_OppIsPartOf();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Country#getOppCompanyIsLocatedIn <em>Opp Company Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Company Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.Country#getOppCompanyIsLocatedIn()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_OppCompanyIsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Country#getOppMessageIsLocatedIn <em>Opp Message Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Message Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.Country#getOppMessageIsLocatedIn()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_OppMessageIsLocatedIn();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Continent <em>Continent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continent</em>'.
	 * @see de.mdelab.ldbc_snb.Continent
	 * @generated
	 */
	EClass getContinent();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Continent#getOppIsPartOf <em>Opp Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Is Part Of</em>'.
	 * @see de.mdelab.ldbc_snb.Continent#getOppIsPartOf()
	 * @see #getContinent()
	 * @generated
	 */
	EReference getContinent_OppIsPartOf();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Forum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forum</em>'.
	 * @see de.mdelab.ldbc_snb.Forum
	 * @generated
	 */
	EClass getForum();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Forum#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getTitle()
	 * @see #getForum()
	 * @generated
	 */
	EAttribute getForum_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Forum#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getCreationDate()
	 * @see #getForum()
	 * @generated
	 */
	EAttribute getForum_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Forum#getHasModerator <em>Has Moderator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Moderator</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getHasModerator()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_HasModerator();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Forum#getHasTag <em>Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Tag</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getHasTag()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_HasTag();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Forum#getHasMember <em>Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Member</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getHasMember()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_HasMember();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Forum#getOppContainer <em>Opp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Container</em>'.
	 * @see de.mdelab.ldbc_snb.Forum#getOppContainer()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_OppContainer();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.mdelab.ldbc_snb.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Message#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getCreationDate()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Message#getBrowserUsed <em>Browser Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser Used</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getBrowserUsed()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_BrowserUsed();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Message#getLocationIP <em>Location IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location IP</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getLocationIP()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_LocationIP();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Message#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getLength()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Length();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Message#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Located In</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getIsLocatedIn()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_IsLocatedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Message#getHasTag <em>Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Tag</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getHasTag()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_HasTag();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Message#getHasCreator <em>Has Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Creator</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getHasCreator()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_HasCreator();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Message#getOppLikes <em>Opp Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Likes</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getOppLikes()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_OppLikes();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Message#getOppReplyOf <em>Opp Reply Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Reply Of</em>'.
	 * @see de.mdelab.ldbc_snb.Message#getOppReplyOf()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_OppReplyOf();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see de.mdelab.ldbc_snb.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Post#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getLanguage()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Post#getImageFile <em>Image File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image File</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getImageFile()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_ImageFile();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Post#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getSuccessor()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Successor();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Post#getLinkedPosts <em>Linked Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Posts</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getLinkedPosts()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_LinkedPosts();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Post#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getContainer()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Container();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Post#getOppSuccessor <em>Opp Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Successor</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getOppSuccessor()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_OppSuccessor();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Post#getOppLinkedPosts <em>Opp Linked Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Linked Posts</em>'.
	 * @see de.mdelab.ldbc_snb.Post#getOppLinkedPosts()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_OppLinkedPosts();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see de.mdelab.ldbc_snb.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.Comment#getReplyOf <em>Reply Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reply Of</em>'.
	 * @see de.mdelab.ldbc_snb.Comment#getReplyOf()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_ReplyOf();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see de.mdelab.ldbc_snb.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.ldbc_snb.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Tag#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Type</em>'.
	 * @see de.mdelab.ldbc_snb.Tag#getHasType()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_HasType();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Tag#getOppMessageHasTag <em>Opp Message Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Message Has Tag</em>'.
	 * @see de.mdelab.ldbc_snb.Tag#getOppMessageHasTag()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_OppMessageHasTag();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Tag#getOppHasInterest <em>Opp Has Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Has Interest</em>'.
	 * @see de.mdelab.ldbc_snb.Tag#getOppHasInterest()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_OppHasInterest();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.Tag#getOppForumHasTag <em>Opp Forum Has Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Forum Has Tag</em>'.
	 * @see de.mdelab.ldbc_snb.Tag#getOppForumHasTag()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_OppForumHasTag();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.TagClass <em>Tag Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Class</em>'.
	 * @see de.mdelab.ldbc_snb.TagClass
	 * @generated
	 */
	EClass getTagClass();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.TagClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mdelab.ldbc_snb.TagClass#getName()
	 * @see #getTagClass()
	 * @generated
	 */
	EAttribute getTagClass_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.TagClass#getIsSubclassOf <em>Is Subclass Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Subclass Of</em>'.
	 * @see de.mdelab.ldbc_snb.TagClass#getIsSubclassOf()
	 * @see #getTagClass()
	 * @generated
	 */
	EReference getTagClass_IsSubclassOf();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.TagClass#getOppHasType <em>Opp Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Has Type</em>'.
	 * @see de.mdelab.ldbc_snb.TagClass#getOppHasType()
	 * @see #getTagClass()
	 * @generated
	 */
	EReference getTagClass_OppHasType();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.TagClass#getOppIsSubclassOf <em>Opp Is Subclass Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opp Is Subclass Of</em>'.
	 * @see de.mdelab.ldbc_snb.TagClass#getOppIsSubclassOf()
	 * @see #getTagClass()
	 * @generated
	 */
	EReference getTagClass_OppIsSubclassOf();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.KnowsLink <em>Knows Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knows Link</em>'.
	 * @see de.mdelab.ldbc_snb.KnowsLink
	 * @generated
	 */
	EClass getKnowsLink();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.KnowsLink#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.mdelab.ldbc_snb.KnowsLink#getCreationDate()
	 * @see #getKnowsLink()
	 * @generated
	 */
	EAttribute getKnowsLink_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.KnowsLink#getKnows <em>Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knows</em>'.
	 * @see de.mdelab.ldbc_snb.KnowsLink#getKnows()
	 * @see #getKnowsLink()
	 * @generated
	 */
	EReference getKnowsLink_Knows();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.KnowsLink#getOppKnows <em>Opp Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Knows</em>'.
	 * @see de.mdelab.ldbc_snb.KnowsLink#getOppKnows()
	 * @see #getKnowsLink()
	 * @generated
	 */
	EReference getKnowsLink_OppKnows();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.StudyAtLink <em>Study At Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study At Link</em>'.
	 * @see de.mdelab.ldbc_snb.StudyAtLink
	 * @generated
	 */
	EClass getStudyAtLink();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.StudyAtLink#getClassYear <em>Class Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Year</em>'.
	 * @see de.mdelab.ldbc_snb.StudyAtLink#getClassYear()
	 * @see #getStudyAtLink()
	 * @generated
	 */
	EAttribute getStudyAtLink_ClassYear();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.StudyAtLink#getStudyAt <em>Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Study At</em>'.
	 * @see de.mdelab.ldbc_snb.StudyAtLink#getStudyAt()
	 * @see #getStudyAtLink()
	 * @generated
	 */
	EReference getStudyAtLink_StudyAt();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt <em>Opp Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Study At</em>'.
	 * @see de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt()
	 * @see #getStudyAtLink()
	 * @generated
	 */
	EReference getStudyAtLink_OppStudyAt();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.WorkAtLink <em>Work At Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work At Link</em>'.
	 * @see de.mdelab.ldbc_snb.WorkAtLink
	 * @generated
	 */
	EClass getWorkAtLink();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkFrom <em>Work From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work From</em>'.
	 * @see de.mdelab.ldbc_snb.WorkAtLink#getWorkFrom()
	 * @see #getWorkAtLink()
	 * @generated
	 */
	EAttribute getWorkAtLink_WorkFrom();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkAt <em>Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work At</em>'.
	 * @see de.mdelab.ldbc_snb.WorkAtLink#getWorkAt()
	 * @see #getWorkAtLink()
	 * @generated
	 */
	EReference getWorkAtLink_WorkAt();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt <em>Opp Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Work At</em>'.
	 * @see de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt()
	 * @see #getWorkAtLink()
	 * @generated
	 */
	EReference getWorkAtLink_OppWorkAt();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.HasMemberLink <em>Has Member Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Member Link</em>'.
	 * @see de.mdelab.ldbc_snb.HasMemberLink
	 * @generated
	 */
	EClass getHasMemberLink();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.HasMemberLink#getJoinDate <em>Join Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Date</em>'.
	 * @see de.mdelab.ldbc_snb.HasMemberLink#getJoinDate()
	 * @see #getHasMemberLink()
	 * @generated
	 */
	EAttribute getHasMemberLink_JoinDate();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.HasMemberLink#getHasMember <em>Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Member</em>'.
	 * @see de.mdelab.ldbc_snb.HasMemberLink#getHasMember()
	 * @see #getHasMemberLink()
	 * @generated
	 */
	EReference getHasMemberLink_HasMember();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember <em>Opp Has Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Has Member</em>'.
	 * @see de.mdelab.ldbc_snb.HasMemberLink#getOppHasMember()
	 * @see #getHasMemberLink()
	 * @generated
	 */
	EReference getHasMemberLink_OppHasMember();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.LikesLink <em>Likes Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Likes Link</em>'.
	 * @see de.mdelab.ldbc_snb.LikesLink
	 * @generated
	 */
	EClass getLikesLink();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.LikesLink#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.mdelab.ldbc_snb.LikesLink#getCreationDate()
	 * @see #getLikesLink()
	 * @generated
	 */
	EAttribute getLikesLink_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.LikesLink#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Likes</em>'.
	 * @see de.mdelab.ldbc_snb.LikesLink#getLikes()
	 * @see #getLikesLink()
	 * @generated
	 */
	EReference getLikesLink_Likes();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.ldbc_snb.LikesLink#getOppLikes <em>Opp Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opp Likes</em>'.
	 * @see de.mdelab.ldbc_snb.LikesLink#getOppLikes()
	 * @see #getLikesLink()
	 * @generated
	 */
	EReference getLikesLink_OppLikes();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement <em>Integer Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Identified Element</em>'.
	 * @see de.mdelab.ldbc_snb.IntegerIdentifiedElement
	 * @generated
	 */
	EClass getIntegerIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement#getIntId <em>Int Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Id</em>'.
	 * @see de.mdelab.ldbc_snb.IntegerIdentifiedElement#getIntId()
	 * @see #getIntegerIdentifiedElement()
	 * @generated
	 */
	EAttribute getIntegerIdentifiedElement_IntId();

	/**
	 * Returns the meta object for class '{@link de.mdelab.ldbc_snb.LdbcSNBModel <em>Ldbc SNB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldbc SNB Model</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel
	 * @generated
	 */
	EClass getLdbcSNBModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPersons <em>Owned Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Persons</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPersons()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedPersons();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOrganisations()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_Organisations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedUniversities <em>Owned Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Universities</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedUniversities()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedUniversities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCompanies <em>Owned Companies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Companies</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCompanies()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedCompanies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCities <em>Owned Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Cities</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCities()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedCities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCountries <em>Owned Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Countries</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedCountries()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedCountries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedContinents <em>Owned Continents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Continents</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedContinents()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedContinents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedForums <em>Owned Forums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Forums</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedForums()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedForums();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getMessages()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPosts <em>Owned Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Posts</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedPosts()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedPosts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedComments <em>Owned Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comments</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedComments()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedComments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTags <em>Owned Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tags</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTags()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedTags();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTagClasses <em>Owned Tag Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tag Classes</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedTagClasses()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedTagClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedKnowsLinks <em>Owned Knows Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Knows Links</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedKnowsLinks()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedKnowsLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedStudyAtLinks <em>Owned Study At Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Study At Links</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedStudyAtLinks()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedStudyAtLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedWorkAtLinks <em>Owned Work At Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Work At Links</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedWorkAtLinks()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedWorkAtLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedHasMemberLinks <em>Owned Has Member Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Has Member Links</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedHasMemberLinks()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedHasMemberLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedLikesLinks <em>Owned Likes Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Likes Links</em>'.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel#getOwnedLikesLinks()
	 * @see #getLdbcSNBModel()
	 * @generated
	 */
	EReference getLdbcSNBModel_OwnedLikesLinks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ldbc_snbFactory getLdbc_snbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.IdentifiedElementImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_ID();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.DynamicElementImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getDynamicElement()
		 * @generated
		 */
		EClass DYNAMIC_ELEMENT = eINSTANCE.getDynamicElement();

		/**
		 * The meta object literal for the '<em><b>Cts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_ELEMENT__CTS = eINSTANCE.getDynamicElement_Cts();

		/**
		 * The meta object literal for the '<em><b>Dts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_ELEMENT__DTS = eINSTANCE.getDynamicElement_Dts();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.PersonImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CREATION_DATE = eINSTANCE.getPerson_CreationDate();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTHDAY = eINSTANCE.getPerson_Birthday();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Speaks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SPEAKS = eINSTANCE.getPerson_Speaks();

		/**
		 * The meta object literal for the '<em><b>Browser Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BROWSER_USED = eINSTANCE.getPerson_BrowserUsed();

		/**
		 * The meta object literal for the '<em><b>Location IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LOCATION_IP = eINSTANCE.getPerson_LocationIP();

		/**
		 * The meta object literal for the '<em><b>Knows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__KNOWS = eINSTANCE.getPerson_Knows();

		/**
		 * The meta object literal for the '<em><b>Has Interest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__HAS_INTEREST = eINSTANCE.getPerson_HasInterest();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LIKES = eINSTANCE.getPerson_Likes();

		/**
		 * The meta object literal for the '<em><b>Work At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__WORK_AT = eINSTANCE.getPerson_WorkAt();

		/**
		 * The meta object literal for the '<em><b>Study At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__STUDY_AT = eINSTANCE.getPerson_StudyAt();

		/**
		 * The meta object literal for the '<em><b>Is Located In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IS_LOCATED_IN = eINSTANCE.getPerson_IsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Opp Has Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OPP_HAS_MEMBER = eINSTANCE.getPerson_OppHasMember();

		/**
		 * The meta object literal for the '<em><b>Opp Has Creator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OPP_HAS_CREATOR = eINSTANCE.getPerson_OppHasCreator();

		/**
		 * The meta object literal for the '<em><b>Opp Knows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OPP_KNOWS = eINSTANCE.getPerson_OppKnows();

		/**
		 * The meta object literal for the '<em><b>Opp Has Moderator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OPP_HAS_MODERATOR = eINSTANCE.getPerson_OppHasModerator();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.OrganisationImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.UniversityImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Is Located In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__IS_LOCATED_IN = eINSTANCE.getUniversity_IsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Opp Study At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__OPP_STUDY_AT = eINSTANCE.getUniversity_OppStudyAt();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.CompanyImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Is Located In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__IS_LOCATED_IN = eINSTANCE.getCompany_IsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Opp Work At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__OPP_WORK_AT = eINSTANCE.getCompany_OppWorkAt();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.PlaceImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.CityImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__IS_PART_OF = eINSTANCE.getCity_IsPartOf();

		/**
		 * The meta object literal for the '<em><b>Opp Person Is Located In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__OPP_PERSON_IS_LOCATED_IN = eINSTANCE.getCity_OppPersonIsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Opp University Is Located In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__OPP_UNIVERSITY_IS_LOCATED_IN = eINSTANCE.getCity_OppUniversityIsLocatedIn();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.CountryImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__IS_PART_OF = eINSTANCE.getCountry_IsPartOf();

		/**
		 * The meta object literal for the '<em><b>Opp Is Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__OPP_IS_PART_OF = eINSTANCE.getCountry_OppIsPartOf();

		/**
		 * The meta object literal for the '<em><b>Opp Company Is Located In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__OPP_COMPANY_IS_LOCATED_IN = eINSTANCE.getCountry_OppCompanyIsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Opp Message Is Located In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__OPP_MESSAGE_IS_LOCATED_IN = eINSTANCE.getCountry_OppMessageIsLocatedIn();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.ContinentImpl <em>Continent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.ContinentImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getContinent()
		 * @generated
		 */
		EClass CONTINENT = eINSTANCE.getContinent();

		/**
		 * The meta object literal for the '<em><b>Opp Is Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINENT__OPP_IS_PART_OF = eINSTANCE.getContinent_OppIsPartOf();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.ForumImpl <em>Forum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.ForumImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getForum()
		 * @generated
		 */
		EClass FORUM = eINSTANCE.getForum();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORUM__TITLE = eINSTANCE.getForum_Title();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORUM__CREATION_DATE = eINSTANCE.getForum_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Has Moderator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__HAS_MODERATOR = eINSTANCE.getForum_HasModerator();

		/**
		 * The meta object literal for the '<em><b>Has Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__HAS_TAG = eINSTANCE.getForum_HasTag();

		/**
		 * The meta object literal for the '<em><b>Has Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__HAS_MEMBER = eINSTANCE.getForum_HasMember();

		/**
		 * The meta object literal for the '<em><b>Opp Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__OPP_CONTAINER = eINSTANCE.getForum_OppContainer();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.MessageImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CREATION_DATE = eINSTANCE.getMessage_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Browser Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__BROWSER_USED = eINSTANCE.getMessage_BrowserUsed();

		/**
		 * The meta object literal for the '<em><b>Location IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__LOCATION_IP = eINSTANCE.getMessage_LocationIP();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__LENGTH = eINSTANCE.getMessage_Length();

		/**
		 * The meta object literal for the '<em><b>Is Located In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__IS_LOCATED_IN = eINSTANCE.getMessage_IsLocatedIn();

		/**
		 * The meta object literal for the '<em><b>Has Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__HAS_TAG = eINSTANCE.getMessage_HasTag();

		/**
		 * The meta object literal for the '<em><b>Has Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__HAS_CREATOR = eINSTANCE.getMessage_HasCreator();

		/**
		 * The meta object literal for the '<em><b>Opp Likes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPP_LIKES = eINSTANCE.getMessage_OppLikes();

		/**
		 * The meta object literal for the '<em><b>Opp Reply Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPP_REPLY_OF = eINSTANCE.getMessage_OppReplyOf();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.PostImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__LANGUAGE = eINSTANCE.getPost_Language();

		/**
		 * The meta object literal for the '<em><b>Image File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__IMAGE_FILE = eINSTANCE.getPost_ImageFile();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__SUCCESSOR = eINSTANCE.getPost_Successor();

		/**
		 * The meta object literal for the '<em><b>Linked Posts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__LINKED_POSTS = eINSTANCE.getPost_LinkedPosts();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__CONTAINER = eINSTANCE.getPost_Container();

		/**
		 * The meta object literal for the '<em><b>Opp Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__OPP_SUCCESSOR = eINSTANCE.getPost_OppSuccessor();

		/**
		 * The meta object literal for the '<em><b>Opp Linked Posts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__OPP_LINKED_POSTS = eINSTANCE.getPost_OppLinkedPosts();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.CommentImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Reply Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__REPLY_OF = eINSTANCE.getComment_ReplyOf();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.TagImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__HAS_TYPE = eINSTANCE.getTag_HasType();

		/**
		 * The meta object literal for the '<em><b>Opp Message Has Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__OPP_MESSAGE_HAS_TAG = eINSTANCE.getTag_OppMessageHasTag();

		/**
		 * The meta object literal for the '<em><b>Opp Has Interest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__OPP_HAS_INTEREST = eINSTANCE.getTag_OppHasInterest();

		/**
		 * The meta object literal for the '<em><b>Opp Forum Has Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__OPP_FORUM_HAS_TAG = eINSTANCE.getTag_OppForumHasTag();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.TagClassImpl <em>Tag Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.TagClassImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getTagClass()
		 * @generated
		 */
		EClass TAG_CLASS = eINSTANCE.getTagClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_CLASS__NAME = eINSTANCE.getTagClass_Name();

		/**
		 * The meta object literal for the '<em><b>Is Subclass Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_CLASS__IS_SUBCLASS_OF = eINSTANCE.getTagClass_IsSubclassOf();

		/**
		 * The meta object literal for the '<em><b>Opp Has Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_CLASS__OPP_HAS_TYPE = eINSTANCE.getTagClass_OppHasType();

		/**
		 * The meta object literal for the '<em><b>Opp Is Subclass Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_CLASS__OPP_IS_SUBCLASS_OF = eINSTANCE.getTagClass_OppIsSubclassOf();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.KnowsLinkImpl <em>Knows Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.KnowsLinkImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getKnowsLink()
		 * @generated
		 */
		EClass KNOWS_LINK = eINSTANCE.getKnowsLink();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWS_LINK__CREATION_DATE = eINSTANCE.getKnowsLink_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Knows</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWS_LINK__KNOWS = eINSTANCE.getKnowsLink_Knows();

		/**
		 * The meta object literal for the '<em><b>Opp Knows</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWS_LINK__OPP_KNOWS = eINSTANCE.getKnowsLink_OppKnows();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.StudyAtLinkImpl <em>Study At Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.StudyAtLinkImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getStudyAtLink()
		 * @generated
		 */
		EClass STUDY_AT_LINK = eINSTANCE.getStudyAtLink();

		/**
		 * The meta object literal for the '<em><b>Class Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_AT_LINK__CLASS_YEAR = eINSTANCE.getStudyAtLink_ClassYear();

		/**
		 * The meta object literal for the '<em><b>Study At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_AT_LINK__STUDY_AT = eINSTANCE.getStudyAtLink_StudyAt();

		/**
		 * The meta object literal for the '<em><b>Opp Study At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_AT_LINK__OPP_STUDY_AT = eINSTANCE.getStudyAtLink_OppStudyAt();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.WorkAtLinkImpl <em>Work At Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.WorkAtLinkImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getWorkAtLink()
		 * @generated
		 */
		EClass WORK_AT_LINK = eINSTANCE.getWorkAtLink();

		/**
		 * The meta object literal for the '<em><b>Work From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_AT_LINK__WORK_FROM = eINSTANCE.getWorkAtLink_WorkFrom();

		/**
		 * The meta object literal for the '<em><b>Work At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_AT_LINK__WORK_AT = eINSTANCE.getWorkAtLink_WorkAt();

		/**
		 * The meta object literal for the '<em><b>Opp Work At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_AT_LINK__OPP_WORK_AT = eINSTANCE.getWorkAtLink_OppWorkAt();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.HasMemberLinkImpl <em>Has Member Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.HasMemberLinkImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getHasMemberLink()
		 * @generated
		 */
		EClass HAS_MEMBER_LINK = eINSTANCE.getHasMemberLink();

		/**
		 * The meta object literal for the '<em><b>Join Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_MEMBER_LINK__JOIN_DATE = eINSTANCE.getHasMemberLink_JoinDate();

		/**
		 * The meta object literal for the '<em><b>Has Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_MEMBER_LINK__HAS_MEMBER = eINSTANCE.getHasMemberLink_HasMember();

		/**
		 * The meta object literal for the '<em><b>Opp Has Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_MEMBER_LINK__OPP_HAS_MEMBER = eINSTANCE.getHasMemberLink_OppHasMember();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.LikesLinkImpl <em>Likes Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.LikesLinkImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getLikesLink()
		 * @generated
		 */
		EClass LIKES_LINK = eINSTANCE.getLikesLink();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKES_LINK__CREATION_DATE = eINSTANCE.getLikesLink_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIKES_LINK__LIKES = eINSTANCE.getLikesLink_Likes();

		/**
		 * The meta object literal for the '<em><b>Opp Likes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIKES_LINK__OPP_LIKES = eINSTANCE.getLikesLink_OppLikes();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement <em>Integer Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.IntegerIdentifiedElement
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getIntegerIdentifiedElement()
		 * @generated
		 */
		EClass INTEGER_IDENTIFIED_ELEMENT = eINSTANCE.getIntegerIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Int Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_IDENTIFIED_ELEMENT__INT_ID = eINSTANCE.getIntegerIdentifiedElement_IntId();

		/**
		 * The meta object literal for the '{@link de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl <em>Ldbc SNB Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.ldbc_snb.impl.LdbcSNBModelImpl
		 * @see de.mdelab.ldbc_snb.impl.Ldbc_snbPackageImpl#getLdbcSNBModel()
		 * @generated
		 */
		EClass LDBC_SNB_MODEL = eINSTANCE.getLdbcSNBModel();

		/**
		 * The meta object literal for the '<em><b>Owned Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_PERSONS = eINSTANCE.getLdbcSNBModel_OwnedPersons();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__ORGANISATIONS = eINSTANCE.getLdbcSNBModel_Organisations();

		/**
		 * The meta object literal for the '<em><b>Owned Universities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_UNIVERSITIES = eINSTANCE.getLdbcSNBModel_OwnedUniversities();

		/**
		 * The meta object literal for the '<em><b>Owned Companies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_COMPANIES = eINSTANCE.getLdbcSNBModel_OwnedCompanies();

		/**
		 * The meta object literal for the '<em><b>Owned Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_CITIES = eINSTANCE.getLdbcSNBModel_OwnedCities();

		/**
		 * The meta object literal for the '<em><b>Owned Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_COUNTRIES = eINSTANCE.getLdbcSNBModel_OwnedCountries();

		/**
		 * The meta object literal for the '<em><b>Owned Continents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_CONTINENTS = eINSTANCE.getLdbcSNBModel_OwnedContinents();

		/**
		 * The meta object literal for the '<em><b>Owned Forums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_FORUMS = eINSTANCE.getLdbcSNBModel_OwnedForums();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__MESSAGES = eINSTANCE.getLdbcSNBModel_Messages();

		/**
		 * The meta object literal for the '<em><b>Owned Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_POSTS = eINSTANCE.getLdbcSNBModel_OwnedPosts();

		/**
		 * The meta object literal for the '<em><b>Owned Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_COMMENTS = eINSTANCE.getLdbcSNBModel_OwnedComments();

		/**
		 * The meta object literal for the '<em><b>Owned Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_TAGS = eINSTANCE.getLdbcSNBModel_OwnedTags();

		/**
		 * The meta object literal for the '<em><b>Owned Tag Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_TAG_CLASSES = eINSTANCE.getLdbcSNBModel_OwnedTagClasses();

		/**
		 * The meta object literal for the '<em><b>Owned Knows Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_KNOWS_LINKS = eINSTANCE.getLdbcSNBModel_OwnedKnowsLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Study At Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_STUDY_AT_LINKS = eINSTANCE.getLdbcSNBModel_OwnedStudyAtLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Work At Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_WORK_AT_LINKS = eINSTANCE.getLdbcSNBModel_OwnedWorkAtLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Has Member Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_HAS_MEMBER_LINKS = eINSTANCE.getLdbcSNBModel_OwnedHasMemberLinks();

		/**
		 * The meta object literal for the '<em><b>Owned Likes Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDBC_SNB_MODEL__OWNED_LIKES_LINKS = eINSTANCE.getLdbcSNBModel_OwnedLikesLinks();

	}

} //Ldbc_snbPackage
