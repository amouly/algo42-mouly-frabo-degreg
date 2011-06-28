package algo3.tp2.eventos;

import algo3.tp2.MotorJuego;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.inmoviles.CajaArma;
import algo3.tp2.modelo.inmoviles.CajaEnergia;

public class EscuchadorEventos
{
	public static void manejarDisparoJugador(Proyectil proyectil)
	{
		MotorJuego.agregarProyectilJugador(proyectil);
	}

	public static void manejarDisparoEnemigo(Proyectil proyectil)
	{
		MotorJuego.agregarProyectilEnemigo(proyectil);
	}

	public static void manejarMuerteNaveEnemiga(Nave unaNave)
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
				/* Se agrega al escenario el tanque de combustible de la Nave destruida. */
				Energia energiaNave = nave.getEnergia();
				energiaNave.setEnergia(100); /* Si la nave muere, es porque no tiene mas energia, asi que lleno el tanque. */
				CajaEnergia unaCajaEnergia = new CajaEnergia(nave.getX(), nave.getY());
				unaCajaEnergia.setContenido(energiaNave);
				
				/* Se agrega al escenario el arma activa de la Nave destruida. */
				//Arma armaNave = nave.getArmaActiva();
				//CajaArma unaCajaArma = new CajaArma(nave.getX(), nave.getY());
				//unaCajaArma.setContenido(armaNave);
				
				//MotorJuego.agregarVistaInmovil(unaCajaArma);
				MotorJuego.agregarVistaInmovil(unaCajaEnergia);
				MotorJuego.getJugador().aumentarPuntaje(nave.getValor());
				MotorJuego.quitarNaveEnemiga(nave);
			}
		}
		
		new Thread(new unThread(unaNave)).start();
	}
	
	public static void manejarMuerteProyectil(Proyectil proyectil) {
		class unThread implements Runnable {
			public unThread(Proyectil proyectil) {
				this.proyectil = proyectil;
			}
			private final Proyectil proyectil;
			@Override
			public void run() {
				MotorJuego.quitarProyectil(proyectil);
				
			}
		}
		new Thread(new unThread(proyectil)).start();
	}
}
