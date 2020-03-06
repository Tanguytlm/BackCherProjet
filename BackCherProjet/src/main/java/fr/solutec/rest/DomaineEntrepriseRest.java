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

import fr.solutec.dao.DomaineEntrepriseRepository;
import fr.solutec.entities.DomaineEntreprise;

@RestController @CrossOrigin("*")
public class DomaineEntrepriseRest {
	@Autowired
	private DomaineEntrepriseRepository DER;
	
	@RequestMapping(value = "/domaineEntreprise", method=RequestMethod.GET)
	public List<DomaineEntreprise> getAll(){
		
		return (List<DomaineEntreprise>) DER.findAll();
	}
	
	@RequestMapping(value = "/domaineEntreprise", method=RequestMethod.POST)
	public DomaineEntreprise saveDomaineEntreprise(@RequestBody DomaineEntreprise e) {
		return DER.save(e);
	}
	
	@RequestMapping(value = "domaineEntreprise/{id}", method = RequestMethod.GET)
	public List<DomaineEntreprise> getDomaineEntreprise(@PathVariable Long id){
		return (List<DomaineEntreprise>) DER.findByEntrepriseIdUtilisateur(id);}
	
	@RequestMapping(value = "entrepriseDomaine/{id}", method = RequestMethod.GET)
	public List<DomaineEntreprise> getEntrepriseDomaine(@PathVariable Long id){
		return (List<DomaineEntreprise>) DER.findByDomaineIdDomaine(id);}
	
	
	
}
