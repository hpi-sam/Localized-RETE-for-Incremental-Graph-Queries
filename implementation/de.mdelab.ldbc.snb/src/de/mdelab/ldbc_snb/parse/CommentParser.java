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

import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Country;
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

public class CommentParser extends Parser<Comment>{

	private Collection<EObject> nodes;
	private final Map<Long, Person> persons;
	private final Map<Long, Tag> tags;
	private final Map<Long, Place> places;
	private final Map<Long, Post> posts;
	private Map<Long, Comment> comments;
	protected LdbcSNBModel model;
	
	public CommentParser(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Person> persons, Map<Long, Tag> tags, Map<Long, Place> places, Map<Long, Post> posts) {
		this.model = model;
		this.nodes = nodes;
		this.persons = persons;
		this.tags = tags;
		this.places = places;
		this.posts = posts;
	}
	
	private void parseComments(String commentFile) {
		FileReader fr;
		try {
			fr = new FileReader(commentFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String commentTuple;
			while((commentTuple = br.readLine()) != null){
				createComment(commentTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createComment(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		Comment c = Ldbc_snbFactory.eINSTANCE.createComment();

		Date creationDate;
		Date deletionDate;
		try {
			creationDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[0]);
			deletionDate = LDBC_SNBParser.DATE_TIME_PARSER.parse(tokens[1]);

			c.setCreationDate(creationDate.getTime());

			c.setCts(creationDate.getTime());
			c.setDts(deletionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		long id = Long.parseLong(tokens[3]);
		
		String locationIP = tokens[4];
		String browserUsed = tokens[5];
		String content = tokens[6];
		int length = Integer.parseInt(tokens[7]);

		c.setID(id);
		c.setLocationIP(locationIP);
		c.setBrowserUsed(browserUsed);
		c.setContent(content);
		c.setLength(length);

		long creatorId = Long.parseLong(tokens[8]);
		c.setHasCreator(persons.get(creatorId));

		long placeId = Long.parseLong(tokens[9]);
		c.setIsLocatedIn((Country) places.get(placeId));
		
		nodes.add(c);
		comments.put(id, c);
		((InternalEList<Message>) model.getMessages()).addUnique(c);
		model.getOwnedComments().add(c);
	}

	private void parseReplyOf(String commentFile) {
		FileReader fr;
		try {
			fr = new FileReader(commentFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				NullStringTokenizer t = new NullStringTokenizer(line, '|');
				
				//skip dates
				t.nextToken();
				t.nextToken();
				t.nextToken();
				
				long id = Long.parseLong(t.nextToken());
				Comment c = comments.get(id);
				
				for(int i = 4; i < 10; i++) {
					//skip other fields
					t.nextToken();
				}

				Message m;
				String replyOfPost = t.nextToken();
				if(replyOfPost != null) {
					long postId = Long.parseLong(replyOfPost);
					m = posts.get(postId);
				}
				else {
					long commentId = Long.parseLong(t.nextToken());
					m = comments.get(commentId);
				}
				c.setReplyOf(m);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		long commentId = Long.parseLong(tokens[4]);
		
		Comment comment = comments.get(commentId);
		Person person = persons.get(personId);
		
		likes.setLikes(comment);
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
				
				long commentId = Long.parseLong(tokens[2]);
				long tagId = Long.parseLong(tokens[3]);
				
				Comment comment = comments.get(commentId);
				Tag tag = tags.get(tagId);

				comment.getHasTag().add(tag);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "comment parser";
	}

	@Override
	protected Map<Long, Comment> doParse(String dataDir) {
		comments = new HashMap<>();
		
		File commentBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Comment");
		for(String commentPart:commentBaseDir.list(CSV_FILTER)) {
			this.parseComments(commentBaseDir.getPath() + "/" + commentPart);
		}
		for(String commentPart:commentBaseDir.list(CSV_FILTER)) {
			this.parseReplyOf(commentBaseDir.getPath() + "/" + commentPart);
		}

		File hasTagBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Comment_hasTag_Tag");
		for(String hasTagPart:hasTagBaseDir.list(CSV_FILTER)) {
			this.parseHasTag(hasTagBaseDir + "/" + hasTagPart);
		}

		File likesBaseDir = new File(dataDir + "composite-merged-fk/dynamic/Person_likes_Comment");
		for(String likesPart:likesBaseDir.list(CSV_FILTER)) {
			this.parseLikes(likesBaseDir + "/" + likesPart);
		}

		return comments;
	}
}
