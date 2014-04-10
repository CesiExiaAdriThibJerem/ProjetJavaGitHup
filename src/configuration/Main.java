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
			
<<<<<<< HEAD
=======
			
>>>>>>> 4d02645308d80fcd89eb53a709c8674cebd3aee8
			if(System.currentTimeMillis() - temps >= fenStats.getVitesse() && !fenStats.isPas()) {
				monDonjon.jouer();
				fenStats.rafraichir(nbrTour);
				nbrTour++;
<<<<<<< HEAD
						
=======
<<<<<<< HEAD
				//System.out.println(fenStats.getVitesse());			
=======
						
>>>>>>> e28559634130a715a6a549f73f9c9d7c0b3d70f4
>>>>>>> 4d02645308d80fcd89eb53a709c8674cebd3aee8
				temps = System.currentTimeMillis();

				if (fenStats.isModepas()) {
					fenStats.setPas(true);
				}

			}
				
				
				
		}
		


	}

}
