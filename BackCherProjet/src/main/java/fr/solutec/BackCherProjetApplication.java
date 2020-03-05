package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.dao.ParticulierRepository;
import fr.solutec.dao.UtilisateurRepository;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.Particulier;

@SpringBootApplication
public class BackCherProjetApplication implements CommandLineRunner{

	@Autowired
	private ParticulierRepository particulierRepo;
	private EntrepriseRepository entrepriseRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BackCherProjetApplication.class, args);
		System.out.println("finishhhhhhhhhhhhhhhhhhhhhhhhhh");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		Particulier p1= new Particulier("monMail@serveur.com","monMotDePasse",1,"monNom","monPrenom",15,null,null,null);
		particulierRepo.save(p1);
		Entreprise e1= new Entreprise("mailEntreprise","motDePasseEntreprise",0,"nomEntreprise","la crêpe","adresseEntreprise",75000,"0652145654",null,"maDescription");
		entrepriseRepo.save(e1);
		
	}

}
