package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.ParticulierRepository;
import fr.solutec.entities.Particulier;

@RestController @CrossOrigin("*")
public class ParticulierRest {
	
	@Autowired
	private ParticulierRepository particulierRepo;
	
	@RequestMapping(value = "/particulier", method=RequestMethod.GET)
	public List<Particulier> getAll(){
		return (List<Particulier>) particulierRepo.findAll();
		
		
	}

}
