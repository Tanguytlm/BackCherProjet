package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineProjet;

public interface DomaineProjetRepository extends CrudRepository<DomaineProjet, Long> {
	public List<DomaineProjet> findByProjetIdProjet(Long id);

	public List<DomaineProjet> findByDomaineIdDomaine(Long id);
}
