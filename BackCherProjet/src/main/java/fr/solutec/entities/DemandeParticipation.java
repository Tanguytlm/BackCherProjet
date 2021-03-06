package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DemandeParticipation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParticipation;
	@ManyToOne
	private Particulier particulier;
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

	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public DemandeParticipation() {
		super();
	}
	public DemandeParticipation(Particulier particulier,  Projet projet) {
		super();
		this.particulier = particulier;
		this.projet = projet;
	}
	@Override
	public String toString() {
		return "DemandeParticipation [idParticipation=" + idParticipation + ", particulier=" + particulier + ", projet="
				+ projet + "]";
	}

	
	
}
