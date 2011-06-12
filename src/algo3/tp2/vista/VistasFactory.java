package algo3.tp2.vista;

import ar.uba.fi.algo3.titiritero.Dibujable;

public interface VistasFactory {
	/*Vistas de proyectiles*/
	public Dibujable getLaserVista();
	
	/*Vistas de naves*/
	public Dibujable getJugadorVista();
	
	public Dibujable getAvionetaVista();
	
	public Dibujable getCivilVista();
	
	public Dibujable getExploradorVista();
	
	public Dibujable getHelicopteroVista();
	
	public Dibujable getBombarderoVista();
	
	public Dibujable getCazaVista();
}
