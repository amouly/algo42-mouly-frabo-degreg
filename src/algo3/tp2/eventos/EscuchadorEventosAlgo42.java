package algo3.tp2.eventos;

import algo3.tp2.Motor;
import algo3.tp2.modelo.inmoviles.Caja;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public class EscuchadorEventosAlgo42 implements EscuchadorEventos
{
	Motor motorJuego;

	public EscuchadorEventosAlgo42(Motor motorJuego)
	{
		this.motorJuego = motorJuego;
	}

	@Override
	public void manejarDisparoJugador(Proyectil unProyectil)
	{
		motorJuego.agregarProyectilJugador(unProyectil);
	}
	
	@Override
	public void manejarDisparoEnemigo(Proyectil proyectil) {
		class unThread implements Runnable {
			private final Proyectil proyectil;

			public unThread(Proyectil unProyectil) {
				this.proyectil = unProyectil;
			}

			@Override
			public void run() {
				motorJuego.agregarProyectilEnemigo(proyectil);
			}
		}

		new Thread(new unThread(proyectil)).start();
	}
	
	public void manejarMuerteJugador(Jugador elJugador)
	{
		System.out.println("- El Jugador fue asesinado.");
		//ManejadorMensajes.jugadorMuerto();
	}

	@Override
	public void manejarMuerteNaveEnemiga(Nave unaNave)
	{
		class unThread implements Runnable
		{
			private final Nave nave;

			public unThread(Nave unaNave) 
			{
				this.nave = unaNave;
			}

			@Override
			public void run()
			{
				motorJuego.getJugador().aumentarPuntaje(nave.getValor());
				motorJuego.quitarNaveEnemiga(nave);
			}
		}

		new Thread(new unThread(unaNave)).start();
		
		System.out.println("- Una nave enemiga fue asesinada.");
	}

	@Override
	public void manejarMuerteProyectil(Proyectil unProyectil) {
		class unThread implements Runnable {
			private final Proyectil proyectil;

			public unThread(Proyectil unProyectil) {
				this.proyectil = unProyectil;
			}

			@Override
			public void run() {
				motorJuego.quitarProyectil(proyectil);
			}
		}

		new Thread(new unThread(unProyectil)).start();
	}

	@Override
	public void manejarCajaSoltada(Caja unaCaja)
	{
		class unThread implements Runnable
		{
			private final Caja caja;

			public unThread(Caja unaCaja) {
				this.caja = unaCaja;
			}

			@Override
			public void run() {
				motorJuego.agregarCajaEscenario(caja);
			}
		}

		System.out.println("- Caja soltada.");

		new Thread(new unThread(unaCaja)).start();
	}

	@Override
	public void manejarCajaTomada(Caja unaCaja) {
		class unThread implements Runnable {
			private final Caja caja;

			public unThread(Caja unaCaja) {
				this.caja = unaCaja;
			}

			@Override
			public void run() {
				motorJuego.quitarCajaEscenario(caja);
			}
		}

		System.out.println("- Caja tomada.");

		new Thread(new unThread(unaCaja)).start();
	}
}
