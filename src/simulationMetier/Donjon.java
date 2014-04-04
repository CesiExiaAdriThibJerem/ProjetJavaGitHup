package simulationMetier;

import java.util.Random;

import simulationInterface.Plateau;

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
	
	private Plateau plateauJeu;
	
	
	//Creation du Donjon
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
		
		//Parcour les cases du tableau pour placer les coins
		
		for (int y=0; y< longueurGrille; y++)
		{
			for (int x=0; x< largeurGrille; x++)
			{
				if (y==0 && x==0)
				{
					unecase = new CoinHautDroite();

				}
				else if (y==0 && x== largeurGrille-1)
				{
					unecase = new CoinHautGauche();
				}
				else if (y== longueurGrille-1 && x==0)
				{
					unecase = new CoinBasDroite();
				}
				else if (y== longueurGrille-1 && x== largeurGrille-1)
				{
					unecase = new CoinBasGauche();
				}
				
				// Pour placer les bords
				else if ((y==0 && x != 0 && x != largeurGrille-1) || (y==longueurGrille-1 && x != 0 && x != largeurGrille-1))
				{
					unecase = new MurHorizontal();
				}
				else if ((x==0 && y != 0 && y != longueurGrille-1) || (x==largeurGrille-1 && y != 0 && y != longueurGrille-1))
				{
					unecase = new MurVertical();
					
				}
				
				//Placer les tours de façon aléatoire
				else if (hasard.nextInt(10)==0)
				{
					unecase = new Tour();
				}
				//Le reste en sol
				else 
				{
					unecase = construireUnSol();
					
				}
				
				this.cases[x][y]= unecase;

				
			}
			
			
		}
		
		//Instanciation du plateau

		this.plateauJeu = new Plateau(this.largeurGrille, this.longueurGrille, this.cases);
		
		
	}
	
	//Methode permettant de choisir aléatoirement un des 3 sols
	public Case getPosition(int x, int y)
	{
		return this.cases[x][y];
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
	
	//Methode pour placer les elements mobiles
	private void placerUnElementMobileAuHasard(ElementsMobile e)
	{
		int x = this.hasard.nextInt(this.largeurGrille);
		int y = this.hasard.nextInt(this.longueurGrille);
		
		//tant que la case n'est pas vide boucle
		while (cases[x][y].estVide()==false)
		{
			x = this.hasard.nextInt(this.largeurGrille);
			y = this.hasard.nextInt(this.longueurGrille);
		}
		
    //Definit les coordonées de l'objet à placer
		e.modifierX();
		e.modifierY();
		
		
		
		
		
		

		
		
	}
	

			
		
	}
	
	
	



