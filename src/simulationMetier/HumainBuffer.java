package simulationMetier;

import java.util.Random;

public class HumainBuffer extends ElementsMobile {
	private ElementsMobile e;
	private ElementsMobile danger;
	private ElementsMobile danger1;
	private ElementsMobile danger2;
	private ElementsMobile danger3;
	private ElementsMobile danger4;
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
		//Si il y a un monstre lance la m�thode bouger
		if (detection() == true)
		{


			if (mort == false) {
				Random random = new Random();
				if(vivant==true)
				{

					direction= random.nextInt(4);

					if (!this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud ) {

						direction = random.nextInt(4); 				

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

						direction = random.nextInt(4);				

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

						direction = random.nextInt(4);			


					}	

					else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {
						e = donjon.getElementMobile(getX() -1, getY());
						if (e == null) {
							setX(getX()-1);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = random.nextInt(4);
							}
						}
					}

					else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest ) {

						direction = random.nextInt(4);

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



		//check si il y � un monstre au sud de sa position

		if (donjon.getElementMobile(getX()+1, getY()) != null) {

			if (donjon.getElementMobile(getX()+1, getY()).getNomE().equals("Monstre")) {

				return true;
			}
			
			else 
			{
				return false;
			}

		}
		 if (donjon.getElementMobile(getX(), getY()+1) != null) {

			if (donjon.getElementMobile(getX(), getY()+1).getNomE().equals("Monstre"))
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		 if (donjon.getElementMobile(getX()-1, getY())!= null)
		{
			if(donjon.getElementMobile(getX()-1, getY()).getNomE().equals("Monstre"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		 if(donjon.getElementMobile(getX(), getY()-1) != null)
		{
			if(donjon.getElementMobile(getX(), getY()-1).getNomE().equals("Monstre"))
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else
		{
			return false;
		}


		/*
		if (danger1!= null || danger2)
		{

		if (danger.getNomE().equals("Monstre"))
		{
			return true;
		}
		else 
		{
			//a l'est
			danger = donjon.getElementMobile(getX(), getY()+1);
			if (danger != null)
			{

			if (danger.getNomE().equals("Monstre") )
			{
				return true; 
			}
			else
			{
				// au nord
				danger = donjon.getElementMobile(getX()-1, getY());
				if (danger != null)
				{
				if (danger.getNomE().equals("Monstre"))
				{
					return true;
				}
				else
				{
					// a l'ouest
					if (danger != null)
					{
					danger = donjon.getElementMobile(getX(), getY()-1);
					if (danger.getNomE().equals("Monstre"))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				}
			}
			}
		}
		}


	}
		return false;*/
		
	}



}


