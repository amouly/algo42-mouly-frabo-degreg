package algo3.tp2.modelo.inmoviles;

import algo3.tp2.MotorJuego;
import algo3.tp2.modelo.ObjetoPosicionable;
import ar.uba.fi.algo3.titiritero.Dibujable;

public abstract class Caja extends ObjetoPosicionable
{
	protected MotorJuego elMotor;
	
	public abstract Dibujable getVista();
}
