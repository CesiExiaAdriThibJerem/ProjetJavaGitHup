package simulationMetier;

import java.awt.Image;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;


public abstract class ElementsMobile {
	
	public final static int nord = 0;
	public final static int ouest = 1;
	public final static int est = 2;
	public final static int sud = 3;
	
	protected int vision;
	protected int deplacement;
	protected boolean vivant;

	protected int direction;
	protected Donjon donjon;
	protected int x;
	protected int y;
	
	private Image img;

	
	
	public Image getImage() {
		return img;
	}




	public void setImage(String image)
	{
		try {
					
					
				this.img = ImageIO.read(new File("image/"+image));
					
			} catch (Exception e) 
				
			{
				System.out.print("impossible d'afficher l'image: "+ image);
					
					
			}
	}
	
	
	
	
	public int getX()
	{
		return this.x;//permet de connaitre la position x(abscisse) d'un element
	}
	public int getY()
	{

		return this.y;//permet de connaitre la position y(ordonn�e) d'un element
	}
	
	public int modifierX()
	{// modifie la valeur de x pour permettre un deplacement vers la droite ou la gauche
		
		switch(this.direction)
		{
		case est:
			if(this.x <donjon.getLongueurGrille())
			{
				
				return this.x +1;
			}
			break;
		case ouest :
			if(this.x>0)
			{
				
				return this.x -1;
				
			}
			break;
		default :
			
		return this.x;		
		}
		return 0; 

		
	}
	public int modifierY()
	{// modifie la valeur de y pour permettre un deplacement vers le haut ou le bas
		
		switch(this.direction)
		{
		
		case nord:
			if(this.y < donjon.getLargeurGrille())
			{
				
				return this.y -1;
			}
			break;
		case sud :
			
			if(this.y>0)
			{
				
				return this.y +1;
			}
			break;
			
		default :
			
			
		return this.y;		
		}
		return 0;
		
	}
	public void setX(final int x) {
		this.x = x;
	}

	public void setY(final int y) {
		this.y = y;
	}
	
	
	abstract public void bouger();
	
	protected void avancer(int move)
	{
		
		int i;
		for( i=0; i<move; i++ )
		{
			
			modifierX();
			modifierY();
		}
	}
	protected void modifierDirection()
	{
		this.direction =new Random().nextInt(4);
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
