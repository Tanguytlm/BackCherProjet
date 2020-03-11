package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class PartageFichier {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String commentaire;
	
	@Lob
	private byte[] fichier;
	
	@ManyToOne
	private Projet projet;
	
	public PartageFichier() {
		// TODO Auto-generated constructor stub
	}

	public PartageFichier(Long id, String commentaire, byte[] fichier, Projet projet) {
		super();
		this.id = id;
		this.commentaire = commentaire;
		this.fichier = fichier;
		this.projet = projet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	
	

}
