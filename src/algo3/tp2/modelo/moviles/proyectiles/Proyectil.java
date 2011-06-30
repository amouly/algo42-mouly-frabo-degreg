package algo3.tp2.modelo.moviles.proyectiles;

import java.awt.Point;

import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.moviles.Movil;

public abstract class Proyectil extends Movil
{
	protected Energia danio;

	public Energia getDanio()
	{
		return danio;
	}
	
	@Override
	public Energia getEnergia()
	{
		return tanqueEnergia;
	}

	@Override
	public void restarEnergia(Energia energia)
	{
		tanqueEnergia.disminuir(energia);
	}
	
	@Override
	public void vivir() {
		Point delta = formaVuelo.getVariacionPosicion();
		this.cuerpo.translate(new Double(delta.getX()).intValue(), new Double(delta.getY()).intValue());
	}
	
	@Override
	public void morir() {
		escuchadorEventos.manejarMuerteProyectil(this);
	}
	
	public abstract Proyectil crearInstancia(int posX, int posY, int unSentido);
}
