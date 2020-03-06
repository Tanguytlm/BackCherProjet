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

import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.Particulier;


@RestController @CrossOrigin("*")
public class EntrepriseRest {
	
	@Autowired
	private EntrepriseRepository entrepriseRepo;
	
	@RequestMapping(value = "/entreprise", method=RequestMethod.GET)
	public List<Entreprise> getAll(){
		
		return (List<Entreprise>) entrepriseRepo.findAll();
		
	}
	
	@RequestMapping(value = "/entreprise", method=RequestMethod.POST)
	public Boolean saveEntreprise(@RequestBody Entreprise e) {
		Optional<Entreprise> entreprise  = entrepriseRepo.findByMailAndMdp(e.getMail(), e.getMdp());
		
		Entreprise ent = new Entreprise();
		
		if (entreprise.isPresent()) {
	

			return false;
		}else {
			entrepriseRepo.save(e);	
			return true;
		}	
		
	}
	
	@RequestMapping(value = "/entreprise/{id}", method = RequestMethod.PUT)
	public Entreprise editEntreprise (@RequestBody Entreprise e, @PathVariable Long id) {
		e.setIdUtilisateur(id);
		return entrepriseRepo.save(e);
	}
	
	@RequestMapping(value = "/entreprise/{id}", method = RequestMethod.GET)
	public Optional<Entreprise> getEntreprise(@PathVariable Long id){
		return entrepriseRepo.findById(id);}
	
	@RequestMapping(value = "/entreprise/{id}", method = RequestMethod.DELETE)
	public boolean deleteEntreprise(@PathVariable Long id){
		entrepriseRepo.deleteById(id);
		return true; }
	
	@RequestMapping(value = "/entreprises", method = RequestMethod.POST)
	public Entreprise getConnexion(@RequestBody Entreprise e) {
		Optional<Entreprise> entreprise  = entrepriseRepo.findByMailAndMdp(e.getMail(), e.getMdp());
		Entreprise en = new Entreprise();
		if(entreprise.isPresent()) {
			en = entreprise.get();
			en.setMdp("");
		}
		return en;
	}
}
