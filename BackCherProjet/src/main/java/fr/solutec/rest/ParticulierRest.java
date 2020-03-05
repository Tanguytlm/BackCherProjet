package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.ParticulierRepository;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.Particulier;

@RestController @CrossOrigin("*")
public class ParticulierRest {
	
	@Autowired
	private ParticulierRepository particulierRepo;
	
	@RequestMapping(value = "/particulier", method=RequestMethod.GET)
	public List<Particulier> getAll(){
		return (List<Particulier>) particulierRepo.findAll();
		
	}
	
	@RequestMapping(value = "/particulier", method=RequestMethod.POST)
	public Particulier saveParticulier(@RequestBody Particulier p) {
		return particulierRepo.save(p);
		
	}
	@RequestMapping(value = "/particuliers", method = RequestMethod.POST)
	public Particulier getConnexion(@RequestBody Particulier p) {
		Optional<Particulier> particulier  = particulierRepo.findByMailAndMdp(p.getMail(), p.getMdp());
		Particulier pa = new Particulier();
		if(particulier.isPresent()) {
			pa = particulier.get();
			pa.setMdp("");
		}
		return pa;
	}
	
}
