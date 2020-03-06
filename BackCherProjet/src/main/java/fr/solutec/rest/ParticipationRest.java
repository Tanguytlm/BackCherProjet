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
import fr.solutec.entities.ParticipationProjet;

@RestController @CrossOrigin("*")
public class ParticipationRest {
	@Autowired
	private ParticipationRepository participationRepo;
	
	@RequestMapping(value = "/participation", method=RequestMethod.POST)
	public ParticipationProjet saveParticipation(@RequestBody ParticipationProjet p) {
		return participationRepo.save(p);
	}
	
	@RequestMapping(value = "/participation", method=RequestMethod.GET)
	public List<ParticipationProjet> getAll(){
		
		return (List<ParticipationProjet>) participationRepo.findAll();
	}
	
	@RequestMapping(value = "participation/entreprise/{id}", method = RequestMethod.GET)
	public Optional<ParticipationProjet> getParticipationEntreprise(@PathVariable Long id){
		return participationRepo.findByEntrepriseIdUtilisateur(id);}
	
	@RequestMapping(value = "participation/particulier/{id}", method = RequestMethod.GET)
	public Optional<ParticipationProjet> getParticipationParticulier(@PathVariable Long id){
		return participationRepo.findByParticulierIdUtilisateur(id);}
	
	@RequestMapping(value = "participation/projet/{id}", method = RequestMethod.GET)
	public Optional<ParticipationProjet> getParticipationProjet(@PathVariable Long id){
		return participationRepo.findByProjetIdProjet(id);}
	
}
