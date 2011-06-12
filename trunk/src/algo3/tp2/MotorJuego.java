package algo3.tp2;

import java.util.ArrayList;
import java.util.List;

import algo3.tp2.eventos.TeclaEscuchador;
import algo3.tp2.modelo.Escenario;
import algo3.tp2.modelo.moviles.Movil;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.vista.EscenarioVista;
import algo3.tp2.vista.JugadorVista;
import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.vista.KeyPressedController;

public class MotorJuego
{
	private static List<Nave> navesEnemigas = new ArrayList<Nave>();
	private static List<Proyectil> proyectilesEnemigos = new ArrayList<Proyectil>();
	private static List<Proyectil> proyectilesJugador = new ArrayList<Proyectil>();
	private static Jugador jugador = new Jugador();
	private static Escenario escenario = new Escenario();
	private static ControladorJuego controlador = new ControladorJuego(false);
	
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
	
	public static void agregarProyectilEnemigo(Proyectil proyectil){
		proyectilesEnemigos.add(proyectil);
		agregarVista(proyectil);
	}
	
	public synchronized static void agregarProyectilJugador(Proyectil proyectil){
		proyectilesJugador.add(proyectil);
		agregarVista(proyectil);
	}
	
	private synchronized static void agregarVista(Movil movil) {
		Dibujable vista = movil.getVista();
		vista.setPosicionable(movil);
		
		controlador.agregarObjetoVivo(movil);
		controlador.agregarDibujable(vista);
	}
	
	public static void main(String[] args)
	{
		/* Ventana que encapsula al Juego. */
		VentanaJuego ventana = new VentanaJuego();
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.addKeyListener(new KeyPressedController(controlador));
		
		/* Vista del Escenario. */
		EscenarioVista escenarioVista = new EscenarioVista();
		escenarioVista.setPosicionable(escenario);
		
		/* Vista del Jugador. */
		JugadorVista jugadorVista = new JugadorVista();
		jugadorVista.setPosicionable(jugador);
		
		/* Controlador del Juego. */
		controlador.agregarKeyPressObservador(new TeclaEscuchador(jugador));
		controlador.agregarObjetoVivo(jugador);
		controlador.setSuperficieDeDibujo(ventana.getSuperficieDeDibujo());
		
		controlador.agregarDibujable(escenarioVista);
		controlador.agregarDibujable(jugadorVista);
		controlador.setIntervaloSimulacion(20);
		
		controlador.comenzarJuegoAsyn();
	}
} 