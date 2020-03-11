package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Messages;

public interface MessagesRepository extends CrudRepository<Messages, Long> {

}
