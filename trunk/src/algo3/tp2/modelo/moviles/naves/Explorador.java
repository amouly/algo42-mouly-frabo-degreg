package algo3.tp2.modelo.moviles.naves;

import java.awt.Rectangle;

import ar.uba.fi.algo3.titiritero.Dibujable;

public class Explorador extends Nave
{
	public Explorador(int posInicialX, int posInicialY)
	{
		super();
		this.valor = 50;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.vista = vistasFactory.getExploradorVista();
	}

	@Override
	public Dibujable getVista() {
		return vista;
	}
}
