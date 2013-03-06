package fr.adhoc.domain;

/**
 * Entity class which contains the information of an User
 * 
 */

@Entity
public class User{
	
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String codepostale;
	private String telephone;
	private String email;
	private String motdepasse;

	public String getNom(){
		return nom;
		}

	public void setNom(String nom){
		this.nom=nom; 
	}	

	public String getPrenom(){
		return prenom;
		}

	public void setPrenom(String prenom){
		this.prenom=prenom; 
	}	

	public String getAdresse(){
		return adresse;
		}

	public void setAdresse(String adresse){
		this.adresse=adresse; 
	}	

	public String getVille(){
		return ville;
		}

	public void setVille(String ville){
		this.ville=ville; 
	}	

	public String getCodePostale(){
		return codepostale;
		}

	public void setCodePostale(String nom){
		this.codepostale=codepostale; 
	}

	public String getTelephone(){
		return telephone;
		}

	public void setTelephone(String telephone){
		this.telephone=telephone; 
	}		

	public String getEmail(){
		return email;
		}

	public void setEmail(String email){
		this.email=email; 
	}	

	public String getMotDePasse(){
		return motdepasse;
		}

	public void setMotDePasse(String motdepasse){
		this.motdepasse=motdepasse; 
	}	
}