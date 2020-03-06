package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import fr.solutec.entities.Projet;

@RestController @CrossOrigin("*")
public interface ProjetRepository extends CrudRepository<Projet, Long>{
	public List<Projet> findByStatut(int statut);
}
