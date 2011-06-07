package algo3.tp2.modelo.moviles;

import algo3.tp2.modelo.Movil;

public class Bala extends Movil
{
	private int efecto;
	
	public Bala(int posInicialX, int posInicialY, int unEfecto)
	{
		super(posInicialX, posInicialY);
		
		efecto = unEfecto;
		tanqueEnergia.setCantidad(1);
	}
}
