package fr.solutec.entities;

import javax.persistence.Entity;


@Entity
public class Particulier extends Utilisateur {
	
	private String nom;
	private String prenom;
	private int age;
	private String bio;
	private String photo;
	
	
	public Particulier() {
		// TODO Auto-generated constructor stub
	}


	public Particulier(String mail, String mdp, int statut, String nom, String prenom, int age,
			String bio, String photo) {
		super(mail, mdp, statut);
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
	
	
	
	
}
