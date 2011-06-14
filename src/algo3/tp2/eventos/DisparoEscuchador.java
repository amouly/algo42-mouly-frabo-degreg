package algo3.tp2.eventos;

import algo3.tp2.MotorJuego;
import algo3.tp2.modelo.moviles.proyectiles.Proyectil;

public class DisparoEscuchador
{
	public static void manejarDisparoJugador(Proyectil proyectil)
	{
		MotorJuego.agregarProyectilJugador(proyectil);
	}
	
	public static void manejarDisparoEnemigo(Proyectil proyectil)
	{
		MotorJuego.agregarProyectilEnemigo(proyectil);
	}
}
