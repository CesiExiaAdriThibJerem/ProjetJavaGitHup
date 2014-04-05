package configuration;

public class Configurations {
	private static int grilleX;
	private static int grilleY;
	private static int nbrObstacle;
	private static int nbrHumainsClassique;
	private static int nbrHumainsEclaireur;
	private static int nbrHumainsTeleport;
	private static int nbrHumainsBuffer;
	
	private static boolean valide = false;
	
	
	public static void setValide(boolean valide) {
		Configurations.valide = valide;
	}
	public static int getGrilleX() {
		return grilleX;
	}
	public static void setGrilleX(int grilleX) {
		Configurations.grilleX = grilleX;
	}
	public static int getGrilleY() {
		return grilleY;
	}
	public static void setGrilleY(int grilleY) {
		Configurations.grilleY = grilleY;
	}
	public static int getNbrObstacle() {
		return nbrObstacle;
	}
	public static void setNbrObstacle(int nbrObstacle) {
		Configurations.nbrObstacle = nbrObstacle;
	}
	public static int getNbrHumainsClassique() {
		return nbrHumainsClassique;
	}
	public static void setNbrHumainsClassique(int nbrHumainsClassique) {
		Configurations.nbrHumainsClassique = nbrHumainsClassique;
	}
	public static int getNbrHumainsEclaireur() {
		return nbrHumainsEclaireur;
	}
	public static void setNbrHumainsEclaireur(int nbrHumainsEclaireur) {
		Configurations.nbrHumainsEclaireur = nbrHumainsEclaireur;
	}
	public static int getNbrHumainsTeleport() {
		return nbrHumainsTeleport;
	}
	public static void setNbrHumainsTeleport(int nbrHumainsTeleport) {
		Configurations.nbrHumainsTeleport = nbrHumainsTeleport;
	}
	public static int getNbrHumainsBuffer() {
		return nbrHumainsBuffer;
	}
	public static void setNbrHumainsBuffer(int nbrHumainsBuffer) {
		Configurations.nbrHumainsBuffer = nbrHumainsBuffer;
	}
	public static boolean isValide() {
		
		return valide;
	}
	
	
	
}
