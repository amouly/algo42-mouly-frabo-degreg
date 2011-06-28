package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class LaserProy extends Proyectil
{
	public LaserProy()
	{
		super();
	}

	private LaserProy(int posX, int posY, int unSentido)
	{
		this.cuerpo = new Rectangle(posX, posY, 5, 10);
		this.formaVuelo = new Recto(5, unSentido);
		this.danio = new Energia(50);
		this.vista = vistasFactory.getLaserVista();
	}
	
	@Override
	public Proyectil crearInstancia(int posX, int posY, int unSentido)
	{
		return new LaserProy(posX, posY, unSentido);
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
