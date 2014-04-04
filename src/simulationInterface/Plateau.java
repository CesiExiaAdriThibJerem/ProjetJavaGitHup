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
	private Case cases[][];
	
	public Plateau(int largeur, int longueur, Case casesDonjons[][]) {
		
		this.largeur = largeur;
		this.longueur = longueur;
		
		for (int y = 0; y <= this.largeur ; y++) {
			for (int x = 0; y <= this.longueur ; x++) {
				this.cases[x][y] = casesDonjons[x][y];
			}
		}
		
		JFrame fen = new JFrame();
		
		fen.setTitle("Donjons");
		fen.setLocationRelativeTo(null);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(1280,1024);
		
		JPanel contentpan = new JPanel();
		GridLayout cl = new GridLayout(this.largeur,this.longueur);
		contentpan.setLayout(cl);
		
		for (int y1 = 0; y1 < this.largeur ; y1++) {
			for (int x1 = 0; y1 < this.longueur ; x1++) {
				contentpan.add(new JLabel(new ImageIcon(this.cases[x1][y1].getImage())));
			}
		}
		
			
		fen.setContentPane(contentpan);
		fen.setVisible(true);
	}
	
}
