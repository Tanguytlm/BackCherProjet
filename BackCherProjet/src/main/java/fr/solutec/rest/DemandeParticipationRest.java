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
	
	@RequestMapping(value = "demandeParticipation/particulier/{id}/{statut}", method = RequestMethod.GET)
	public List<DemandeParticipation> getDemandeParticipationParticulierStatut(@PathVariable Long id,@PathVariable int statut){
		return (List<DemandeParticipation>) demandeParticipationRepo.findByParticulierIdUtilisateurAndProjetStatut(id,statut);}
	
	@RequestMapping(value = "demandeParticipation/entreprise/{identreprise}/{idprojet}", method = RequestMethod.GET)
	public List<DemandeParticipation> getDemandeParticipationEntreprise(@PathVariable Long identreprise,@PathVariable Long idprojet){
		return (List<DemandeParticipation>) demandeParticipationRepo.findByProjetEntrepriseIdUtilisateurAndProjetIdProjet(identreprise,idprojet);}
	
	@RequestMapping(value = "demandeParticipation/particulier/{id}", method = RequestMethod.GET)
	public List<DemandeParticipation> getDemandeParticipationParticulier(@PathVariable Long id){
		return (List<DemandeParticipation>) demandeParticipationRepo.findByParticulierIdUtilisateur(id);}
	
	@RequestMapping(value = "demandeParticipation/projet/{id}", method = RequestMethod.GET)
	public List<DemandeParticipation> getDemandeParticipationProjet(@PathVariable Long id){
		return (List<DemandeParticipation>) demandeParticipationRepo.findByProjetIdProjet(id);}
	
	@RequestMapping(value = "/demandeParticipation/{id}", method = RequestMethod.DELETE)
	public boolean deleteDemandeParticipation(@PathVariable Long id){
		demandeParticipationRepo.deleteById(id);
		return true; }
}
