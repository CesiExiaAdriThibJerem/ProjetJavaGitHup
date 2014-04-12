package simulationMetier;



public class Pierre extends ElementsMobile {
	private ElementsMobile e;
	Pierre(Donjon donjon)
	{
		setImage("pierre.png");
		this.deplacement=0;
		this.vision=0;
		this.nomE = "Pierre";
		this.donjon = donjon;
	}

	@Override
	public void bougerPierre(int x, int y) {
		if (donjon.getPosition(x, y).estVide()) {
			e = donjon.getElementMobile(x, y);
			
			if (e == null) {
				setX(x);
				setY(y);
			}
		}

	}

	@Override
	public void bouger() {
		// TODO Auto-generated method stub
		
	}

}

