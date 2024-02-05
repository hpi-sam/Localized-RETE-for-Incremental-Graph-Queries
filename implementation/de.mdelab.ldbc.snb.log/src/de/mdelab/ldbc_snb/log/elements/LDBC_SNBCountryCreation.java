package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;

public class LDBC_SNBCountryCreation extends LDBC_SNBElementAction<Country> {

	private Country country;
	
	public LDBC_SNBCountryCreation(long creationTime, Country country) {
		super(creationTime);
		this.country = country;
	}
	
	@Override
	public Country executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedCountries().add(country);
		return country;
	}

	@Override
	public void undoAction(EObject model) {
		((LdbcSNBModel) model).getOwnedCountries().remove(country);
	}

	@Override
	public String toString() {
		return "Country " + country.getID();
	}

}
