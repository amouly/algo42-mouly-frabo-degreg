package algo3.tp2.modelo.moviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.inmoviles.Energia;
import algo3.tp2.modelo.vuelos.Vuelo;
import algo3.tp2.vista.VistasFactory;
import algo3.tp2.vista.VistasFactoryImpl;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

/* Define el comportamiento de todo MÃ³vil del juego. */

public abstract class Movil extends ObjetoPosicionable implements ObjetoVivo
{
	protected Energia tanqueEnergia; /* EnergÃ­a acumulada que posee un MÃ³vil. */
	protected Vuelo formaVuelo; /* Forma con la que se desplaza un MÃ³vil. */
	protected static VistasFactory vistasFactory = new VistasFactoryImpl();
	
	public int getEnergia() {
		return tanqueEnergia.getCantidad();
	}

	public void restarEnergia(int unValor) {
		tanqueEnergia.restarCantidad(unValor);
	}
	
	public abstract Dibujable getVista();
	
}
