package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;

import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.inmoviles.CajaArma;

public abstract class NaveAtacante extends Nave
{
	protected LinkedList<Arma> armas;
	protected int armaActiva;
	protected int sentidoDisparo = 1;
	protected int cantidadDisparos;
	protected int periodoDisparo;
	
	protected NaveAtacante()
	{
		super();
		armaActiva = 0;
		cantidadDisparos = 0;
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
	
	public void cambiarArmaActiva(int unaPos)
	{
		if(armas.get(unaPos) != null)
		{
			armaActiva = unaPos;
		}
	}
	
	@Override
	public void vivir()
	{
		super.vivir();
		
		if(cantidadDisparos == periodoDisparo)
		{
			cantidadDisparos = 0;
			disparar();
		}
		
		cantidadDisparos++;
	}
	
	public void disparar()
	{
		try
		{
			escuchadorEventos.manejarDisparoEnemigo(armas.get(armaActiva).dispararBala(getX(), getY(), sentidoDisparo));
		}
		catch (SinBalasException ex)
		{
			//System.out.println("El arma del Enemigo no tiene más balas.");
		}
	}
	
	public void soltarCajaArma()
	{
		/* Se crea una Caja con el Arma Activa. */
		CajaArma unaCajaArma = new CajaArma(this.getX(), this.getY());
		unaCajaArma.setContenido(this.getArmaActiva());
		
		escuchadorEventos.manejarCajaSoltada(unaCajaArma);
	}
}
