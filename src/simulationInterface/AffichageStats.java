package simulationInterface;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AffichageStats extends JFrame{
	
	private JLabel nbrhumaclass;
	private JLabel nbrhumaeclair;
	private JLabel nbrhumateleport;
	private JLabel nbrhumabuffer;
	private JLabel tour;
	
	public AffichageStats() {
		this.setTitle("Statistique");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 800);
		
		
		this.setVisible(true);
	}
	
	public void rafraichir() {
		
	}

	public JLabel getNbrhumaclass() {
		return nbrhumaclass;
	}

	public JLabel getNbrhumaeclair() {
		return nbrhumaeclair;
	}

	public JLabel getNbrhumateleport() {
		return nbrhumateleport;
	}

	public JLabel getNbrhumabuffer() {
		return nbrhumabuffer;
	}

	public JLabel getTour() {
		return tour;
	}
}
