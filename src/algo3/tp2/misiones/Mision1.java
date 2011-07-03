package algo3.tp2.misiones;

import algo3.tp2.Motor;
import algo3.tp2.modelo.moviles.naves.atacantes.Avioneta;
import algo3.tp2.modelo.moviles.naves.atacantes.Bombardero;

public class Mision1
{
	public Mision1(Motor motorJuego)
	{
		/* Se agregan algunos Enemigos. */
		motorJuego.agregarNaveEnemiga(new Avioneta(360, 30));
		motorJuego.agregarNaveEnemiga(new Bombardero(690, 20));
		motorJuego.agregarNaveEnemiga(new Bombardero(100, 20));
	}
}
