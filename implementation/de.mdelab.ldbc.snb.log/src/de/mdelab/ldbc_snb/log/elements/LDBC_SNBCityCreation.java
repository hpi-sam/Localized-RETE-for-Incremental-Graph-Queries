package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;

public class LDBC_SNBCityCreation extends LDBC_SNBElementAction<City> {

	private City city;
	private Country country;
	
	public LDBC_SNBCityCreation(long creationTime, City city, Country country) {
		super(creationTime);
		this.city = city;
		this.country = country;
	}
	
	@Override
	public City executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedCities().add(city);
		city.setIsPartOf(country);
		return city;
	}

	@Override
	public void undoAction(EObject model) {
		city.setIsPartOf(null);
		((LdbcSNBModel) model).getOwnedCities().remove(city);
	}
	
	@Override
	public String toString() {
		return "City " + city.getID();
	}

	
}
