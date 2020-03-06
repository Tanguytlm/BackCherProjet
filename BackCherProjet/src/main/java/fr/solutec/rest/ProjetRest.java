package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.ProjetRepository;
import fr.solutec.entities.Projet;
@RestController @CrossOrigin("*")
public class ProjetRest {
	@Autowired
	private ProjetRepository projetRepo;
	
	@RequestMapping(value = "/projet", method = RequestMethod.POST)
	public Projet saveProjet (@RequestBody Projet p) {
		return projetRepo.save(p);}
	
	@RequestMapping(value = "/projet", method = RequestMethod.GET)
	public List<Projet> getAll(){
		return (List<Projet>) projetRepo.findAll();
	}
	
}
