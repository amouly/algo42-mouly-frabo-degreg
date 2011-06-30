package algo3.tp2.modelo;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;

import algo3.tp2.modelo.moviles.Movil;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public class Escenario extends ObjetoPosicionable
{
	public Escenario(int unAncho, int unAlto)
	{
		cuerpo = new Rectangle(0, 0, unAncho, unAlto);
	}
	
	@Override 
	public void vivir()
	{
		List<Proyectil> proyectilesJugador = motorJuego.getProyectilesJugador();
		List<Proyectil> proyectilesEnemigos = motorJuego.getProyectilesEnemigos();
		List<Nave> navesEnemigas = motorJuego.getNavesEnemigas();
		
		/* Chequea colisión con los proyectiles del Jugador. */
		synchronized (proyectilesJugador)
		{
			Iterator<Proyectil> it = proyectilesJugador.iterator();
			Proyectil unProyectil;
			
			while(it.hasNext())
			{
				unProyectil = it.next();
				this.colisionar(unProyectil);
			}
		
			/* Chequea colisión con las Naves Enemigas.

			Iterator<Nave> it2 = navesEnemigas.iterator();
			Nave unaNave;
			
			while(it2.hasNext())
			{
				unaNave = it2.next();
				this.colisionar(unaNave);
			}
			 */
		}
	}
	
	private void colisionar(Movil unMovil)
	{
		if(!(unMovil.getCuerpo().intersects(this.getCuerpo())))
		{
			unMovil.morir();
			System.out.println("- Movil fuera del escenario.");
		}
	}
}
