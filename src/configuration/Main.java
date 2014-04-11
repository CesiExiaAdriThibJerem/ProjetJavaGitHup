package configuration;

import simulationInterface.AffichageStats;
import simulationMetier.Donjon;
import simulationMetier.ElementsMobile;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FenetreConfig fenconfig = new FenetreConfig(); // Appel de la fenetre de configuration du debut

		while (Configurations.isValide() == false) { // On attend que les conditions soit valide pour passer a l'etape suivante du programme
			System.out.print("");
		}
		int nbrTour = 0 ;

		Donjon monDonjon = new Donjon(Configurations.getGrilleX(), Configurations.getGrilleY(), Configurations.getNbrObstacle(), Configurations.getNbrHumainsClassique(), Configurations.getNbrHumainsEclaireur(), Configurations.getNbrHumainsTeleport(),Configurations.getNbrHumainsBuffer());
		AffichageStats fenStats = new AffichageStats();
		// On appelle la fenetre de Donjons et la fenetre de stats
		
		long temps;

		temps = System.currentTimeMillis(); // On releve l'heure actuel en milliseconds
		for (;;) {

			if (ElementsMobile.getPdvMonstre() == 0) {	// on creer un timer concernant la fin du jeu
				monDonjon.finDuJeu();
				temps = System.currentTimeMillis();
				for (;;) {
					if(System.currentTimeMillis() - temps >= 4000) {
						System.exit(0);
					}
				}
			}
			

			if(System.currentTimeMillis() - temps >= fenStats.getVitesse() && !fenStats.isPas()) {
				monDonjon.jouer();
				fenStats.rafraichir(nbrTour); // rafraichissement du donjons
				nbrTour++;

				//System.out.println(fenStats.getVitesse());			


				temps = System.currentTimeMillis();

				if (fenStats.isModepas()) {
					fenStats.setPas(true);
				}

			}



		}



	}

}
