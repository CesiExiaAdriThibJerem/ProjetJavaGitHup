package simulationMetier;



public class Monstre extends ElementsMobile
{
	private int hp;
	private int compteurObstacle=0;
	Monstre()
	{
		setImage("monstre.png");
		this.direction=sud;
		this.deplacement=1;
		this.vision=1;
		hp = 100;
		this.x = getX();
		this.y = getY();
	}
	
	
	protected void bouger()
	{		
		
		boolean testObstacle;		
		testObstacle = this.obstacleDevant(this.x, this.y);
		if (testObstacle == true)
		{
			if(compteurObstacle==3)
			{
				this.demiTour();
				this.avancer(deplacement);
				compteurObstacle = 0;
			}
			else
			{
				this.tournerADroite();
				this.avancer(deplacement);
				compteurObstacle = compteurObstacle +1;
			}
		}
		else
		{
			this.avancer(deplacement);
		}
		hp=hp-1;
		
		
	}
	public int getHp()
	{
		return this.hp;
	}
	
	private void demiTour()
	{
		this.tournerADroite();
		this.tournerADroite();
	}
	private boolean obstacleDevant(int x, int y)
	{
	    boolean obstacle;
	    
	    obstacle = this.donjon.getPosition(x, y).estVide();
	    //detection si il ya mur ou rocher devant le monstre
	    // si oui retourne true
	    
		return obstacle;
	}
	void mangerHumain()
	{
		hp=hp+20;
		
	}

}