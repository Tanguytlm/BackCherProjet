package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DomaineEntreprise {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Domaine domaine;
	@ManyToOne
	private Entreprise entreprise;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	@Override
	public String toString() {
		return "DomaineEntreprise [id=" + id + ", domaine=" + domaine + ", entreprise=" + entreprise + "]";
	}
	public DomaineEntreprise(Domaine domaine, Entreprise entreprise) {
		super();
		this.domaine = domaine;
		this.entreprise = entreprise;
	}
	public DomaineEntreprise() {
		super();
	}
	
	
}
