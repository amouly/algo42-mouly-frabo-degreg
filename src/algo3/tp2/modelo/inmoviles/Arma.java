package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public abstract class Arma extends Inmovil
{
	protected int cantidadBalas;
	protected Proyectil proyectil;
	
	public Proyectil dispararBala(int posX, int posY) throws SinBalasException
	{
		if(cantidadBalas > 0)
		{
			cantidadBalas--;
			
			return proyectil.crearInstancia();
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
	
	public void setProyectil(Proyectil proyectil) {
		this.proyectil = proyectil;
	}
}
