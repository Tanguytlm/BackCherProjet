package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineParticulier;

public interface DomaineParticulierRepository extends CrudRepository<DomaineParticulier, Long> {
	public List<DomaineParticulier> findByParticulierIdUtilisateur(Long id);
	public List<DomaineParticulier> findByDomaineIdDomaine(Long id);
}
