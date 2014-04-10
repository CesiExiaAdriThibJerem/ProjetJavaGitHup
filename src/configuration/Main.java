package configuration;

import simulationInterface.AffichageStats;
import simulationMetier.Donjon;
import simulationMetier.ElementsMobile;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FenetreConfig fenconfig = new FenetreConfig();
		
		while (Configurations.isValide() == false) {
			System.out.print("");
			}
		int nbrTour = 0 ;
		
		Donjon monDonjon = new Donjon(Configurations.getGrilleX(), Configurations.getGrilleY(), Configurations.getNbrObstacle(), Configurations.getNbrHumainsClassique(), Configurations.getNbrHumainsEclaireur(), Configurations.getNbrHumainsTeleport(),Configurations.getNbrHumainsBuffer());
		AffichageStats fenStats = new AffichageStats();
		
		
		long temps;
		
		temps = System.currentTimeMillis();
		for (;;) {
			if (ElementsMobile.getPdvMonstre() == 0) {
				System.exit(0);
			}
			

			if(System.currentTimeMillis() - temps >= fenStats.getVitesse() && !fenStats.isPas()) {
				monDonjon.jouer();
				fenStats.rafraichir(nbrTour);
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
