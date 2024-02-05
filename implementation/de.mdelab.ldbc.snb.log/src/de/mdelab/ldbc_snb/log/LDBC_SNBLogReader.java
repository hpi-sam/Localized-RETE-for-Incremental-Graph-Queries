package de.mdelab.ldbc_snb.log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.IdentifiedElement;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
import de.mdelab.ldbc_snb.University;
import de.mdelab.ldbc_snb.WorkAtLink;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBCityCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBCommentCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBCompanyCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBCountryCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBElementAction;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBForumCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBKnowsCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBLikesCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBMemberCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBPersonCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBPostCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBStudyCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBTagClassCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBTagCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBUniversityCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBWorkCreation;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBElementDeletion;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;

public class LDBC_SNBLogReader {

	protected List<LDBC_SNBElementAction<? extends EObject>> actionQueue;
	protected List<String> lines;
	protected int currentIndex;
	protected EObject model;
	protected MLSDMReferenceIndex referenceIndex;
	protected Map<Long, LDBC_SNBElementDeletion> deletions;
	
	public LDBC_SNBLogReader(String logFile) throws IOException {
		this.model = Ldbc_snbFactory.eINSTANCE.createLdbcSNBModel();
		this.currentIndex = 0;
		initializeReferenceIndex();
		FileReader fr = new FileReader(logFile);
		BufferedReader br = new BufferedReader(fr);
		initializeActionQueue(br);
	}

	protected void initializeReferenceIndex() {
		this.referenceIndex = new MLSDMReferenceIndex();
		this.referenceIndex.registerEObject(model);
	}

	protected void initializeActionQueue(BufferedReader br) throws IOException {
		this.actionQueue = new ArrayList<LDBC_SNBElementAction<? extends EObject>>();
		this.deletions = new LinkedHashMap<Long, LDBC_SNBElementDeletion>();
		this.lines = new ArrayList<String>();
		Map<Long, Country> createdCountries = new HashMap<Long, Country>();
		Map<Long, City> createdCities = new HashMap<Long, City>();
		Map<Long, Forum> createdForums = new HashMap<Long, Forum>();
		Map<Long, Person> createdPersons = new HashMap<Long, Person>();
		Map<Long, Tag> createdTags = new HashMap<Long, Tag>();
		Map<Long, Message> createdMessages = new HashMap<Long, Message>();
		Map<Long, Company> createdCompanies = new HashMap<Long, Company>();
		Map<Long, University> createdUniversities = new HashMap<Long, University>();
		Map<Long, TagClass> createdTagClasses = new HashMap<Long, TagClass>();
		Map<Long, Map<Long, KnowsLink>> createdKnows = new HashMap<Long, Map<Long, KnowsLink>>();
		Map<Long, Map<Long, LikesLink>> createdLikes = new HashMap<Long, Map<Long, LikesLink>>();
		Map<Long, Map<Long, HasMemberLink>> createdMembers = new HashMap<Long, Map<Long, HasMemberLink>>();
		String line;
		while((line = br.readLine()) != null) {
			lines.add(line);
			LDBC_SNBElementAction<? extends EObject> action;
			if(line.startsWith("CREATE_")) {
				action = getElementCreation(line.substring("CREATE_".length()), createdCountries, createdCities, createdForums,
						createdPersons, createdTags, createdMessages,
						createdCompanies, createdUniversities, createdTagClasses, createdKnows, createdLikes, createdMembers);
			}
			else {
				action = getElementDeletion(line.substring("DELETE_".length()), createdForums,
						createdPersons, createdMessages, createdKnows, createdLikes, createdMembers);
				EObject element = ((LDBC_SNBElementDeletion) action).getElement();
				if(element.eClass().getEAllSuperTypes().contains(Ldbc_snbPackage.Literals.IDENTIFIED_ELEMENT)) {
					deletions.put(((IdentifiedElement) element).getID(), (LDBC_SNBElementDeletion) action);
				}
			}
			actionQueue.add(action);
		}
	}

	protected LDBC_SNBElementAction<? extends EObject> getElementDeletion(
			String line, Map<Long, Forum> createdForums,
			Map<Long, Person> createdPersons, Map<Long, Message> createdMessages, Map<Long, Map<Long, KnowsLink>> createdKnows,
			Map<Long, Map<Long, LikesLink>> createdLikes, Map<Long, Map<Long, HasMemberLink>> createdMembers) {
		String[] tuple = line.split(Pattern.quote(LDBC_SNBLogCreator.SEP));
		String type = tuple[0];
		if(type.equals(LDBC_SNBLogCreator.PERSON)) {
			return getPersonDeletion(tuple, createdPersons);
		}
		else if(type.equals(LDBC_SNBLogCreator.KNOWS)) {
			return getKnowsDeletion(tuple, createdKnows);
		}
		else if(type.equals(LDBC_SNBLogCreator.POST)) {
			return getPostDeletion(tuple, createdMessages);
		}
		else if(type.equals(LDBC_SNBLogCreator.COMMENT)) {
			return getCommentDeletion(tuple, createdMessages);
		}
		else if(type.equals(LDBC_SNBLogCreator.LIKES)) {
			return getLikesDeletion(tuple, createdLikes);
		}
		else if(type.equals(LDBC_SNBLogCreator.FORUM)) {
			return getForumDeletion(tuple, createdForums);
		}
		else if(type.equals(LDBC_SNBLogCreator.MEMBER)) {
 			return getMemberDeletion(tuple, createdMembers);
		}
		else{
			return null;
		}
	}

	protected LDBC_SNBElementAction<? extends EObject> getPersonDeletion(
			String[] tuple, Map<Long, Person> createdPersons) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBElementDeletion(timestamp, createdPersons.get(id), referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getKnowsDeletion(
			String[] tuple, Map<Long, Map<Long, KnowsLink>> createdKnows) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		KnowsLink k = createdKnows.get(sourceID).get(targetID);
		
		return new LDBC_SNBElementDeletion(timestamp, k, referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getPostDeletion(
			String[] tuple, Map<Long, Message> createdMessages) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBElementDeletion(timestamp, createdMessages.get(id), referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getCommentDeletion(
			String[] tuple, Map<Long, Message> createdMessages) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBElementDeletion(timestamp, createdMessages.get(id), referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getLikesDeletion(String[] tuple,
			Map<Long, Map<Long, LikesLink>> createdLikes) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		LikesLink l = createdLikes.get(sourceID).get(targetID);
		return new LDBC_SNBElementDeletion(timestamp, l, referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getForumDeletion(
			String[] tuple, Map<Long, Forum> createdForums) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBElementDeletion(timestamp, createdForums.get(id), referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getMemberDeletion(
			String[] tuple, Map<Long, Map<Long, HasMemberLink>> createdMembers) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		HasMemberLink l = createdMembers.get(sourceID).get(targetID);
		return new LDBC_SNBElementDeletion(timestamp, l, referenceIndex);
	}

	protected LDBC_SNBElementAction<? extends EObject> getElementCreation(String line, Map<Long, Country> createdCountries,
							Map<Long, City> createdCities, Map<Long, Forum> createdForums, Map<Long, Person> createdPersons,
							Map<Long, Tag> createdTags, Map<Long, Message> createdMessages, Map<Long, Company> createdCompanies,
							Map<Long, University> createdUniversities, Map<Long, TagClass> createdTagClasses,
							Map<Long, Map<Long, KnowsLink>> createdKnows, Map<Long, Map<Long, LikesLink>> createdLikes,
							Map<Long, Map<Long, HasMemberLink>> createdMembers) {
		String[] tuple = line.split(Pattern.quote(";"));
		String type = tuple[0];
		if(type.equals(LDBC_SNBLogCreator.PERSON)) {
			return getPersonCreation(tuple, createdPersons, createdCities, createdTags);
		}
		else if(type.equals(LDBC_SNBLogCreator.KNOWS)) {
			return getKnowsCreation(tuple, createdPersons, createdKnows);
		}
		else if(type.equals(LDBC_SNBLogCreator.POST)) {
			return getPostCreation(tuple, createdPersons, createdCountries, createdForums, createdTags, createdMessages);
		}
		else if(type.equals(LDBC_SNBLogCreator.COMMENT)) {
			return getCommentCreation(tuple, createdPersons, createdCountries, createdTags, createdMessages);
		}
		else if(type.equals(LDBC_SNBLogCreator.TAG)){
			return getTagCreation(tuple, createdTagClasses, createdTags);
		}
		else if(type.equals(LDBC_SNBLogCreator.TAGCLASS)){
			return getTagClassCreation(tuple, createdTagClasses);
		}
		else if(type.equals(LDBC_SNBLogCreator.CITY)){
			return getCityCreation(tuple, createdCountries, createdCities);
		}
		else if(type.equals(LDBC_SNBLogCreator.COUNTRY)){
			return getCountryCreation(tuple, createdCountries);
		}
		else if(type.equals(LDBC_SNBLogCreator.LIKES)) {
			return getLikesCreation(tuple, createdPersons, createdMessages, createdLikes);
		}
		else if(type.equals(LDBC_SNBLogCreator.FORUM)) {
			return getForumCreation(tuple, createdForums);
		}
		else if(type.equals(LDBC_SNBLogCreator.MEMBER)) {
 			return getMemberCreation(tuple, createdForums, createdPersons, createdMembers);
		}
		else if(type.equals(LDBC_SNBLogCreator.COMPANY)) {
 			return getCompanyCreation(tuple, createdCountries, createdCompanies);
		}
		else if(type.equals(LDBC_SNBLogCreator.UNIVERSITY)) {
 			return getUniversityCreation(tuple, createdCities, createdUniversities);
		}
		else if(type.equals(LDBC_SNBLogCreator.WORK)) {
 			return getWorkCreation(tuple, createdPersons, createdCompanies);
		}
		else if(type.equals(LDBC_SNBLogCreator.STUDY)) {
 			return getStudyCreation(tuple, createdPersons, createdUniversities);
		}
		else{
			return null;
		}
	}

	protected LDBC_SNBElementAction<? extends EObject> getTagClassCreation(
			String[] tuple, Map<Long, TagClass> createdTagClasses) {
		TagClass tagClass = Ldbc_snbFactory.eINSTANCE.createTagClass();
		tagClass.setID(Long.parseLong(tuple[2]));
		tagClass.setName(tuple[3]);
		Collection<TagClass> superTypes = new ArrayList<TagClass>();
		for(int i = 4; i < tuple.length; i++) {
			superTypes.add(createdTagClasses.get(Long.parseLong(tuple[i])));
		}
		createdTagClasses.put(tagClass.getID(), tagClass);
		return new LDBC_SNBTagClassCreation(Long.parseLong(tuple[1]), tagClass, superTypes);
	}

	protected LDBC_SNBElementAction<? extends EObject> getStudyCreation(
			String[] tuple, Map<Long, Person> createdPersons,
			Map<Long, University> createdUniversities) {
		StudyAtLink study = Ldbc_snbFactory.eINSTANCE.createStudyAtLink();
		Person person = createdPersons.get(Long.parseLong(tuple[2]));
		University university = createdUniversities.get(Long.parseLong(tuple[3]));
		return new LDBC_SNBStudyCreation(Long.parseLong(tuple[1]), study, person, university);
	}

	protected LDBC_SNBElementAction<? extends EObject> getWorkCreation(
			String[] tuple, Map<Long, Person> createdPersons,
			Map<Long, Company> createdCompanies) {
		WorkAtLink work = Ldbc_snbFactory.eINSTANCE.createWorkAtLink();
		work.setWorkFrom(Integer.parseInt(tuple[2]));
		Person person = createdPersons.get(Long.parseLong(tuple[3]));
		Company company = createdCompanies.get(Long.parseLong(tuple[4]));
		return new LDBC_SNBWorkCreation(Long.parseLong(tuple[1]), work, person, company);
	}

	protected LDBC_SNBElementAction<? extends EObject> getUniversityCreation(
			String[] tuple, Map<Long, City> createdCities,
			Map<Long, University> createdUniversities) {
		University university = Ldbc_snbFactory.eINSTANCE.createUniversity();
		university.setID(Long.parseLong(tuple[2]));
		City city= createdCities.get(Long.parseLong(tuple[3]));
		createdUniversities.put(university.getID(), university);
		return new LDBC_SNBUniversityCreation(Long.parseLong(tuple[1]), university, city);
	}

	protected LDBC_SNBElementAction<? extends EObject> getCompanyCreation(
			String[] tuple, Map<Long, Country> createdCountries,
			Map<Long, Company> createdCompanies) {
		Company company = Ldbc_snbFactory.eINSTANCE.createCompany();
		company.setID(Long.parseLong(tuple[2]));
		Country country = createdCountries.get(Long.parseLong(tuple[3]));
		createdCompanies.put(company.getID(), company);
		return new LDBC_SNBCompanyCreation(Long.parseLong(tuple[1]), company, country);
	}

	protected LDBC_SNBElementAction<? extends EObject> getMemberCreation(
			String[] tuple, Map<Long, Forum> createdForums,
			Map<Long, Person> createdPersons, Map<Long, Map<Long, HasMemberLink>> createdMembers) {
		HasMemberLink member = Ldbc_snbFactory.eINSTANCE.createHasMemberLink();
		member.setJoinDate(Long.parseLong(tuple[1]));

		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);
		createdMembers.putIfAbsent(sourceID, new HashMap<Long, HasMemberLink>());
		createdMembers.get(sourceID).put(targetID, member);
		
		Forum forum = createdForums.get(sourceID);
		Person person = createdPersons.get(targetID);
		return new LDBC_SNBMemberCreation(Long.parseLong(tuple[1]), member, forum, person);
	}

	protected LDBC_SNBElementAction<? extends EObject> getForumCreation(
			String[] tuple, Map<Long, Forum> createdForums) {
		Forum forum = Ldbc_snbFactory.eINSTANCE.createForum();
		forum.setCreationDate(Long.parseLong(tuple[1]));
		forum.setID(Long.parseLong(tuple[2]));
		createdForums.put(forum.getID(), forum);
		return new LDBC_SNBForumCreation(Long.parseLong(tuple[1]), forum);
	}

	protected LDBC_SNBElementAction<? extends EObject> getLikesCreation(
			String[] tuple, Map<Long, Person> createdPersons,
			Map<Long, Message> createdMessages, Map<Long, Map<Long, LikesLink>> createdLikes) {
		LikesLink likes = Ldbc_snbFactory.eINSTANCE.createLikesLink();
		likes.setCreationDate(Long.parseLong(tuple[1]));
		
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);
		createdLikes.putIfAbsent(sourceID, new HashMap<Long, LikesLink>());
		createdLikes.get(sourceID).put(targetID, likes);
		
		Person person = createdPersons.get(sourceID);
		Message message = createdMessages.get(targetID);
		return new LDBC_SNBLikesCreation(Long.parseLong(tuple[1]), likes, person, message);
	}

	protected LDBC_SNBElementAction<? extends EObject> getCountryCreation(String[] tuple,
			Map<Long, Country> createdCountries) {
		Country country = Ldbc_snbFactory.eINSTANCE.createCountry();
		country.setID(Long.parseLong(tuple[2]));
		country.setName(tuple[3]);
		createdCountries.put(country.getID(), country);
		return new LDBC_SNBCountryCreation(Long.parseLong(tuple[1]), country);
	}

	protected LDBC_SNBElementAction<? extends EObject> getCityCreation(String[] tuple,
			Map<Long, Country> createdCountries, Map<Long, City> createdCities) {
		City city = Ldbc_snbFactory.eINSTANCE.createCity();
		city.setID(Long.parseLong(tuple[2]));
		Country country = createdCountries.get(Long.parseLong(tuple[3]));
		createdCities.put(city.getID(), city);
		return new LDBC_SNBCityCreation(Long.parseLong(tuple[1]), city, country);
	}

	protected LDBC_SNBElementAction<? extends EObject> getTagCreation(String[] tuple,
			Map<Long, TagClass> createdTagClasses, Map<Long, Tag> createdTags) {
		Tag tag = Ldbc_snbFactory.eINSTANCE.createTag();
		tag.setID(Long.parseLong(tuple[2]));
		tag.setName(tuple[3]);
		Collection<TagClass> types = new ArrayList<TagClass>();
		for(int i = 4; i < tuple.length; i++) {
			types.add(createdTagClasses.get(Long.parseLong(tuple[i])));
		}
		createdTags.put(tag.getID(), tag);
		return new LDBC_SNBTagCreation(Long.parseLong(tuple[1]), tag, types);
	}

	protected LDBC_SNBElementAction<? extends EObject> getPostCreation(String[] tuple,
			Map<Long, Person> createdPersons, Map<Long, Country> createdCountries, Map<Long, Forum> createdForums, Map<Long, Tag> createdTags, Map<Long, Message> createdMessages) {
		Post post = Ldbc_snbFactory.eINSTANCE.createPost();
		post.setCreationDate(Long.parseLong(tuple[1]));
		post.setID(Long.parseLong(tuple[2]));
		post.setContent(tuple[3]);
		Person creator = createdPersons.get(Long.parseLong(tuple[4]));
		Country country = createdCountries.get(Long.parseLong(tuple[5]));
		Forum forum = createdForums.get(Long.parseLong(tuple[6]));
		Post predecessor = (Post) createdMessages.get(Long.parseLong(tuple[7]));
		Collection<Tag> tags = new ArrayList<Tag>();
		for(int i = 8; i < tuple.length; i++) {
			tags.add(createdTags.get(Long.parseLong(tuple[i])));
		}
		createdMessages.put(post.getID(), post);
		return new LDBC_SNBPostCreation(Long.parseLong(tuple[1]), post, creator, country, forum, predecessor, tags);
	}

	protected LDBC_SNBElementAction<? extends EObject> getCommentCreation(
			String[] tuple, Map<Long, Person> createdPersons,
			Map<Long, Country> createdCountries, Map<Long, Tag> createdTags, Map<Long, Message> createdMessages) {
		Comment comment = Ldbc_snbFactory.eINSTANCE.createComment();
		comment.setCreationDate(Long.parseLong(tuple[1]));
		comment.setID(Long.parseLong(tuple[2]));
		Person creator = createdPersons.get(Long.parseLong(tuple[3]));
		Country country = createdCountries.get(Long.parseLong(tuple[4]));
		Message message = createdMessages.get(Long.parseLong(tuple[5]));
		Collection<Tag> tags = new ArrayList<Tag>();
		for(int i = 6; i < tuple.length; i++) {
			tags.add(createdTags.get(Long.parseLong(tuple[i])));
		}
		createdMessages.put(comment.getID(), comment);
		return new LDBC_SNBCommentCreation(Long.parseLong(tuple[1]), comment, creator, country, message, tags);
	}

	protected LDBC_SNBElementAction<? extends EObject> getKnowsCreation(String[] tuple,
			Map<Long, Person> createdPersons, Map<Long, Map<Long, KnowsLink>> createdKnows) {
		KnowsLink knows = Ldbc_snbFactory.eINSTANCE.createKnowsLink();
		knows.setCreationDate(Long.parseLong(tuple[1]));
		
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);
		createdKnows.putIfAbsent(sourceID, new HashMap<Long, KnowsLink>());
		createdKnows.get(sourceID).put(targetID, knows);
		
		Person source = (Person) createdPersons.get(sourceID);
		Person target = (Person) createdPersons.get(targetID);
		return new LDBC_SNBKnowsCreation(Long.parseLong(tuple[1]), knows, source, target);
	}

	protected LDBC_SNBElementAction<? extends EObject> getPersonCreation(String[] tuple, Map<Long, Person> createdPersons,
				Map<Long, City> createdCitites, Map<Long, Tag> createdTags) {
		Person person = Ldbc_snbFactory.eINSTANCE.createPerson();
		person.setCreationDate(Long.parseLong(tuple[1]));
		person.setID(Long.parseLong(tuple[2]));
		person.setFirstName(tuple[3]);
		City city = createdCitites.get(Long.parseLong(tuple[4]));
		Collection<Tag> tags = new ArrayList<Tag>();
		for(int i = 5; i < tuple.length; i++) {
			Tag t = createdTags.get(Long.parseLong(tuple[i]));
			tags.add(t);
		}
		createdPersons.put(person.getID(), person);
		return new LDBC_SNBPersonCreation(Long.parseLong(tuple[1]), person, city, tags);
	}

	public boolean hasNextElement() {
		return currentIndex < actionQueue.size();
	}

	public boolean hasPreviousElement() {
		return currentIndex > 0;
	}

	public int getLogSize() {
		return actionQueue.size();
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public EObject executeNextAction() {
		EObject created = actionQueue.get(currentIndex).executeAction(model);
		currentIndex++;
		return created;
	}

	public void removePreviousElement() {
		currentIndex--;
		actionQueue.get(currentIndex).undoAction(model);
	}

	public EObject getModel() {
		return model;
	}

	public LDBC_SNBElementDeletion getDeletion(long id) {
		return deletions.get(id);
	}
	
}
