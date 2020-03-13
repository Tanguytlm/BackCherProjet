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


		
		Particulier p1= new Particulier("A.Bean@gmail.com","a",1,null,"Bean","Arthur",d.parse("27/09/1996"),"Jeune agronôme diplomé de l'université agricole de Beynes recherchant des missions pour améliorer sa connaissance de la filière bovine");
		particulierRepo.save(p1);
		Particulier p2= new Particulier("Neederlands@yahoo.fr","p1",1,null,"Erlandais","René",d.parse("29/09/1993"),"Jeune artiste en reconversion, je souhaite découvrir de nouveau domaine auquel apporte mon point de vue unique");
		particulierRepo.save(p2);
		Particulier p3= new Particulier("Ltic@outlook.fr","p2",1,null,"Tic","Laetitia",d.parse("30/01/2000"),"J'aimerais travailler dans le renseignement militaire mais il me faut plus d'expérience ! si vous avez des projets pour moi n'hésitez pas!");
		particulierRepo.save(p3);
		Particulier p4= new Particulier("Matty@hotmail.fr","p3",1,null,"Muholland","Matt",d.parse("05/08/1980"),"Chanteur ingénieur australien, retrouvez ici ma chaîne youtube https://www.youtube.com/watch?v=X2WH8mHJnhM ");
		particulierRepo.save(p4);
		
		
		
		Entreprise e1= new Entreprise("CherGroupe@gmail.com","c",0,null,"CherGroupe","86 boulevard Haussman, Paris (à partir de la semaine prochaine)",75000,"0652145654","Formée par un groupe de jeunes Cdïstes, ce groupe est avant tout une équipe soudée qui aime la brioche, supportée même depuis l'étranger par un gourou motivant","http://localhost:4200/home-page",2020,"4-5 employés");
		entrepriseRepo.save(e1);
		Entreprise e2= new Entreprise("carreauxMalakoof@clean.org","e1",0,null,"Les laveurs de carreaux de Malakoff","12 rue de Malakoff",75000,"0152145654","Nos laveurs de vitres expérimentés sont formés pour nettoyer tout type de vitres : vitres en hauteur, baies vitrées, Velux, auvents, etc. En plus de vos vitres, ils entretiennent les châssis et les pièces d’appui de vos fenêtres. Ce sont des salariés qui interviennent à domicile selon vos disponibilités du lundi au samedi. Contactez-nous pour définir vos besoins avec un conseiller qui se déplace sans frais, et celui-ci vous proposera un forfait sur mesure. ","https://www.isoclean.pro",2010,"plus de 100 employés");
		entrepriseRepo.save(e2);
		Entreprise e3= new Entreprise("OOOOOTacos@gmail.com","e2",0,null,"Le vendeur de tacos d'en face","36 rue de l'esic",75000,"0752145654","Créé en 2007 O'Tacos est la première chaîne de restaurants #FrenchTacos\r\n" + 
				"Dans chaque otacos, retrouvez notre recette originale de sauce fromagère et choisissez parmi 5 viandes certifiées HALAL, rigoureusement sélectionnées pour leur qualité premium.Pour satisfaire tout le monde, nous avons créé des otacos de toutes les tailles, allant même jusqu’à 2,5 kg pour les plus courageux.","https://o-tacos.com/fr",2017,"moins de 15 employés");
		entrepriseRepo.save(e3);
		Entreprise e4= new Entreprise("GoldenGrahams@yahoo.fr","e3",0,null,"Nestle","77446 Marne La Vallée",75000,"0811 812 813","Créé il y a plus de 150 ans par Henri Nestlé, Nestlé est aujourd'hui le premier groupe alimentaire mondial spécialisé dans la Nutrition, Santé, Bien-être.La mission au quotidien du Groupe Nestlé est de proposer aux consommateurs, à travers une large gamme de produits, des repères fiables et durables en termes de nutrition, de plaisir, de qualité et de sécurité.Dirigé par Mark Schneider, le Groupe Nestlé est aujourd’hui présent dans plus de 189 pays. Nestlé commercialise plus de 10 000 types de produits fabriqués dans 413 usines réparties dans 85 pays.","https://www.nestle.fr/",1963,"plus de 2000 employés");
		entrepriseRepo.save(e4);
		
		
		
		
		DomaineEntreprise de1= new DomaineEntreprise(d5,e1);
		DER.save(de1);
		DomaineEntreprise de2= new DomaineEntreprise(d22,e1);
		DER.save(de2);
		DomaineEntreprise de3= new DomaineEntreprise(d24,e2);
		DER.save(de3);
		DomaineEntreprise de4= new DomaineEntreprise(d21,e3);
		DER.save(de4);
		DomaineEntreprise de5= new DomaineEntreprise(d1,e4);
		DER.save(de5);
		DomaineEntreprise de6= new DomaineEntreprise(d10,e4);
		DER.save(de6);
		
		DomaineParticulier dpa1= new DomaineParticulier(d1,p1);
		DPaR.save(dpa1);
		DomaineParticulier dpa2= new DomaineParticulier(d2,p3);
		DPaR.save(dpa2);
		DomaineParticulier dpa3= new DomaineParticulier(d3,p2);
		DPaR.save(dpa3);
		DomaineParticulier dpa4= new DomaineParticulier(d4,p2);
		DPaR.save(dpa4);
		DomaineParticulier dpa5= new DomaineParticulier(d5,p1);
		DPaR.save(dpa5);
		DomaineParticulier dpa6= new DomaineParticulier(d11,p4);
		DPaR.save(dpa6);
		
		
		Projet proj1 = new Projet("Presentation de CherProjet","Il s'agit ici de présenter un site. L'entreprise, bien que certaine de ses qualités rhétoriques, n'est pas certaine de terminer à temps",d.parse("10/03/2020"),d.parse("14/03/2020"),6,2,e1,"brioche",2);
		Projet proj2 = new Projet("Trouver une mission ","nous recherchons un emploi révolutionnant la face du monde et permettant le TT (coronavirus oblige).Lors de ce projet nous vous accompagnerons pour nous aider à trouver du travail",d.parse("14/03/2020"),d.parse("14/04/2020"),15,3,e1,"notre bonheur",3);
		Projet proj3 = new Projet("Réalisation d'un site web","Réaliser une plateforme de partage de projet Entreprise/Particulier",d.parse("03/03/2020"),d.parse("13/03/2020"),4,1,e1,"une grande satisfaction",1);
		Projet proj6 = new Projet("Pot avec Jojo","Réussir à retrouver Joel Banka après son retour en France",d.parse("03/04/2020"),d.parse("13/07/2020"),4,0,e1,"une sympatique soirée",0);
		Projet proj7 = new Projet("Briser la glace","Organiser une soirée de recrutement pour rameuter tout les meilleurs laveurs de vitre de la région!",d.parse("01/04/2020"),d.parse("20/07/2020"),4,0,e2,"une sympatique soirée",0);
		Projet proj4 = new Projet("Développer une nouvelle gamme de produit pour vaches","Nous les voulons plus charnue ! Quelqu'un sait comment faire ? ",d.parse("14/07/2018"),d.parse("14/07/2021"),15,0,e3,"3 Tacos et peut être un emploi !",0);
		Projet proj5 = new Projet("Concours de lancer de marteaux","Le sport étant un élément primordiale pour avoir la vie saine que nous préconisons nous organisons régulièrement des évènements sportifs pour nos amis bons vivants !",d.parse("14/07/2020"),d.parse("14/07/2021"),63,0,e4,"une vie saine et un marteau",0);
		Projet proj8 = new Projet("Rendre nos emballages plus respectueux de l'environnement","Compte tenu des enjeux environnementaux auquels nous faisons face au quotidien, les consommateurs attendent de nous des produits plus verts et nous répondrons à leurs attentes parce que c'est notre planète !",d.parse("14/07/2020"),d.parse("14/07/2021"),3,0,e4,"possibilité d'embauche en CDD au sein de notre service conditionnement",0);
		projetRepo.save(proj1);
		projetRepo.save(proj2);
		projetRepo.save(proj3);
		projetRepo.save(proj4);
		projetRepo.save(proj5);
		projetRepo.save(proj6);
		projetRepo.save(proj7);
		projetRepo.save(proj8);
		
		Participation pa1= new Participation(p1,e3,proj4);
		participationRepo.save(pa1);
		Participation pa2= new Participation(p1,e1,proj1);
		participationRepo.save(pa2);
				
		DemandeParticipation dp1=new DemandeParticipation(p3,proj6);
		DPR.save(dp1);
		DemandeParticipation dp2=new DemandeParticipation(p4,proj6);
		DPR.save(dp2);


		EtapeProjet ep1 = new EtapeProjet(d.parse("11/03/2020"), d.parse("13/03/2020"), "Faire la documentation de l'application", "bonne chance", proj1);
		EPR.save(ep1);
		EtapeProjet ep2 = new EtapeProjet(d.parse("13/03/2020"), d.parse("13/03/2020"), "Se répartir les rôle", "allez plus vite !", proj1);
		EPR.save(ep2);

		
		Messages mes1 = new Messages(proj1, null, p1, null, null, "J'ai reçu de nombreuse demandes d'emploi , le projet se déroule à merveille !");
		messagesRepo.save(mes1);
		Messages mes2 = new Messages(null, null, p1, e1, null, "Bonjour, j'ai besoin d'aide pour structurer le projet");
		messagesRepo.save(mes2);
		Messages mes3 = new Messages(null, null, p1, e1, null, "C'est bon je viens de trouver la solution finalement !");
		messagesRepo.save(mes3);
		Messages mes4 = new Messages(null, e1, null, null, p1, "Tes questions m'importunent. Limite les !");
		messagesRepo.save(mes4);
		Messages mes5 = new Messages(null, e1,null , null, p1, "Parlons de tout ça autour d'un verre mardi");
		messagesRepo.save(mes5);
		Messages mes6 = new Messages(proj1, e1, null, null, null, "Bravo René continu comme ça !");
		messagesRepo.save(mes6);
		
		
		ProjetPropose pp1 = new ProjetPropose("Faire un documentaire sur votre épopée de ces derniers mois","On m'a demandé lors de mes études de faire un documentaire sur un sujet ininteressant", d.parse("13/05/2020"),d.parse("13/11/2020"),1, e1, p2, "s'il vous plaît !", 0);
		PPR.save(pp1);
		
		DomaineProjetPropose dpp1= new DomaineProjetPropose(d3, pp1);
		DPPR.save(dpp1);
		DomaineProjetPropose dpp2= new DomaineProjetPropose(d4, pp1);
		DPPR.save(dpp2);
		DomaineProjetPropose dpp3= new DomaineProjetPropose(d22, pp1);
		DPPR.save(dpp3);

		DomaineProjet dppp1= new DomaineProjet(d14, proj1);
		DPrR.save(dppp1);
		DomaineProjet dppp2= new DomaineProjet(d25, proj1);
		DPrR.save(dppp2);
		DomaineProjet dppp3= new DomaineProjet(d29, proj2);
		DPrR.save(dppp3);
		DomaineProjet dppp4= new DomaineProjet(d22, proj3);
		DPrR.save(dppp4);
		DomaineProjet dppp5= new DomaineProjet(d1, proj4);
		DPrR.save(dppp5);
		DomaineProjet dppp6= new DomaineProjet(d30, proj5);
		DPrR.save(dppp6);
		DomaineProjet dppp7= new DomaineProjet(d29, proj6);
		DPrR.save(dppp7);
		DomaineProjet dppp8= new DomaineProjet(d25, proj7);
		DPrR.save(dppp8);
		DomaineProjet dppp9= new DomaineProjet(d23, proj6);
		DPrR.save(dppp9);
		DomaineProjet dppp10= new DomaineProjet(d24, proj6);
		DPrR.save(dppp10);
		
		
}
}
