package simulationMetier;

import java.util.Random;

import configuration.Configurations;

public class HumainTeleport extends ElementsMobile {
	private ElementsMobile  e;
	HumainTeleport(Donjon donjon)
	{
		setImage("hommeteleport.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
		this.donjon = donjon;
		this.nomE = "humaintp";
	}
	
	public void bouger()
	{
		if (mort == false) {
		Random random = new Random();
		
		int caseDeplacement = random.nextInt(3);
		
		
		if(vivant=true)
		{
			switch(caseDeplacement)
			{
				case 0 :
					
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
						
						random.nextInt(4);				
						
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
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {
						e = donjon.getElementMobile(getX()-1, getY());
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
						
						random.nextInt(4);
							
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
					break;
					
				case 1 :
					
					direction= random.nextInt(4);
					if (!this.donjon.getPosition(getX() + 2, getY()).estVide() && direction == sud ) {
						
						direction = random.nextInt(4); 				
						
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
											
										direction = random.nextInt(4);
										}
								}
						}
						
						
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est && this.donjon.getPosition(getX(), getY()+1).estVide()) {
						
						if ((getY()+2 < Configurations.getGrilleY())&& (getY()+2 > 0)) {
							e = donjon.getElementMobile(getX(), getY()+2);
							if (e == null) {
								setY(getY()+2);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
					}
					
					else if (!this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord && this.donjon.getPosition(getX()-1, getY()).estVide()) {
						if ((getX()-2 < Configurations.getGrilleX())&& (getX()-2 > 0)) {
							e = donjon.getElementMobile(getX()-2, getY());
							if (e == null) {
								setX(getX()-2);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest  && this.donjon.getPosition(getX(), getY()-1).estVide()) {
						if ((getY()-2 < Configurations.getGrilleX())&& (getY()-2 > 0)) {
							e = donjon.getElementMobile(getX(), getY()-2);
							if (e == null) {
								setY(getY()-2);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
					}
					break;
					
				case 2 :
					
					direction= random.nextInt(4);
					if (!this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud ) {
						
						direction = random.nextInt(4); 				
						
					}
					else if (this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud && this.donjon.getPosition(getX()+2, getY()).estVide()  && this.donjon.getPosition(getX()+1, getY()).estVide())  
					{
						if ((getX()+3 < Configurations.getGrilleX())&& (getY()+3 > 0)) {
							e = donjon.getElementMobile(getX()+3, getY());
							if (e == null) {
								setX(getX()+3);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est && this.donjon.getPosition(getX(), getY()+2).estVide()&& this.donjon.getPosition(getX(), getY()+1).estVide()) {
						if ((getY()+3 < Configurations.getGrilleX())&& (getY()+3 > 0)) {
							e = donjon.getElementMobile(getX(), getY()+3);
							if (e == null) {
								setY(getY()+3);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
					}
					
					else if (!this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord && this.donjon.getPosition(getX()-2, getY()).estVide() && this.donjon.getPosition(getX()-1, getY()).estVide()) {
						if ((getX()-3 < Configurations.getGrilleX())&& (getX()-3 > 0))
						{
							e = donjon.getElementMobile(getX()-3, getY());
							if (e == null) {
								setX(getX()-3);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
						
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest  && this.donjon.getPosition(getX(), getY()-2).estVide()&& this.donjon.getPosition(getX(), getY()-1).estVide()) {
						if ((getX()-3 < Configurations.getGrilleX())&& (getX()-3 > 0)) {
							e = donjon.getElementMobile(getX(), getY()-3);
							if (e == null) {
								setY(getY()-3);
							}
							else {
								if (e.getNomE().equals("Humain")) {
											
										direction = random.nextInt(4);
										}
								}
						}
							
						
						
					}
					break;
			}
		
		}				
		}
		
	

	}
}

