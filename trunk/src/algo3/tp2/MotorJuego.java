package algo3.tp2;

import java.util.ArrayList;
import java.util.List;

import algo3.tp2.eventos.TeclaEscuchador;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.vista.JugadorVista;
import ar.uba.fi.algo3.titiritero.ControladorJuego;

public class MotorJuego {

	private static List<Nave> navesEnemigas = new ArrayList<Nave>();
	private static List<Proyectil> proyectilesEnemigos = new ArrayList<Proyectil>();
	private static List<Proyectil> proyectilesJugador = new ArrayList<Proyectil>();
	private static Jugador jugador = new Jugador();
	private static ControladorJuego controlador = new ControladorJuego(true);
	
	public static List<Nave> getNavesenemigas() {
		return navesEnemigas;
	}
	public static List<Proyectil> getProyectilesenemigos() {
		return proyectilesEnemigos;
	}
	public static List<Proyectil> getProyectilesjugador() {
		return proyectilesJugador;
	}
	public static Jugador getJugador() {
		return jugador;
	}
	
	public void agregarProyectilEnemigo(Proyectil proyectil) {
		proyectilesEnemigos.add(proyectil);
		controlador.agregarObjetoVivo(proyectil);
	}
	
	public static void main(String[] args) {
		VentanaJuego ventana = new VentanaJuego();
		controlador.setSuperficieDeDibujo(ventana.getSuperficieDeDibujo());

		ventana.setVisible(true);
		
		JugadorVista jugadorVista = new JugadorVista();
		jugadorVista.setPosicionable(jugador);
		
		controlador.agregarKeyPressObservador(new TeclaEscuchador(jugador));
		controlador.agregarObjetoVivo(jugador);
		controlador.agregarDibujable(jugadorVista);
		controlador.comenzarJuego();

	}
	
	
} 
