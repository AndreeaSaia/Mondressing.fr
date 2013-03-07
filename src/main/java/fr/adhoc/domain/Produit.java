package fr.adhoc.domain;

import javax.persistence.*;

/**
 * Marking a POJO as a persistent entity by adding @Entity
 * Defining the identifier property of my entity by adding @Id
 * 
 */

@Entity
public class Produit {

	@Id
	private int id;
	private String nomProduit;
	private int taille;
	private boolean disponibilité;
	private String nomDesigner;
	private int prix;
	private String couleur;
	private int periodeLocation;
	
	public int getId() {
		return id;
	}

	public void setId(int id) { 
    	this.id=id;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit=nomProduit;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille=taille;
	}

	public boolean getDisponibilité() {
		return disponibilité;
	}

	public void setDisponibilité(boolean disponibilité) {
		this.disponibilité=disponibilité;
	}

	public String getNomDesigner() {
		return nomDesigner;
	}

	public void setNomDesigner(String nomDesigner) {
		this.nomDesigner=nomDesigner;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix=prix;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}

	public int getPeriodeLocation() {
		return periodeLocation;
	}

	public void setPeriodeLocation(int periodeLocation) {
		this.periodeLocation=periodeLocation;
	}

}