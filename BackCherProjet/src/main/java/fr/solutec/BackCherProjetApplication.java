package fr.solutec;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.dao.DemandeParticipationRepository;
import fr.solutec.dao.DomaineEntrepriseRepository;
import fr.solutec.dao.DomaineParticulierRepository;
import fr.solutec.dao.DomaineProjetRepository;
import fr.solutec.dao.DomaineRepository;
import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.dao.EtapeProjetRepositary;
import fr.solutec.dao.MessagesRepository;
import fr.solutec.dao.ParticipationRepository;
import fr.solutec.dao.ParticulierRepository;
import fr.solutec.dao.ProjetRepository;
import fr.solutec.entities.DemandeParticipation;
import fr.solutec.entities.Domaine;
import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineParticulier;
import fr.solutec.entities.DomaineProjet;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.EtapeProjet;
import fr.solutec.entities.Messages;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Particulier;
import fr.solutec.entities.Projet;

@SpringBootApplication
public class BackCherProjetApplication implements CommandLineRunner {

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
	@Autowired
	private DomaineParticulierRepository DPaR;
	@Autowired
	private DomaineEntrepriseRepository DER;
	@Autowired
	private DomaineProjetRepository DPrR;
	@Autowired
	private DemandeParticipationRepository DPR;
	@Autowired
	private EtapeProjetRepositary EPR;
	@Autowired
	private MessagesRepository messagesRepo;

	public static void main(String[] args) {
		SpringApplication.run(BackCherProjetApplication.class, args);
		
	
		
		System.out.println("finishhhhhhhhhhhhhhhhhhhhhhhhhh");

	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		Domaine d1 =new Domaine("Agriculture, agroalimentaire");
		Domaine d2 =new Domaine("Armée, sécurité");
		Domaine d3 =new Domaine("Art, Design");
		Domaine d4 =new Domaine("Audiovisuel, Spectacle, Cinéma");
		Domaine d5 =new Domaine("Audit, Conseil, Expertise");
		Domaine d6 =new Domaine("Automobile");
		Domaine d7 =new Domaine("Banque, Assurance");
		Domaine d8 =new Domaine("BTP, architecture");
		Domaine d9 =new Domaine("Chimie, pharmacie");
		Domaine d10 =new Domaine("Commerce, distribution, e-commerce");
		Domaine d11 =new Domaine("Construction aéronautique, ferroviaire et navale");
		Domaine d12 =new Domaine("Culture, Artisanat d'art");
		Domaine d13 =new Domaine("Droit, justice");
		Domaine d14 =new Domaine("Edition, Journalisme");
		Domaine d15 =new Domaine("Electronique, Electrotechnique");
		Domaine d16 =new Domaine("Energie");
		Domaine d17 =new Domaine("Enseignement");
		Domaine d18 =new Domaine("Environnement");
		Domaine d19 =new Domaine("Fonction publique");
		Domaine d20 =new Domaine("Habillement, Mode");
		Domaine d21 =new Domaine("Hôtellerie, Restauration, Tourisme");
		Domaine d22 =new Domaine("Informatique, Numérique et Réseaux");
		Domaine d23 =new Domaine("Logistique, transport");
		Domaine d24 =new Domaine("Maintenance, entretien");
		Domaine d25 =new Domaine("Marketing, publicité, Communication");
		Domaine d26 =new Domaine("Matériaux, Transformations");
		Domaine d27 =new Domaine("Mécanique");
		Domaine d28 =new Domaine("Santé, médical");
		Domaine d29 =new Domaine("Social, Services à la personne");
		Domaine d30 =new Domaine("Sport et loisirs");
		domaineRepo.save(d1);
		domaineRepo.save(d2);
		domaineRepo.save(d3);
		domaineRepo.save(d4);
		domaineRepo.save(d5);
		domaineRepo.save(d6);
		domaineRepo.save(d7);
		domaineRepo.save(d8);
		domaineRepo.save(d9);
		domaineRepo.save(d10);
		domaineRepo.save(d11);
		domaineRepo.save(d12);
		domaineRepo.save(d13);
		domaineRepo.save(d14);
		domaineRepo.save(d15);
		domaineRepo.save(d16);
		domaineRepo.save(d17);
		domaineRepo.save(d18);
		domaineRepo.save(d19);
		domaineRepo.save(d20);
		domaineRepo.save(d21);
		domaineRepo.save(d22);
		domaineRepo.save(d23);
		domaineRepo.save(d24);
		domaineRepo.save(d25);
		domaineRepo.save(d26);
		domaineRepo.save(d27);
		domaineRepo.save(d28);
		domaineRepo.save(d29);
		domaineRepo.save(d30);


		
		Particulier p1= new Particulier("p","p",1,null,"monNom","monPrenom",d.parse("27/09/1996"),null);
		particulierRepo.save(p1);
		
		Entreprise e1= new Entreprise("e","e",0,null,"nomEntreprise","adresseEntreprise",75000,"0652145654","maDescription","monsite.com",2010,"moins de 15 employés");
		entrepriseRepo.save(e1);
		
		Projet pr1 = new Projet("nom","descriptif",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",0);
		projetRepo.save(pr1);
		
		Participation pa1= new Participation(p1,e1,pr1);
		participationRepo.save(pa1);
		
		DomaineEntreprise de1= new DomaineEntreprise(d1,e1);
		DER.save(de1);
		DomaineParticulier dpa1= new DomaineParticulier(d1,p1);
		DPaR.save(dpa1);
		DomaineProjet dpr1= new DomaineProjet(d1,pr1);
		DPrR.save(dpr1);
		
		DemandeParticipation dp1=new DemandeParticipation(p1,pr1);
		DPR.save(dp1);
		
		Projet proj1 = new Projet("Etude de marché aux puces","descriptif du premeier projet",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",0);
		Projet proj2 = new Projet("Construire des avions en carton","descriptif du deuxieme projet ",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",2);
		Projet proj3 = new Projet("Manger des sauterelles au repas de midi","descriptif du troisieme rpoejt kjdsfqsdfqsd",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",0);
		Projet proj4 = new Projet("Développer une nouvelle gamme de produit pour vaches","descriptif du Quatrième et dernier projet",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",0);
		Projet proj5 = new Projet("Concours de lancer de marteaux","descriptif de la competition de lancer",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",1);
		projetRepo.save(proj1);
		projetRepo.save(proj2);
		projetRepo.save(proj3);
		projetRepo.save(proj4);
		projetRepo.save(proj5);

		EtapeProjet ep1 = new EtapeProjet(d.parse("14/07/2018"), d.parse("14/09/2018"), "Etape test", "description test", proj1);
		EPR.save(ep1);
		EtapeProjet ep2 = new EtapeProjet(d.parse("14/03/2020"), d.parse("17/03/2020"), "Etape test", "description test", proj2);
		EPR.save(ep2);
		EtapeProjet ep3 = new EtapeProjet(d.parse("14/03/2020"), d.parse("15/03/2020"), "Etape test", "description test", proj2);
		EPR.save(ep3);
		EtapeProjet ep4 = new EtapeProjet(d.parse("22/03/2020"), d.parse("27/03/2020"), "Etape test", "description test", proj2);
		EPR.save(ep4);
		
		Messages mes1 = new Messages(proj2, null, p1, null, null, "ceci est un message d'un particulier à un projet !");
		messagesRepo.save(mes1);
		Messages mes2 = new Messages(null, null, p1, e1, null, "ceci est un message d'un particulier à une entreprise !");
		messagesRepo.save(mes2);
		
		
		
}
}
