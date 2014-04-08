package simulationMetier;

import java.util.Random;

public class HumainClassique extends ElementsMobile {
	private ElementsMobile  e;
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

	



