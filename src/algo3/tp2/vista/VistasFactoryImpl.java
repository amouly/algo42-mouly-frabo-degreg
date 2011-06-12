package algo3.tp2.vista;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class VistasFactoryImpl implements VistasFactory {

	@Override
	public Dibujable getLaserVista() {
		return new LaserVista();
	}

	@Override
	public Dibujable getJugadorVista() {
		return new JugadorVista();
	}

	@Override
	public Dibujable getAvionetaVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dibujable getCivilVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dibujable getExploradorVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dibujable getHelicopteroVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dibujable getBombarderoVista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dibujable getCazaVista() {
		// TODO Auto-generated method stub
		return null;
	}
}
