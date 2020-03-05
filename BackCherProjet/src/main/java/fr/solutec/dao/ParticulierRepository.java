package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Particulier;

public interface ParticulierRepository extends CrudRepository<Particulier, Long> {

}
