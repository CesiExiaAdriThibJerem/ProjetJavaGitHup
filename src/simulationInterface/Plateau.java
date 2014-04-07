package simulationInterface;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import simulationMetier.Case;
import simulationMetier.ElementsMobile;


public class Plateau {
	
	private ArrayList<ElementsMobile> mobile;
	private ListIterator<ElementsMobile> it;
	private int largeur;
	private int longueur;
	private Case caseDonjons[][];
	private JPanel contentpan;
	private JFrame fen;
	
	
	public Plateau(int largeur, int longueur, Case[][] casesDonjons) {
		this.caseDonjons = new Case[largeur][longueur];
		this.mobile = new ArrayList<>();
		
		this.largeur = largeur;
		this.longueur = longueur;
		
		for (int y1 = 0; y1 < longueur; y1++) 
		{
			for (int x1 = 0; x1 < largeur ; x1++) 
			{
				this.caseDonjons[y1][x1] = casesDonjons[y1][x1];
				
			}
		}
			
		
		fen = new JFrame();
		
		fen.setTitle("Donjons");
		fen.setLocationRelativeTo(null);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(30*largeur,30*longueur);
		
		contentpan = new JPanel();
		GridLayout cl = new GridLayout(largeur,longueur);
		contentpan.setLayout(cl);
		
		
		
		for (int y = 0; y < largeur; y++) 
		{
			for (int x = 0; x < longueur; x++) 
			{
				
				contentpan.add(new JLabel(new ImageIcon(this.caseDonjons[x][y].getImage())));							
			}
		}
		
		fen.setResizable(false);	
		fen.setContentPane(contentpan);
		fen.setVisible(true);
	}
	
	public void placerElement(ElementsMobile e) {
		mobile.add(e);
	}
	
	public void rafraichir() {
		contentpan = new JPanel();
		contentpan.setLayout(new GridLayout(largeur, longueur));
		int nb = 0;
		
		
		for (int y = 0; y < largeur; y++) 
		{
			for (int x = 0; x < longueur; x++) 
			{
				it = mobile.listIterator();
				while (it.hasNext() == true) {
					ElementsMobile e = it.next();
					
					if ((e.getX() == y) &&( e.getY() == x)) {
						
						contentpan.add(new JLabel(new ImageIcon(e.getImage())));
						nb = 1;
					}
				}
				
				if (nb == 0) {
					contentpan.add(new JLabel(new ImageIcon(this.caseDonjons[x][y].getImage())));	
				}
				else {
					nb = 0;
				}
				
									
			}
		}
		
		fen.setContentPane(contentpan);
		fen.setVisible(true);
		this.mobile = new ArrayList<>();
	}
	
}
