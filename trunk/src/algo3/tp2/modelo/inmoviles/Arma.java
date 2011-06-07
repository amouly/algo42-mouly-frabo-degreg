package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.Inmovil;
import algo3.tp2.modelo.moviles.Bala;
import algo3.tp2.modelo.excepciones.SinBalasException;

public class Arma extends Inmovil
{
	protected int cantidadBalas;
	protected int vueloBala;
	protected int poder; /* Poder de daño que posee el Arma. */
	
	public Bala dispararBala(int posX, int posY) throws SinBalasException
	{
		if(cantidadBalas > 0)
		{
			Bala unaBala = new Bala(posX, posY, poder);
			
			cantidadBalas--;
			
			return unaBala;
		}
		else
		{
			throw new SinBalasException();
		}
	}
	
	public int getCantidadBalas()
	{
		return cantidadBalas;
	}
}
