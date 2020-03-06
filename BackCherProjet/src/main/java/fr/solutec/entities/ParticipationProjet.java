package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParticipationProjet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParticipation;
	@ManyToOne
	private Particulier particulier;
	@ManyToOne
	private Entreprise entreprise; 
	@ManyToOne
	private Projet projet;
	public Long getIdParticipation() {
		return idParticipation;
	}
	public void setIdParticipation(Long idParticipation) {
		this.idParticipation = idParticipation;
	}
	public Particulier getParticulier() {
		return particulier;
	}
	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	@Override
	public String toString() {
		return "ParticipationProjet [idParticipation=" + idParticipation + ", particulier=" + particulier
				+ ", entreprise=" + entreprise + ", projet=" + projet + "]";
	}
	public ParticipationProjet(Particulier particulier, Entreprise entreprise, Projet projet) {
		super();
		this.particulier = particulier;
		this.entreprise = entreprise;
		this.projet = projet;
	}
	public ParticipationProjet() {
		super();
	}
	
	
	
	
}
