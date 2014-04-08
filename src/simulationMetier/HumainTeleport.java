package simulationMetier;

import java.util.Random;

public class HumainTeleport extends ElementsMobile {
	HumainTeleport()
	{
		setImage("hommeteleport.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
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
						
						setX(getX() + 2);
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 2).estVide() && direction == est ) {
						setY(getY()+2);
					}
					
					else if (!this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 2, getY()).estVide() && direction == nord ) {
						setX(getX()-2);
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-2).estVide() && direction == ouest  ) {
						setY(getY()-2);
					}
					break;
					
				case 2 :
					
					direction= random.nextInt(4);
					if (!this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud ) {
						
						direction = random.nextInt(4); 				
						
					}
					else if (this.donjon.getPosition(getX() + 3, getY()).estVide() && direction == sud )  
					{
						
						setX(getX() + 3);
						
					}
					else if (!this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est ) {
						
						random.nextInt(4);				
						
					}
					else if (this.donjon.getPosition(getX(), getY() + 3).estVide() && direction == est ) {
						setY(getY()+3);
					}
					
					else if (!this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord ) {
						
						random.nextInt(4);
							
						}
					
					else if (this.donjon.getPosition(getX() - 3, getY()).estVide() && direction == nord ) {
						setX(getX()-3);
					}
					
					else if (!this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest ) {
						
						random.nextInt(4);
							
									}
					else if (this.donjon.getPosition(getX(), getY()-3).estVide() && direction == ouest  ) {
						setY(getY()-3);
					}
					break;
			}
		
						
		}
		
	

	}
}

