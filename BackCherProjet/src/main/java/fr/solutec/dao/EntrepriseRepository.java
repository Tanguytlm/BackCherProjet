package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Long> {

}
