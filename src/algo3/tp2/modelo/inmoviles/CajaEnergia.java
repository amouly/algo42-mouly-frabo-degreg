package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Energia;

public class CajaEnergia extends ObjetoPosicionable
{
	private int cantidad;
	
	public int getCantidad()
	{
		return cantidad;
	}
	
	public void setCantidad(int unValor)
	{
		this.cantidad = unValor;
	}
}
