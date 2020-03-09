package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Domaine;

public interface DomaineRepository extends CrudRepository<Domaine, Long> {
	public List<Domaine> findByIdDomaine(Long id);
}
