package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DomaineParticulier {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Domaine domaine;
	@ManyToOne
	private Particulier particulier;
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
	public Particulier getParticulier() {
		return particulier;
	}
	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}
	@Override
	public String toString() {
		return "DomaineParticulier [id=" + id + ", domaine=" + domaine + ", particulier=" + particulier + "]";
	}
	public DomaineParticulier() {
		super();
	}
	public DomaineParticulier(Domaine domaine, Particulier particulier) {
		super();
		this.domaine = domaine;
		this.particulier = particulier;
	}
	
}
