package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.vista.VistasFactory;
import algo3.tp2.vista.VistasFactoryImpl;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public abstract class Caja extends ObjetoPosicionable implements ObjetoVivo
{
	protected static VistasFactory vistasFactory = new VistasFactoryImpl();
	protected Dibujable vista;
	
	public abstract Dibujable getVista();
}
