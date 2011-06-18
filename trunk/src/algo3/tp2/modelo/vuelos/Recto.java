package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class Recto implements Vuelo
{
	private final Point variacion;
	
	public Recto(int unaAmplitud)
	{
		variacion = new Point(0, -unaAmplitud);
	}
	
	@Override
	public Point getVariacionPosicion()
	{
		return variacion;
	}
}
