package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;

public class Jugador extends NaveAtacante {
	
	public Jugador() {
		this.cuerpo = new Rectangle(20, 30, 20, 20);
	}

	public void moverEnX(int deltaX) {
		cuerpo.setLocation((int) cuerpo.getX() + deltaX, (int) cuerpo.getY());
	}

	public void moverEnY(int deltaY) {
		cuerpo.setLocation((int) cuerpo.getX(), (int) cuerpo.getY() + deltaY);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub

	}
}
