package fr.solutec.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DemandeParticipation;

public interface DemandeParticipationRepository extends CrudRepository<DemandeParticipation, Long>{
	public Optional<DemandeParticipation> findByProjetIdProjet(Long id);
	public Optional<DemandeParticipation> findByEntrepriseIdUtilisateur(Long id);
	public Optional<DemandeParticipation> findByParticulierIdUtilisateur(Long id);
	public Optional<DemandeParticipation> findByParticulierIdUtilisateurAndProjetStatut(Long id,int statut);
	public Optional<DemandeParticipation> findByEntrepriseIdUtilisateurAndProjetStatut(Long id,int statut);
}
