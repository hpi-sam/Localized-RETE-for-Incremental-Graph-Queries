package de.mdelab.ldbc_snb.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.University;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;

public class OrganisationParser extends Parser<Organisation>{
	
	private Map<Long, Organisation> organisations;
	private final Map<Long, Place> places;
	private Collection<EObject> nodes;
	protected LdbcSNBModel model;

	public OrganisationParser(LdbcSNBModel model, Collection<EObject> nodes,
			Map<Long, Place> places) {
		this.model = model;
		this.places = places;
		this.nodes = nodes;
	}
	
	private void parseOrganisations(String organisationFile) {
		FileReader fr;
		try {
			fr = new FileReader(organisationFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String organisationTuple;
			while((organisationTuple = br.readLine()) != null){
				createOrganisation(organisationTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createOrganisation(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		long id = Long.parseLong(tokens[0]);
		String type = tokens[1].toLowerCase();
		String name = tokens[2];
		long placeId = Long.parseLong(tokens[4]);
		
		Organisation o;
		
		switch(type){
			case "company":
				o = Ldbc_snbFactory.eINSTANCE.createCompany();
				((Company) o).setIsLocatedIn((Country) places.get(placeId));
				model.getOwnedCompanies().add((Company)o);
				break;
			case "university":
				o = Ldbc_snbFactory.eINSTANCE.createUniversity();
				((University) o).setIsLocatedIn((City) places.get(placeId));
				model.getOwnedUniversities().add((University)o);
				break;
			default:
				o = Ldbc_snbFactory.eINSTANCE.createOrganisation();
		}
		
		o.setID(id);
		o.setName(name);
		
		nodes.add(o);
		organisations.put(id, o);
		((InternalEList<Organisation>) model.getOrganisations()).addUnique(o);
	}

	@Override
	public String getName() {
		return "organisation parser";
	}

	@Override
	protected Map<Long, Organisation> doParse(String dataDir) {
		organisations = new HashMap<>();
		File organisationBaseDir = new File(dataDir + "composite-merged-fk/static/Organisation");
		for(String organisationPart:organisationBaseDir.list(CSV_FILTER)) {
			this.parseOrganisations(organisationBaseDir.getPath() + "/" + organisationPart);
		}
		return organisations;
	}
}
