package de.mdelab.ldbc_snb.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Continent;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Place;

public class PlacesParser extends Parser<Place>{

	protected Map<Long, Place> places;
	protected Collection<EObject> nodes;
	protected LdbcSNBModel model;
	
	public PlacesParser(LdbcSNBModel model, Collection<EObject> nodes){
		this.model = model;
		this.nodes = nodes;
	}
	
	protected void parsePlaces(String placesFile) {
		FileReader fr;
		try {
			fr = new FileReader(placesFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String placeTuple;
			while((placeTuple = br.readLine()) != null){
				createPlace(placeTuple);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createPlace(String line) {
		String[] tokens = line.split(Pattern.quote("|"));
		
		long id = Long.parseLong(tokens[0]);
		String name = tokens[1];
		String type = tokens[3].toLowerCase();
		
		Place p;
		
		switch(type){
			case "country":
				p = Ldbc_snbFactory.eINSTANCE.createCountry();
				model.getOwnedCountries().add((Country) p);
				break;
			case "continent":
				p = Ldbc_snbFactory.eINSTANCE.createContinent();
				model.getOwnedContinents().add((Continent) p);
				break;
			case "city":
				p = Ldbc_snbFactory.eINSTANCE.createCity();
				model.getOwnedCities().add((City) p);
				break;
			default:
				p = Ldbc_snbFactory.eINSTANCE.createPlace();
		}
		
		p.setID(id);
		p.setName(name);
		
		nodes.add(p);
		places.put(id, p);
	}
	
	protected void parseIsPartOf(String isPartOfFile) {
		FileReader fr;
		try {
			fr = new FileReader(isPartOfFile);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			String line;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(Pattern.quote("|"));
				
				long partId = Long.parseLong(tokens[0]);
				Place part = places.get(partId);
				
				if(part instanceof Continent) {
					continue;
				}
				
				long partOfId = Long.parseLong(tokens[4]);
				Place partOf = places.get(partOfId);
				
				if(part instanceof Country){
					((Country)part).setIsPartOf((Continent)partOf);
				}
				else if(part instanceof City){
					((City)part).setIsPartOf((Country)partOf);
				}
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getName() {
		return "places parser";
	}

	@Override
	protected Map<Long, Place> doParse(String dataDir) {
		places = new HashMap<>();
		File placeBaseDir = new File(dataDir + "composite-merged-fk/static/Place");
		for(String placePart:placeBaseDir.list(CSV_FILTER)) {
			this.parsePlaces(placeBaseDir.getPath() + "/" + placePart);
		}
		for(String partOfPart:placeBaseDir.list(CSV_FILTER)) {
			this.parseIsPartOf(placeBaseDir.getPath() + "/" + partOfPart);
		}
		return places;
	}
}
