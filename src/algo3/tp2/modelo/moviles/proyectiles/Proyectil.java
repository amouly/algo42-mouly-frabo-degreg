package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Point;

import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.moviles.Movil;

public abstract class Proyectil extends Movil
{
	protected Energia danio;

	public Energia getDanio()
	{
		return danio;
	}
	
	public Energia getEnergia()
	{
		return tanqueEnergia;
	}

	public void restarEnergia(Energia energia)
	{
		tanqueEnergia.disminuir(energia);
	}
	
	@Override
	public void vivir() {
		Point delta = formaVuelo.getVariacionPosicion();
		this.cuerpo.translate(new Double(delta.getX()).intValue(), new Double(delta.getY()).intValue());
	}
	
	public void morir() {
		EscuchadorEventos.manejarMuerteProyectil(this);
	}
	
	public abstract Proyectil crearInstancia(int posX, int posY);

}


