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

import fr.solutec.dao.ProjetProposeRepository;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.Participation;
import fr.solutec.entities.ProjetPropose;
@RestController @CrossOrigin("*")
public class ProjetProposeRest {
	@Autowired
	private ProjetProposeRepository projetProposeRepo;
	
	@RequestMapping(value = "/ProjetPropose", method = RequestMethod.POST)
	public ProjetPropose saveProjet (@RequestBody ProjetPropose p) {
		return projetProposeRepo.save(p);}
	
	@RequestMapping(value = "/ProjetsProposes", method = RequestMethod.GET)
	public List<ProjetPropose> getAll(){
		return (List<ProjetPropose>) projetProposeRepo.findAll();
	}
	
	@RequestMapping(value = "/ProjetProposeStatut", method = RequestMethod.GET)
	public List<ProjetPropose> getProjet(){
		return (List<ProjetPropose>) projetProposeRepo.findByStatut(0);}
	
	@RequestMapping(value = "/ProjetPropose/{id}", method = RequestMethod.DELETE)
	public boolean deleteProjet(@PathVariable Long id){
		projetProposeRepo.deleteById(id);
		return true; }
	
	@RequestMapping(value = "/ProjetPropose/{id}", method = RequestMethod.PUT)
	public ProjetPropose editProjet (@RequestBody ProjetPropose p, @PathVariable Long id) {
		p.setIdProjet(id);
		return projetProposeRepo.save(p);
			
	}
	@RequestMapping(value = "/ProjetPropose/{id}", method = RequestMethod.GET)
	public Optional<ProjetPropose> getProjet (@PathVariable Long id) {
		return projetProposeRepo.findById(id);
		
	}
	@RequestMapping(value = "ProjetPropose/particulier/{id}/{statut}", method = RequestMethod.GET)
	public List<ProjetPropose> getParticipationEntrepriseStatut(@PathVariable Long id,@PathVariable int statut){
		return (List<ProjetPropose>) projetProposeRepo.findByParticulierIdUtilisateurAndStatut(id,statut);}
	
}
