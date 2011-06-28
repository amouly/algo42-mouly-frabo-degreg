package algo3.tp2.eventos;

import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.inmoviles.Caja;

public interface Escuchador
{
	public void manejarDisparoJugador(Proyectil proyectil);

	public void manejarDisparoEnemigo(Proyectil proyectil);
	
	public void manejarMuerteNaveEnemiga(Nave unaNave);
	
	public void manejarMuerteProyectil(Proyectil unProyectil);
	
	public void manejarCajaSoltada(Caja unaCaja);
	
	public void manejarCajaTomada(Caja unaCaja);
}
