package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.ZigZag;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Bombardero extends NaveAtacante
{
	public Bombardero(int posInicialX, int posInicialY)
	{
		super();
		this.valor = 30;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.formaVuelo = new ZigZag(1, 1);
		this.vista = vistasFactory.getBombarderoVista();
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
