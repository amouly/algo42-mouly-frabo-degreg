package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;

import algo3.tp2.eventos.DisparoEscuchador;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.inmoviles.Arma;

public abstract class NaveAtacante extends Nave
{
	protected LinkedList<Arma> armas;
	protected int armaActiva;
	
	protected NaveAtacante() {
		armaActiva = 0;
		armas = new LinkedList<Arma>();
	}
	
	public void agregarArma(Arma unArma)
	{
		armas.add(unArma);
	}
	
	public void disparar() {
		try {
			DisparoEscuchador.manejarDisparoJugador(armas.get(armaActiva).dispararBala(getX(), getY()));
		} catch (SinBalasException ex) {
			//TODO: mostrar algo en la ventana del juego
			System.out.println("El arma no tiene más balas");
		}
	}
}
