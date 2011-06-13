package algo3.tp2.modelo.moviles.naves;

import algo3.tp2.modelo.moviles.Movil;

public abstract class Nave extends Movil
{
	protected int valor; /* Establece cuantos puntos vale la nave. */
	protected int puntaje; /* Establece la cantidad de puntos acumulados por la nave. */

	public Nave()
	{
		this.tanqueEnergia.setCantidad(10);
	}
	
	public int getPuntaje()
	{
		return puntaje;
	}

	public int getValor() {
		return valor;
	}

	public void aumentarPuntaje(int unValor)
	{
		puntaje += unValor;
	}
}
