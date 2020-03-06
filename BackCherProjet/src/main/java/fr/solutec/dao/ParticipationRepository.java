package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Participation;


public interface ParticipationRepository extends CrudRepository<Participation, Long> {
	public List<Participation> findByProjetIdProjet(Long id);
	public List<Participation> findByEntrepriseIdUtilisateur(Long id);
	public List<Participation> findByParticulierIdUtilisateur(Long id);
	public List<Participation> findByParticulierIdUtilisateurAndProjetStatut(Long id,int statut);
	public List<Participation> findByEntrepriseIdUtilisateurAndProjetStatut(Long id,int statut);
}
