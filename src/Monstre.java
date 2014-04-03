
public class Monstre extends ObjetMobile
{
	
	Monstre()
	{
		this.deplacement=1;
		this.vision=1;
	}
	private void bouger()
	{
		boolean testObstacle;
		this.deplacement(deplacement);
		testObstacle = this.obstacleDevant();
		if (testObstacle == true)
		{
			
		}
		
	}
	private boolean obstacleDevant()
	{
	    boolean obstacle=true;
	    
	    //detection si il ya mur ou rocher devant le monstre
	    // si oui retourne true
	    
		return obstacle;
	}

}
