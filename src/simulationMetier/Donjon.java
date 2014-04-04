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
		
		this.cases= new Case[largeurGrille][longueurGrille];
		this.hasard = new Random();
		
		Case unecase;
		
		for (int y=0; y< longueurGrille; y++)
		{
			for (int x=0; x< largeurGrille; x++)
			{
				if (y==0 && x==0)
				{
					unecase = new CoinHautGauche();

				}
				else if (y==0 && x== largeurGrille-1)
				{
					unecase = new CoinHautDroite();
				}
				else if (y== longueurGrille-1 && x==0)
				{
					unecase = new CoinBasGauche();
				}
				else if (y== longueurGrille-1 && x== largeurGrille-1)
				{
					unecase = new CoinBasDroite();
				}
				else if ((y==0 && x != 0 && x != largeurGrille-1) || (y==longueurGrille-1 && x != 0 && x != largeurGrille-1))
				{
					unecase = new MurHorizontal();
				}
				else if ((x==0 && y != 0 && y != longueurGrille-1) || (x==largeurGrille-1 && y != 0 && y != longueurGrille-1))
				{
					unecase = new MurVertical();
					
				}
				else if (hasard.nextInt(10)==0)
				{
					unecase = new Tour();
				}
				else 
				{
					unecase = construireUnSol();
					
				}
				
				
			}
			
			
		}

		
	}
	
	private Case construireUnSol()
	{
		Case c;
		int nbr = hasard.nextInt(3);
		if (nbr == 0)
		{
			c = new Sol1();
		}
		else if (nbr == 1)
		{
			c = new Sol2();
		}
		else 
		{
			c = new Sol3();
		}
		return c;
		
	}
	
	

}
