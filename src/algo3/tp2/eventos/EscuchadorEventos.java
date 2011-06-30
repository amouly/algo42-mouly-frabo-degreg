package algo3.tp2.eventos;

import algo3.tp2.modelo.inmoviles.Caja;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public interface EscuchadorEventos
{
	public void manejarDisparoJugador(Proyectil unProyectil);

	public void manejarDisparoEnemigo(Proyectil unProyectil);
	
	public void manejarMuerteJugador(Jugador elJugador);
	
	public void manejarMuerteNaveEnemiga(Nave unaNave);
	
	public void manejarMuerteProyectil(Proyectil unProyectil);
	
	public void manejarCajaSoltada(Caja unaCaja);
	
	public void manejarCajaTomada(Caja unaCaja);
}
