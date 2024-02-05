package de.mdelab.ldbc_snb.parse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class LDBC_SNBParser {
	
	public static SimpleDateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat DATE_TIME_PARSER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'+00:00'");


	public static void saveGraph(Collection<EObject> nodes, String outputPath){
		Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
		factoryRegistry.getExtensionToFactoryMap().put(Ldbc_snbPackage.eINSTANCE.getName().toLowerCase(), new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(outputPath));
		resource.getContents().addAll(nodes);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<EObject> parseGraph(String dataDir){
		LdbcSNBModel model = Ldbc_snbFactory.eINSTANCE.createLdbcSNBModel();
		return parseGraph(model, dataDir);
	}

	public static List<EObject> parseGraph(LdbcSNBModel model, String dataDir){
		List<EObject> nodes = new ArrayList<>();
		nodes.add(model);

		if(!dataDir.endsWith("/")) {
			dataDir = dataDir + "/";
		}
		
		PlacesParser placesParser = new PlacesParser(model, nodes);
		Map<Long, Place> places = placesParser.parse(dataDir);
		OrganisationParser organisationParser = new OrganisationParser(model, nodes, places);
		Map<Long, Organisation> organisations = organisationParser.parse(dataDir);
		TagParser tagParser = new TagParser(model, nodes);
		Map<Long, Tag> tags = tagParser.parse(dataDir);
		PersonParser personParser = new PersonParser(model, nodes, places, organisations, tags);
		Map<Long, Person> persons = personParser.parse(dataDir);
		ForumParser forumParser = new ForumParser(model, nodes, persons, tags);
		Map<Long, Forum> forums = forumParser.parse(dataDir);
		PostParser postParser = new PostParser(model, nodes, forums, persons, tags, places);
		Map<Long, Post> posts = postParser.parse(dataDir);
		CommentParser commentParser = new CommentParser(model, nodes, persons, tags, places, posts);
		commentParser.parse(dataDir);
		
		return nodes;
	}
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: dataDir");
			return;
		}
		
		parseGraph(args[0]);
	}
	
}
