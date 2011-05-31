package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.Inmovil;

/* Define el comportamiento de un Tanque de Energía. */

public class Energia extends Inmovil
{
	private int Cantidad;
	
	public int GetCantidad()
	{
		return Cantidad;
	}
	
	public void SetCantidad(int UnValor)
	{
		Cantidad = UnValor;
	}
	
	public void RestarCantidad(int UnaCantidad)
	{
		this.Cantidad -= UnaCantidad;
	}
}
