/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.IdentifiedElement;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.WorkAtLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getIntId <em>Int Id</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getDts <em>Dts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getSpeaks <em>Speaks</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getBrowserUsed <em>Browser Used</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getLocationIP <em>Location IP</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getKnows <em>Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getHasInterest <em>Has Interest</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getWorkAt <em>Work At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getStudyAt <em>Study At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getOppHasMember <em>Opp Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getOppHasCreator <em>Opp Has Creator</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getOppKnows <em>Opp Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.PersonImpl#getOppHasModerator <em>Opp Has Moderator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getIntId() <em>Int Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntId()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getIntId() <em>Int Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntId()
	 * @generated
	 * @ordered
	 */
	protected int intId = INT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected static final long CTS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected long cts = CTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected static final long DTS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected long dts = DTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_DATE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected long creationDate = CREATION_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;
	/**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected static final long BIRTHDAY_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected long birthday = BIRTHDAY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> email;
	/**
	 * The cached value of the '{@link #getSpeaks() <em>Speaks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> speaks;
	/**
	 * The default value of the '{@link #getBrowserUsed() <em>Browser Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_USED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBrowserUsed() <em>Browser Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserUsed()
	 * @generated
	 * @ordered
	 */
	protected String browserUsed = BROWSER_USED_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocationIP() <em>Location IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIP()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_IP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocationIP() <em>Location IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIP()
	 * @generated
	 * @ordered
	 */
	protected String locationIP = LOCATION_IP_EDEFAULT;
	/**
	 * The cached value of the '{@link #getKnows() <em>Knows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnows()
	 * @generated
	 * @ordered
	 */
	protected EList<KnowsLink> knows;
	/**
	 * The cached value of the '{@link #getHasInterest() <em>Has Interest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterest()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> hasInterest;
	/**
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected EList<LikesLink> likes;
	/**
	 * The cached value of the '{@link #getWorkAt() <em>Work At</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkAt()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkAtLink> workAt;
	/**
	 * The cached value of the '{@link #getStudyAt() <em>Study At</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyAt()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyAtLink> studyAt;
	/**
	 * The cached value of the '{@link #getIsLocatedIn() <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected City isLocatedIn;
	/**
	 * The cached value of the '{@link #getOppHasMember() <em>Opp Has Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasMember()
	 * @generated
	 * @ordered
	 */
	protected EList<HasMemberLink> oppHasMember;
	/**
	 * The cached value of the '{@link #getOppHasCreator() <em>Opp Has Creator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasCreator()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> oppHasCreator;
	/**
	 * The cached value of the '{@link #getOppKnows() <em>Opp Knows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppKnows()
	 * @generated
	 * @ordered
	 */
	protected EList<KnowsLink> oppKnows;
	/**
	 * The cached value of the '{@link #getOppHasModerator() <em>Opp Has Moderator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasModerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Forum> oppHasModerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntId() {
		return intId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntId(int newIntId) {
		int oldIntId = intId;
		intId = newIntId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__INT_ID, oldIntId, intId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCts() {
		return cts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCts(long newCts) {
		long oldCts = cts;
		cts = newCts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__CTS, oldCts, cts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDts() {
		return dts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDts(long newDts) {
		long oldDts = dts;
		dts = newDts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__DTS, oldDts, dts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(long newCreationDate) {
		long oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBirthday() {
		return birthday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthday(long newBirthday) {
		long oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__BIRTHDAY, oldBirthday, birthday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getEmail() {
		if (email == null) {
			email = new EDataTypeUniqueEList<String>(String.class, this, Ldbc_snbPackage.PERSON__EMAIL);
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSpeaks() {
		if (speaks == null) {
			speaks = new EDataTypeUniqueEList<String>(String.class, this, Ldbc_snbPackage.PERSON__SPEAKS);
		}
		return speaks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserUsed() {
		return browserUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserUsed(String newBrowserUsed) {
		String oldBrowserUsed = browserUsed;
		browserUsed = newBrowserUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__BROWSER_USED, oldBrowserUsed, browserUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationIP() {
		return locationIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationIP(String newLocationIP) {
		String oldLocationIP = locationIP;
		locationIP = newLocationIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__LOCATION_IP, oldLocationIP, locationIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowsLink> getKnows() {
		if (knows == null) {
			knows = new EObjectWithInverseResolvingEList<KnowsLink>(KnowsLink.class, this, Ldbc_snbPackage.PERSON__KNOWS, Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS);
		}
		return knows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tag> getHasInterest() {
		if (hasInterest == null) {
			hasInterest = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, Ldbc_snbPackage.PERSON__HAS_INTEREST, Ldbc_snbPackage.TAG__OPP_HAS_INTEREST);
		}
		return hasInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LikesLink> getLikes() {
		if (likes == null) {
			likes = new EObjectWithInverseResolvingEList<LikesLink>(LikesLink.class, this, Ldbc_snbPackage.PERSON__LIKES, Ldbc_snbPackage.LIKES_LINK__OPP_LIKES);
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkAtLink> getWorkAt() {
		if (workAt == null) {
			workAt = new EObjectWithInverseResolvingEList<WorkAtLink>(WorkAtLink.class, this, Ldbc_snbPackage.PERSON__WORK_AT, Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT);
		}
		return workAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StudyAtLink> getStudyAt() {
		if (studyAt == null) {
			studyAt = new EObjectWithInverseResolvingEList<StudyAtLink>(StudyAtLink.class, this, Ldbc_snbPackage.PERSON__STUDY_AT, Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT);
		}
		return studyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getIsLocatedIn() {
		if (isLocatedIn != null && isLocatedIn.eIsProxy()) {
			InternalEObject oldIsLocatedIn = (InternalEObject)isLocatedIn;
			isLocatedIn = (City)eResolveProxy(oldIsLocatedIn);
			if (isLocatedIn != oldIsLocatedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.PERSON__IS_LOCATED_IN, oldIsLocatedIn, isLocatedIn));
			}
		}
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetIsLocatedIn() {
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsLocatedIn(City newIsLocatedIn, NotificationChain msgs) {
		City oldIsLocatedIn = isLocatedIn;
		isLocatedIn = newIsLocatedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__IS_LOCATED_IN, oldIsLocatedIn, newIsLocatedIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLocatedIn(City newIsLocatedIn) {
		if (newIsLocatedIn != isLocatedIn) {
			NotificationChain msgs = null;
			if (isLocatedIn != null)
				msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN, City.class, msgs);
			if (newIsLocatedIn != null)
				msgs = ((InternalEObject)newIsLocatedIn).eInverseAdd(this, Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN, City.class, msgs);
			msgs = basicSetIsLocatedIn(newIsLocatedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.PERSON__IS_LOCATED_IN, newIsLocatedIn, newIsLocatedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HasMemberLink> getOppHasMember() {
		if (oppHasMember == null) {
			oppHasMember = new EObjectWithInverseResolvingEList<HasMemberLink>(HasMemberLink.class, this, Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER, Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER);
		}
		return oppHasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getOppHasCreator() {
		if (oppHasCreator == null) {
			oppHasCreator = new EObjectWithInverseResolvingEList<Message>(Message.class, this, Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR, Ldbc_snbPackage.MESSAGE__HAS_CREATOR);
		}
		return oppHasCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KnowsLink> getOppKnows() {
		if (oppKnows == null) {
			oppKnows = new EObjectWithInverseResolvingEList<KnowsLink>(KnowsLink.class, this, Ldbc_snbPackage.PERSON__OPP_KNOWS, Ldbc_snbPackage.KNOWS_LINK__KNOWS);
		}
		return oppKnows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Forum> getOppHasModerator() {
		if (oppHasModerator == null) {
			oppHasModerator = new EObjectWithInverseResolvingEList<Forum>(Forum.class, this, Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR, Ldbc_snbPackage.FORUM__HAS_MODERATOR);
		}
		return oppHasModerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.PERSON__KNOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnows()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInterest()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__LIKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLikes()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__WORK_AT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkAt()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyAt()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				if (isLocatedIn != null)
					msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN, City.class, msgs);
				return basicSetIsLocatedIn((City)otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppHasMember()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppHasCreator()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppKnows()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppHasModerator()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.PERSON__KNOWS:
				return ((InternalEList<?>)getKnows()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				return ((InternalEList<?>)getHasInterest()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__LIKES:
				return ((InternalEList<?>)getLikes()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__WORK_AT:
				return ((InternalEList<?>)getWorkAt()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				return ((InternalEList<?>)getStudyAt()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				return basicSetIsLocatedIn(null, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				return ((InternalEList<?>)getOppHasMember()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				return ((InternalEList<?>)getOppHasCreator()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				return ((InternalEList<?>)getOppKnows()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				return ((InternalEList<?>)getOppHasModerator()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.PERSON__INT_ID:
				return getIntId();
			case Ldbc_snbPackage.PERSON__ID:
				return getID();
			case Ldbc_snbPackage.PERSON__CTS:
				return getCts();
			case Ldbc_snbPackage.PERSON__DTS:
				return getDts();
			case Ldbc_snbPackage.PERSON__CREATION_DATE:
				return getCreationDate();
			case Ldbc_snbPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case Ldbc_snbPackage.PERSON__LAST_NAME:
				return getLastName();
			case Ldbc_snbPackage.PERSON__GENDER:
				return getGender();
			case Ldbc_snbPackage.PERSON__BIRTHDAY:
				return getBirthday();
			case Ldbc_snbPackage.PERSON__EMAIL:
				return getEmail();
			case Ldbc_snbPackage.PERSON__SPEAKS:
				return getSpeaks();
			case Ldbc_snbPackage.PERSON__BROWSER_USED:
				return getBrowserUsed();
			case Ldbc_snbPackage.PERSON__LOCATION_IP:
				return getLocationIP();
			case Ldbc_snbPackage.PERSON__KNOWS:
				return getKnows();
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				return getHasInterest();
			case Ldbc_snbPackage.PERSON__LIKES:
				return getLikes();
			case Ldbc_snbPackage.PERSON__WORK_AT:
				return getWorkAt();
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				return getStudyAt();
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				if (resolve) return getIsLocatedIn();
				return basicGetIsLocatedIn();
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				return getOppHasMember();
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				return getOppHasCreator();
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				return getOppKnows();
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				return getOppHasModerator();
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
			case Ldbc_snbPackage.PERSON__INT_ID:
				setIntId((Integer)newValue);
				return;
			case Ldbc_snbPackage.PERSON__ID:
				setID((Long)newValue);
				return;
			case Ldbc_snbPackage.PERSON__CTS:
				setCts((Long)newValue);
				return;
			case Ldbc_snbPackage.PERSON__DTS:
				setDts((Long)newValue);
				return;
			case Ldbc_snbPackage.PERSON__CREATION_DATE:
				setCreationDate((Long)newValue);
				return;
			case Ldbc_snbPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case Ldbc_snbPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case Ldbc_snbPackage.PERSON__GENDER:
				setGender((String)newValue);
				return;
			case Ldbc_snbPackage.PERSON__BIRTHDAY:
				setBirthday((Long)newValue);
				return;
			case Ldbc_snbPackage.PERSON__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends String>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__SPEAKS:
				getSpeaks().clear();
				getSpeaks().addAll((Collection<? extends String>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__BROWSER_USED:
				setBrowserUsed((String)newValue);
				return;
			case Ldbc_snbPackage.PERSON__LOCATION_IP:
				setLocationIP((String)newValue);
				return;
			case Ldbc_snbPackage.PERSON__KNOWS:
				getKnows().clear();
				getKnows().addAll((Collection<? extends KnowsLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				getHasInterest().clear();
				getHasInterest().addAll((Collection<? extends Tag>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__LIKES:
				getLikes().clear();
				getLikes().addAll((Collection<? extends LikesLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__WORK_AT:
				getWorkAt().clear();
				getWorkAt().addAll((Collection<? extends WorkAtLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				getStudyAt().clear();
				getStudyAt().addAll((Collection<? extends StudyAtLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				setIsLocatedIn((City)newValue);
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				getOppHasMember().clear();
				getOppHasMember().addAll((Collection<? extends HasMemberLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				getOppHasCreator().clear();
				getOppHasCreator().addAll((Collection<? extends Message>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				getOppKnows().clear();
				getOppKnows().addAll((Collection<? extends KnowsLink>)newValue);
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				getOppHasModerator().clear();
				getOppHasModerator().addAll((Collection<? extends Forum>)newValue);
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
			case Ldbc_snbPackage.PERSON__INT_ID:
				setIntId(INT_ID_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__ID:
				setID(ID_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__CTS:
				setCts(CTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__DTS:
				setDts(DTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__BIRTHDAY:
				setBirthday(BIRTHDAY_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__EMAIL:
				getEmail().clear();
				return;
			case Ldbc_snbPackage.PERSON__SPEAKS:
				getSpeaks().clear();
				return;
			case Ldbc_snbPackage.PERSON__BROWSER_USED:
				setBrowserUsed(BROWSER_USED_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__LOCATION_IP:
				setLocationIP(LOCATION_IP_EDEFAULT);
				return;
			case Ldbc_snbPackage.PERSON__KNOWS:
				getKnows().clear();
				return;
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				getHasInterest().clear();
				return;
			case Ldbc_snbPackage.PERSON__LIKES:
				getLikes().clear();
				return;
			case Ldbc_snbPackage.PERSON__WORK_AT:
				getWorkAt().clear();
				return;
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				getStudyAt().clear();
				return;
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				setIsLocatedIn((City)null);
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				getOppHasMember().clear();
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				getOppHasCreator().clear();
				return;
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				getOppKnows().clear();
				return;
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				getOppHasModerator().clear();
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
			case Ldbc_snbPackage.PERSON__INT_ID:
				return intId != INT_ID_EDEFAULT;
			case Ldbc_snbPackage.PERSON__ID:
				return id != ID_EDEFAULT;
			case Ldbc_snbPackage.PERSON__CTS:
				return cts != CTS_EDEFAULT;
			case Ldbc_snbPackage.PERSON__DTS:
				return dts != DTS_EDEFAULT;
			case Ldbc_snbPackage.PERSON__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
			case Ldbc_snbPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case Ldbc_snbPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case Ldbc_snbPackage.PERSON__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case Ldbc_snbPackage.PERSON__BIRTHDAY:
				return birthday != BIRTHDAY_EDEFAULT;
			case Ldbc_snbPackage.PERSON__EMAIL:
				return email != null && !email.isEmpty();
			case Ldbc_snbPackage.PERSON__SPEAKS:
				return speaks != null && !speaks.isEmpty();
			case Ldbc_snbPackage.PERSON__BROWSER_USED:
				return BROWSER_USED_EDEFAULT == null ? browserUsed != null : !BROWSER_USED_EDEFAULT.equals(browserUsed);
			case Ldbc_snbPackage.PERSON__LOCATION_IP:
				return LOCATION_IP_EDEFAULT == null ? locationIP != null : !LOCATION_IP_EDEFAULT.equals(locationIP);
			case Ldbc_snbPackage.PERSON__KNOWS:
				return knows != null && !knows.isEmpty();
			case Ldbc_snbPackage.PERSON__HAS_INTEREST:
				return hasInterest != null && !hasInterest.isEmpty();
			case Ldbc_snbPackage.PERSON__LIKES:
				return likes != null && !likes.isEmpty();
			case Ldbc_snbPackage.PERSON__WORK_AT:
				return workAt != null && !workAt.isEmpty();
			case Ldbc_snbPackage.PERSON__STUDY_AT:
				return studyAt != null && !studyAt.isEmpty();
			case Ldbc_snbPackage.PERSON__IS_LOCATED_IN:
				return isLocatedIn != null;
			case Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER:
				return oppHasMember != null && !oppHasMember.isEmpty();
			case Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR:
				return oppHasCreator != null && !oppHasCreator.isEmpty();
			case Ldbc_snbPackage.PERSON__OPP_KNOWS:
				return oppKnows != null && !oppKnows.isEmpty();
			case Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR:
				return oppHasModerator != null && !oppHasModerator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
				case Ldbc_snbPackage.PERSON__ID: return Ldbc_snbPackage.IDENTIFIED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == DynamicElement.class) {
			switch (derivedFeatureID) {
				case Ldbc_snbPackage.PERSON__CTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS;
				case Ldbc_snbPackage.PERSON__DTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
				case Ldbc_snbPackage.IDENTIFIED_ELEMENT__ID: return Ldbc_snbPackage.PERSON__ID;
				default: return -1;
			}
		}
		if (baseClass == DynamicElement.class) {
			switch (baseFeatureID) {
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS: return Ldbc_snbPackage.PERSON__CTS;
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS: return Ldbc_snbPackage.PERSON__DTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (intId: ");
		result.append(intId);
		result.append(", ID: ");
		result.append(id);
		result.append(", cts: ");
		result.append(cts);
		result.append(", dts: ");
		result.append(dts);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", gender: ");
		result.append(gender);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(", email: ");
		result.append(email);
		result.append(", speaks: ");
		result.append(speaks);
		result.append(", browserUsed: ");
		result.append(browserUsed);
		result.append(", locationIP: ");
		result.append(locationIP);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
