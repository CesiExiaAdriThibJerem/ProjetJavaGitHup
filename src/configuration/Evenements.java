package configuration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evenements implements ActionListener{

	private FenetreConfig fen;

	public Evenements(FenetreConfig fen) {
		this.fen = fen;
	}


	public void actionPerformed(ActionEvent e) {
		String nom = e.getActionCommand();

		if (nom.equals("Quitter")) {
			System.exit(0);
		}

		if (nom.equals("Nouveau Jeu")) {

			String Staillex = fen.getTaillexField().getText();
			String Stailley = fen.getTaillexField().getText();
			String SnbrObs = fen.getNbrobsField().getText();
			String SnbrHuma = fen.getNbrhumaField().getText();
			String SnbrEclair = fen.getNbreclairField().getText();
			String SnbrTeleport = fen.getNbrteleportField().getText();
			String SnbrPretre = fen.getNbrpretreField().getText();

			int a1 = Integer.parseInt(Staillex);
			int a2 = Integer.parseInt(Stailley);
			int a3 = Integer.parseInt(SnbrObs);
			int a4 = Integer.parseInt(SnbrHuma);
			int a5 = Integer.parseInt(SnbrEclair);
			int a6 = Integer.parseInt(SnbrTeleport);
			int a7 = Integer.parseInt(SnbrPretre);

			int somme = a3+a4+a5+a6+a7;

			if ( a1 < 20 && somme > 60) {
				fen.getNoncondition().setText("Attention : Ne pas exceder les 60 elements pour une taille inférieur a 20");
				
			}
			else if ((a1 >= 10 && a1 <=50) && (a2 >= 10 && a2 <=50) && (a3 >= 0 && a3 <=30) && (a4 >= 0 && a4 <=20) && (a5 >= 0 && a5 <=20) && (a6 >= 0 && a6 <=20) && (a7 >= 0 && a7 <=20))
			{
				fen.getNoncondition().setText("");
				attributionDesParametre(a1,a2,a3,a4,a5,a6,a7);	
				Configurations.setValide(true);
				fen.dispose();
			}
			else {
				fen.getNoncondition().setText("Veuillez vérifier, les conditions ne sont pas respectés !");
			}



		}

	}

	private void attributionDesParametre(int a1, int a2, int a3, int a4, int a5, int a6, int a7) {
		Configurations.setGrilleX(a1);
		Configurations.setGrilleY(a2);
		Configurations.setNbrObstacle(a3);
		Configurations.setNbrHumainsClassique(a4);
		Configurations.setNbrHumainsEclaireur(a5);
		Configurations.setNbrHumainsTeleport(a6);
		Configurations.setNbrHumainsBuffer(a7);
	}

}
