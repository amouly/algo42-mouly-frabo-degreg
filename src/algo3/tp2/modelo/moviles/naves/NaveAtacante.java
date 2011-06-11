package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;

import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.inmoviles.Arma;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public abstract class NaveAtacante extends Nave
{
	private LinkedList<Arma> armas;
	private int armaActiva;
	
	public void agregarArma(Arma unArma)
	{
		armas.add(unArma);
	}
	
	public Proyectil disparar() throws SinBalasException {
		return armas.get(armaActiva).dispararBala(getX(), getY());
	}
}
