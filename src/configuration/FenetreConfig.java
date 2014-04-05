package configuration;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	private JLabel noncondition = new JLabel();
	
	private JTextField taillexField;
	private JTextField tailleyField;
	private JTextField nbrobsField;
	private JTextField nbrhumaField;
	private JTextField nbreclairField;
	private JTextField nbrteleportField;
	private JTextField nbrpretreField;
	
	public FenetreConfig() {
		this.setTitle("Donjons - Configurations");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(800, 600);
		
		this.setLayout(new GridLayout(10,1));
		
		Font police = new Font("Consolas", Font.BOLD, 14);
		Font policeAttention = new Font("Consolas", Font.BOLD, 18);
		noncondition.setFont(policeAttention);
		
		JLabel bienvenue = new JLabel("Bienvenue dans Donjons !"); bienvenue.setFont(police);
		JLabel regle = new JLabel("Veuillez configurer les paramètre de jeu :"); regle.setFont(police);
		
		JLabel taillex = new JLabel("Taille de la grille (entre 10 et 50) :"); taillex.setFont(police);
		JLabel tailley = new JLabel("Taille de la grille en Y(entre 10 et 50) :"); tailley.setFont(police);
		JLabel nbrobs = new JLabel("Nombre d'obstacles(entre 0 et 30) :"); nbrobs.setFont(police);
		JLabel nbrhuma = new JLabel("Nombre d'humains(entre 0 et 20) :"); nbrhuma.setFont(police);
		JLabel nbreclair = new JLabel("Nombre d'éclaireurs(entre 0 et 20) :"); nbreclair.setFont(police);
		JLabel nbrteleport = new JLabel("Nombre de téléporteurs(entre 0 et 20) :"); nbrteleport.setFont(police);
		JLabel nbrpretre = new JLabel("Nombre de pretre(entre 0 et 20) :"); nbrpretre.setFont(police);
		
		taillexField = new JTextField();
		tailleyField = new JTextField();
		nbrobsField = new JTextField();
		nbrhumaField = new JTextField();
		nbreclairField = new JTextField();
		nbrteleportField = new JTextField();
		nbrpretreField = new JTextField();
		
		this.add(bienvenue);
		this.add(regle);
		
		JPanel contentpan1 = new JPanel();
		contentpan1.setLayout(new GridLayout(2,1));
		
		contentpan1.add(taillex);
		contentpan1.add(taillexField);
		contentpan1.add(nbrobs);
		contentpan1.add(nbrobsField);
		
		JPanel contentpan2 = new JPanel();
		contentpan2.setLayout(new GridLayout(2,1));
				
		contentpan2.add(nbrhuma);
		contentpan2.add(nbrhumaField);
		contentpan2.add(nbreclair);
		contentpan2.add(nbreclairField);
		
		JPanel contentpan3 = new JPanel();
		contentpan3.setLayout(new GridLayout(2,1));
		
		contentpan3.add(nbrteleport);
		contentpan3.add(nbrteleportField);
		contentpan3.add(nbrpretre);
		contentpan3.add(nbrpretreField);
		
		
		this.add(contentpan1);
		this.add(contentpan2);
		this.add(contentpan3);
		
		JButton butquit = new JButton("Quitter");
		JButton butnew = new JButton("Nouveau Jeu");
		butnew.setFont(police);
		butquit.setFont(police);
		
		butnew.addActionListener(new Evenements(this));
		butquit.addActionListener(new Evenements(this));
		
		JPanel contentpan5 = new JPanel();
		contentpan5.setLayout(new GridLayout(1,2));
		
		contentpan5.add(butquit);
		contentpan5.add(butnew);
		
        this.add(contentpan5);
        
        JPanel contentpan6 = new JPanel();
        contentpan6.add(noncondition);
        
        
        this.add(contentpan6);
        this.setResizable(false);
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
	
	

	public JLabel getNoncondition() {
		return noncondition;
	}

	public JTextField getTaillexField() {
		return taillexField;
	}

	public JTextField getTailleyField() {
		return tailleyField;
	}

	public JTextField getNbrobsField() {
		return nbrobsField;
	}

	public JTextField getNbrhumaField() {
		return nbrhumaField;
	}

	public JTextField getNbreclairField() {
		return nbreclairField;
	}

	public JTextField getNbrteleportField() {
		return nbrteleportField;
	}

	public JTextField getNbrpretreField() {
		return nbrpretreField;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public boolean isValide() {
		return valide;
	}
}
