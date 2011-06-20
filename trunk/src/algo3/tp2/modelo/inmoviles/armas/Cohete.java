package algo3.tp2.modelo.inmoviles.armas;

import algo3.tp2.modelo.inmoviles.Arma;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public class Cohete extends Arma implements ObjetoVivo
{
	public Cohete()
	{
		cantidadBalas = 5;
		nombre = "Cohete";
	}

	@Override
	public void vivir() {
		// TODO Auto-generated method stub
		
	}
}
