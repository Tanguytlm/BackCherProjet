package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineProjet;

public interface DomaineProjetRepository extends CrudRepository<DomaineProjet,Long> {
	public Optional<DomaineEntreprise> findByProjetIdProjet(Long id);
	public Optional<DomaineEntreprise> findByDomaineIdDomaine(Long id);
}
