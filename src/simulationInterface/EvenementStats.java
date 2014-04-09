package simulationInterface;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EvenementStats implements ChangeListener {
	
	private AffichageStats fen;
	
	public EvenementStats(AffichageStats fen) {
		this.fen = fen;
	}
	
	public void stateChanged(ChangeEvent arg0) {
		JSlider e = (JSlider) arg0.getSource();
		int nbr = e.getValue();
		
		long nbr2 = (long) nbr; 
		
		fen.setVitesse(nbr2);
		

	}

}
