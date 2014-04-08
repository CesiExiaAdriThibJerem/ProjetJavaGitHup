package simulationMetier;

public class HumainEclaireur extends ElementsMobile  {
	HumainEclaireur(Donjon donjon)
	{
		setImage("hommeeclaireur.png");
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
