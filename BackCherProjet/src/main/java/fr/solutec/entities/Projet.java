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
public class Projet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String nom;
	private String descriptif;
	private String secteur;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private int	nbrParticipants;
	@ManyToOne
	private Entreprise entreprise;
	private String interessement;
	private int statut;
	
}
