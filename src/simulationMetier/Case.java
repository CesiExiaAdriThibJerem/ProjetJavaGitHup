package simulationMetier;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Case {

	private Image image;
	protected boolean vide;

	// methode retournat le non de l'image
	public Image getImage() {
		return image;
	}

	// methode récupérant le nom de l'image pour la lire dans l'affichage remonte aussi le boolean de estVide
	public Case(String img, boolean vide)
	{
		this.vide = vide;
		try {


			this.image = ImageIO.read(new File("image/"+img));

		} catch (Exception e) 

		{
			System.out.print("impossible d'afficher l'image : "+ img);


		}


	}

	//methode servant à qualifer de vide ou non une case pour savoir si le deplacemet est autorisé

	public boolean estVide() {
		return this.vide;
	}

}
