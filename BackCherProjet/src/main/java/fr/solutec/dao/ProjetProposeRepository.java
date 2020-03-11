package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Participation;
import fr.solutec.entities.Projet;
import fr.solutec.entities.ProjetPropose;

@RestController @CrossOrigin("*")
public interface ProjetProposeRepository extends CrudRepository<ProjetPropose, Long>{
	public List<ProjetPropose> findByStatut(int statut);
	public List<ProjetPropose> findByParticulierIdUtilisateurAndStatut(Long id,int statut);
	public List<ProjetPropose> findByEntrepriseIdUtilisateur(Long id);
	public Optional<ProjetPropose> findById(Long id);
}
