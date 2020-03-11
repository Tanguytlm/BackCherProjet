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

import fr.solutec.dao.DomaineProjetProposeRepositary;
import fr.solutec.entities.DomaineProjet;
import fr.solutec.entities.DomaineProjetPropose;

@RestController @CrossOrigin("*")
public class DomaineProjetProposeRest {
	@Autowired
	private DomaineProjetProposeRepositary DPPR;
	
	@RequestMapping(value = "/domaineProjetPropose", method=RequestMethod.GET)
	public List<DomaineProjetPropose> getAll(){
		
		return (List<DomaineProjetPropose>) DPPR.findAll();
	}
	
	@RequestMapping(value = "/domaineProjetPropose", method=RequestMethod.POST)
	public DomaineProjetPropose saveDomaineProjetPropose(@RequestBody DomaineProjetPropose p) {
		return DPPR.save(p);
	}
	
	@RequestMapping(value = "domaineProjetPropose/{id}", method = RequestMethod.GET)
	public Optional<DomaineProjetPropose> getDomaineProjetPropose(@PathVariable Long id){
		return DPPR.findByProjetProposeIdProjet(id);}
	
	@RequestMapping(value = "projetDomainePropose/{id}", method = RequestMethod.GET)
	public List<DomaineProjetPropose> getProjetProposeDomaine(@PathVariable Long id){
		return (List<DomaineProjetPropose>) DPPR.findByDomaineIdDomaine(id);}
	
	@RequestMapping(value = "/projetProposeDomaine/{id}", method = RequestMethod.PUT)
	public DomaineProjetPropose editProjetProposeDomaine (@RequestBody DomaineProjetPropose p, @PathVariable Long id) {
		p.setId(DPPR.findByProjetProposeIdProjet(id).get().getId());
		return DPPR.save(p);
}
}
