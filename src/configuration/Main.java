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
		
		temps = System.currentTimeMillis();
		for (;;) {
			
			
			if(System.currentTimeMillis() - temps >= fenStats.getVitesse() && !fenStats.isPas()) {
				monDonjon.jouer();
				fenStats.rafraichir(nbrTour);
				nbrTour++;
<<<<<<< HEAD
				//System.out.println(fenStats.getVitesse());			
=======
						
>>>>>>> e28559634130a715a6a549f73f9c9d7c0b3d70f4
				temps = System.currentTimeMillis();

				if (fenStats.isModepas()) {
					fenStats.setPas(true);
				}

			}
				
				
				
		}
		


	}

}
