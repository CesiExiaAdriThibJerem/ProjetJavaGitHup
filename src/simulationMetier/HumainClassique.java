package simulationMetier;

import java.util.Random;

public class HumainClassique extends ElementsMobile {
	
	HumainClassique(Donjon donjon)
	{
		setImage("hommeclassique.png");
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
		if(vivant==true)
		{

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
		

		}
		
	}
}




