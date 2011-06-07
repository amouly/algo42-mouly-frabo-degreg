package algo3.tp2.modelo.moviles.naves;

import java.util.LinkedList;
import algo3.tp2.modelo.moviles.Nave;
import algo3.tp2.modelo.inmoviles.Arma;

public class NaveAtacante extends Nave
{
	private LinkedList<Arma> armas;
	
	private void agregarArma(Arma unArma)
	{
		armas.add(unArma);
	}
}
