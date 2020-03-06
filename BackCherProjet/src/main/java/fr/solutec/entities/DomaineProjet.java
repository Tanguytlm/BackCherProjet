package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DomaineProjet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Domaine domaine;
	@ManyToOne
	private Projet projet;
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
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	@Override
	public String toString() {
		return "DomaineProjet [id=" + id + ", domaine=" + domaine + ", projet=" + projet + "]";
	}
	public DomaineProjet() {
		super();
	}
	public DomaineProjet(Domaine domaine, Projet projet) {
		super();
		this.domaine = domaine;
		this.projet = projet;
	}
	
}
