package algo3.tp2.modelo.auxiliares.armas;

import algo3.tp2.modelo.auxiliares.Arma;
import algo3.tp2.modelo.moviles.proyectiles.LaserProy;

public class Laser extends Arma
{
	public Laser()
	{
		proyectil = new LaserProy();
		cantidadBalas = 1000;
		nombre = "Laser";
	}
}
