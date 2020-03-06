package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.ParticipationProjet;


public interface ParticipationRepository extends CrudRepository<ParticipationProjet, Long> {
	public Optional<ParticipationProjet> findByProjetIdProjet(Long id);
	public Optional<ParticipationProjet> findByEntrepriseIdUtilisateur(Long id);
	public Optional<ParticipationProjet> findByParticulierIdUtilisateur(Long id);
	public Optional<ParticipationProjet> findByParticulierIdUtilisateurAndProjetStatut(Long id,int statut);
	public Optional<ParticipationProjet> findByEntrepriseIdUtilisateurAndProjetStatut(Long id,int statut);
}
