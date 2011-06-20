package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Point;

import algo3.tp2.modelo.moviles.Movil;

public abstract class Proyectil extends Movil
{
	private int danio;

	public int getDanio()
	{
		return danio;
	}
	
	@Override
	public void vivir()
	{
		Point delta = formaVuelo.getVariacionPosicion();
		this.cuerpo.translate(new Double(delta.getX()).intValue(), new Double(delta.getY()).intValue());
	}
	
	public abstract Proyectil crearInstancia(int posX, int posY);

}
