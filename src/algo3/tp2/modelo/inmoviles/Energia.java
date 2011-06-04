package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.Inmovil;

/* Define el comportamiento de un Tanque de Energía. */

public class Energia extends Inmovil {
	private int cantidad;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int unValor) {
		cantidad = unValor;
	}

	public void restarCantidad(int unaCantidad) {
		this.cantidad -= unaCantidad;
	}
}
