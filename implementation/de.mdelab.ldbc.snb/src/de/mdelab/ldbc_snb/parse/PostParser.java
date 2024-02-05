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

import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;

public class PostParser extends Parser<Post> {

	protected Map<Long, Post> posts;
	protected final Map<Long, Forum> forums;
	protected final Map<Long, Person> persons;
	private final Map<Long, Tag> tags;
	private final Map<Long, Place> places;
	private Collection<EObject> nodes;
	protected LdbcSNBModel model;
	
	public PostParser(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Forum> forums, Map<Long, Person> persons, Map<Long, Tag> tags, Map<Long, Place> places) {
		this.model = model;
		this.forums = forums;
		this.persons = persons;
		this.tags = tags;
		this.places = places;
		this.nodes = nodes;
	}

	private void parsePosts(String postFile) {
		FileReader fr;
		try {
			fr = new FileReader(postFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String postTuple;
			while((postTuple = br.readLine()) != null){
				createPost(postTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createPost(String postTuple) {
		NullStringTokenizer st = new NullStringTokenizer(postTuple, '|');
		
		Post p = Ldbc_snbFactory.eINSTANCE.createPost();

		Date creationDate;
		Date deletionDate;
		try {
			creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(st.nextToken());
			deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(st.nextToken());

			p.setCreationDate(creationDate.getTime());

			p.setCts(creationDate.getTime());
			p.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		st.nextToken();	//skip explicitlyDeleted field
		
		long id = Long.parseLong(st.nextToken());
		String imageFile = st.nextToken();
		
		String locationIP = st.nextToken();
		String browserUsed = st.nextToken();
		String language = st.nextToken();
		String content = st.nextToken();
		int length = Integer.parseInt(st.nextToken());

		p.setID(id);
		p.setImageFile(imageFile);
		p.setLocationIP(locationIP);
		p.setBrowserUsed(browserUsed);
		p.setLanguage(language);
		p.setContent(content);
		p.setLength(length);
		
		long creatorId = Long.parseLong(st.nextToken());
		p.setHasCreator(persons.get(creatorId));
		
		long forumId = Long.parseLong(st.nextToken());
		p.setContainer(forums.get(forumId));
		
		long placeId = Long.parseLong(st.nextToken());
		p.setIsLocatedIn((Country) places.get(placeId));
		
		nodes.add(p);
		posts.put(id, p);
		((InternalEList<Message>) model.getMessages()).addUnique(p);
		model.getOwnedPosts().add(p);
	}
	
	private void parseLikes(String likesFile) {
		FileReader fr;
		try {
			fr = new FileReader(likesFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String likesTuple;
			while((likesTuple = br.readLine()) != null){
				createLikes(likesTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createLikes(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		LikesLink likes = Ldbc_snbFactory.eINSTANCE.createLikesLink();

		Date creationDate;
		Date deletionDate;
		try {
			creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);

			likes.setCreationDate(creationDate.getTime());

			likes.setCts(creationDate.getTime());
			likes.setDts(deletionDate.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		long personId = Long.parseLong(tokens[3]);
		long postId = Long.parseLong(tokens[4]);
		
		Post post = posts.get(postId);
		Person person = persons.get(personId);
		
		likes.setLikes(post);
		person.getLikes().add(likes);
		
		nodes.add(likes);
		model.getOwnedLikesLinks().add(likes);
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
				
				long postId = Long.parseLong(tokens[2]);
				long tagId = Long.parseLong(tokens[3]);
				
				Post post = posts.get(postId);
				Tag tag = tags.get(tagId);

				post.getHasTag().add(tag);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "post parser";
	}

	@Override
	protected Map<Long, Post> doParse(String dataDir) {
		posts = new HashMap<>();

		File postBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Post");
		for(String postPart:postBaseDir.list(CSV_FILTER)) {
			this.parsePosts(postBaseDir + "/" + postPart);
		}

		File likesBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_likes_Post");
		for(String likesPart:likesBaseDir.list(CSV_FILTER)) {
			this.parseLikes(likesBaseDir + "/" + likesPart);
		}

		File hasTagBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Post_hasTag_Tag");
		for(String hasTagPart:hasTagBaseDir.list(CSV_FILTER)) {
			this.parseHasTag(hasTagBaseDir + "/" + hasTagPart);
		}
		
		return posts;
	}
	
}
