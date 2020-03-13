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
import fr.solutec.dao.DomaineProjetProposeRepositary;
import fr.solutec.dao.DomaineProjetRepository;
import fr.solutec.dao.DomaineRepository;
import fr.solutec.dao.EntrepriseRepository;
import fr.solutec.dao.EtapeProjetRepositary;
import fr.solutec.dao.MessagesRepository;
import fr.solutec.dao.ParticipationRepository;
import fr.solutec.dao.ParticulierRepository;
import fr.solutec.dao.ProjetProposeRepository;
import fr.solutec.dao.ProjetRepository;
import fr.solutec.entities.DemandeParticipation;
import fr.solutec.entities.Domaine;
import fr.solutec.entities.DomaineEntreprise;
import fr.solutec.entities.DomaineParticulier;
import fr.solutec.entities.DomaineProjet;
import fr.solutec.entities.DomaineProjetPropose;
import fr.solutec.entities.Entreprise;
import fr.solutec.entities.EtapeProjet;
import fr.solutec.entities.Messages;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Particulier;
import fr.solutec.entities.Projet;
import fr.solutec.entities.ProjetPropose;

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
	private DomaineProjetProposeRepositary DPPR;
	@Autowired
	private DemandeParticipationRepository DPR;
	@Autowired
	private EtapeProjetRepositary EPR;
	@Autowired
	private MessagesRepository messagesRepo;
	@Autowired
	private ProjetProposeRepository PPR;


	public static void main(String[] args) {
		SpringApplication.run(BackCherProjetApplication.class, args);
		
	
		
		System.out.println("finishhhhhhhhhhhhhhhhhhhhhhhhhh");

	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		Domaine d0 =new Domaine("Aucun");
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
		domaineRepo.save(d0);
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
		Entreprise e2= new Entreprise("ez","ez",0,null,"Les laveurs de carreaux de Malakoff","12 rue de Malakoff",75000,"0652145654","maDescription","monsite.com",2010,"moins de 15 employés");
		entrepriseRepo.save(e2);
		Entreprise e3= new Entreprise("ea","ea",0,null,"Le vendeur de tacos d'en face","36 rue de l'esic",75000,"0652145654","maDescription","monsite.com",2010,"moins de 15 employés");
		entrepriseRepo.save(e3);
		
		Projet pr1 = new Projet("nom","descriptif",d.parse("14/07/2018"),d.parse("14/07/2019"),15,e1,"interessement",0);
		projetRepo.save(pr1);
		
		Participation pa1= new Participation(p1,e1,pr1);
		participationRepo.save(pa1);
		
		
		
		DomaineEntreprise de1= new DomaineEntreprise(d1,e1);
		DER.save(de1);
		DomaineEntreprise de2= new DomaineEntreprise(d2,e1);
		DER.save(de2);
		DomaineEntreprise de3= new DomaineEntreprise(d3,e1);
		DER.save(de3);
		DomaineEntreprise de4= new DomaineEntreprise(d0,e1);
		DER.save(de4);
		DomaineEntreprise de5= new DomaineEntreprise(d0,e1);
		DER.save(de5);
		DomaineEntreprise de6= new DomaineEntreprise(d5,e2);
		DER.save(de6);
		
		DomaineParticulier dpa1= new DomaineParticulier(d1,p1);
		DPaR.save(dpa1);
		DomaineParticulier dpa2= new DomaineParticulier(d2,p1);
		DPaR.save(dpa2);
		DomaineParticulier dpa3= new DomaineParticulier(d3,p1);
		DPaR.save(dpa3);
		DomaineParticulier dpa4= new DomaineParticulier(d4,p1);
		DPaR.save(dpa4);
		DomaineParticulier dpa5= new DomaineParticulier(d5,p1);
		DPaR.save(dpa5);
		

		
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
		Messages mes3 = new Messages(null, null, p1, e1, null, "ceci est un message a la meilleure des entreprises!");
		messagesRepo.save(mes3);
		Messages mes4 = new Messages(null, e1, null, null, p1, "ceci est un message a destination du particulier 1!");
		messagesRepo.save(mes4);
		Messages mes5 = new Messages(null, e1,null , null, p1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		messagesRepo.save(mes5);
		Messages mes6 = new Messages(proj2, e1, null, null, null, "ceci est un message d'une entreprise à un projet !");
		messagesRepo.save(mes6);
		
		
		ProjetPropose pp1 = new ProjetPropose("ezqgea", "test", d.parse("22/03/2020"),d.parse("22/04/2020"), 15, e1,p1, "tada", 0);
		PPR.save(pp1);
		DomaineProjetPropose dpp1= new DomaineProjetPropose(d4, pp1);
		DPPR.save(dpp1);
		DomaineProjetPropose dpp2= new DomaineProjetPropose(d5, pp1);
		DPPR.save(dpp2);
		DomaineProjetPropose dpp3= new DomaineProjetPropose(d0, pp1);
		DPPR.save(dpp3);
		DomaineProjetPropose dpp4= new DomaineProjetPropose(d0, pp1);
		DPPR.save(dpp4);
		DomaineProjetPropose dpp5= new DomaineProjetPropose(d0, pp1);
		DPPR.save(dpp5);
		
		DomaineProjet dppp1= new DomaineProjet(d4, proj1);
		DPrR.save(dppp1);
		DomaineProjet dppp2= new DomaineProjet(d5, proj1);
		DPrR.save(dppp2);
		DomaineProjet dppp3= new DomaineProjet(d0, proj1);
		DPrR.save(dppp3);
		DomaineProjet dppp4= new DomaineProjet(d0, proj1);
		DPrR.save(dppp4);
		DomaineProjet dppp5= new DomaineProjet(d0, proj1);
		DPrR.save(dppp5);
		
		DomaineProjet dppp6= new DomaineProjet(d4, pr1);
		DPrR.save(dppp6);
		DomaineProjet dppp7= new DomaineProjet(d5, pr1);
		DPrR.save(dppp7);
		DomaineProjet dppp8= new DomaineProjet(d0, pr1);
		DPrR.save(dppp8);
		DomaineProjet dppp9= new DomaineProjet(d0, pr1);
		DPrR.save(dppp9);
		DomaineProjet dppp10= new DomaineProjet(d0, pr1);
		DPrR.save(dppp10);
}
}
