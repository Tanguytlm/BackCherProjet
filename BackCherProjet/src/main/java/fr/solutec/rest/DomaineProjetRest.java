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

import fr.solutec.dao.DomaineProjetRepository;
import fr.solutec.entities.DomaineProjet;

@RestController @CrossOrigin("*")
public class DomaineProjetRest {
	@Autowired
	private DomaineProjetRepository DPrR;
	
	@RequestMapping(value = "/domaineProjet", method=RequestMethod.GET)
	public List<DomaineProjet> getAll(){
		
		return (List<DomaineProjet>) DPrR.findAll();
	}
	
	@RequestMapping(value = "/domaineProjet", method=RequestMethod.POST)
	public DomaineProjet saveDomaineProjet(@RequestBody DomaineProjet p) {
		return DPrR.save(p);
	}
	
	@RequestMapping(value = "domaineProjet/{id}", method = RequestMethod.GET)
	public List<DomaineProjet> getDomaineProjet(@PathVariable Long id){
		return (List<DomaineProjet>) DPrR.findByProjetIdProjet(id);}
	
	@RequestMapping(value = "projetDomaine/{id}", method = RequestMethod.GET)
	public List<DomaineProjet> getProjetDomaine(@PathVariable Long id){
		return (List<DomaineProjet>) DPrR.findByDomaineIdDomaine(id);}
}
