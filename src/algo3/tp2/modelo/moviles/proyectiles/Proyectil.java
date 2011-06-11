package algo3.tp2.modelo.moviles.proyectiles;

import algo3.tp2.modelo.moviles.Movil;

public abstract class Proyectil extends Movil
{
	private int danio;

	public int getDanio() {
		return danio;
	}
	
	public abstract Proyectil crearInstancia();

}


