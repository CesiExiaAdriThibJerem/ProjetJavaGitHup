package simulationMetier;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
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
	
	protected String nomE = "Humain";
	
	public String getNomE() {
		return nomE;
	}




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
	
	
	public abstract void bouger();
	
	public int getX()
	{
		return this.x;//permet de connaitre la position x(abscisse) d'un element
	}
	public int getY()
	{

		return this.y;//permet de connaitre la position y(ordonnée) d'un element
	}
	
	
		
		
	
	public void setX(final int x) {
		this.x = x;
	}

	public void setY(final int y) {
		this.y = y;
	}
	
	

	public int getDirection() {
		return direction;
	}




	public void setDirection(int direction) {
		this.direction = direction;
	}

}
