package algo3.tp2.modelo.moviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.vuelos.Vuelo;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

/* Define el comportamiento de todo Móvil del juego. */
public abstract class Movil extends ObjetoPosicionable
{
	protected Energia tanqueEnergia; /* Energía acumulada que posee un Móvil. */
	protected Vuelo formaVuelo; /* Forma con la que se desplaza un Móvil. */
	
	public abstract Energia getEnergia();

	public abstract void restarEnergia(Energia energia);
	
	public abstract Dibujable getVista();
	
	public abstract void morir();
}
