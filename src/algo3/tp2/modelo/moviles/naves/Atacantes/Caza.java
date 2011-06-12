package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.RectoVuelo;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Caza extends NaveAtacante
{
	public Caza()
	{
		super();
		valor = 30;
		this.formaVuelo = new RectoVuelo(1);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getCazaVista();
	}
}
