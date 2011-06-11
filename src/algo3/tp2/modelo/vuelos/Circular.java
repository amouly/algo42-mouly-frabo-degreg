package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class Circular implements Vuelo
{
	private int Radio;
	private int Angulo;
	private int Amplitud; /* Determina la amplitud del movimiento. */
	Point Variacion = new Point();
	
	/* Se crea el vuelo en base a una Amplitud de avance, y un Radio de giro. */
	public Circular(int unaAmplitud, int unRadio)
	{
		Amplitud = unaAmplitud;
		Radio = unRadio;
	}
	
	public Point getVariacionPosicion()
	{
		return Variacion;
	}
}
