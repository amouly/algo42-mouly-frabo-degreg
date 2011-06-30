package algo3.tp2.modelo;

import java.awt.Rectangle;

import algo3.tp2.Motor;
import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.vista.VistasFactory;
import algo3.tp2.vista.VistasFactoryImpl;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.Posicionable;

public abstract class ObjetoPosicionable implements Posicionable, ObjetoVivo
{
	protected Rectangle cuerpo; /* Cuerpo físico del objeto, dimensión y posición. */
	
	protected Dibujable vista;
	
	protected static VistasFactory vistasFactory = new VistasFactoryImpl();
	protected static Motor motorJuego;
	protected static EscuchadorEventos escuchadorEventos;
	
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
	
	public static void setMotor(Motor motor) {
		motorJuego = motor;
	}
	
	public static void setEscuchadorEventos(EscuchadorEventos escuchador) {
		escuchadorEventos = escuchador;
	}
}
