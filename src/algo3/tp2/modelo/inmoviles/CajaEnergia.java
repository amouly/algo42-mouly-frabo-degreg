package algo3.tp2.modelo.inmoviles;

import java.awt.Rectangle;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Energia;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class CajaEnergia extends Caja
{
	private Energia energia;
	
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
	
	public void vivir()
	{

	}
	
	public void setContenido(Energia unaEnergia)
	{
		this.energia.setEnergia(unaEnergia.getEnergia());
	}
	
	public Dibujable getVista()
	{
		return vista;
	}
}
