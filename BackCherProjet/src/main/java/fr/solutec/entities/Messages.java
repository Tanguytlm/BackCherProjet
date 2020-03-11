package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Messages {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Projet projet;
	@ManyToOne
	private Entreprise auteurE;
	@ManyToOne
	private Particulier auteurP;
	@ManyToOne
	private Entreprise destinataireE;
	@ManyToOne
	private Particulier destinataireP;
	@Column(length=3000)
	private String contenu;
	@CreationTimestamp
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public Entreprise getAuteurE() {
		return auteurE;
	}
	public void setAuteurE(Entreprise auteurE) {
		this.auteurE = auteurE;
	}
	public Particulier getAuteurP() {
		return auteurP;
	}
	public void setAuteurP(Particulier auteurP) {
		this.auteurP = auteurP;
	}
	public Entreprise getDestinataireE() {
		return destinataireE;
	}
	public void setDestinataireE(Entreprise destinataireE) {
		this.destinataireE = destinataireE;
	}
	public Particulier getDestinataireP() {
		return destinataireP;
	}
	public void setDestinataireP(Particulier destinataireP) {
		this.destinataireP = destinataireP;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Messages() {
		super();
	}
	public Messages(Projet projet, Entreprise auteurE, Particulier auteurP, Entreprise destinataireE,
			Particulier destinataireP, String contenu) {
		super();
		this.projet = projet;
		this.auteurE = auteurE;
		this.auteurP = auteurP;
		this.destinataireE = destinataireE;
		this.destinataireP = destinataireP;
		this.contenu = contenu;
	}
	
	
}
