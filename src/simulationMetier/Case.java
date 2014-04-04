package simulationMetier;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

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
			
		} catch (final IOException e) 
		
		{
			e.printStackTrace();
			System.out.print("impossible d'afficher l'image: "+ img);
			
			
		}
		
		
	}

}
