package simulationInterface;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import simulationMetier.Case;

public class Plateau {
	private int largeur;
	private int longueur;
	
	public Plateau(int largeur, int longueur, Case[][] casesDonjons) {
		
		this.largeur = largeur;
		this.longueur = longueur;
		
		JFrame fen = new JFrame();
		
		fen.setTitle("Donjons");
		fen.setLocationRelativeTo(null);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(1280,920);
		
		JPanel contentpan = new JPanel();
		GridLayout cl = new GridLayout(largeur,longueur);
		contentpan.setLayout(cl);
		
		for (int y = 0; y < this.largeur; y++) 
		{
			for (int x = 0; x < this.longueur; x++) 
			{				
				contentpan.add(new JLabel(new ImageIcon(casesDonjons[x][y].getImage())));							
			}
		}
		
			
		fen.setContentPane(contentpan);
		fen.setVisible(true);
	}
	
}
