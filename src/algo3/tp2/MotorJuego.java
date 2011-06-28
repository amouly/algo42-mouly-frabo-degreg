package algo3.tp2;

import java.util.ArrayList;
import java.util.List;

import algo3.tp2.eventos.TeclaEscuchador;
import algo3.tp2.misiones.AdministradorMisiones;
import algo3.tp2.modelo.Escenario;
import algo3.tp2.modelo.auxiliares.InfoJugador;
import algo3.tp2.modelo.inmoviles.Caja;
import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.moviles.Movil;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.vista.EscenarioVista;
import algo3.tp2.vista.InfoJugadorVista;
import algo3.tp2.vista.JugadorVista;
import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.vista.KeyPressedController;

public class MotorJuego {
	private static List<Nave> navesEnemigas = new ArrayList<Nave>();
	private static List<Proyectil> proyectilesEnemigos = new ArrayList<Proyectil>();
	private static List<Proyectil> proyectilesJugador = new ArrayList<Proyectil>();
	private static List<Caja> cajasEscenario = new ArrayList<Caja>();
	private static Jugador jugador = new Jugador(360, 450);
	private static Escenario escenario = new Escenario();
	private static ControladorJuego controlador = new ControladorJuego(false);

	public static List<Nave> getNavesenemigas() {
		return navesEnemigas;
	}

	public static List<Proyectil> getProyectilesEnemigos() {
		return proyectilesEnemigos;
	}

	public static List<Proyectil> getProyectilesJugador() {
		return proyectilesJugador;
	}

	public static Jugador getJugador() {
		return jugador;
	}

	public static void agregarCajaEscenario(Caja unaCaja)
	{
		cajasEscenario.add(unaCaja);
		agregarVista(unaCaja);
	}
	
	public static void quitarCajaEscenario(Caja unaCaja)
	{
		cajasEscenario.remove(unaCaja);
		quitarVista(unaCaja);
	}

	public static void agregarNaveEnemiga(Nave unaNave)
	{
		navesEnemigas.add(unaNave);
		agregarVista(unaNave);
	}
	
	public static void quitarNaveEnemiga(Nave unaNave) {
		navesEnemigas.remove(unaNave);
		quitarVista(unaNave);
	}

	public static void agregarProyectilEnemigo(Proyectil proyectil) {
		proyectilesEnemigos.add(proyectil);
		agregarVista(proyectil);
	}

	public static void agregarProyectilJugador(Proyectil proyectil) {
		synchronized (proyectilesJugador) {
			proyectilesJugador.add(proyectil);
		}
		agregarVista(proyectil);
	}
	
	public static void quitarProyectil(Proyectil proyectil) {
		synchronized (proyectilesJugador) {
			proyectilesJugador.remove(proyectil);
		}
		proyectilesEnemigos.remove(proyectil);
		
		quitarVista(proyectil);
	}

	private static void agregarVista(ObjetoPosicionable unPosicionable)
	{
		Dibujable vista = unPosicionable.getVista();
		vista.setPosicionable(unPosicionable);

		controlador.agregarObjetoVivo(unPosicionable);
		controlador.agregarDibujable(vista);
	}
	
	private static void quitarVista(ObjetoPosicionable unPosicionable) {
		
		controlador.removerDibujable(unPosicionable.getVista());
		controlador.removerObjetoVivo(unPosicionable);
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

		/* Panel que contiene la información del Jugador. */
		InfoJugador infoJugador = new InfoJugador(jugador);

		/* Vista de los Datos del Jugador. */
		InfoJugadorVista infoJugadorVista = new InfoJugadorVista(infoJugador);
		infoJugadorVista.setPosicionable(infoJugador);

		/* Controlador del Juego. */
		controlador.agregarKeyPressObservador(new TeclaEscuchador(jugador));
		controlador.agregarObjetoVivo(jugador);
		controlador.agregarObjetoVivo(infoJugador);
		controlador.setSuperficieDeDibujo(ventana.getSuperficieDeDibujo());

		/* Se agregan los Objetos Vivos del Juego. */
		controlador.agregarDibujable(escenarioVista);
		controlador.agregarDibujable(jugadorVista);

		/* Se crean las Misiones. */
		AdministradorMisiones.comenzarMisiones();

		/* Se agrega el panel que contiene la informacion del Jugador. */
		controlador.agregarDibujable(infoJugadorVista);

		controlador.setIntervaloSimulacion(20);

		controlador.comenzarJuego();
	}
}
