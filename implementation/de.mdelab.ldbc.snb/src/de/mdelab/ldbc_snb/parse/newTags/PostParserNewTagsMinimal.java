package de.mdelab.ldbc_snb.parse.newTags;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.parse.LDBC_SNBParser;
import de.mdelab.ldbc_snb.parse.NullStringTokenizer;
import de.mdelab.ldbc_snb.parse.Parser;

public class PostParserNewTagsMinimal extends Parser<Post> {

	protected Map<Long, Post> posts;
	private final Map<Long, Person> persons;
	private final Map<Long, Tag> tags;
	private Collection<EObject> nodes;
	protected LdbcSNBModel model;
	
	public PostParserNewTagsMinimal(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Person> persons, Map<Long, Tag> tags) {
		this.model = model;
		this.persons = persons;
		this.tags = tags;
		this.nodes = nodes;
	}

	@Override
	protected Map<Long, Post> doParse(String dataDir) {
		this.parsePosts(dataDir + "/post_0_0.csv");
		this.parseHasCreator(dataDir + "/post_hasCreator_person_0_0.csv");
		this.parseHasTag(dataDir + "/post_hasTag_tag_0_0.csv");
		
		if(Files.notExists(Paths.get(dataDir + PostParserNewTags.SUCCESSOR_FILE))) {
			SuccessorEdgeCreator.createEdges(dataDir);
		}
		this.parseSuccessors(dataDir + PostParserNewTags.SUCCESSOR_FILE);
		
		if(Files.notExists(Paths.get(dataDir + PostParserNewTags.LINKED_POSTS_FILE))) {
			LinkedPostsEdgeCreator.createEdges(dataDir);
		}
		this.parseLinkedPosts(dataDir + PostParserNewTags.LINKED_POSTS_FILE);
		return posts;
	}
	
	private void parsePosts(String postFile) {
		posts = new HashMap<>();
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
		
		long id = Long.parseLong(st.nextToken());
		String imageFile = st.nextToken();
		
		Date creationDate;
		try {
			creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(st.nextToken());
			p.setCreationDate(creationDate.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
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
		
		nodes.add(p);
		posts.put(id, p);
		((InternalEList<Message>) model.getMessages()).addUnique(p);
		model.getOwnedPosts().add(p);
	}
	
	private void parseHasCreator(String hasCreatorFile){
		FileReader fr;
		try {
			fr = new FileReader(hasCreatorFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String hasCreatorTuple;
			while((hasCreatorTuple = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(hasCreatorTuple, "|");
				long postId = Long.parseLong(st.nextToken());
				long personId = Long.parseLong(st.nextToken());
				
				Post post = posts.get(postId);
				Person person = persons.get(personId);

				post.setHasCreator(person);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parseHasTag(String hasTagFile){
		FileReader fr;
		try {
			fr = new FileReader(hasTagFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String hasTagTuple;
			while((hasTagTuple = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(hasTagTuple, "|");
				long postId = Long.parseLong(st.nextToken());
				long tagId = Long.parseLong(st.nextToken());
				
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

	private void parseSuccessors(String successorFile) {
		FileReader fr;
		try {
			fr = new FileReader(successorFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String successorTuple;
			while((successorTuple = br.readLine()) != null){
				createSuccessorEdge(successorTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createSuccessorEdge(String successorTuple) {
		NullStringTokenizer st = new NullStringTokenizer(successorTuple, '|');

		Long postId = Long.parseLong(st.nextToken());
		Long successorId = Long.parseLong(st.nextToken());
		
		Post post = posts.get(postId);
		Post successor = posts.get(successorId);
		
		post.setSuccessor(successor);
	}
	
	private void parseLinkedPosts(String linkedPostsFile) {
		FileReader fr;
		try {
			fr = new FileReader(linkedPostsFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String linkedTuple;
			while((linkedTuple = br.readLine()) != null){
				createLinkedPostsEdge(linkedTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createLinkedPostsEdge(String linkedTuple) {
		NullStringTokenizer st = new NullStringTokenizer(linkedTuple, '|');
		
		Long postId1 = Long.parseLong(st.nextToken());
		Long postId2 = Long.parseLong(st.nextToken());
		
		Post post1 = posts.get(postId1);
		Post post2 = posts.get(postId2);
		
		post1.getLinkedPosts().add(post2);
	}

	@Override
	public String getName() {
		return "minimal post parser";
	}
	
}