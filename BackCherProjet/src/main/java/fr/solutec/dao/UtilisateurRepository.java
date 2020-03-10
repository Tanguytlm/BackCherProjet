package fr.solutec.dao;

import java.awt.Image;

import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long>{
	
}
