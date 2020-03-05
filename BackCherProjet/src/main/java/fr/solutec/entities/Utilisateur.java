package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	@Column(unique = true)
	private String mail;
	private String mdp;
	private int statut;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", mail=" + mail + ", mdp=" + mdp + ", statut=" + statut
				+ "]";
	}
	public Utilisateur(String mail, String mdp, int statut) {
		super();
		this.mail = mail;
		this.mdp = mdp;
		this.statut = statut;
	}
	public Utilisateur() {
		super();
	}
	
	
	
}
