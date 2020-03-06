package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.DemandeParticipation;

public interface DemandeParticipationRepository extends CrudRepository<DemandeParticipation, Long>{
	public List<DemandeParticipation> findByProjetIdProjet(Long id);
	public List<DemandeParticipation> findByEntrepriseIdUtilisateur(Long id);
	public List<DemandeParticipation> findByParticulierIdUtilisateur(Long id);
	public List<DemandeParticipation> findByParticulierIdUtilisateurAndProjetStatut(Long id,int statut);
	public List<DemandeParticipation> findByEntrepriseIdUtilisateurAndProjetStatut(Long id,int statut);
}
