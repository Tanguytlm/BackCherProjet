package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Particulier;

public interface ParticulierRepository extends CrudRepository<Particulier, Long> {
	public Optional<Particulier> findByMailAndMdp(String mail,String mdp);
	public Optional<Particulier> findByMail(String mail);

}
