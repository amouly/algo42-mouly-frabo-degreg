package algo3.tp2.modelo.auxiliares;

import java.awt.Rectangle;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.vista.ObjetoDeTexto;

/* Clase que se encarga de juntar y transformar la información del Jugador. */
public class InfoJugador extends ObjetoPosicionable implements ObjetoDeTexto, ObjetoVivo
{
	private int puntaje;
	private int energia;
	private int cantidadBalas;
	private Jugador jugador;

	public InfoJugador(Jugador unJugador)
	{
		super();
		
		jugador = unJugador;
		this.cuerpo = new Rectangle(5, 565, 30, 30);
	}
	
	public void vivir()
	{
		puntaje = jugador.getPuntaje();
		energia = jugador.getEnergia();
		cantidadBalas = jugador.getCantidadBalas();
	}
	
	public String getTexto()
	{
    	return "Puntaje: "+Integer.toString(puntaje)+" | Energia: "+Integer.toString(energia)+" | Balas: "+Integer.toString(cantidadBalas);
	}
}
