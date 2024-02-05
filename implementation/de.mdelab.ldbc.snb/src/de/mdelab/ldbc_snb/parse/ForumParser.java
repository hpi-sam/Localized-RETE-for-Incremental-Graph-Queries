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

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;

import org.eclipse.emf.ecore.EObject;

public class ForumParser extends Parser<Forum>{

	protected Map<Long, Forum> forums;
	protected final Map<Long, Person> persons;
	private final Map<Long, Tag> tags;
	protected Collection<EObject> nodes;
	protected LdbcSNBModel model;
	
	public ForumParser(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Person> persons, Map<Long, Tag> tags) {
		this.model = model;
		this.persons = persons;
		this.tags = tags;
		this.nodes = nodes;
	}
	
	private void parseForums(String forumFile) {
		FileReader fr;
		try {
			fr = new FileReader(forumFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String forumTuple;
			while((forumTuple = br.readLine()) != null){
				createForum(forumTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createForum(String line) {
		String[] tokens = line.split(Pattern.quote("|"));		

		Forum f = Ldbc_snbFactory.eINSTANCE.createForum();

		try {
			Date creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			Date deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);

			long id = Long.parseLong(tokens[3]);
			String title = tokens[4];
			long modId = Long.parseLong(tokens[5]);
			
			f.setID(id);
			f.setTitle(title);
			f.setCreationDate(creationDate.getTime());
			f.setHasModerator(persons.get(modId));

			f.setCts(creationDate.getTime());
			f.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		nodes.add(f);
		forums.put(f.getID(), f);
		model.getOwnedForums().add(f);
	}
	
	protected void parseHasMember(String hasMemberFile){
		FileReader fr;
		try {
			fr = new FileReader(hasMemberFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String hasMemberTuple;
			while((hasMemberTuple = br.readLine()) != null){
				createHasMember(hasMemberTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createHasMember(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		HasMemberLink hasMember = Ldbc_snbFactory.eINSTANCE.createHasMemberLink();

		long forumId = Long.parseLong(tokens[3]);
		long personId = Long.parseLong(tokens[4]);
		
		Forum forum = forums.get(forumId);
		Person person = persons.get(personId);
		forum.getHasMember().add(hasMember);
		hasMember.setHasMember(person);
		
		try {
			Date creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			Date deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);

			hasMember.setJoinDate(creationDate.getTime());

			hasMember.setCts(creationDate.getTime());
			hasMember.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		nodes.add(hasMember);
		model.getOwnedHasMemberLinks().add(hasMember);
	}
	
	private void parseHasTag(String hasTagFile){
		FileReader fr;
		try {
			fr = new FileReader(hasTagFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));
				long forumId = Long.parseLong(tokens[2]);
				long tagId = Long.parseLong(tokens[3]);
				

				Forum forum = forums.get(forumId);
				Tag tag = tags.get(tagId);

				forum.getHasTag().add(tag);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "forum parser";
	}

	@Override
	protected Map<Long, Forum> doParse(String dataDir) {
		forums = new HashMap<>();
		File forumBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Forum");
		for(String forumPart:forumBaseDir.list(CSV_FILTER)) {
			this.parseForums(forumBaseDir + "/" + forumPart);
		}

		File memberBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Forum_hasMember_Person");
		for(String memberPart:memberBaseDir.list(CSV_FILTER)) {
			this.parseHasMember(memberBaseDir + "/" + memberPart);
		}

		File hasTagBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Forum_hasTag_Tag");
		for(String hasTagPart:hasTagBaseDir.list(CSV_FILTER)) {
			this.parseHasTag(hasTagBaseDir + "/" + hasTagPart);
		}
		
		return forums;
	}
	
	
}
