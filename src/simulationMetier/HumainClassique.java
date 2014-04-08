package simulationMetier;

public class HumainClassique extends ElementsMobile {
	
	HumainClassique()
	{
		setImage("hommeclassique.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
	}
	
	public void bouger() 
	{
		if(vivant=true)
		{
			
		}
		
	}

	

}
