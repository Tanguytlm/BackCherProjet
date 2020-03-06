package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Long> {
	public Optional<Entreprise> findByMailAndMdp(String mail,String mdp);
}
