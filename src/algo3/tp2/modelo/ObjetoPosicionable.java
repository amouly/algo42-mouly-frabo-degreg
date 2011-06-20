package algo3.tp2.modelo;

import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.Posicionable;

public class ObjetoPosicionable implements Posicionable {
	protected Rectangle cuerpo; /* Cuerpo físico del objeto, dimensión y posición. */
	
	@Override
	public int getX() {
		return new Double(cuerpo.getX()).intValue();
	}

	@Override
	public int getY() {
		return new Double(cuerpo.getY()).intValue();
	}
	
	public Rectangle getCuerpo() {
		return cuerpo;
	}
}
