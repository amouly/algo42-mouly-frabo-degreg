package algo3.tp2.vista;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class VistasFactoryImpl implements VistasFactory
{
	/* Vista de Proyectiles. */
	@Override
	public Dibujable getLaserVista() {
		return new LaserVista();
	}

	/* Vistas de Naves. */
	@Override
	public Dibujable getJugadorVista() {
		return new JugadorVista();
	}

	@Override
	public Dibujable getAvionetaVista()
	{
		return new AvionetaVista();
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
	public Dibujable getBombarderoVista()
	{
		return new BombarderoVista();
	}

	@Override
	public Dibujable getCazaVista() {
		// TODO Auto-generated method stub
		return null;
	}
}
