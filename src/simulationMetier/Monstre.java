package simulationMetier;



public class Monstre extends ElementsMobile
{
	private int hp;
	private int compteurObstacle=0;
	Monstre()
	{
		this.direction=4;
		this.deplacement=1;
		this.vision=1;
		hp = 100;
		this.x = getX();
		this.y = getY();
	}
	
	public void setImage()
	{
		
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
				this.avancer();
				compteurObstacle = 0;
			}
			else
			{
				this.tournerADroite();
				this.avancer();
				compteurObstacle = compteurObstacle +1;
			}
		}
		else
		{
			this.avancer();
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