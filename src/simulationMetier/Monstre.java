package simulationMetier;



public class Monstre extends ElementsMobile
{
	
	Monstre()
	{
		this.deplacement=1;
		this.vision=1;
		int hp = 100;
	}
	private void bouger()
	{
		boolean testObstacle;
		this.avancer(deplacement);
		testObstacle = this.obstacleDevant();
		if (testObstacle == true)
		{
			
			this.demiTour();
		}
		
		
	}
	private void demiTour()
	{
		this.tournerADroite();
		this.tournerADroite();
	}
	private boolean obstacleDevant()
	{
	    boolean obstacle=true;
	    
	    //detection si il ya mur ou rocher devant le monstre
	    // si oui retourne true
	    
		return obstacle;
	}
	void mangerHumain()
	{
		
	}

}