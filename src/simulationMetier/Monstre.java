package simulationMetier;

import java.util.Random;



public class Monstre extends ElementsMobile
{

	private int compteurObstacle=0;
	@SuppressWarnings("unused")
	private boolean verif ;
	private ElementsMobile  e;
	Monstre(Donjon donjon)//constructeur de la classe monstre
	{

		this.donjon = donjon;
		setImage("monstre.png");
		this.direction=sud;
		this.deplacement=1;
		this.vision=1;
		setPdvMonstre(100); 
		this.x = getX();
		this.y = getY();
		this.nomE = "Monstre";
	}


	public void bouger()//definition de la methode abstraite bouger pour le monstre
	{		


		//detection des differents obstacles/elements autour du monstre
		//si il ya un obstacle le monstre tourne à droite, au bout de plusieurs fois, il fait un demi-tour
		//si c'est un humain il le mange et gagne 20 points de vie
		if (!this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud ) {

			e = donjon.getElementMobile(getX()+1, getY());

			if (e == null) {

				direction = est;

				compteurObstacle ++ ;

				if (compteurObstacle == 6)
				{
					compteurObstacle = 0 ;

					direction = nord;

				}
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain
					hpMob = hpMob + 20;

					setX(getX() + 1);
				}
			}

		}
		else if (this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud)  
		{
			e = donjon.getElementMobile(getX()+1, getY());

			if (e == null) {
				setX(getX() + 1);
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}

				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setX(getX() + 1);
				}
			}

		}
		else if (!this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {

			e = donjon.getElementMobile(getX(), getY()+1);

			if (e == null) {

				direction = nord;

				compteurObstacle ++ ;

				if (compteurObstacle == 6)
				{
					compteurObstacle = 0 ;

					direction = ouest;

				}
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain


					setY(getY()+1);
				}
			}

		}
		else if (this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {
			e = donjon.getElementMobile(getX(), getY()+1);
			if (e == null) {
				setY(getY()+1);
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setY(getY()+1);
				}
			}
		}

		else if (!this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			e = donjon.getElementMobile(getX()-1, getY());
			if (e==null) {

				direction = ouest;

				compteurObstacle ++ ;

				if (compteurObstacle == 6)
				{
					compteurObstacle = 0 ;

					direction = sud;

				}
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setX(getX()-1);
				}
			}
		}


		else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			e = donjon.getElementMobile(getX()-1, getY());

			if (e==null) {
				setX(getX()-1);
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setX(getX()-1);
				}
			}
		}

		else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			e = donjon.getElementMobile(getX(), getY()-1);
			if (e == null) {

				direction = sud;

				compteurObstacle ++ ;

				if (compteurObstacle == 6)
				{
					compteurObstacle = 0 ;

					direction = est;

				}
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setY(getY()-1);
				}
			}

		}
		else if (this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			e = donjon.getElementMobile(getX(), getY()-1);
			if (e== null) {
				setY(getY()-1);
			}
			else {
				if (e.getNomE().equals("Pierre")) {
					direction = est;

					compteurObstacle ++ ;

					if (compteurObstacle == 6)
					{
						compteurObstacle = 0 ;

						direction = nord;

					}
				}
				else {
					e.mourir();//appel à la methode mourir pour tuer l'humain

					setY(getY()-1);
				}
			}
		}
		hpMob = hpMob -1;
		setPdvMonstre(ElementsMobile.hpMob);
		
		Random nbr = new Random();
		
		if (nbr.nextInt(5) == 0) {
			direction = nbr.nextInt(3);
		}

	}



	void mangerHumain()
	{

		hpMob=hpMob+20;

	}


	@Override
	public void bougerPierre(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}