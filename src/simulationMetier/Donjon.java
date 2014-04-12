package simulationMetier;

import java.util.ArrayList;
import java.util.Random;

import configuration.Configurations;
import simulationInterface.Plateau;

/*méthode qui initialise les attributs du donjon , nombre ce chaque éléments (mobiles ou obstacle), du plateau, contient les geteurs des largeurs longeur de la grille, 
ainsi qu'instancier l'arrayList des objets mobiles*/

public class Donjon {

	// Attributs et geteurs
	private int largeurGrille;
	public int getLargeurGrille() {
		return largeurGrille;
	}

	public int getLongueurGrille() {
		return longueurGrille;
	}

	private int longueurGrille;
	private int nombreObstacle;
	private int nbrHumainClassique;
	private int nbrHumainEclaireur;
	private int nbrHumainTeleport;
	private int nbrHumainBuffer;
	private Case cases[][];
	private Random hasard;

	private Plateau plateauJeu;

	private ArrayList<ElementsMobile> mobile = new ArrayList<>();




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
				else if (hasard.nextInt(20)==0)
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

		placerLesBuffers();
		placerLesClassiques();
		placerLesEclaireur();
		placerLesTeleports();
		placerLesPierres();

		placerLeMonstre();

	}

	// methode servant a placer les pierres à partir de la méthode de placement des élements mobiles

	private void placerLesPierres() {
		Pierre e;

		for (int i = 0; i < this.nombreObstacle; i++)
		{
			e = new Pierre(this);
			this.mobile.add(e);
			this.placerUnElementMobileAuHasard(e);
			this.plateauJeu.placerElement(e);
		}
	}

	//methode servant à placer le monstre à partir de la méthode de palcement des élements mobiles

	private void placerLeMonstre() {



		Monstre monstre = new Monstre(this);
		this.mobile.add(monstre);
		this.placerUnElementMobileAuHasard(monstre);
		this.plateauJeu.placerElement(monstre);


	}

	// methode servant à récuperer les coordonnées d'une case
	public Case getPosition(int x, int y)
	{

		if ((x >= Configurations.getGrilleX()-1 || x < 0) || (y >= Configurations.getGrilleX()-1 || y < 0)) {
			return this.cases[0][0];

		}
		else {

			return this.cases[y][x];
		}

	}
	//Methode permettant de choisir aléatoirement un des 3 sols
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
		boolean valide = false;
		int nbr;

		int x = this.hasard.nextInt(this.longueurGrille);
		int y = this.hasard.nextInt(this.longueurGrille);



		//tant que la case n'est pas vide boucle et qu'il n'y a pas d'element mobile dessus
		while (cases[x][y].estVide()==false || valide == false)
		{
			nbr = 0;
			for (ElementsMobile a : this.mobile) {
				if ((a.getX() == x && a.getY() == y) && nbr == 0) {
					valide = false;
				}
				else if (nbr == 0) {
					nbr = 1;
					valide =true;
				}
			}			
			if (valide == false || cases[x][y].estVide()==false) {
				x = this.hasard.nextInt(this.longueurGrille);
				y = this.hasard.nextInt(this.longueurGrille);
			}

		}

		// renvoi a ElementsMobile les nouvelles coordonnées
		e.setX(x);
		e.setY(y);




	}

	// méthode avec les coordonnées
	public void setXY(int x, int y, Case c)
	{
		this.cases[x][y] = c;


	}

	//methode pour placer les humains Buffers (fuyard)
	private void placerLesBuffers()
	{
		HumainBuffer e;

		//Recupere le nombre d'objet à placer et increment en fonction
		for (int i = 0; i < this.nbrHumainBuffer; i++)
		{
			e = new HumainBuffer(this);
			this.mobile.add(e);
			this.placerUnElementMobileAuHasard(e);
			this.plateauJeu.placerElement(e);

		}
	}
	// methode pour placer les humains classiques
	private void placerLesClassiques()
	{
		HumainClassique e;

		//Recupere le nombre d'objet à placer et increment en fonction
		for (int i = 0; i < this.nbrHumainClassique; i++)
		{
			e = new HumainClassique(this);
			this.mobile.add(e);
			this.placerUnElementMobileAuHasard(e);
			this.plateauJeu.placerElement(e);

		}
	}
	// methode pour placer les eclaireurs
	private void placerLesEclaireur()
	{
		HumainEclaireur e;

		//Recupere le nombre d'objet à placer et increment en fonction
		for (int i = 0; i < this.nbrHumainEclaireur; i++)
		{
			e = new HumainEclaireur(this);
			this.mobile.add(e);
			this.placerUnElementMobileAuHasard(e);
			this.plateauJeu.placerElement(e);

		}
	}
	// methode pour placer les humains teleporteurs
	private void placerLesTeleports()
	{
		HumainTeleport e;

		//Recupere le nombre d'objet à placer et increment en fonction
		for (int i = 0; i < this.nbrHumainTeleport; i++)
		{
			e = new HumainTeleport(this);
			this.mobile.add(e);
			this.placerUnElementMobileAuHasard(e);
			this.plateauJeu.placerElement(e);

		}
	}

	// methode assurant le deroulement de la partie, appel le rafraichissement 

	public void jouer() {

		plateauJeu.rafraichir();
		for (ElementsMobile a : this.mobile) {

			a.bouger();

			int hpMob= ElementsMobile.getPdvMonstre();

			if(hpMob==0 )
			{

			}

			if (!a.isMort()) {
				this.plateauJeu.placerElement(a);

			}



			else {



			}


		}

	}

	// appel la methode fermant le jeu
	public void finDuJeu() {
		plateauJeu.finDuJeu();
	}

	// getter pour les elements mobiles
	public ElementsMobile getElementMobile(int x, int y) {
		for (ElementsMobile e : this.mobile) {
			if (e != null) {

				if ( (e.getX() == x) && (e.getY() == y) ) {
					return e;
				}
			}
		}
		return null;
	}


}






