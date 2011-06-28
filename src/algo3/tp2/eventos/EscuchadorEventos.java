package algo3.tp2.eventos;

import algo3.tp2.MotorJuego;
import algo3.tp2.eventos.Escuchador;
import algo3.tp2.modelo.moviles.naves.Nave;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;
import algo3.tp2.modelo.auxiliares.Energia;
import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.inmoviles.Caja;

public class EscuchadorEventos //implements Escuchador
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
				MotorJuego.getJugador().aumentarPuntaje(nave.getValor());
				MotorJuego.quitarNaveEnemiga(nave);
			}
		}
		
		new Thread(new unThread(unaNave)).start();
	}
	
	public static void manejarMuerteProyectil(Proyectil unProyectil)
	{
		class unThread implements Runnable
		{
			private final Proyectil proyectil;
			
			public unThread(Proyectil unProyectil)
			{
				this.proyectil = unProyectil;
			}
			
			@Override
			public void run()
			{
				MotorJuego.quitarProyectil(proyectil);
			}
		}
		
		new Thread(new unThread(unProyectil)).start();
	}
	
	public static void manejarCajaSoltada(Caja unaCaja)
	{
		class unThread implements Runnable
		{
			private final Caja caja;
			
			public unThread(Caja unaCaja)
			{
				this.caja = unaCaja;
			}
			
			@Override
			public void run()
			{				
				MotorJuego.agregarCajaEscenario(caja);
			}
		}
		
		new Thread(new unThread(unaCaja)).start();
	}
	
	public static void manejarCajaTomada(Caja unaCaja)
	{
		class unThread implements Runnable
		{
			private final Caja caja;
			
			public unThread(Caja unaCaja)
			{
				this.caja = unaCaja;
			}
			
			@Override
			public void run()
			{				
				MotorJuego.quitarCajaEscenario(caja);
			}
		}
		
		new Thread(new unThread(unaCaja)).start();
	}
}
