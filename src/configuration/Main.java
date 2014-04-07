package configuration;


import simulationMetier.Donjon;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FenetreConfig fenconfig = new FenetreConfig();
		
		while (Configurations.isValide() == false) {
			System.out.print("");
			}
		
		Donjon monDonjon = new Donjon(Configurations.getGrilleX(), Configurations.getGrilleY(), Configurations.getNbrObstacle(), Configurations.getNbrHumainsClassique(), Configurations.getNbrHumainsEclaireur(), Configurations.getNbrHumainsTeleport(),Configurations.getNbrHumainsBuffer());
		
		long temps;
		
		for (;;) {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			monDonjon.jouer();
			
			
		}
		


	}

}
