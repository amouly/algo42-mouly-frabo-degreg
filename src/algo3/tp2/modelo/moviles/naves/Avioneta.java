package algo3.tp2.modelo.moviles.naves;

import algo3.tp2.modelo.moviles.Nave;
import algo3.tp2.modelo.vuelos.Recto;

public class Avioneta extends Nave {
	
	public Avioneta() {
		this.valor = 20;
		this.formaVuelo = new Recto();
	}
}
