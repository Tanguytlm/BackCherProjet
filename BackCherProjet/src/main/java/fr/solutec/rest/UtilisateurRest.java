package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.UtilisateurRepository;
import fr.solutec.entities.Utilisateur;

@ RestController @CrossOrigin("*")
public class UtilisateurRest {
	@Autowired
	private UtilisateurRepository utilisateurRepo;
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public Utilisateur getConnexion(@RequestBody Utilisateur p) {
		Optional<Utilisateur> utilisateur = utilisateurRepo.findByMailAndMdp(p.getMail(), p.getMdp());
		Utilisateur pe = new Utilisateur();
		if(utilisateur.isPresent()) {
			pe = utilisateur.get();
			pe.setMdp("");
		}
		return pe;
	}
	
}
