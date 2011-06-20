package algo3.tp2.modelo.inmoviles;

import algo3.tp2.modelo.ObjetoPosicionable;
import algo3.tp2.modelo.auxiliares.Arma;

public class CajaArma extends ObjetoPosicionable
{
	private Arma arma;
	
	public Arma getArma()
	{
		return arma;
	}
	
	public void setArma(Arma unArma)
	{
		this.arma = unArma;
	}
}
