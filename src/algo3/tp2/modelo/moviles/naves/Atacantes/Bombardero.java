package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Point;
import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.inmoviles.Arma;
import algo3.tp2.modelo.vuelos.ZigZag;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Bombardero extends NaveAtacante
{
	public Bombardero(int posInicialX, int posInicialY)
	{
		super();
		valor = 30;
		
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.formaVuelo = new ZigZag(3, -1);
	}

	@Override
	public void vivir()
	{
		Point variacionPos = formaVuelo.getVariacionPosicion();
		
		cuerpo.setLocation((int) cuerpo.getX() - (int) variacionPos.getX(), (int) cuerpo.getY() - (int) variacionPos.getY());
	}

	@Override
	public Dibujable getVista()
	{
		return vistasFactory.getBombarderoVista();
	}
}
