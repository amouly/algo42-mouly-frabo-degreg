package algo3.tp2.modelo.auxiliares;

/* Define el comportamiento de un Tanque de Energía. */
public class Energia {
	private int energia;
	
	public Energia(int energia) {
		this.energia = energia;
	}
	
	public boolean tieneEnergia() {
		return energia > 0;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void aumentar(Energia energia) {
		this.energia += energia.getEnergia();
	}
	
	public void disminuir(Energia energia) {
		this.energia -= energia.getEnergia();
	}
	
	private int getEnergia() {
		return energia;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.energia);
	}
}
