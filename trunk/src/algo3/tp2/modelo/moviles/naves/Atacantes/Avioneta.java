package algo3.tp2.modelo.moviles.naves.atacantes;

import java.awt.Rectangle;

import algo3.tp2.modelo.auxiliares.armas.Laser;
import algo3.tp2.modelo.moviles.naves.NaveAtacante;
import algo3.tp2.modelo.vuelos.Recto;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class Avioneta extends NaveAtacante
{
	public Avioneta(int posInicialX, int posInicialY)
	{
		super();
		this.valor = 20;
		this.formaVuelo = new Recto(2, -1);
		this.cuerpo = new Rectangle(posInicialX, posInicialY, 65, 45);
		this.vista = vistasFactory.getAvionetaVista();
		
		this.agregarArma(new Laser());
	}

	@Override
	public Dibujable getVista()
	{
		return vista;
	}
	
	@Override
	public void morir()
	{
		super.morir();
		this.soltarCajaArma();
		this.soltarCajaEnergia(20);
	}
}
