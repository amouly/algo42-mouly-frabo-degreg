package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.armas.Laser;
import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Caza extends NaveAtacante
{
	public Caza(int posInicialX, int posInicialY)
	{
		super();
		valor = 30;
		this.formaVuelo = new Recto(1);
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 65, 45);
		this.vista = vistasFactory.getCazaVista();
		
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
		this.soltarCajaEnergia(50);
	}
}
