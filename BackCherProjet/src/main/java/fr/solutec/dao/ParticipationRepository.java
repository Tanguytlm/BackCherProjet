package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.ParticipationProjet;


public interface ParticipationRepository extends CrudRepository<ParticipationProjet, Long> {
	public Optional<ParticipationProjet> findByProjetIdProjet(Long id);
	public Optional<ParticipationProjet> findByEntrepriseIdUtilisateur(Long id);
	public Optional<ParticipationProjet> findByParticulierIdUtilisateur(Long id);
}
