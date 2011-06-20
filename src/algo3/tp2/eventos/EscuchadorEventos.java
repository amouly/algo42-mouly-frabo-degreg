package algo3.tp2.eventos;

import algo3.tp2.MotorJuego;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public class EscuchadorEventos {
	public static void manejarDisparoJugador(Proyectil proyectil) {
		MotorJuego.agregarProyectilJugador(proyectil);
	}

	public static void manejarDisparoEnemigo(Proyectil proyectil) {
		MotorJuego.agregarProyectilEnemigo(proyectil);
	}

	public static void manejarMuerteNaveEnemiga(Nave nave) {
		class unThread implements Runnable {
			public unThread(Nave nave) {
				this.nave = nave;
			}
			private final Nave nave;
			@Override
			public void run()
			{
				MotorJuego.getJugador().aumentarPuntaje(nave.getValor());
				MotorJuego.quitarNaveEnemiga(nave);
			}
		}
		new Thread(new unThread(nave)).start();
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
