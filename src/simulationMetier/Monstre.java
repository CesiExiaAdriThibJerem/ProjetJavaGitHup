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
		
		
		
		if (!this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud ) {
			
			ElementsMobile  e = donjon.getElementMobile(getX()+1, getY());
			
			if (e == null) {
				
			direction = est;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				
				direction = nord;
				
			}
			}
			else {
				
			}
			
		}
		else if (this.donjon.getPosition(getX() + 1, getY()).estVide() && direction == sud)  
		{
			ElementsMobile  e = donjon.getElementMobile(getX()+1, getY());
			
			if (e == null) {
				setX(getX() + 1);
			}
			else {
				
			}
			
		}
		else if (!this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {
			
			ElementsMobile  e = donjon.getElementMobile(getX(), getY()+1);
			
			if (e == null) {
				
			direction = nord;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				
				direction = ouest;
				
			}
			}
			else {
				
			}
			
		}
		else if (this.donjon.getPosition(getX(), getY() + 1).estVide() && direction == est) {
			ElementsMobile  e = donjon.getElementMobile(getX(), getY()+1);
			if (e == null) {
				setY(getY()+1);
			}
			else {
				
			}
		}
		
		else if (!this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			ElementsMobile  e = donjon.getElementMobile(getX()-1, getY());
			if (e==null) {
				
				direction = ouest;
				
				compteurObstacle ++ ;
				
				if (compteurObstacle == 6)
				{
					compteurObstacle = 0 ;
				
					direction = sud;
					
				}
				else {
					
				}
			}
			
		}
		else if (this.donjon.getPosition(getX() - 1, getY()).estVide() && direction == nord) {
			ElementsMobile  e = donjon.getElementMobile(getX()-1, getY());
			
			if (e==null) {
				setX(getX()-1);
			}
			else {
				
			}
		}
		
		else if (!this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			ElementsMobile  e = donjon.getElementMobile(getX(), getY()-1);
			if (e == null) {
				
			direction = sud;
			
			compteurObstacle ++ ;
			
			if (compteurObstacle == 6)
			{
				compteurObstacle = 0 ;
				
				direction = est;
				
			}
			}
			else {
				
			}
			
		}
		else if (this.donjon.getPosition(getX(), getY()-1).estVide() && direction == ouest) {
			ElementsMobile  e = donjon.getElementMobile(getX(), getY()-1);
			if (e== null) {
				setY(getY()-1);
			}
			else {
				
			}
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