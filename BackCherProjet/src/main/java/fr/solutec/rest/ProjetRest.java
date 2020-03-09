package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.ProjetRepository;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Projet;
@RestController @CrossOrigin("*")
public class ProjetRest {
	@Autowired
	private ProjetRepository projetRepo;
	
	@RequestMapping(value = "/projet", method = RequestMethod.POST)
	public Projet saveProjet (@RequestBody Projet p) {
		return projetRepo.save(p);}
	
	@RequestMapping(value = "/projet", method = RequestMethod.GET)
	public List<Projet> getAll(){
		return (List<Projet>) projetRepo.findAll();
	}
	
	@RequestMapping(value = "/projetPropose", method = RequestMethod.GET)
	public List<Projet> getProjet(){
		return (List<Projet>) projetRepo.findByStatut(0);}
	
	@RequestMapping(value = "/projet/{id}", method = RequestMethod.DELETE)
	public boolean deleteProjet(@PathVariable Long id){
		projetRepo.deleteById(id);
		return true; }
	
	@RequestMapping(value = "/projet/{id}", method = RequestMethod.PUT)
	public Projet editProjet (@RequestBody Projet p, @PathVariable Long id) {
		p.setIdProjet(id);
		return projetRepo.save(p);
	}
	@RequestMapping(value = "projet/entreprise/{id}/{statut}", method = RequestMethod.GET)
	public List<Projet> getParticipationEntrepriseStatut(@PathVariable Long id,@PathVariable int statut){
		return (List<Projet>) projetRepo.findByEntrepriseIdUtilisateurAndStatut(id,statut);}
	
}
