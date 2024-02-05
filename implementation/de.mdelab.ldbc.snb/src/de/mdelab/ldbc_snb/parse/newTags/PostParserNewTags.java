package de.mdelab.ldbc_snb.parse.newTags;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.parse.NullStringTokenizer;
import de.mdelab.ldbc_snb.parse.PostParser;

public class PostParserNewTags extends PostParser {

	public static final String SUCCESSOR_FILE = "/post_successor_post_0_0.csv";
	public static final String LINKED_POSTS_FILE = "/post_linkedPosts_post_0_0.csv";
	
	public PostParserNewTags(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Forum> forums, Map<Long, Person> persons, Map<Long, Tag> tags, Map<Long, Place> places) {
		super(model, nodes, forums, persons, tags, places);
	}

	@Override
	protected Map<Long, Post> doParse(String dataDir) {
		super.doParse(dataDir);
		if(Files.notExists(Paths.get(dataDir + SUCCESSOR_FILE))) {
			SuccessorEdgeCreator.createEdges(dataDir);
		}
		this.parseSuccessors(dataDir + SUCCESSOR_FILE);
		
		if(Files.notExists(Paths.get(dataDir + LINKED_POSTS_FILE))) {
			LinkedPostsEdgeCreator.createEdges(dataDir);
		}
		this.parseLinkedPosts(dataDir + LINKED_POSTS_FILE);
		return posts;
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
	
}
