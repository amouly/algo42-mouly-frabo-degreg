package algo3.tp2.modelo.moviles.naves;

import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class Helicoptero extends Nave
{
	public Helicoptero(int posInicialX, int posInicialY)
	{
		super();
		this.valor = -200;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.vista = vistasFactory.getHelicopteroVista();
	}

	@Override
	public Dibujable getVista() {
		return vista;
	}
}
