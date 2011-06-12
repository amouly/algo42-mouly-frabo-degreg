package algo3.tp2.modelo;

import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public class Escenario extends ObjetoPosicionable implements ObjetoVivo {
	
	public Escenario() {
		cuerpo = new Rectangle(0, 0, 600, 600);
	}
	
	@Override 
	public void vivir() {
		// TODO Auto-generated method stub

	}

}
