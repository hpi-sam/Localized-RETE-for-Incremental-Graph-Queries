package de.mdelab.ldbc_snb.parse.newTags;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.parse.LDBC_SNBParser;

public class SuccessorEdgeCreator {

	private static class Tuple<E1, E2>{

		E1 e1;
		E2 e2;
		
		private Tuple(E1 e1, E2 e2){
			this.e1 = e1;
			this.e2 = e2;
		}
		
	}
	
	public static void createEdges(String dataDir) {
		String outputFile = dataDir + PostParserNewTags.SUCCESSOR_FILE;
		Collection<EObject> graph = LDBC_SNBParser.parseGraph(dataDir);
		System.out.println();
		List<Tuple<Long, Long>> successorEdges = new ArrayList<>();
		int edgeCount = 0;
		
		for(EObject node:graph){
			if(node.eClass() == Ldbc_snbPackage.Literals.PERSON){
				List<Message> messages = ((Person)node).getOppHasCreator();
				List<Post> posts = new ArrayList<>();
				for(Message message:messages){
					if(message.eClass() == Ldbc_snbPackage.Literals.POST){
						posts.add((Post) message);
					}
				}
				Collections.sort(posts, new Comparator<Post>() {

					@Override
					public int compare(Post o1, Post o2) {
						return Long.signum(o1.getCreationDate() - o2.getCreationDate());
					}
					
				});
				for(int i = 0; i < posts.size() - 1; i++){
					successorEdges.add(new Tuple<Long, Long>(posts.get(i).getID(), posts.get(i+1).getID()));
					if(++edgeCount % 100000 == 0) {
						System.out.println("created edge " + edgeCount);
					}
				}
			}
		}
		
		try {
			FileWriter fw = new FileWriter(outputFile);
			fw.write("Post.id|Post.id\n");
			for(Tuple<Long, Long> tuple:successorEdges){
				//System.out.println(tuple.e1 + "|" + tuple.e2 + "|\n");
				fw.write(tuple.e1 + "|" + tuple.e2 + "|\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("created " + edgeCount + " successor edges");
	}
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: dataDir");
			return;
		}
		
		String dataDir = args[0];
		createEdges(dataDir);
	}

}
