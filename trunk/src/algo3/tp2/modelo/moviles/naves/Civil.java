package algo3.tp2.modelo.moviles.naves;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class Civil extends Nave
{
	public Civil()
	{
		valor = -300;
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getCivilVista();
	}
}
