package fr.solutec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.EtapeProjet;

@RestController @CrossOrigin("*")
public interface EtapeProjetRepositary extends CrudRepository<EtapeProjet, Long>{
public List<EtapeProjet> findByProjetIdProjet(Long id);
}
