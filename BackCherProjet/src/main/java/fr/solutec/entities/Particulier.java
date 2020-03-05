package fr.solutec.entities;

import javax.persistence.Entity;


@Entity
public class Particulier extends Utilisateur {
	
	private String nom;
	private String prenom;
	private int age;
	private String interet;
	private String bio;
	
	
	public Particulier() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
