package algo3.tp2.modelo.auxiliares;

import java.awt.Rectangle;

import algo3.tp2.modelo.ObjetoPosicionable;

import ar.uba.fi.algo3.titiritero.vista.ObjetoDeTexto;

/* Clase que se encarga de juntar y transformar la información del Jugador. */
public class InfoJugador extends ObjetoPosicionable implements ObjetoDeTexto
{
	private int puntaje;
	private int energia;
	private int cantidadBalas;

	public InfoJugador(int unPuntaje, int unaEnergia, int cuantasBalas)
	{
		super();
		
		puntaje = unPuntaje;
		energia = unaEnergia;
		cantidadBalas = cuantasBalas;
		
		this.cuerpo = new Rectangle(5, 565, 30, 30);
	}
	
	public String getTexto()
	{
    	return "Puntaje: "+Integer.toString(puntaje)+" | Energia: "+Integer.toString(energia)+" | Balas: "+Integer.toString(cantidadBalas);
	}
}
