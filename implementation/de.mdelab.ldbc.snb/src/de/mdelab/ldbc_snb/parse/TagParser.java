package de.mdelab.ldbc_snb.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;

import org.eclipse.emf.ecore.EObject;

public class TagParser extends Parser<Tag>{

	private Map<Long, Tag> tags;
	private Map<Long, TagClass> tagClasses;
	private Collection<EObject> nodes;
	protected LdbcSNBModel model;
	
	public TagParser(LdbcSNBModel model, Collection<EObject> nodes) {
		this.nodes = nodes;
		this.model = model;
	}

	private void parseTagClasses(String tagClassFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tagClassFile), StandardCharsets.UTF_8));
			br.readLine();
			
			String tagClassTuple;
			while((tagClassTuple = br.readLine()) != null){
				createTagClass(tagClassTuple);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createTagClass(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		long id = Long.parseLong(tokens[0]);
		String name = tokens[1];
		
		TagClass tc = Ldbc_snbFactory.eINSTANCE.createTagClass();
		tc.setID(id);
		tc.setName(name);
		
		nodes.add(tc);
		tagClasses.put(id, tc);
		model.getOwnedTagClasses().add(tc);
	}

	private void parseIsSubclassOf(String tagClassFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tagClassFile), StandardCharsets.UTF_8));
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));

				if(tokens.length < 4) {
					continue;
				}
				
				long subClassId = Long.parseLong(tokens[0]);
				long superClassId = Long.parseLong(tokens[3]);
				
				TagClass tc = tagClasses.get(subClassId);
				tc.getIsSubclassOf().add(tagClasses.get(superClassId));
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parseTags(String tagFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tagFile), StandardCharsets.UTF_8));
			br.readLine();
			
			String tagTuple;
			while((tagTuple = br.readLine()) != null){
				createTag(tagTuple);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createTag(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		long id = Long.parseLong(tokens[0]);
		String name = tokens[1];
		long classId = Long.parseLong(tokens[3]);
		
		Tag t = Ldbc_snbFactory.eINSTANCE.createTag();
		t.setID(id);
		t.setName(name);
		t.getHasType().add(tagClasses.get(classId));
		
		nodes.add(t);
		tags.put(id, t);
		model.getOwnedTags().add(t);
	}

	@Override
	public String getName() {
		return "tag parser";
	}

	@Override
	protected Map<Long, Tag> doParse(String dataDir) {
		tagClasses = new HashMap<>();
		tags = new HashMap<>();

		File tagClassBaseDir = new File(dataDir + "composite-merged-fk/static/TagClass");
		for(String tagClassPart:tagClassBaseDir.list(CSV_FILTER)) {
			this.parseTagClasses(tagClassBaseDir + "/" + tagClassPart);
		}
		for(String subclassPart:tagClassBaseDir.list(CSV_FILTER)) {
			this.parseIsSubclassOf(tagClassBaseDir + "/" + subclassPart);
		}
		
		File tagBaseDir = new File(dataDir + "composite-merged-fk/static/Tag");
		for(String tagPart:tagBaseDir.list(CSV_FILTER)) {
			this.parseTags(tagBaseDir + "/" + tagPart);
		}
		return tags;
	}

}
