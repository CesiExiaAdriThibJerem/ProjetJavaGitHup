package simulationMetier;

import java.util.Random;

import configuration.Configurations;

public class HumainEclaireur extends ElementsMobile  {
	private ElementsMobile  e;
	HumainEclaireur(Donjon donjon)
	{
		setImage("hommeeclaireur.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
		this.donjon = donjon;
	}
	public void bouger() 
	{
		if (mort == false) {
			Random random = new Random();
			if(vivant==true)
			{

				direction= random.nextInt(4);
				if (!this.donjon.getPosition(getX() + 2, getY()).estVide() && direction == sud ) {

					direction = nord; 				

				}
				else if (this.donjon.getPosition(getX() + 2, getY()).estVide() && direction == sud && this.donjon.getPosition(getX()+1, getY()).estVide())  
				{

					if ((getX()+2 < Configurations.getGrilleX())&& (getX()+2 > 0)) {
						e = donjon.getElementMobile(getX()+2, getY());
						if (e == null) {
							setX(getX()+2);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = nord;
							}
							else if ((e.getNomE().equals("Monstre")))
							{
								direction=nord;

							}
						}
					}



				}
				else if (!this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {

					direction= ouest;				

				}
				else if (this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est && this.donjon.getPosition(getX(), getY()+1).estVide()) {

					if ((getY()+2 < Configurations.getGrilleY())&& (getY()+2 > 0)) {
						e = donjon.getElementMobile(getX(), getY()+2);
						if (e == null) {
							setY(getY()+2);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = ouest;
							}
							else if ((e.getNomE().equals("Monstre")))
							{
								direction=ouest;

							}
						}
					}

				}

				else if (!this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {

					direction = sud;

				}

				else if (this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord && this.donjon.getPosition(getX()-1, getY()).estVide()) {
					if ((getX()-2 < Configurations.getGrilleX())&& (getX()-2 > 0)) {
						e = donjon.getElementMobile(getX()-2, getY());
						if (e == null) {
							setX(getX()-2);
						}
						else {
								if (e.getNomE().equals("Humain")) {
	
									direction = sud;
								}
								else if ((e.getNomE().equals("Monstre")))
								{
									direction=sud;
	
								}
						}
					}

				}

				else if (!this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest ) {

					direction = est;

				}
				else if (this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest  && this.donjon.getPosition(getX(), getY()-1).estVide()) {
					if ((getY()-2 < Configurations.getGrilleX())&& (getY()-2 > 0)) {
						e = donjon.getElementMobile(getX(), getY()-2);
						if (e == null) {
							setY(getY()-2);
						}
						else {
							if (e.getNomE().equals("Humain")) {

								direction = est;
							}
							else if ((e.getNomE().equals("Monstre")))
							{
								direction=est;

							}
						}
					}

				}

			}
		}

	}

}
