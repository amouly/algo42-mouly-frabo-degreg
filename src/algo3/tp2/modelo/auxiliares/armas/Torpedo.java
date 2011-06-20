package algo3.tp2.modelo.auxiliares.armas;

import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.moviles.proyectiles.TorpedoProy;

public class Torpedo extends Arma
{
	public Torpedo()
	{
		proyectil = new TorpedoProy();
		cantidadBalas = 15;
		nombre = "Torpedo";
	}
}
