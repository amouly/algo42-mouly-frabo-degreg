package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.Recto;

public class Caza extends NaveAtacante
{
	public Caza()
	{
		super();
		valor = 30;
		this.formaVuelo = new Recto(1);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}
}
