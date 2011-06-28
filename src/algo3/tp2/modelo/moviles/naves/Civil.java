package algo3.tp2.modelo.moviles.naves;

import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class Civil extends Nave
{
	public Civil(int posInicialX, int posInicialY)
	{
		super();
		this.valor = -300;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.vista = vistasFactory.getCivilVista();
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
