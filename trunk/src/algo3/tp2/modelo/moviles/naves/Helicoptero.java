package algo3.tp2.modelo.moviles.naves;

import java.awt.Point;
import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class Helicoptero extends Nave
{
	public Helicoptero(int posInicialX, int posInicialY)
	{
		super();
		valor = -200;
		
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dibujable getVista() {
		return vistasFactory.getHelicopteroVista();
	}
}
