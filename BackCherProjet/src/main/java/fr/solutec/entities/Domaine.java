package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Domaine {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDomaine;
	private String domaine;
	public Long getIdDomaine() {
		return idDomaine;
	}
	public void setIdDomaine(Long idDomaine) {
		this.idDomaine = idDomaine;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	@Override
	public String toString() {
		return "Domaine [idDomaine=" + idDomaine + ", domaine=" + domaine + "]";
	}
	public Domaine(String domaine) {
		super();
		this.domaine = domaine;
	}
	public Domaine() {
		super();
	}
	
}
