package algo3.tp2.modelo.inmoviles;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.Energia;
import ar.uba.fi.algo3.titiritero.Dibujable;

/* Implementa una Caja que contiene un Objeto del tipo Energia. */
public class CajaEnergia extends Caja
{
	private final Energia energia;
	
	public CajaEnergia(int posX, int posY)
	{
		this.energia = new Energia(0);
		this.cuerpo = new Rectangle(posX, posY, 25, 25);
		this.vista = vistasFactory.getCajaEnergiaVista();
	}
	
	public Energia getContenido()
	{
		return energia;
	}
	
	@Override
	public void vivir()
	{
		/* Chequea si el Cuerpo del Jugador choca a su propio Cuerpo. */
		if(motorJuego.getJugador().getCuerpo().intersects(this.getCuerpo()))
		{
			motorJuego.getJugador().aumentarEnergia(this.energia);
			escuchadorEventos.manejarCajaTomada(this);
			
			System.out.println("Caja de Energia tomada.");
		}
	}
	
	public void setContenido(Energia unaEnergia)
	{
		this.energia.setEnergia(unaEnergia.getEnergia());
	}
	
	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
