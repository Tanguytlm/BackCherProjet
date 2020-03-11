package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Messages;

public interface MessagesRepository extends CrudRepository<Messages, Long> {
	public List<Messages> findByProjetIdProjet(Long id);
	public List<Messages> findByAuteurEIdUtilisateur(Long id);
	public List<Messages> findByAuteurPIdUtilisateur(Long id);
	public List<Messages> findByDestinatairePIdUtilisateur(Long id);
	public List<Messages> findByDestinataireEIdUtilisateur(Long id);
}
