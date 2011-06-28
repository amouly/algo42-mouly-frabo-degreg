package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.armas.Laser;
import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.ZigZag;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Bombardero extends NaveAtacante
{
	public Bombardero(int posInicialX, int posInicialY)
	{
		super();
		this.valor = 30;
		this.formaVuelo = new ZigZag(1, 1);
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 65, 45);
		this.vista = vistasFactory.getBombarderoVista();
		
		this.agregarArma(new Laser());
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
	
	public void morir()
	{
		super.morir();
		this.soltarCajaArma();
	}
}
