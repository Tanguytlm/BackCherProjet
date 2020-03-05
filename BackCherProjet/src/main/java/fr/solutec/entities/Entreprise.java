package fr.solutec.entities;

import javax.persistence.Entity;

@Entity
public class Entreprise extends Utilisateur {
	
	private String nom;
	private String secteurActivite;
	private String adresse;
	private int codePostal;
	private String telephone;
	private String logo;
	private String description;
	
	public Entreprise() {
		// TODO Auto-generated constructor stub
	}

	public Entreprise(String mail, String mdp, int statut, String nom, String secteurActivite, String adresse,
			int codePostal, String telephone, String logo, String description) {
		super(mail, mdp, statut);
		this.nom = nom;
		this.secteurActivite = secteurActivite;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.logo = logo;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}


