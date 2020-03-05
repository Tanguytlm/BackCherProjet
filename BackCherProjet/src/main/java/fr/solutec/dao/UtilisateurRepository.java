package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long>{
}
