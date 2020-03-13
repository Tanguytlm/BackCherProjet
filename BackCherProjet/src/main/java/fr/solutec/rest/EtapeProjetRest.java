package fr.solutec.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.EtapeProjetRepositary;
import fr.solutec.entities.EtapeProjet;
import fr.solutec.entities.Particulier;

@RestController @CrossOrigin("*")
public class EtapeProjetRest {
	@Autowired
	private EtapeProjetRepositary EtapeProjetRepo;
	
	@RequestMapping(value = "/etapeProjet/{id}", method = RequestMethod.DELETE)
	public boolean deleteEtapeProjet(@PathVariable Long id){
		EtapeProjetRepo.deleteById(id);
		return true; }
	@RequestMapping(value = "/etapeProjet/{id}", method = RequestMethod.PUT)
	public EtapeProjet editEtapeProjet (@RequestBody EtapeProjet p, @PathVariable Long id) {
		p.setId(id);
		return EtapeProjetRepo.save(p);
	}
	@RequestMapping(value = "/etapeProjet/{id}", method = RequestMethod.GET)
	public Optional<EtapeProjet> getEtapeProjet (@PathVariable Long id) {
		return EtapeProjetRepo.findById(id);
		}
	
	@RequestMapping(value = "/etapeProjet/projet/{id}", method = RequestMethod.GET)
	public List<EtapeProjet> getEtapeProjetProjet (@PathVariable Long id) {
		return (List<EtapeProjet>) EtapeProjetRepo.findByProjetIdProjet(id);
	}
	
	@RequestMapping(value = "/etapeProjet", method = RequestMethod.POST)
	public EtapeProjet saveEtapeProjet(@RequestBody EtapeProjet p) {
		Date dateMax = p.getProjet().getDateFin();
		Date dateMin = p.getProjet().getDateDebut();
		EtapeProjet incorrecte = new EtapeProjet();
		if (p.getDateDebut().after(dateMin) && p.getDateFin().before(dateMax)) {

			return EtapeProjetRepo.save(p);
		} else {
			return incorrecte;
		}

	}
	
	}
