package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class TorpedoProy extends Proyectil
{
	public TorpedoProy()
	{
		super();
	}

	private TorpedoProy(int posX, int posY)
	{
		this.cuerpo = new Rectangle(posX, posY, 5, 10);
		this.formaVuelo = new Recto(2);
		this.danio = new Energia(100);
		this.vista = vistasFactory.getTorpedoVista();
	}
		
	@Override
	public Proyectil crearInstancia(int posX, int posY)
	{
		return new TorpedoProy(posX, posY);
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
