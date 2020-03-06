package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineProjet;

public interface DomaineProjetRepository extends CrudRepository<DomaineProjet,Long> {
	public Optional<DomaineProjet> findByProjetIdProjet(Long id);
	public Optional<DomaineProjet> findByDomaineIdDomaine(Long id);
}