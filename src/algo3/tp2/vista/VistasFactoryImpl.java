package algo3.tp2.vista;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class VistasFactoryImpl implements VistasFactory
{
	/* Vistas de Inmoviles. */
	public Dibujable getCajaArmaVista()
	{
		return new CajaArmaVista();
	}
	
	public Dibujable getCajaEnergiaVista()
	{
		return new CajaEnergiaVista();
	}

	/* Vista de Proyectiles. */
	@Override
	public Dibujable getLaserVista()
	{
		return new LaserVista();
	}
	
	@Override
	public Dibujable getTorpedoVista()
	{
		return new TorpedoVista();
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
