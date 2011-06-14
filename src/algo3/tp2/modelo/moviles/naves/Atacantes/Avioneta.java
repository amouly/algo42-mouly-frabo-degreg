package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Point;
import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.inmoviles.Arma;
import algo3.tp2.modelo.vuelos.RectoVuelo;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Avioneta extends NaveAtacante
{
	public Avioneta()
	{
		super();
		this.valor = 20;
		this.formaVuelo = new RectoVuelo(2);
		
		this.cuerpo = new Rectangle(34, 30, 20, 20);
	}

	@Override
	public void vivir()
	{
		Point variacionPos = formaVuelo.getVariacionPosicion();
		
		cuerpo.setLocation((int) cuerpo.getX() - (int) variacionPos.getX(), (int) cuerpo.getY() - (int) variacionPos.getY());
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getAvionetaVista();
	}
}
