package simulationMetier;



public class Monstre extends ElementsMobile
{

	private int compteurObstacle=0;
	@SuppressWarnings("unused")
	private boolean verif ;
	private ElementsMobile  e;
	Monstre(Donjon donjon)
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


	public void bouger()
	{		



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
				//System.out.println(e.getNomE());
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
					e.mourir();
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
				//	System.out.println(e.getNomE());
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
					e.mourir();

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
				//System.out.println(e.getNomE());
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
					e.mourir();


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
				//System.out.println(e.getNomE());
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
					e.mourir();

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
				//System.out.println(e.getNomE());
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
					e.mourir();

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
				//System.out.println(e.getNomE());
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
					e.mourir();

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
				//System.out.println(e.getNomE());
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
					e.mourir();

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
				//	System.out.println(e.getNomE());
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
					e.mourir();

					setY(getY()-1);
				}
			}
		}
		hpMob = hpMob -1;
		setPdvMonstre(ElementsMobile.hpMob);


	}



	void mangerHumain()
	{

		hpMob=hpMob+20;

	}

}