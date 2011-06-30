package algo3.tp2;

import java.util.List;

import algo3.tp2.modelo.inmoviles.Caja;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public interface Motor {

	public List<Nave> getNavesEnemigas();

	public List<Proyectil> getProyectilesEnemigos();

	public List<Proyectil> getProyectilesJugador();

	public Jugador getJugador();

	public void agregarCajaEscenario(Caja unaCaja);

	public void quitarCajaEscenario(Caja unaCaja);

	public void agregarNaveEnemiga(Nave unaNave);

	public void quitarNaveEnemiga(Nave unaNave);

	public void agregarProyectilEnemigo(Proyectil proyectil);

	public void agregarProyectilJugador(Proyectil proyectil);

	public void quitarProyectil(Proyectil proyectil);

}
