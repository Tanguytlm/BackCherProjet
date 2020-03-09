package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.DomaineRepository;
import fr.solutec.entities.Domaine;

@RestController @CrossOrigin("*")
public class DomaineRest {
	@Autowired
	private DomaineRepository domaineRepo;
	
	@RequestMapping(value = "/domaine", method=RequestMethod.GET)
	public List<Domaine> getAll(){
		
		return (List<Domaine>) domaineRepo.findAll();
		
	}
	
	@RequestMapping(value = "/domaine/{id}", method = RequestMethod.GET)
	public Optional<Domaine> getDomaine(@PathVariable Long id){
		return domaineRepo.findById(id);}
}
