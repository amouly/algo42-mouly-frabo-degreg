package algo3.tp2.modelo.moviles;

import java.awt.Rectangle;

import algo3.tp2.modelo.inmoviles.Energia;
import algo3.tp2.modelo.vuelos.Vuelo;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.Posicionable;

/* Define el comportamiento de todo Móvil del juego. */

public abstract class Movil implements Posicionable, ObjetoVivo
{
	protected Energia tanqueEnergia; /* Energía acumulada que posee un Móvil. */
	protected Vuelo formaVuelo; /* Forma con la que se desplaza un Móvil. */
	protected Rectangle cuerpo; /* Cuerpo físico del móvil, dimensión y posición. */

	@Override
	public int getX() {
		return new Double(cuerpo.getX()).intValue();
	}

	@Override
	public int getY() {
		return new Double(cuerpo.getY()).intValue();
	}
	
	public int getEnergia() {
		return tanqueEnergia.getCantidad();
	}

	public void restarEnergia(int unValor) {
		tanqueEnergia.restarCantidad(unValor);
	}
	
}
