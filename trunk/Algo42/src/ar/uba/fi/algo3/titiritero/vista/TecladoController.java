package ar.uba.fi.algo3.titiritero.vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import ar.uba.fi.algo3.titiritero.ControladorJuego;

public class TecladoController extends KeyAdapter {
	private ControladorJuego controlador;
	
	public TecladoController(ControladorJuego controlador) {
		this.controlador = controlador;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		this.controlador.despacharTecla(e.getKeyCode(), e.getModifiersEx());
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		this.controlador.despacharTecla(e.getKeyCode(), e.getModifiersEx());
	}
}
