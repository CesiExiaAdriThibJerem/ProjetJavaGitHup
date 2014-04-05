package configuration;

import simulationMetier.Donjon;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		FenetreConfig config = new FenetreConfig();
		
		while (config.getValide() == false) {}
			
		Donjon monDonjon = new Donjon(config.getGrilleX(), config.getGrilleY(), config.getNbrObstacle(), config.getNbrHumainsClassique(), config.getNbrHumainsEclaireur(), config.getNbrHumainsTeleport(),config.getNbrHumainsBuffer());
	


	}

}
