package algo3.tp2.modelo.inmoviles;

import java.awt.Rectangle;

import algo3.tp2.MotorJuego;
import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Arma;
import ar.uba.fi.algo3.titiritero.Dibujable;

/* Implementa una Caja que contiene un Objeto del tipo Arma. */
public class CajaArma extends Caja
{
	private Arma arma;
	
	public CajaArma(int posX, int posY)
	{
		this.cuerpo = new Rectangle(posX, posY, 25, 25);
		this.vista = vistasFactory.getCajaArmaVista();
	}
	
	public Arma getContenido()
	{
		return arma;
	}
	
	public void vivir()
	{
		/* Chequea si el Cuerpo del Jugador choca a su propio Cuerpo. */
		if(MotorJuego.getJugador().getCuerpo().intersects(this.getCuerpo()))
		{
			MotorJuego.getJugador().agregarArma(this.arma);
			EscuchadorEventos.manejarCajaTomada(this);
			
			System.out.println("- Caja de Arma tomada.");
		}
	}
	
	public void setContenido(Arma unArma)
	{
		this.arma = unArma;
	}
	
	public Dibujable getVista()
	{
		return vista;
	}
}
