package algo3.tp2.modelo.vuelos;

import algo3.tp2.modelo.Vuelo;
import java.awt.Point;

public class Recto implements Vuelo
{
	private int Amplitud; /* Determina la amplitud del movimiento. */
	Point Variacion = new Point();
	
	public Recto(int unaAmplitud)
	{
		Amplitud = unaAmplitud;
	}
	
	public Point getVariacionPosicion()
	{
		Variacion.setLocation(0, Amplitud);
		
		return Variacion;
	}
}
