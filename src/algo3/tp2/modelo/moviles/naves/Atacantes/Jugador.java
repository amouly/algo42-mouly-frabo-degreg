package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;

import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.auxiliares.armas.Laser;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Jugador extends NaveAtacante
{
	private final int ancho = 65;
	private final int largo = 45;
	
	public Jugador(int posInicialX, int posInicialY)
	{
		super();
		this.sentidoDisparo = -1;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, this.ancho, this.largo);
		this.agregarArma(new Laser());
		this.vista = vistasFactory.getJugadorVista();
		
	}

	public void moverEnX(int deltaX)
	{
		cuerpo.setLocation((int) cuerpo.getX() + deltaX, (int) cuerpo.getY());
	}

	public void moverEnY(int deltaY)
	{
		cuerpo.setLocation((int) cuerpo.getX(), (int) cuerpo.getY() + deltaY);
	}

	@Override
	public void vivir()
	{
		/* Chequea colisión con los proyectiles Enemigos. */
		List<Proyectil> proyectilesEnemigos = motorJuego.getProyectilesEnemigos();
		
		synchronized (proyectilesEnemigos)
		{
			Iterator<Proyectil> it = proyectilesEnemigos.iterator();
			Proyectil proyectil;
			
			while (it.hasNext() && isAlive())
			{
				proyectil = it.next();
				colisionar(proyectil);
			}
		}
		
		/* Si el Jugador no quedó vivo luego de recibir los ataques, muere. */
		if(!isAlive())
		{
			this.morir();
		}
	}
	
	@Override
	public void morir()
	{
		escuchadorEventos.manejarMuerteJugador(this);
	}
	
	@Override
	public void disparar()
	{
		try
		{
			escuchadorEventos.manejarDisparoJugador(armas.get(armaActiva).dispararBala(getX(), getY(), this.sentidoDisparo));
		}
		catch (SinBalasException ex)
		{
			//System.out.println("- El arma Jugador no tiene más balas.");
		}
	}
	
	public int getCantidadBalas()
	{
		Arma unArma = armas.get(this.armaActiva);
		return unArma.getCantidadBalas();
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
}
