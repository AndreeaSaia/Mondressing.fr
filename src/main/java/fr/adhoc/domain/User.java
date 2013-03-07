package fr.adhoc.domain;

import javax.persistence.*;


/** Marking a POJO as a persistent entity by adding @Entity
 * Defining the table for my entity by adding @Table
 * Defining the identifier property of my entity by adding @Id
 * Tell JPA to let the databaase automatically generate each primary key for us. 
 * Add a GeneratedValue annotation to the entityId.
 */

@Entity
@Table(name="T_USER")
public class User{

	@Id
	@GeneratedValue
	@Column(name="IDENTIFIER")
	private int identifier;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRENOM")
	private String prenom;

	@Column(name="ADRESSE")
	private String adresse;

	@Column(name="VILLE")
	private String ville;

	@Column(name="CODE_POSTALE")
	private int codepostale;

	@Column(name="TELEPHONE")
	private String telephone;

	@Column(name="EMAIL")
	private String email;

	@Column(name="MOT_DE_PASSE")
	private String motdepasse;


	public int getIdentifier() {
		return id;
	}

	public void setIdendifier(int identifier){
		this.id=id;
	}

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

	public int getCodePostale(){
		return codepostale;
		}

	public void setCodePostale(int nom){
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