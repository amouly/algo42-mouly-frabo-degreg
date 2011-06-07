package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.ZigZag;

public class Bombardero extends NaveAtacante
{
	public Bombardero()
	{
		super();
		valor = 30;
		this.formaVuelo = new ZigZag(5, -1);
	}
}
