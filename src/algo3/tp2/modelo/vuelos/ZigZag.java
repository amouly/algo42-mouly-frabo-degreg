package algo3.tp2.modelo.vuelos;

import java.awt.Point;

public class ZigZag implements Vuelo
{
	private int contadorMovimientos;
	private int amplitud; /* Determina la amplitud del movimiento. */
	private int periodo = 100; /* Cantidad de movimientos para completar un Zig o un Zag. */
	private int sentido;
	private Point variacion = new Point();
	
	/* 
	 * Amplitud: Cuanto avanzara en cada movimiento.
	 * Sentido: Si el movimiento es inicialmente para le derecha, el sentido sera -1, y si fuera para la izquierda, sera 1.
	*/
	public ZigZag(int unaAmplitud, int sentidoInicial)
	{
		amplitud = unaAmplitud;
		sentido = sentidoInicial;
		contadorMovimientos = 0;
	}
	
	public Point getVariacionPosicion()
	{
		if(contadorMovimientos == periodo)
		{
			sentido *= -1;
			contadorMovimientos = 0;
		}
		
		variacion.setLocation(amplitud * sentido, -amplitud);
		
		contadorMovimientos++;
		
		return variacion;
	}
}
