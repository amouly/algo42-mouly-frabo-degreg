package algo3.tp2.modelo.moviles.naves;

import java.awt.Point;
import java.util.Iterator;
import java.util.List;

import algo3.tp2.MotorJuego;
import algo3.tp2.eventos.EscuchadorEventos;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.moviles.Movil;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public abstract class Nave extends Movil
{
	protected int valor; /* Establece cuantos puntos vale la nave. */
	protected int puntaje; /* Establece la cantidad de puntos acumulados por la nave. */

	public Nave()
	{
		this.tanqueEnergia = new Energia(100);
	}
	
	@Override
	public void vivir()
	{
		/* Cambia su posicion de acuerdo al tipo de vuelo. */
		Point variacionPos = formaVuelo.getVariacionPosicion();
		cuerpo.setLocation((int) cuerpo.getX() - (int) variacionPos.getX(), (int) cuerpo.getY() - (int) variacionPos.getY());
		
		/* Chequea colisión con los proyectiles del jugador. */
		List<Proyectil> proyectiles = MotorJuego.getProyectilesJugador();
		synchronized (proyectiles) {
			Iterator<Proyectil> it = proyectiles.iterator();
			Proyectil proyectil;
			while (it.hasNext() && isAlive()) {
				proyectil = it.next();
				colisionar(proyectil);
			}
		}
		
		/* Chequea colisión con la nave del jugador. */
		if (isAlive()) {
			colisionar(MotorJuego.getJugador());
		}
		else
		{
			morir();
		}
	}
	
	public void morir() {
		EscuchadorEventos.manejarMuerteNaveEnemiga(this);
	}
	
	public boolean isAlive() {
		return tanqueEnergia.tieneEnergia();
	}
	
	public int getPuntaje()
	{
		return puntaje;
	}

	public int getValor() {
		return valor;
	}

	public void aumentarPuntaje(int unValor)
	{
		puntaje += unValor;
	}
	
	private void colisionar(Proyectil proyectil) {
		if(proyectil.getCuerpo().intersects(this.getCuerpo())) {
			proyectil.morir();
			this.recibirDanio(proyectil);
			System.out.println("IMPACTO DE BALA");
		}
	}
	
	private void colisionar(Nave nave) {
		if(nave.getCuerpo().intersects(this.getCuerpo())) {
			nave.morir();
			this.morir();
		}
	}
	
	private void recibirDanio(Proyectil proyectil) {
		this.tanqueEnergia.disminuir(proyectil.getDanio());
		System.out.println("ENERGIA: " + tanqueEnergia);
	}
}
