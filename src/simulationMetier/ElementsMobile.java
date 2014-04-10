package simulationMetier;

import java.awt.Image;
import java.io.File;



import javax.imageio.ImageIO;

import configuration.Configurations;


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
	protected static int hpMob;
	
	protected boolean mort = false;
	
	public boolean isMort() {
		return mort;
	}




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
				System.out.println("impossible d'afficher l'image: "+ image);
					
					
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
	public void setPdvMonstre(int hpMob)
	{
		
		 ElementsMobile.hpMob = hpMob;
	}
	public static int getPdvMonstre()
	{
		return ElementsMobile.hpMob;
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
	
	public void mourir() {
		setImage("sol1.png");

		if (this.mort == false) {
			
			if (this.nomE.equals("humainbuf")) {
				Configurations.setNbrHumainsBuffer(Configurations.getNbrHumainsBuffer() - 1);
			}
			else if (this.nomE.equals("humainclass")) {
				Configurations.setNbrHumainsClassique(Configurations.getNbrHumainsClassique() - 1);
			}
			else if (this.nomE.equals("humaineclair")) {
				Configurations.setNbrHumainsEclaireur(Configurations.getNbrHumainsEclaireur() - 1);
			}
			else if (this.nomE.equals("humaintp")) {
				Configurations.setNbrHumainsTeleport(Configurations.getNbrHumainsTeleport() - 1);
			}
			this.mort = true;
			ElementsMobile.hpMob = hpMob + 20;
		}
		
		
	}
}
