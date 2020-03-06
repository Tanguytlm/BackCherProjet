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

import fr.solutec.dao.DomaineParticulierRepository;
import fr.solutec.entities.DomaineParticulier;

@RestController @CrossOrigin("*")
public class DomaineParticulierRest {
	@Autowired
	private DomaineParticulierRepository DPaR;
	
	@RequestMapping(value = "/domaineParticulier", method=RequestMethod.GET)
	public List<DomaineParticulier> getAll(){
		
		return (List<DomaineParticulier>) DPaR.findAll();
	}
	
	@RequestMapping(value = "/domaineParticulier", method=RequestMethod.POST)
	public DomaineParticulier saveDomaineParticulier(@RequestBody DomaineParticulier p) {
		return DPaR.save(p);
	}
	
	@RequestMapping(value = "domaineParticulier/{id}", method = RequestMethod.GET)
	public List<DomaineParticulier> getDomaineParticulier(@PathVariable Long id){
		return (List<DomaineParticulier>) DPaR.findByParticulierIdUtilisateur(id);}
	
	@RequestMapping(value = "particulierDomaine/{id}", method = RequestMethod.GET)
	public List<DomaineParticulier> getParticulierDomaine(@PathVariable Long id){
		return (List<DomaineParticulier>) DPaR.findByDomaineIdDomaine(id);}
}
