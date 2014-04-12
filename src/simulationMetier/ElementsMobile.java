package simulationMetier;

import java.awt.Image;
import java.io.File;



import javax.imageio.ImageIO;

import configuration.Configurations;


public abstract class ElementsMobile {

	
	//variables qui permettent de déterminer l'orientation des differents elements 
	public final static int nord = 0;
	public final static int ouest = 1;
	public final static int est = 2;
	public final static int sud = 3;

	protected int vision;// variable qui determine la portée de detection 
	protected int deplacement;// variable qui determine le nombre de cas que l'element peut parcourir
	protected boolean vivant;//variable qui dit si un humain est mort ou non

	protected int direction; //variable qui stocke l'orientation de l'element
	protected Donjon donjon;//instantiation de la classe donjon pour envoyer les données du package
	
	//variables des coordonnées
	protected int x;
	protected int y;
	
	protected static int hpMob;//variable qui stocke les points de vie du monstre

	protected boolean mort = false;

	public boolean isMort() {// fonction qui determine si un humain est mort ou pas
		return mort;
	}




	protected String nomE = "Humain";

	public String getNomE() {
		return nomE;
	}




	private Image img;



	public Image getImage() {// fonction qui renvoi l'image de l'element
		return img;
	}




	public void setImage(String image)
	{// fonction qui determine l'image de l'element
		try {


			this.img = ImageIO.read(new File("image/"+image));

		} catch (Exception e) 

		{
			System.out.println("impossible d'afficher l'image: "+ image);


		}
	}


	public abstract void bouger();// methode abstraite qui, une fois definie, permet aux differents elements de bouger

	public int getX()
	{
		return this.x;//permet de connaitre la position x(abscisse) d'un element
	}
	public int getY()
	{

		return this.y;//permet de connaitre la position y(ordonnée) d'un element
	}
	public void setPdvMonstre(int hpMob)
	{//methode qui change les points de vie du monstre

		ElementsMobile.hpMob = hpMob;
	}
	public static int getPdvMonstre()
	{// methode qui permet d'obtenir les points de vie du monstre
		return ElementsMobile.hpMob;
	}





	public void setX(final int x) {//definie la position x(abscisse)
		this.x = x;
	}

	public void setY(final int y) {//definie la position y(ordonnée)
		this.y = y;
	}



	public int getDirection() {//obtention de l'orientation de l'element
		return direction;
	}




	public void setDirection(int direction) {//definie l'orientation de l'element
		this.direction = direction;
	}

	public void mourir() {//fonction qui fait mourir les humains quand ils sont mangés
		setImage("sol1.png");
		//fait appel aux fonctions de la classe configuration pour reduire le nombre d'humains affichés
		if (this.mort == false) {

			if (this.nomE.equals("humainbuf")) {
				Configurations.setNbrHumainsBuffer(Configurations.getNbrHumainsBuffer() - 1);
			}
			else if (this.nomE.equals("humainclass")) {
				Configurations.setNbrHumainsClassique(Configurations.getNbrHumainsClassique() - 1);
			}
			else if (this.nomE.equals("humaineclair")) {
				Configurations.setNbrHumainsEclaireur(Configurations.getNbrHumainsEclaireur() - 1);
			}
			else if (this.nomE.equals("humaintp")) {
				Configurations.setNbrHumainsTeleport(Configurations.getNbrHumainsTeleport() - 1);
			}
			this.mort = true;
			ElementsMobile.hpMob = hpMob + 20;
		}


	}




	public abstract void bougerPierre(int x, int y);
	
}
