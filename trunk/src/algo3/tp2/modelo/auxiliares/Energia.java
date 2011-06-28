package algo3.tp2.modelo.auxiliares;

/* Define el comportamiento de un Tanque de Energía. */
public class Energia
{
	private int energia;
	
	public Energia(int unaEnergia)
	{
		this.energia = unaEnergia;
	}
	
	public boolean tieneEnergia()
	{
		return energia > 0;
	}

	public void setEnergia(int unValor)
	{
		this.energia = unValor;
	}
	
	public void aumentar(Energia unaEnergia)
	{
		this.energia += unaEnergia.getEnergia();
	}
	
	public void disminuir(Energia unaEnergia)
	{
		this.energia -= unaEnergia.getEnergia();
	}
	
	public int getEnergia()
	{
		return energia;
	}
	
	@Override
	public String toString()
	{
		return Integer.toString(this.energia);
	}
}
