package configuration;

import simulationInterface.AffichageStats;
import simulationMetier.Donjon;

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
		
		
		for (;;) {
			
			temps = System.currentTimeMillis();
			if (temps == temps + fenStats.getVitesse()) {
				monDonjon.jouer();
				fenStats.rafraichir(nbrTour);
				nbrTour++;
				
				temps = System.currentTimeMillis();
				
			}
			else {
				temps++;
			}
			
		}
		


	}

}
