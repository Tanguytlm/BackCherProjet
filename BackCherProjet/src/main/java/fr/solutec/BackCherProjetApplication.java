package fr.solutec;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.dao.DomaineRepository;
import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.dao.ParticipationRepository;
import fr.solutec.dao.ParticulierRepository;
import fr.solutec.dao.ProjetRepository;
import fr.solutec.dao.UtilisateurRepository;
import fr.solutec.entities.Domaine;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.ParticipationProjet;
import fr.solutec.entities.Particulier;
import fr.solutec.entities.Projet;

@SpringBootApplication
public class BackCherProjetApplication implements CommandLineRunner{

	@Autowired
	private ParticulierRepository particulierRepo;
	@Autowired
	private EntrepriseRepository entrepriseRepo;
	@Autowired
	private ProjetRepository projetRepo;
	@Autowired
	private ParticipationRepository participationRepo;
	@Autowired
	private DomaineRepository domaineRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BackCherProjetApplication.class, args);
		
	
		
		System.out.println("finishhhhhhhhhhhhhhhhhhhhhhhhhh");

	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		Domaine d1= new Domaine("BTP");
		domaineRepo.save(d1);
		
		 Particulier p1= new Particulier("monMail@serveur.com","monMotDePasse",1,"monNom","monPrenom",15,null,null);
		particulierRepo.save(p1);
		
		Entreprise e1= new Entreprise("mailEntreprise","motDePasseEntreprise",0,"nomEntreprise","adresseEntreprise",75000,"0652145654",null,"maDescription");
		entrepriseRepo.save(e1);
		
		Projet pr1 = new Projet("nom","descriptif",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",1);
		projetRepo.save(pr1);
		
		ParticipationProjet pa1= new ParticipationProjet(p1,e1,pr1);
		participationRepo.save(pa1);
		
		
}}
