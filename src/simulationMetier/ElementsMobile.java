package simulationMetier;


public abstract class ElementsMobile {
	
	public final static int nord = 1;
	public final static int ouest = 2;
	public final static int est = 3;
	public final static int sud = 4;
	
	protected int vision;
	protected int deplacement;
	protected int direction;
	protected Donjon donjon;
	protected int x;
	protected int y;
	
	
	public void setImage()
	{
		
	}
	
	protected abstract void modifDirection();	//permet modifier la direction de 
												//deplacement des diff elements mobiles
	
	public int getX()
	{
		return this.x;//permet de connaitre la position x(abscisse) d'un element
	}
	public int getY()
	{
		return this.y;//permet de connaitre la position y(ordonnée) d'un element
	}
	
	public int modifierX()
	{// modifie la valeur de x pour permettre un deplacement vers la droite ou la gauche
		switch(this.direction)
		{
		case est:
			if(this.x <99)
			{
				return this.x +1;
			}
		case ouest :
			if(this.x>0)
			{
				return this.x -1;
			}
			
		default :
		return this.x;		
		} 
		
	}
	public int modifierY()
	{// modifie la valeur de y pour permettre un deplacement vers le haut ou le bas
		switch(this.direction)
		{
		case nord:
			if(this.y <99)
			{
				return this.y +1;
			}
		case sud :
			if(this.y>0)
			{
				return this.y -1;
			}
			
		default :
		return this.y;		
		}
		
	}
	
	
	
	abstract protected void bouger();
	
	protected void avancer()
	{
		modifierX();
		modifierY();
	}
	
	
	protected void tournerADroite()
	{
		this.direction = est;
	}
	protected void tournerAGauche()
	{
		this.direction = ouest;
	}

}
