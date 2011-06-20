package algo3.tp2.modelo.inmoviles.armas;

import algo3.tp2.modelo.inmoviles.Arma;
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
