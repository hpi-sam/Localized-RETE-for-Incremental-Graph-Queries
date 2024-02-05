package de.mdelab.ldbc_snb.parse.newTags;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.parse.LDBC_SNBParser;

public class LinkedPostsEdgeCreator {

	public static void createEdges(String dataDir) {
		String outputFile = dataDir + PostParserNewTags.LINKED_POSTS_FILE;
		Collection<EObject> graph = LDBC_SNBParser.parseGraph(dataDir);
		System.out.println();
		int edgeCount = 0;
		
		try {
			FileWriter fw = new FileWriter(outputFile);
			fw.write("Post.id|Post.id\n");
			
			for(EObject node:graph){
				if(node.eClass() == Ldbc_snbPackage.Literals.FORUM){
					List<Post> posts = new ArrayList<>(((Forum)node).getOppContainer());
					Collections.sort(posts, new Comparator<Post>() {
	
						@Override
						public int compare(Post o1, Post o2) {
							return Long.signum(o2.getCreationDate() - o1.getCreationDate());
						}
						
					});
					
					for(int i = 0; i < posts.size() - 1; i++){
						for(int j = i+1; j < posts.size(); j++){
							fw.write(posts.get(i).getID() + "|" + posts.get(j).getID() + "|\n");
							if(++edgeCount % 100000 == 0) {
								System.out.println("created edge " + edgeCount);
							}
						}
					}
				}
			}
			fw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("created " + edgeCount + " linkedPosts edges");
	}
	
	public static void main(String[] args){
		if(args.length < 1) {
			System.out.println("1 argument: dataDir");
			return;
		}

		String dataDir = args[0];
		createEdges(dataDir);
	}
	
}
