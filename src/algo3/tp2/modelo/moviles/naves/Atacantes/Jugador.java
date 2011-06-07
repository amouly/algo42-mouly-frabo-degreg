package algo3.tp2.modelo.moviles.naves.atacantes;

import algo3.tp2.modelo.moviles.naves.NaveAtacante;

public class Jugador extends NaveAtacante
{
	public Jugador()
	{
		super();
	}

	public void moverEnX(int deltaX) {
		cuerpo.setLocation((int) cuerpo.getX() + deltaX, (int) cuerpo.getY());
	}

	public void moverEnY(int deltaY) {
		cuerpo.setLocation((int) cuerpo.getX(), (int) cuerpo.getY() + deltaY);
	}
}
