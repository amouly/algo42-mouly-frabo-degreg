package algo3.tp2.misiones;

import algo3.tp2.MotorJuego;
import algo3.tp2.modelo.moviles.naves.atacantes.Avioneta;
import algo3.tp2.modelo.moviles.naves.atacantes.Bombardero;

public class Mision1
{
	public Mision1()
	{
		/* Se agregan algunos Enemigos. */
		MotorJuego.agregarNaveEnemiga(new Avioneta(360, 30));
		MotorJuego.agregarNaveEnemiga(new Bombardero(690, 20));
		MotorJuego.agregarNaveEnemiga(new Bombardero(70, 20));
	}
}
