package simulationMetier;

import java.util.Random;

import configuration.Configurations;

public class HumainTeleport extends ElementsMobile {
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
	}
	
	public void bouger()
	{
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
						
						setX(getX() + 1);
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est ) {
						setY(getY()+1);
					}
					
					else if (!this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord ) {
						setX(getX()-1);
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest  ) {
						setY(getY()-1);
					}
					break;
					
				case 1 :
					
					direction= random.nextInt(4);
					if (!this.donjon.getPosition(getX() + 2, getY()).estVide() && direction == sud ) {
						
						direction = random.nextInt(4); 				
						
					}
					else if (this.donjon.getPosition(getX() + 2, getY()).estVide() && direction == sud )  
					{
						if ((getX()+2 < Configurations.getGrilleX())&& (getX()+2 > 0)) {
							setX(getX() + 2);
						}
						
						
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {
						if ((getY()+2 < Configurations.getGrilleY())&& (getY()+2 > 0)) {
							setY(getY()+2);
						}
						
					}
					
					else if (!this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {
						if ((getX()-2 < Configurations.getGrilleX())&& (getX()-2 > 0)) {
							setX(getX()-2);
						}
						
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest  ) {
						if ((getY()-2 < Configurations.getGrilleX())&& (getY()-2 > 0)) {
							setY(getY()-2);
						}
						
					}
					break;
					
				case 2 :
					
					direction= random.nextInt(4);
					if (!this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud ) {
						
						direction = random.nextInt(4); 				
						
					}
					else if (this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud )  
					{
						if ((getX()+3 < Configurations.getGrilleX())&& (getY()+3 > 0)) {
							setX(getX() + 3);
						}
						
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est ) {
						if ((getY()+3 < Configurations.getGrilleX())&& (getY()+3 > 0)) {
							setY(getY()+3);
						}
						
					}
					
					else if (!this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord ) {
						if ((getX()-3 < Configurations.getGrilleX())&& (getX()-3 > 0))
						setX(getX()-3);
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest  ) {
						if ((getY()-3 < Configurations.getGrilleX())&& (getY()-3 > 0)) {
							setY(getY()-3);
						}
						
					}
					break;
			}
		
						
		}
		
	

	}
}

