package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public abstract class Arma extends Inmovil
{
	protected int cantidadBalas;
	protected Proyectil proyectil;
	protected String nombre;
	
	public Proyectil dispararBala(int posX, int posY) throws SinBalasException
	{
		if(cantidadBalas > 0)
		{
			cantidadBalas--;
			
			System.out.println("Arma disparada (class Arma).");
			
			return proyectil.crearInstancia(posX+20, posY);
		}
		else
		{
			throw new SinBalasException();
		}
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCantidadBalas()
	{
		return cantidadBalas;
	}
	
	public void setProyectil(Proyectil unProyectil)
	{
		this.proyectil = unProyectil;
	}
}
