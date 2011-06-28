package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;

import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.inmoviles.CajaArma;

public abstract class NaveAtacante extends Nave
{
	protected LinkedList<Arma> armas;
	protected int armaActiva;
	protected int sentidoDisparo = 1;
	
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
		
		//Hacer que la Nave dispare.
	}
	
	public void disparar()
	{
		try
		{
			EscuchadorEventos.manejarDisparoEnemigo(armas.get(armaActiva).dispararBala(getX(), getY(), sentidoDisparo));
			
			System.out.println("Arma disparada por Enemigo (class NaveAtacante).");
		}
		catch (SinBalasException ex)
		{
			System.out.println("El arma del Enemigo no tiene más balas.");
		}
	}
	
	public void soltarCajaArma()
	{
		/* Se crea una Caja con el Arma Activa. */
		CajaArma unaCajaArma = new CajaArma(this.getX(), this.getY());
		unaCajaArma.setContenido(this.getArmaActiva());
		
		EscuchadorEventos.manejarCajaSoltada(unaCajaArma);
	}
}
