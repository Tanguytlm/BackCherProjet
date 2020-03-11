package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProjetPropose {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String nom;
	private String descriptif;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private int	nbrParticipants;
	@ManyToOne
	private Entreprise entreprise;
	@ManyToOne
	private Particulier particulier;
	private String commentaire;
	private int statut;
	
	public ProjetPropose(String nom, String descriptif, Date dateDebut, Date dateFin,
			int nbrParticipants, Entreprise entreprise, Particulier particulier, String commentaire, int statut) {
		super();
		this.nom = nom;
		this.descriptif = descriptif;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbrParticipants = nbrParticipants;
		this.entreprise = entreprise;
		this.particulier = particulier;
		this.commentaire = commentaire;
		this.statut = statut;
	}
	public Particulier getParticulier() {
		return particulier;
	}
	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getNbrParticipants() {
		return nbrParticipants;
	}
	public void setNbrParticipants(int nbrParticipants) {
		this.nbrParticipants = nbrParticipants;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}

	public ProjetPropose() {
		super();
	}
	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", nom=" + nom + ", descriptif=" + descriptif + ", dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + ", nbrParticipants=" + nbrParticipants + ", entreprise="
				+ entreprise + ", commentairet=" + commentaire + ", statut=" + statut + "]";
	}
	
}