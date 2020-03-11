package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Entreprise extends Utilisateur {
	
	@Column(unique = true)
	private String nom;
	private String adresse;
	private int codePostal;
	private String telephone;
	@Column(length=3000)
	private String description;
	private String siteWeb;
	private int dateCreation;
	private String tailleEntreprise;
	
	
	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public int getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(int dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getTailleEntreprise() {
		return tailleEntreprise;
	}

	public void setTailleEntreprise(String tailleEntreprise) {
		this.tailleEntreprise = tailleEntreprise;
	}

	public Entreprise() {
		// TODO Auto-generated constructor stub
	}



	public Entreprise(String mail, String mdp, int statut, byte[] photo, String nom, String adresse, int codePostal, String telephone, 
			String description, String siteWeb, int dateCreation, String tailleEntreprise) {
		super(mail, mdp, statut, photo);
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.description = description;
		this.siteWeb = siteWeb;
		this.dateCreation = dateCreation;
		this.tailleEntreprise = tailleEntreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}


