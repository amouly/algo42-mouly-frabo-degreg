package algo3.tp2.modelo;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.Posicionable;
import ar.uba.fi.algo3.titiritero.TecladoObservador;

public class Jugador implements ObjetoVivo, Posicionable, TecladoObservador {
	
	//TODO estos atributos deben pertenecer a la clase padre
	private int posX;
	private int posY;
	
	public Jugador(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public void ManejarTecla(int codigoTecla, int modificadores) {
		System.out.println("cod tecla:" + codigoTecla);
		System.out.println("modificadores: " + modificadores);
	}

	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	public int getX() {
		return posX;
	}

	public int getY() {
		return posY;
	}

}
