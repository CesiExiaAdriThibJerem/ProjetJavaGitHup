package simulationMetier;



public class Humain extends ElementsMobile {
	private boolean enVie;
	Humain()
	{
		this.deplacement=1;
		this.vision=2;
		this.enVie= true;
		this.direction=sud;
		this.x=getX();
		this.y=getY();
	}
	Humain(final String img)
	{
		setImage(img);
	}
	protected void bouger()
	{
		if(this.enVie==true)
		{
			modifierDirection();
			avancer(deplacement);
			
		}
	}
	
	
	

}
