package simulationMetier;

public class HumainEclaireur extends ElementsMobile  {
	HumainEclaireur()
	{
		setImage("hommeeclaireur.png");
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
