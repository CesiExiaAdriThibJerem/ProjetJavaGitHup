package simulationMetier;

import java.util.Random;

import configuration.Configurations;

public class HumainEclaireur extends ElementsMobile  {
	private ElementsMobile  e;
	HumainEclaireur(Donjon donjon)//constructeur des humains eclaireurs dits "les peureux"
	{
		setImage("hommeeclaireur.png");
		this.deplacement=2;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
		this.donjon = donjon;
		this.nomE = "humaineclair";
	}
	public void bouger() //implementation de la methode abstraite bouger pour les humains
	{
		if (mort == false) {//check si l'humain est mort ou non
			Random random = new Random();
			if(vivant==true)
			{
				
				//l'humain eclaireur bouge de 2 cases par 2 cases cependant il a tellement peur de se 
				// retrouver face au monstre que dés qu'il croise quelque chose qui bouge ou non
				// il part dans la direction opposée

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
	@Override
	public void bougerPierre(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
