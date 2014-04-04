package simulationMetier;

import java.util.Random;

public class Donjon {
	
	private int largeurGrille;
	private int longueurGrille;
	
	private int nombreObstacle;
	
	private int nbrHumainClassique;
	private int nbrHumainEclaireur;
	private int nbrHumainTeleport;
	private int nbrHumainBuffer;
	
	private Case cases[][];
	private Random hasard;
	
	public Donjon(int grilleX, int grilleY, int nbrObstacle, int nbrHumainClassique, int nbrHumaineEclaireur, int nbrHumainTeleport, int nbrHumainBuffer)
	{
		largeurGrille = grilleX;
		longueurGrille = grilleY;
		nombreObstacle = nbrObstacle;
		this.nbrHumainClassique = nbrHumainClassique;
		this.nbrHumainBuffer = nbrHumainBuffer;
		this.nbrHumainEclaireur = nbrHumaineEclaireur;
		this.nbrHumainTeleport = nbrHumainTeleport;
		
		
		
		
		
		
		
	}
	public Donjon() {
		// TODO Auto-generated constructor stub
	}
	public Case[][] getPosition()
	{
		return this.cases;
	}
	
	
	

}
