package algo3.tp2.modelo.moviles.proyectiles;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class LaserProy extends Proyectil {

	@Override
	public Proyectil crearInstancia() {
		return new LaserProy();
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getLaserVista();
	}
}
