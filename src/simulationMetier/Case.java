package simulationMetier;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Case {
	
	private Image image;
	
	
	public Image getImage() {
		return image;
	}


	public Case(String img)
	{
		try {
			
			this.image = ImageIO.read(new File("image/"+img));
			
		} catch (Exception e) 
		
		{
			System.out.print("impossible d'afficher l'image: "+ img);
			
			
		}
		
		
	}

}
