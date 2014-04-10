package simulationInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

import simulationMetier.ElementsMobile;
import configuration.Configurations;

@SuppressWarnings("serial")
public class AffichageStats extends JFrame{
	
	private JLabel nbrhumaclass;
	private JLabel nbrhumaeclair;
	private JLabel nbrhumateleport;
	private JLabel nbrhumabuffer;
	private JLabel tour;
	
	private JButton pasapas;
	
	private boolean pas = false;
	private boolean modepas = false;
	
	private JLabel pdvMonstre;
	
	private long vitesse = 300;
	
	public AffichageStats() {
		this.nbrhumaclass = new JLabel();
		this.nbrhumaeclair = new JLabel();
		this.nbrhumateleport = new JLabel();
		this.nbrhumabuffer = new JLabel();
		this.pdvMonstre = new JLabel();
		
		this.tour = new JLabel();
		
		this.nbrhumaclass.setText(Integer.toString(Configurations.getNbrHumainsClassique()));
		this.nbrhumaeclair.setText(Integer.toString(Configurations.getNbrHumainsEclaireur()));
		this.nbrhumateleport.setText(Integer.toString(Configurations.getNbrHumainsTeleport()));
		this.nbrhumabuffer.setText(Integer.toString(Configurations.getNbrHumainsBuffer()));
		
		tour.setText("0");
		
		this.setTitle("Statistique");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 600);
		
		this.setLayout(new GridLayout(7,2));
		
		this.add(new JLabel("Point de vie du monstre : "));
		this.add(pdvMonstre);
		
		this.add(new JLabel("Nombre de tour : "));
		this.add(tour);
		
		this.add(new JLabel("Nombre d'humains : "));
		this.add(nbrhumaclass);
		
		this.add(new JLabel("Nombre d'éclaireur : "));
		this.add(nbrhumaeclair);
		
		this.add(new JLabel("Nombre de teleporteur : "));
		this.add(nbrhumateleport);
		
		this.add(new JLabel("Nombre de prêtre : "));
		this.add(nbrhumabuffer);
		
		JSlider slide = new JSlider(0, 600, 300);
		slide.addChangeListener(new EvenementStats(this));
		
		this.add(slide);
		
		pasapas = new JButton("-> Pas a pas");
		
		pasapas.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				pas = false;
				
				
			}
		});
		
		pasapas.setEnabled(false);
		this.add(pasapas);
		
		this.setVisible(true);
	}
	
	public void rafraichir(int nbrTour) {
		this.tour.setText(Integer.toString(nbrTour));
		
		this.nbrhumaclass.setText(Integer.toString(Configurations.getNbrHumainsClassique()));
		this.nbrhumaeclair.setText(Integer.toString(Configurations.getNbrHumainsEclaireur()));
		this.nbrhumateleport.setText(Integer.toString(Configurations.getNbrHumainsTeleport()));
		this.nbrhumabuffer.setText(Integer.toString(Configurations.getNbrHumainsBuffer()));
		
		this.pdvMonstre.setText(Integer.toString(ElementsMobile.getPdvMonstre()));
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

	public long getVitesse() {
		return vitesse;
	}

	public JLabel getPdvMonstre() {
		return pdvMonstre;
	}

	public void setVitesse(long vitesse) {
		this.vitesse = vitesse;
	}

	public boolean isPas() {
		return pas;
	}

	public void setPas(boolean pas) {
		this.pas = pas;
	}

	public boolean isModepas() {
		return modepas;
	}

	public void setModepas(boolean modepas) {
		this.modepas = modepas;
	}

	public JButton getPasapas() {
		return pasapas;
	}
}
