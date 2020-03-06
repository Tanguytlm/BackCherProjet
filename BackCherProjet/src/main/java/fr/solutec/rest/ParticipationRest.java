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

import fr.solutec.dao.ParticipationRepository;
import fr.solutec.entities.Participation;

@RestController @CrossOrigin("*")
public class ParticipationRest {
	@Autowired
	private ParticipationRepository participationRepo;
	
	@RequestMapping(value = "/participation", method=RequestMethod.POST)
	public Participation saveParticipation(@RequestBody Participation p) {
		return participationRepo.save(p);
	}
	
	@RequestMapping(value = "/participation", method=RequestMethod.GET)
	public List<Participation> getAll(){
		
		return (List<Participation>) participationRepo.findAll();
	}
	
	@RequestMapping(value = "participation/entreprise/{id}", method = RequestMethod.GET)
	public List<Participation> getParticipationEntreprise(@PathVariable Long id){
		return  (List<Participation>) participationRepo.findByEntrepriseIdUtilisateur(id);}
	
	@RequestMapping(value = "participation/entreprise/{id}/{statut}", method = RequestMethod.GET)
	public List<Participation> getParticipationEntrepriseStatut(@PathVariable Long id,@PathVariable int statut){
		return (List<Participation>) participationRepo.findByEntrepriseIdUtilisateurAndProjetStatut(id,statut);}
	
	@RequestMapping(value = "participation/particulier/{id}/{statut}", method = RequestMethod.GET)
	public List<Participation> getParticipationParticulierStatut(@PathVariable Long id,@PathVariable int statut){
		return (List<Participation>) participationRepo.findByParticulierIdUtilisateurAndProjetStatut(id,statut);}
	
	@RequestMapping(value = "participation/particulier/{id}", method = RequestMethod.GET)
	public List<Participation> getParticipationParticulier(@PathVariable Long id){
		return (List<Participation>) participationRepo.findByParticulierIdUtilisateur(id);}
	
	@RequestMapping(value = "participation/projet/{id}", method = RequestMethod.GET)
	public List<Participation> getParticipationProjet(@PathVariable Long id){
		return (List<Participation>) participationRepo.findByProjetIdProjet(id);}
	
}
