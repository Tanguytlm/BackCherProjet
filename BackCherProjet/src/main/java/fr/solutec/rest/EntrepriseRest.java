package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.entities.Entreprise;


@RestController @CrossOrigin("*")
public class EntrepriseRest {
	
	@Autowired
	private EntrepriseRepository entrepriseRepo;
	
	@RequestMapping(value = "/entreprise", method=RequestMethod.GET)
	public List<Entreprise> getAll(){
		
		return (List<Entreprise>) entrepriseRepo.findAll();
		
	}
	
	@RequestMapping(value = "/entreprise", method=RequestMethod.POST)
	public Entreprise saveEntreprise(@RequestBody Entreprise e) {
		return entrepriseRepo.save(e);
		
	}

}
