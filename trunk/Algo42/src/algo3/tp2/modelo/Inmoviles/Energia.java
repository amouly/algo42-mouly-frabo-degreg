package algo3.tp2.modelo;

import algo3.tp2.modelo.Inmovil;

/* Define el comportamiento de un Tanque de Energía. */

public class Energia extends Inmovil
{
	private int Valor;
	
	public int GetValor()
	{
		return Valor;
	}
	
	public void SetValor(int UnValor)
	{
		Valor = UnValor;
	}
}
