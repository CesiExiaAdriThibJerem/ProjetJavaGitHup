package simulationMetier;



public class Humain extends ElementsMobile {
	protected boolean enVie;
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
	
	public void bouger() {
		
		
	}
	
	
	

}
