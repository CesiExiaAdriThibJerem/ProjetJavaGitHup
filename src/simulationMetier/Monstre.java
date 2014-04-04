package simulationMetier;



public class Monstre extends ElementsMobile
{
	private int hp;
	Monstre()
	{
		this.direction=4;
		this.deplacement=1;
		this.vision=1;
		hp = 100;
		this.x = getX();
		this.y = getY();
	}
	protected void bouger()
	{
		
		
		boolean testObstacle;
		this.avancer();
		testObstacle = this.obstacleDevant(this.x, this.y);
		if (testObstacle == true)
		{
			
			this.demiTour();
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
	@Override
	protected void modifDirection() {
		// TODO Auto-generated method stub
		
	}

}