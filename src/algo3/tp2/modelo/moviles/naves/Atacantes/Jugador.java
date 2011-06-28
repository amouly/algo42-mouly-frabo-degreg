package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.excepciones.SinBalasException;
import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.auxiliares.armas.Laser;
import algo3.tp2.modelo.auxiliares.armas.Torpedo;
import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Jugador extends NaveAtacante {
	
	public Jugador(int posInicialX, int posInicialY)
	{
		super();
		this.sentidoDisparo = -1;
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 65, 45);
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

	}
	
	@Override
	public void disparar()
	{
		try
		{
			EscuchadorEventos.manejarDisparoJugador(armas.get(armaActiva).dispararBala(getX(), getY(), this.sentidoDisparo));
			
			System.out.println("- Arma disparada por Jugador (class NaveAtacante).");
		}
		catch (SinBalasException ex)
		{
			System.out.println("- El arma Jugador no tiene más balas.");
		}
	}
	
	public int getCantidadBalas()
	{
		Arma unArma = armas.get(this.armaActiva);
		return unArma.getCantidadBalas();
	}

	public Dibujable getVista() {
		return vista;
	}
}
