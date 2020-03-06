package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Particulier extends Utilisateur {
	
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String bio;
	private String photo;
	
	
	public Particulier() {
		// TODO Auto-generated constructor stub
	}


	


	public Date getDateNaissance() {
		return dateNaissance;
	}





	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}





	public Particulier(String mail, String mdp, int statut, String nom, String prenom, Date dateNaissance, String bio,
			String photo) {
		super(mail, mdp, statut);
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.bio = bio;
		this.photo = photo;
	}





	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
	
	
	
	
}
