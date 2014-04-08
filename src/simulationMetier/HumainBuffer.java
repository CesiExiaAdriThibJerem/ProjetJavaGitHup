package simulationMetier;

public class HumainBuffer extends ElementsMobile {
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
	}
	
	public void bouger() 
	{
		if(vivant=true)
		{
				
		}
		
	}

}
