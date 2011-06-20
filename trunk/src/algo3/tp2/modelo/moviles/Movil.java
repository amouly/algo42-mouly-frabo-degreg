package algo3.tp2.modelo.moviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.vuelos.Vuelo;
import algo3.tp2.vista.VistasFactory;
import algo3.tp2.vista.VistasFactoryImpl;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

/* Define el comportamiento de todo Móvil del juego. */

public abstract class Movil extends ObjetoPosicionable implements ObjetoVivo
{
	protected Energia tanqueEnergia; /* Energía acumulada que posee un Móvil. */
	protected Vuelo formaVuelo; /* Forma con la que se desplaza un Móvil. */
	protected static VistasFactory vistasFactory = new VistasFactoryImpl();
	protected Dibujable vista;
	
	public Energia getEnergia()
	{
		return tanqueEnergia;
	}

	public void restarEnergia(Energia energia)
	{
		tanqueEnergia.disminuir(energia);
	}
	
	public abstract Dibujable getVista();
	
}
