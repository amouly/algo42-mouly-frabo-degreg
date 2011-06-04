package algo3.tp2.modelo.moviles;

import algo3.tp2.modelo.Movil;

public class Nave extends Movil {
	protected int valor; /* Establece cuantos puntos vale la nave. */
	protected int puntaje; /* Establece la cantidad de puntos acumulados por la nave.*/

	public Nave() {
		tanqueEnergia.setCantidad(10);
	}

	public int getPuntaje() {
		return puntaje;
	}

	public int getValor() {
		return valor;
	}

	public void aumentarPuntaje(int unValor) {
		this.puntaje += unValor;
	}
}
