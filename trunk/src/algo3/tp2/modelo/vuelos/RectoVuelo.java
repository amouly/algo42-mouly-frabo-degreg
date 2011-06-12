package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class RectoVuelo implements Vuelo
{
	private final Point variacion;
	
	public RectoVuelo(int unaAmplitud)
	{
		variacion = new Point(0, -unaAmplitud);
	}
	
	@Override
	public Point getVariacionPosicion()
	{
		return variacion;
	}
}
