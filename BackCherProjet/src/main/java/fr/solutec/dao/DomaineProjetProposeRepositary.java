package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.DomaineProjetPropose;

public interface DomaineProjetProposeRepositary extends CrudRepository<DomaineProjetPropose, Long> {
	public Optional<DomaineProjetPropose> findByProjetProposeIdProjet(Long id);
	public List<DomaineProjetPropose> findByDomaineIdDomaine(Long id);
}
