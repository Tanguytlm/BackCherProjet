package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DomaineProjetPropose {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Domaine domaine;
	@ManyToOne
	private ProjetPropose projetPropose;
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
	public ProjetPropose getProjetPropose() {
		return projetPropose;
	}
	public void setProjetPropose(ProjetPropose projetPropose) {
		this.projetPropose = projetPropose;
	}
	@Override
	public String toString() {
		return "DomaineProjetPropose [domaine=" + domaine + ", projetPropose=" + projetPropose + "]";
	}
	public DomaineProjetPropose() {
		super();
	}
	public DomaineProjetPropose(Domaine domaine, ProjetPropose projetPropose) {
		super();
		this.domaine = domaine;
		this.projetPropose = projetPropose;
	}

	
	
}
