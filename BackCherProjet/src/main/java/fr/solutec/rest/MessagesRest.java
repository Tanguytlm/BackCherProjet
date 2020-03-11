package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.MessagesRepository;
import fr.solutec.entities.Messages;

@RestController @CrossOrigin("*")
public class MessagesRest {
	@Autowired
	private MessagesRepository MessagesRepo;
	
	@RequestMapping(value = "/messages", method=RequestMethod.POST)
	public Messages saveMessages(@RequestBody Messages m) {
		return MessagesRepo.save(m);
	}
	
	@RequestMapping(value = "/messages/{id}", method = RequestMethod.DELETE)
	public boolean deleteMessages(@PathVariable Long id){
		MessagesRepo.deleteById(id);
		return true; }
	
	@RequestMapping(value = "/messages", method=RequestMethod.GET)
	public List<Messages> getAll(){
		
		return (List<Messages>) MessagesRepo.findAll();
	}
	
	@RequestMapping(value = "messages/{id}", method = RequestMethod.GET)
	public Optional<Messages> getMessages(@PathVariable Long id){
		return MessagesRepo.findById(id);}
	
	@RequestMapping(value = "messages/projet/{id}", method = RequestMethod.GET)
	public List<Messages> getMessagesProjet(@PathVariable Long id){
		return (List<Messages>) MessagesRepo.findByProjetIdProjet(id);}
	
	@RequestMapping(value = "messages/auteurE/{id}", method = RequestMethod.GET)
	public List<Messages> getMessagesAuteurE(@PathVariable Long id){
		return (List<Messages>) MessagesRepo.findByAuteurEIdUtilisateur(id);}
	
	@RequestMapping(value = "messages/auteurP/{id}", method = RequestMethod.GET)
	public List<Messages> getMessagesAuteurP(@PathVariable Long id){
		return (List<Messages>) MessagesRepo.findByAuteurPIdUtilisateur(id);}
	
	@RequestMapping(value = "messages/destinataireP/{id}", method = RequestMethod.GET)
	public List<Messages> getMessagesDestinataireP(@PathVariable Long id){
		return (List<Messages>) MessagesRepo.findByDestinatairePIdUtilisateur(id);}
	
	@RequestMapping(value = "messages/destinataireE/{id}", method = RequestMethod.GET)
	public List<Messages> getMessagesDestinataireE(@PathVariable Long id){
		return (List<Messages>) MessagesRepo.findByDestinataireEIdUtilisateur(id);}
	
	
}
