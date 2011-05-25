package algo3.tp2.modelo;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.Posicionable;
import algo3.tp2.modelo.Inmoviles.Energia;
import algo3.tp2.modelo.Vuelo;

/* Define el comportamiento de todo Móvil del juego. */

public class Movil implements ObjetoVivo, Posicionable
{
	protected Energia TanqueEnergia = new Energia(); /* Energía acumulada que posee un Móvil. */
	protected Vuelo FormaVuelo; /* Forma con la que se desplaza un Móvil. */
	protected int PosX;
	protected int PosY;
	
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
	
	public void vivir()
	{
	}
}
