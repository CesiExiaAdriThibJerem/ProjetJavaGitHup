package simulationInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

import simulationMetier.ElementsMobile;
import configuration.Configurations;

@SuppressWarnings("serial")
public class AffichageStats extends JFrame{

	private JLabel nbrhumaclass;
	private JLabel nbrhumaeclair;
	private JLabel nbrhumateleport;
	private JLabel nbrhumabuffer;
	private JLabel tour;
	
	private Clip clip;
	
	private JButton pasapas;

	private boolean pas = false;
	private boolean modepas = false;

	private JLabel pdvMonstre;

	private long vitesse = 300;

	public AffichageStats() { // On creer l'affichage graphique
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
		slide.setBorder(new TitledBorder("Vitesse"));

		this.add(slide);

		pasapas = new JButton("Pas a pas");

		pasapas.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {

				pas = false;


			}
		});

		pasapas.setEnabled(false);
		pasapas.setSize(125, 25);
		JPanel panbut = new JPanel();
		panbut.add(pasapas);

		this.add(panbut);

		this.setVisible(true);
		
		try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("sons/jeu.wav"));
            // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
		
		
	}

	public void rafraichir(int nbrTour) { // Methode qui permet de rafraichir l'affichage
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
