package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.inmoviles.Arma;
import algo3.tp2.modelo.inmoviles.armas.Laser;
import algo3.tp2.modelo.inmoviles.armas.Torpedo;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Jugador extends NaveAtacante {
	
	public Jugador(int posInicialX, int posInicialY)
	{
		super();
		
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 20, 20);
		this.agregarArma(new Torpedo());
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
		// TODO Auto-generated method stub
	}
	
	public int getCantidadBalas()
	{
		Arma unArma = armas.get(this.armaActiva);
		
		return unArma.getCantidadBalas();
	}

	@Override
	public Dibujable getVista()
	{
		return vistasFactory.getJugadorVista();
	}
}
