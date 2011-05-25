package algo3.tp2.modelo;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.Posicionable;
package algo3.tp2.modelo.Inmoviles.Energia;
package algo3.tp2.modelo.Vuelo;

/* Define el comportamiento de todo Móvil del juego. */

public class Movil implements ObjetoVivo, Posicionable
{
	private Energia TanqueEnergia; /* Energía acumulada que posee un Móvil. */
	private Vuelo FormaVuelo; /* Forma con la que se desplaza un Móvil. */
	private int PosX;
	private int PosY;
	
	public int getX()
	{
		return PosX;
	}
	
	public int getY()
	{
		return PosY;
	}
	
	public int GetEnergia()
	{
		return TanqueEnergia.GetCantidad();
	}
}
