package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Domaine;

public interface DomaineRepository extends CrudRepository<Domaine, Long> {
	public Optional<Domaine> findById(Long id);
}
