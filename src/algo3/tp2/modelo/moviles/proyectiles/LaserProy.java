package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Rectangle;

import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class LaserProy extends Proyectil {
	private LaserProy(int posX, int posY) {
		this.cuerpo = new Rectangle(posX, posY, 5, 10);
		this.formaVuelo = new Recto(5);
	}
	
	public LaserProy() {
		super();
	}
	
	@Override
	public Proyectil crearInstancia(int posX, int posY) {
		return new LaserProy(posX, posY);
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getLaserVista();
	}
}
