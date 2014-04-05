package configuration;

import simulationMetier.Donjon;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		FenetreConfig config = new FenetreConfig();
		
		while (config.getValide() == false) {}
			
		Donjon monDonjon = new Donjon(config.getGrilleX(), config.getGrilleY(), config.getNbrObstacle(), config.getNbrHumainsClassique(), config.getNbrHumainsEclaireur(), config.getNbrHumainsTeleport(),config.getNbrHumainsBuffer());
=======
		Donjon monDonjon = new Donjon(30, 30, 10, 5, 5,5, 5);		

>>>>>>> cf435a6f08023ecbc0d954fa8147a5b054008712
	}

}
