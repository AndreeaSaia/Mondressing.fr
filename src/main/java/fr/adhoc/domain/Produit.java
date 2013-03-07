package fr.adhoc.domain;

/**
 * la classe métier Produit
 * 
 */

public class Produit {

	private int id;
	private String nomProduit;
	private int taille;
	private boolean disponibilité;
	private String nomDesigner;
	private int prix;
	private String couleur;
	private Date duréeDébut;
	private Date duréeFin;
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

	public Data getDuréeDébut() {
		return duréeDébut;
	}

	public void setDuréeDébut(Data duréeDébut) {
		this.duréeDébut=duréeDébut;
	}

	public Data getDuréeFin() {
		return duréeFin;
	}

	public void setDuréeFin(Data duréeFin) {
		this.duréeFin=duréeFin;
	}

	public int getPeriodeLocation() {
		return periodeLocation;
	}

	public void setPeriodeLocation(int periodeLocation) {
		this.periodeLocation=periodeLocation;
	}

}