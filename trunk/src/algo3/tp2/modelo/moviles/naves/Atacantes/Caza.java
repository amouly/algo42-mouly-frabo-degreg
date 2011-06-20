package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Caza extends NaveAtacante
{
	public Caza(int posInicialX, int posInicialY)
	{
		super();
		valor = 30;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.formaVuelo = new Recto(1);
		this.vista = vistasFactory.getCazaVista();
	}

	@Override
	public Dibujable getVista() {
		return vista;
	}
}
