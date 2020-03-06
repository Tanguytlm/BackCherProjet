package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineParticulier;

public interface DomaineParticulierRepository extends CrudRepository<DomaineParticulier, Long> {
	public Optional<DomaineEntreprise> findByParticulierIdUtilisateur(Long id);
	public Optional<DomaineEntreprise> findByDomaineIdDomaine(Long id);
}
