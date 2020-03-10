package fr.solutec.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUtilisateur;
	@Column(unique = true)
	private String mail;
	private String mdp;
	private int statut;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] photo;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", mail=" + mail + ", mdp=" + mdp + ", statut=" + statut
				+ "]";
	}
	public Utilisateur(String mail, String mdp, int statut, byte[] photo) {
		super();
		this.mail = mail;
		this.mdp = mdp;
		this.statut = statut;
		this.photo = photo;
	}
	public Utilisateur() {
		super();
	}
	
	
	
}
