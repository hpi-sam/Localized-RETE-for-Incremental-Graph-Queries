/**
 */
package de.mdelab.ldbc_snb.util;

import de.mdelab.ldbc_snb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage
 * @generated
 */
public class Ldbc_snbSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ldbc_snbPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ldbc_snbSwitch() {
		if (modelPackage == null) {
			modelPackage = Ldbc_snbPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ldbc_snbPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.DYNAMIC_ELEMENT: {
				DynamicElement dynamicElement = (DynamicElement)theEObject;
				T result = caseDynamicElement(dynamicElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseIntegerIdentifiedElement(person);
				if (result == null) result = caseIdentifiedElement(person);
				if (result == null) result = caseDynamicElement(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.ORGANISATION: {
				Organisation organisation = (Organisation)theEObject;
				T result = caseOrganisation(organisation);
				if (result == null) result = caseIdentifiedElement(organisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.UNIVERSITY: {
				University university = (University)theEObject;
				T result = caseUniversity(university);
				if (result == null) result = caseOrganisation(university);
				if (result == null) result = caseIdentifiedElement(university);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.COMPANY: {
				Company company = (Company)theEObject;
				T result = caseCompany(company);
				if (result == null) result = caseOrganisation(company);
				if (result == null) result = caseIdentifiedElement(company);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseIdentifiedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = casePlace(city);
				if (result == null) result = caseIdentifiedElement(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = casePlace(country);
				if (result == null) result = caseIdentifiedElement(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.CONTINENT: {
				Continent continent = (Continent)theEObject;
				T result = caseContinent(continent);
				if (result == null) result = casePlace(continent);
				if (result == null) result = caseIdentifiedElement(continent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.FORUM: {
				Forum forum = (Forum)theEObject;
				T result = caseForum(forum);
				if (result == null) result = caseIdentifiedElement(forum);
				if (result == null) result = caseDynamicElement(forum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseIdentifiedElement(message);
				if (result == null) result = caseDynamicElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.POST: {
				Post post = (Post)theEObject;
				T result = casePost(post);
				if (result == null) result = caseMessage(post);
				if (result == null) result = caseIntegerIdentifiedElement(post);
				if (result == null) result = caseIdentifiedElement(post);
				if (result == null) result = caseDynamicElement(post);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseMessage(comment);
				if (result == null) result = caseIdentifiedElement(comment);
				if (result == null) result = caseDynamicElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseIntegerIdentifiedElement(tag);
				if (result == null) result = caseIdentifiedElement(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.TAG_CLASS: {
				TagClass tagClass = (TagClass)theEObject;
				T result = caseTagClass(tagClass);
				if (result == null) result = caseIdentifiedElement(tagClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.KNOWS_LINK: {
				KnowsLink knowsLink = (KnowsLink)theEObject;
				T result = caseKnowsLink(knowsLink);
				if (result == null) result = caseDynamicElement(knowsLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.STUDY_AT_LINK: {
				StudyAtLink studyAtLink = (StudyAtLink)theEObject;
				T result = caseStudyAtLink(studyAtLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.WORK_AT_LINK: {
				WorkAtLink workAtLink = (WorkAtLink)theEObject;
				T result = caseWorkAtLink(workAtLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.HAS_MEMBER_LINK: {
				HasMemberLink hasMemberLink = (HasMemberLink)theEObject;
				T result = caseHasMemberLink(hasMemberLink);
				if (result == null) result = caseDynamicElement(hasMemberLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.LIKES_LINK: {
				LikesLink likesLink = (LikesLink)theEObject;
				T result = caseLikesLink(likesLink);
				if (result == null) result = caseDynamicElement(likesLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.INTEGER_IDENTIFIED_ELEMENT: {
				IntegerIdentifiedElement integerIdentifiedElement = (IntegerIdentifiedElement)theEObject;
				T result = caseIntegerIdentifiedElement(integerIdentifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ldbc_snbPackage.LDBC_SNB_MODEL: {
				LdbcSNBModel ldbcSNBModel = (LdbcSNBModel)theEObject;
				T result = caseLdbcSNBModel(ldbcSNBModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicElement(DynamicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversity(University object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompany(Company object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinent(Continent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForum(Forum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePost(Post object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagClass(TagClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knows Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knows Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowsLink(KnowsLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study At Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study At Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyAtLink(StudyAtLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work At Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work At Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkAtLink(WorkAtLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Member Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Member Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasMemberLink(HasMemberLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Likes Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Likes Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLikesLink(LikesLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerIdentifiedElement(IntegerIdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ldbc SNB Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldbc SNB Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdbcSNBModel(LdbcSNBModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ldbc_snbSwitch
