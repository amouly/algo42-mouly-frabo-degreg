package ar.uba.fi.algo3.titiritero.ejemplo;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.ejemplo.modelo.Mesa;
import ar.uba.fi.algo3.titiritero.ejemplo.modelo.Pelota;
import ar.uba.fi.algo3.titiritero.ejemplo.vista.VentanaPrincipal;
import ar.uba.fi.algo3.titiritero.ejemplo.vista.VistaMesa;
import ar.uba.fi.algo3.titiritero.ejemplo.vista.VistaPelota;
import ar.uba.fi.algo3.titiritero.vista.Ventana;

public class Programa {

	public static void main(String[] args) {

		/*
		 * Primero instancio mi modelo: una pelota que se mueve por una mesa
		 */
		Pelota unaPelota = new Pelota();
		Mesa unaMesa = new Mesa(200, 200);
		unaPelota.setMesa(unaMesa);

		/*
		 * Luego instancio los objetos del framework: una ventana y el controlador
		 */		
		
		ControladorJuego controlador = new ControladorJuego();
		Ventana ventana = new VentanaPrincipal(controlador);
		controlador.setSuperficieDeDibujo(ventana);
		ventana.setVisible(true);
		
		/*
		 * Instancio un cuadrado para que actue como vista de la mesa
		 */
		VistaMesa vistaMesa = new VistaMesa();
		vistaMesa.setPosicionable(unaMesa);
		
		/*
		 * Instancio una imagen para que actue como vista de la pelota
		 */
		VistaPelota vistaPelota = new VistaPelota();
		vistaPelota.setPosicionable(unaPelota);
		
		/*
		 * agrego la pelota a la lista de objetos vivios del controlador
		 * para que este le de vida dentro del gameloop
		 */
		controlador.agregarObjetoVivo(unaPelota);
		
		/*
		 * Agrego los objetos que actuan como vista a la lista de dibujables del controlador
		 * para que sean repintados al final de cada gameloop
		 */
		
		controlador.agregarDibujable(vistaMesa);
		controlador.agregarDibujable(vistaPelota);
		
		
		controlador.agregarMouseClickObservador(vistaMesa);
		
		/*
		 * finalmente establezco el intervalo de sleep dentro del gameloop
		 * y comienzo a ejecutar
		 */
		controlador.setIntervaloSimulacion(20);
		controlador.comenzar();

	}

}
