package de.mdelab.ldbc_snb.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.University;
import de.mdelab.ldbc_snb.WorkAtLink;

public class PersonParser extends Parser<Person>{

	protected LdbcSNBModel model;
	protected Map<Long, Person> persons;
	protected Collection<EObject> nodes;
	private final Map<Long, Place> places;
	private final Map<Long, Organisation> organisations;
	private final Map<Long, Tag> tags;
	
	public PersonParser(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Place> places, Map<Long, Organisation> organisations, Map<Long, Tag> tags){
		this.model = model;
		this.nodes = nodes;
		this.places = places;
		this.organisations = organisations;
		this.tags = tags;
	}
	
	protected void parsePersons(String filePath){		
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String personTuple;
			while((personTuple = br.readLine()) != null){
				createPerson(personTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createPerson(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		Person p = Ldbc_snbFactory.eINSTANCE.createPerson();
		
		try {
			Date creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			Date deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);
			long id = Long.parseLong(tokens[3]);
			String firstname = tokens[4];
			String lastname = tokens[5];
			String gender = tokens[6];
			Date birthDay = LDBC_SNBParser.DATE_PARSER.parse(tokens[7]);
			String locationIP = tokens[8];
			String browserUsed = tokens[9];
			long placeId = Long.parseLong(tokens[10]);
			String[] languages = tokens[11].split(Pattern.quote(";"));
			String[] mails = tokens[12].split(Pattern.quote(";"));
			
			p.setID(id);
			p.setFirstName(firstname);
			p.setLastName(lastname);
			p.setGender(gender);
			p.setBirthday(birthDay.getTime());
			p.setCreationDate(creationDate.getTime());
			p.setLocationIP(locationIP);
			p.setBrowserUsed(browserUsed);
			p.setIsLocatedIn((City) places.get(placeId));
			for(String language:languages) {
				p.getSpeaks().add(language);
			}
			for(String mail:mails) {
				p.getEmail().add(mail);
			}

			p.setCts(creationDate.getTime());
			p.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		persons.put(p.getID(), p);
		nodes.add(p);
		model.getOwnedPersons().add(p);
	}

	private void parseHasInterest(String filePath) {
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));

				long personId = Long.parseLong(tokens[2]);
				long tagId = Long.parseLong(tokens[3]);
				
				Person p = persons.get(personId);
				p.getHasInterest().add(tags.get(tagId));
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseStudyAt(String filePath) {
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));

				long personId = Long.parseLong(tokens[2]);
				long uniId = Long.parseLong(tokens[3]);
				int classYear = Integer.parseInt(tokens[4]);
				
				StudyAtLink s = Ldbc_snbFactory.eINSTANCE.createStudyAtLink();
				s.setClassYear(classYear);
				
				Person p = persons.get(personId);
				University u = (University) organisations.get(uniId);
				
				p.getStudyAt().add(s);
				s.setStudyAt(u);
				
				model.getOwnedStudyAtLinks().add(s);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseWorkAt(String filePath) {
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));

				long personId = Long.parseLong(tokens[2]);
				long companyId = Long.parseLong(tokens[3]);
				int workFrom = Integer.parseInt(tokens[4]);
				
				WorkAtLink w = Ldbc_snbFactory.eINSTANCE.createWorkAtLink();
				w.setWorkFrom(workFrom);
				
				Person p = persons.get(personId);
				Company c = (Company) organisations.get(companyId);
				
				p.getWorkAt().add(w);
				w.setWorkAt(c);
				
				model.getOwnedWorkAtLinks().add(w);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void parseKnows(String knowsFile) {
		FileReader fr;
		try {
			fr = new FileReader(knowsFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String knowsTuple;
			while((knowsTuple = br.readLine()) != null){
				createKnows(knowsTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createKnows(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		KnowsLink k1 = Ldbc_snbFactory.eINSTANCE.createKnowsLink();
		KnowsLink k2 = Ldbc_snbFactory.eINSTANCE.createKnowsLink();
		
		try {
			Date creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			Date deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);
			long id1 = Long.parseLong(tokens[3]);
			long id2 = Long.parseLong(tokens[4]);
			
			Person p1 = persons.get(id1);
			Person p2 = persons.get(id2);
			
			p1.getKnows().add(k1);
			p2.getKnows().add(k2);
			
			k1.setKnows(p2);
			k2.setKnows(p1);
			
			k1.setCreationDate(creationDate.getTime());
			k2.setCreationDate(creationDate.getTime());

			k1.setCts(creationDate.getTime());
			k2.setCts(creationDate.getTime());
			k1.setDts(deletionDate.getTime());
			k2.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		nodes.add(k1);
		nodes.add(k2);
		model.getOwnedKnowsLinks().add(k1);
		model.getOwnedKnowsLinks().add(k2);
	}
	
	@Override
	public String getName() {
		return "person parser";
	}

	@Override
	protected Map<Long, Person> doParse(String dataDir) {
		persons = new HashMap<>();
		
		File personBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person");
		for(String personPart:personBaseDir.list(CSV_FILTER)) {
			this.parsePersons(personBaseDir + "/" + personPart);
		}

		File interestBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_hasInterest_Tag");
		for(String interestPart:interestBaseDir.list(CSV_FILTER)) {
			this.parseHasInterest(interestBaseDir + "/" + interestPart);
		}

		File studyBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_studyAt_University");
		for(String studyPart:studyBaseDir.list(CSV_FILTER)) {
			this.parseStudyAt(studyBaseDir + "/" + studyPart);
		}

		File workBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_workAt_Company");
		for(String workPart:workBaseDir.list(CSV_FILTER)) {
			this.parseWorkAt(workBaseDir + "/" + workPart);
		}
		
		File knowsBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_knows_Person");
		for(String knowsPart:knowsBaseDir.list(CSV_FILTER)) {
			this.parseKnows(knowsBaseDir + "/" + knowsPart);
		}
		
		return persons;
	}

}
