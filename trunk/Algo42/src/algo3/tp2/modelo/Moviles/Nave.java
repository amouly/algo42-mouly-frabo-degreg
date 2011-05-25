package algo3.tp2.modelo.Moviles;

import algo3.tp2.modelo.Movil;
import algo3.tp2.modelo.Inmoviles.Energia;

public class Nave extends Movil
{
	protected int Valor; /* Establece cuantos puntos vale la nave. */
	protected int Puntaje; /* Establece la cantidad de puntos acumulados por la nave. */
	
	public Nave()
	{
		TanqueEnergia.SetValor(10);
	}
	
	public int GetPuntaje()
	{
		return Puntaje;
	}
	
	public int GetValor()
	{
		return Valor;
	}
}
