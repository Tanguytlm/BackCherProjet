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

import fr.solutec.dao.DemandeParticipationRepository;
import fr.solutec.dao.ParticipationRepository;
import fr.solutec.entities.DemandeParticipation;
import fr.solutec.entities.Participation;

@RestController @CrossOrigin("*")
public class DemandeParticipationRest {
	@Autowired
	private DemandeParticipationRepository demandeParticipationRepo;
	
	@RequestMapping(value = "/demandeParticipation", method=RequestMethod.POST)
	public DemandeParticipation saveDemandeParticipation(@RequestBody DemandeParticipation dp) {
		return demandeParticipationRepo.save(dp);
	}
	
	@RequestMapping(value = "/demandeParticipation", method=RequestMethod.GET)
	public List<DemandeParticipation> getAll(){
		
		return (List<DemandeParticipation>) demandeParticipationRepo.findAll();
	}
	
	@RequestMapping(value = "demandeParticipation/entreprise/{id}", method = RequestMethod.GET)
	public Optional<DemandeParticipation> getDemandeParticipationEntreprise(@PathVariable Long id){
		return demandeParticipationRepo.findByEntrepriseIdUtilisateur(id);}
}