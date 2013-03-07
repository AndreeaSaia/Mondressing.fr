package fr.adhoc.domain;

import javax.persistence.*;

/**
 * Marking a POJO as a persistent entity by adding @Entity
 * 
 */

@Entity
public class Offre {

	private String réference;
	private int montant;
	private Date duréeDébutLocation;
	private Date duréeFinLocation;
	
	public String getRéference() {
		return réference;
	}
	public void setRéference(String réference) {
		this.réference = réference;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public Date getDuréeDébutLocation() {
		return duréeDébutLocation;
	}
	public void setDuréeDébutLocation(Date duréeDébutLocation) {
		this.duréeDébutLocation = duréeDébutLocation;
	}
	public Date getDuréeFinLocation() {
		return duréeFinLocation;
	}
	public void setDuréeFinLocation(Date duréeFinLocation) {
		this.duréeFinLocation = duréeFinLocation;
	}	

}