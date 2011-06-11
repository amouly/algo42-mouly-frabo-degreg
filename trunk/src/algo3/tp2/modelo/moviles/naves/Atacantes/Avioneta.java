package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.Recto;

public class Avioneta extends NaveAtacante {
	
	public Avioneta()
	{
		super();
		this.valor = 20;
		this.formaVuelo = new Recto(3);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}
}
