package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class Recto implements Vuelo
{
	private final Point variacion;
	
	public Recto(int unaAmplitud, int unSentido)
	{
		variacion = new Point(0, unSentido*unaAmplitud);
	}
	
	@Override
	public Point getVariacionPosicion()
	{
		return variacion;
	}
}
