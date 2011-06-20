package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;

import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.auxiliares.Arma;

public abstract class NaveAtacante extends Nave
{
	protected LinkedList<Arma> armas;
	protected int armaActiva;
	
	protected NaveAtacante()
	{
		super();
		armaActiva = 0;
		armas = new LinkedList<Arma>();
	}
	
	public void agregarArma(Arma unArma)
	{
		armas.add(unArma);
	}
	
	public Arma getArmaActiva()
	{
		return armas.get(armaActiva);
	}
	
	@Override
	public void vivir()
	{
		super.vivir();
		//TODO: hacer que dispare cada x tiempo.
	}
	
	public void disparar()
	{
		try
		{
			EscuchadorEventos.manejarDisparoJugador(armas.get(armaActiva).dispararBala(getX(), getY()));
			
			System.out.println("Arma disparada (class NaveAtacante).");
		}
		catch (SinBalasException ex)
		{
			System.out.println("El arma no tiene más balas.");
		}
	}
}
