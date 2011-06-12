package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.ZigZag;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Bombardero extends NaveAtacante
{
	public Bombardero()
	{
		super();
		valor = 30;
		this.formaVuelo = new ZigZag(5, -1);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getBombarderoVista();
	}
}
