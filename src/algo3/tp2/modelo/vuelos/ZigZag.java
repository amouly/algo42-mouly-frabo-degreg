package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class ZigZag implements Vuelo
{
	private int ContadorMovimientos;
	private int Amplitud; /* Determina la amplitud del movimiento. */
	private int Periodo = 60; /* Cantidad de movimientos para completar un Zig o un Zag. */
	private int Sentido;
	private Point Variacion = new Point();
	
	/* 
	 * Amplitud: Cuanto avanzara en cada movimiento.
	 * Sentido: Si el movimiento es inicialmente para le derecha, el sentido sera -1, y si fuera para la izquierda, sera 1.
	*/
	public ZigZag(int unaAmplitud, int sentidoInicial)
	{
		Amplitud = unaAmplitud;
		Sentido = sentidoInicial;
		ContadorMovimientos = 0;
	}
	
	public Point getVariacionPosicion()
	{
		if(ContadorMovimientos == Periodo)
		{
			Sentido *= -1;
			ContadorMovimientos = 0;
		}
		
		Variacion.setLocation(Amplitud * Sentido, -Amplitud);
		
		ContadorMovimientos++;
		
		return Variacion;
	}
}
