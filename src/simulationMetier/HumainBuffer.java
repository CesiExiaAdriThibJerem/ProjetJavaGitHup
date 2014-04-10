package simulationMetier;

import java.util.Random;

public class HumainBuffer extends ElementsMobile {
	private ElementsMobile e;

	HumainBuffer(Donjon donjon)
	{
		setImage("hommebuufer.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
		this.donjon = donjon;

		this.nomE = "humainbuf";
	}

	public void bouger() 
	{
		//Si il y a un monstre lance la méthode bouger
		if (detection() == true)
		{

			
			if (mort == false) {
				Random random = new Random();
				if(vivant==true)
				{

					direction= random.nextInt(4);


					if (!this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud ) {

						//direction = random.nextInt(4); 				

					}
					else if (this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud )  
					{

						e = donjon.getElementMobile(getX()+1, getY());
						if (e == null) {
							setX(getX()+1);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = random.nextInt(4);
							}

						}

					}
					else if (!this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est ) {

						//direction = random.nextInt(4);				

					}
					else if (this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est ) {
						e = donjon.getElementMobile(getX(), getY()+1);
						if (e == null) {
							setY(getY()+1);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = random.nextInt(4);
							}
						}
					}



					else if (!this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {

						//direction = random.nextInt(4);			


					}	

					else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {
						e = donjon.getElementMobile(getX() -1, getY());
						if (e == null) {
							setX(getX()-1);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								//direction = random.nextInt(4);
							}
						}
					}

					else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest ) {

						//direction = random.nextInt(4);

					}
					else if (this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest  ) {
						e = donjon.getElementMobile(getX(), getY()-1);
						if (e == null) {
							setY(getY()-1);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = random.nextInt(4);
							}
						}
					}

				}
			}
		}
		else
		{

			//ne rien faire
		}
	}


	public boolean detection()
	{



		//check si il y à un monstre au sud de sa position

		boolean ilYaUnMonstre = false;
		if (donjon.getElementMobile(getX()+1, getY()) != null) {
			e = donjon.getElementMobile(getX()+1, getY());
			if (e.getNomE().equals("Monstre")) 
			{
				ilYaUnMonstre= true;
				setDirection(nord);
			}

			else 
			{

				ilYaUnMonstre= false;
			}

		}
		else if (donjon.getElementMobile(getX(), getY()+1) != null) {

			e = donjon.getElementMobile(getX(), getY()+1);
			if (e.getNomE().equals("Monstre"))
			{
				ilYaUnMonstre= true;
				setDirection(ouest);
			}
			else
			{

				ilYaUnMonstre= false;
			}

		}
		else if (donjon.getElementMobile(getX()-1, getY())!= null)
		{
			e = donjon.getElementMobile(getX()-1, getY());
			if (e.getNomE().equals("Monstre")) 
			{
				ilYaUnMonstre= true;
				setDirection(sud);
			}
			else
			{

				ilYaUnMonstre= false;
			}
		}

		else if(donjon.getElementMobile(getX(), getY()-1) != null)
		{
			e = donjon.getElementMobile(getX(), getY()-1);
			if (e.getNomE().equals("Monstre"))
			{
				ilYaUnMonstre= true;
				setDirection(est);
			}
			else 
			{

				ilYaUnMonstre= false;
			}
		}

		return ilYaUnMonstre;


	}
	public void setDirection(int direct)
	{
		this.direction=direct;
	}
	public int getDirection()
	{
		return this.direction;
	}



}


