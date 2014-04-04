package simulationMetier;

public class HumainBuffer extends ElementsMobile {
	HumainBuffer()
	{
		setImage("hommebuufer.png");
		this.deplacement=1;
		this.vision=2;
		this.vivant= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
	}
	
	protected void bouger() 
	{
		if(vivant=true)
		{
			modifierDirection();
			avancer(deplacement);	
		}
		
	}

}
