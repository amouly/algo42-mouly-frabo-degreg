package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.Nave;
import algo3.tp2.modelo.vuelos.Recto;

public class Avioneta extends Nave
{
	public Avioneta()
	{
		this.Valor = 20;
		this.FormaVuelo = new Recto();
	}
}
