package algo3.tp2.modelo;

import java.awt.Rectangle;

import algo3.tp2.vista.VistasFactory;
import algo3.tp2.vista.VistasFactoryImpl;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.Posicionable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public class ObjetoPosicionable implements Posicionable, ObjetoVivo
{
	protected Rectangle cuerpo; /* Cuerpo físico del objeto, dimensión y posición. */
	protected static VistasFactory vistasFactory = new VistasFactoryImpl();
	protected Dibujable vista;
	
	@Override
	public int getX()
	{
		return new Double(cuerpo.getX()).intValue();
	}

	@Override
	public int getY() {
		return new Double(cuerpo.getY()).intValue();
	}
	
	public Rectangle getCuerpo()
	{
		return cuerpo;
	}
	
	public Dibujable getVista()
	{
		return vista;
	}
	
	public void vivir()
	{
		
	}
}
