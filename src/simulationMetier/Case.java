package simulationMetier;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Case {
	
	private Image image;
	protected boolean vide;
	
	
	public Image getImage() {
		return image;
	}


	public Case(String img, boolean vide)
	{
		this.vide = vide;
		try {
			
			
			this.image = ImageIO.read(new File("image/"+img));
			
		} catch (Exception e) 
		
		{
			System.out.print("impossible d'afficher l'image: "+ img);
			
			
		}
		
		
	}
	
	public boolean estVide() {
		return this.vide;
	}

}
