package configuration;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FenetreConfig extends JFrame{
	
	private int grilleX;
	private int grilleY;
	private int nbrObstacle;
	private int nbrHumainsClassique;
	private int nbrHumainsEclaireur;
	private int nbrHumainsTeleport;
	private int nbrHumainsBuffer;
	private boolean valide = false;
	
	
	public FenetreConfig() {
		this.setTitle("Donjons - Configurations");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800, 600);
		
		this.setLayout(new GridBagLayout());
		
		JLabel bienvenue = new JLabel("Bienvenue dans Donjons !");
		JLabel regle = new JLabel("Veuillez configurer les paramètre de jeu");
		
		JLabel taillex = new JLabel("Taille de la grille en X :");
		JLabel tailley = new JLabel("Taille de la grille en Y :");
		JLabel nbrobs = new JLabel("Nombre d'obstacles :");
		JLabel nbrhuma = new JLabel("Nombre d'humains :");
		JLabel nbreclair = new JLabel("Nombre d'éclaireurs :");
		JLabel nbrteleport = new JLabel("Nombre de téléporteurs :");
		JLabel nbrpretre = new JLabel("Nombre de pretre :");
		
		JTextField taillexField = new JTextField();
		JTextField tailleyField = new JTextField();
		JTextField nbrobsField = new JTextField();
		JTextField nbrhumaField = new JTextField();
		JTextField nbreclairField = new JTextField();
		JTextField nbrteleportField = new JTextField();
		JTextField nbrpretreField = new JTextField();
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
        
        
        
        this.setVisible(true);
	}

	public int getGrilleX() {
		return grilleX;
	}

	public void setGrilleX(int grilleX) {
		this.grilleX = grilleX;
	}

	public int getGrilleY() {
		return grilleY;
	}

	public void setGrilleY(int grilleY) {
		this.grilleY = grilleY;
	}

	public int getNbrObstacle() {
		return nbrObstacle;
	}

	public void setNbrObstacle(int nbrObstacle) {
		this.nbrObstacle = nbrObstacle;
	}

	public int getNbrHumainsClassique() {
		return nbrHumainsClassique;
	}

	public void setNbrHumainsClassique(int nbrHumainsClassique) {
		this.nbrHumainsClassique = nbrHumainsClassique;
	}

	public int getNbrHumainsEclaireur() {
		return nbrHumainsEclaireur;
	}

	public void setNbrHumainsEclaireur(int nbrHumainsEclaireur) {
		this.nbrHumainsEclaireur = nbrHumainsEclaireur;
	}

	public int getNbrHumainsTeleport() {
		return nbrHumainsTeleport;
	}

	public void setNbrHumainsTeleport(int nbrHumainsTeleport) {
		this.nbrHumainsTeleport = nbrHumainsTeleport;
	}

	public int getNbrHumainsBuffer() {
		return nbrHumainsBuffer;
	}

	public void setNbrHumainsBuffer(int nbrHumainsBuffer) {
		this.nbrHumainsBuffer = nbrHumainsBuffer;
	}
	
	public boolean getValide() {
		return valide;
	}
}
