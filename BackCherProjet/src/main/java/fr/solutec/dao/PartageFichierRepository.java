package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.PartageFichier;

public interface PartageFichierRepository extends CrudRepository<PartageFichier, Long> {
	
	public List<PartageFichier> findByProjetIdProjet(Long id);

}
