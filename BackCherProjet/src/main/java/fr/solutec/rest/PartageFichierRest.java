package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.PartageFichierRepository;
import fr.solutec.entities.PartageFichier;

@RestController
@CrossOrigin("*")
public class PartageFichierRest {
	
	@Autowired
	private PartageFichierRepository PartageFichierRepo;
	
	@RequestMapping(value = "partageFichier/projet/{id}", method = RequestMethod.GET)
	public List<PartageFichier> getPartageFichierProjet(@PathVariable Long id){
		return (List<PartageFichier>) PartageFichierRepo.findByProjetIdProjet(id);}
	
	@RequestMapping(value = "/partageFichier", method=RequestMethod.POST)
	public PartageFichier savePartageFichier(@RequestBody PartageFichier pf) {
		return PartageFichierRepo.save(pf);
	}
	
	@RequestMapping(value = "/partageFichier/{id}", method = RequestMethod.DELETE)
	public boolean deletePartageFichier(@PathVariable Long id){
		PartageFichierRepo.deleteById(id);
		return true; }

}
