package simulationInterface;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import simulationMetier.Case;

public class Plateau {
	
	
	public Plateau(int largeur, int longueur, Case[][] casesDonjons) {
		
		
		
		JFrame fen = new JFrame();
		
		fen.setTitle("Donjons");
		fen.setLocationRelativeTo(null);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(30*largeur,30*longueur);
		
		JPanel contentpan = new JPanel();
		GridLayout cl = new GridLayout(largeur,longueur);
		contentpan.setLayout(cl);
		
		for (int y = 0; y < largeur; y++) 
		{
			for (int x = 0; x < longueur; x++) 
			{				
				contentpan.add(new JLabel(new ImageIcon(casesDonjons[x][y].getImage())));							
			}
		}
		
		fen.setResizable(false);	
		fen.setContentPane(contentpan);
		fen.setVisible(true);
	}
	
}
