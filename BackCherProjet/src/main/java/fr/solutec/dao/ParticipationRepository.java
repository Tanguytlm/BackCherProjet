package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Participation;


public interface ParticipationRepository extends CrudRepository<Participation, Long> {
	public Optional<Participation> findByProjetIdProjet(Long id);
	public Optional<Participation> findByEntrepriseIdUtilisateur(Long id);
	public Optional<Participation> findByParticulierIdUtilisateur(Long id);
	public Optional<Participation> findByParticulierIdUtilisateurAndProjetStatut(Long id,int statut);
	public Optional<Participation> findByEntrepriseIdUtilisateurAndProjetStatut(Long id,int statut);
}
