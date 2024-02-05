/**
 */
package de.mdelab.ldbc_snb.util;

import de.mdelab.ldbc_snb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage
 * @generated
 */
public class Ldbc_snbAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ldbc_snbPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ldbc_snbAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ldbc_snbPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ldbc_snbSwitch<Adapter> modelSwitch =
		new Ldbc_snbSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseDynamicElement(DynamicElement object) {
				return createDynamicElementAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseUniversity(University object) {
				return createUniversityAdapter();
			}
			@Override
			public Adapter caseCompany(Company object) {
				return createCompanyAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseCity(City object) {
				return createCityAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseContinent(Continent object) {
				return createContinentAdapter();
			}
			@Override
			public Adapter caseForum(Forum object) {
				return createForumAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter casePost(Post object) {
				return createPostAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseTagClass(TagClass object) {
				return createTagClassAdapter();
			}
			@Override
			public Adapter caseKnowsLink(KnowsLink object) {
				return createKnowsLinkAdapter();
			}
			@Override
			public Adapter caseStudyAtLink(StudyAtLink object) {
				return createStudyAtLinkAdapter();
			}
			@Override
			public Adapter caseWorkAtLink(WorkAtLink object) {
				return createWorkAtLinkAdapter();
			}
			@Override
			public Adapter caseHasMemberLink(HasMemberLink object) {
				return createHasMemberLinkAdapter();
			}
			@Override
			public Adapter caseLikesLink(LikesLink object) {
				return createLikesLinkAdapter();
			}
			@Override
			public Adapter caseIntegerIdentifiedElement(IntegerIdentifiedElement object) {
				return createIntegerIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseLdbcSNBModel(LdbcSNBModel object) {
				return createLdbcSNBModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.DynamicElement <em>Dynamic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.DynamicElement
	 * @generated
	 */
	public Adapter createDynamicElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Company
	 * @generated
	 */
	public Adapter createCompanyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Continent <em>Continent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Continent
	 * @generated
	 */
	public Adapter createContinentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Forum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Forum
	 * @generated
	 */
	public Adapter createForumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Post
	 * @generated
	 */
	public Adapter createPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.TagClass <em>Tag Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.TagClass
	 * @generated
	 */
	public Adapter createTagClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.KnowsLink <em>Knows Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.KnowsLink
	 * @generated
	 */
	public Adapter createKnowsLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.StudyAtLink <em>Study At Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.StudyAtLink
	 * @generated
	 */
	public Adapter createStudyAtLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.WorkAtLink <em>Work At Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.WorkAtLink
	 * @generated
	 */
	public Adapter createWorkAtLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.HasMemberLink <em>Has Member Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.HasMemberLink
	 * @generated
	 */
	public Adapter createHasMemberLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.LikesLink <em>Likes Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.LikesLink
	 * @generated
	 */
	public Adapter createLikesLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.IntegerIdentifiedElement <em>Integer Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.IntegerIdentifiedElement
	 * @generated
	 */
	public Adapter createIntegerIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.ldbc_snb.LdbcSNBModel <em>Ldbc SNB Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.ldbc_snb.LdbcSNBModel
	 * @generated
	 */
	public Adapter createLdbcSNBModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ldbc_snbAdapterFactory
