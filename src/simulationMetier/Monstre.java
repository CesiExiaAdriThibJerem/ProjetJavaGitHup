package simulationMetier;



public class Monstre extends ElementsMobile
{
	private int hp;
	private int compteurObstacle=0;
	private boolean verif ;
	Monstre(Donjon donjon)
	{
		this.donjon = donjon;
		setImage("monstre.png");
		this.direction=sud;
		this.deplacement=1;
		this.vision=1;
		hp = 100;
		this.x = getX();
		this.y = getY();
	}
	
	
	public void bouger()
	{		
		//System.out.println("Monstre : " + getX() + " " + getY());
		
		
		if (!this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud) {
			
			//setY(getY()+1);
			direction = est;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				//setX(getX() - 1);
				//setY(getY()-1);
				direction = nord;
				
			}
		}
		else if (this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud)  
		{
			
			setX(getX() + 1);
			
		}
		else if (!this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {
			
			//setX(getX() - 1);
			direction = nord;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				//setY(getY() - 1);
				//setX(getX() + 1);
				direction = ouest;
				
			}
		}
		else if (this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {
			setY(getY()+1);
		}
		
		else if (!this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			
			//setY(getY() - 1);
			direction = ouest;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				//setX(getX() +1);
				//setY(getY() + 1);
				direction = sud;
				
			}
		}
		else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			setX(getX()-1);
		}
		
		else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			
			//setX(getX() +1);
			direction = sud;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				//setY(getY()+1);
				//setX(getX() -1);
				direction = est;
				
			}
		}
		else if (this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			setY(getY()-1);
		}
		hp = hp -1;
		System.out.println(getHp());
		
	}
	public int getHp()
	{
		return this.hp;
	}
	
	
	void mangerHumain()
	{
		
		hp=hp+20;
		
	}

}