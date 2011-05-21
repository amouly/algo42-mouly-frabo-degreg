package ar.uba.fi.algo3.titiritero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Nicolas
 * Esta clase es la encargada de manejar todo el gameloop. Básicamente tiene una lista
 * de ObjetosVivos y una Dibujables que son recorridas en cada gameloop.
 */
public class ControladorJuego {
	private long intervaloSimulacion;
	private boolean estaEnEjecucion;
	private List<ObjetoVivo> objetosVivos;
	private List<Dibujable> dibujables;
	private List<TecladoObservador> tecladoObservadores;
	private List<MouseClickObservador> mouseClickObservadores;
	private SuperficieDeDibujo superficieDeDibujo;	
	
	public ControladorJuego(){
		this.objetosVivos = new ArrayList<ObjetoVivo>();
		this.dibujables = new ArrayList<Dibujable>();
		this.mouseClickObservadores = new ArrayList<MouseClickObservador>();
		this.tecladoObservadores = new ArrayList<TecladoObservador>();
	}
	
	public void comenzar(){
		estaEnEjecucion = true;
		try{
		while(estaEnEjecucion){
			simular();
			dibujar();
			Thread.sleep(intervaloSimulacion);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void detener(){
		this.estaEnEjecucion = false;
	}
	
	public void agregarObjetoVivo(ObjetoVivo objetoVivo){
		objetosVivos.add(objetoVivo);
	}
	
	public void removerSimulador(ObjetoVivo objetoVivo){
		objetosVivos.remove(objetoVivo);
	}

	public void agregarDibujable(Dibujable unDibujable){
		dibujables.add(unDibujable);
	}
	
	public void removerDibujable(Dibujable unDibujable){
		dibujables.remove(unDibujable);
	}
	
	public long getIntervaloSimulacion() {
		return intervaloSimulacion;
	}

	public void setIntervaloSimulacion(long intervaloSimulacion) {
		this.intervaloSimulacion = intervaloSimulacion;
	}

	private void dibujar() {
		Iterator<Dibujable> iterador = dibujables.iterator();
		while(iterador.hasNext()){
			Dibujable dibujable = iterador.next();
			dibujable.dibujar(this.superficieDeDibujo);
			//System.out.println(dib.getPosicionable().getX());
			//System.out.println( dib.getPosicionable().getY());
		}		
		this.superficieDeDibujo.actualizar();
	}
	
	private void simular() {
		this.superficieDeDibujo.limpiar();
		Iterator<ObjetoVivo> iterador = objetosVivos.iterator();
		while(iterador.hasNext()){
			(iterador.next()).vivir();
		}
	}

	public SuperficieDeDibujo getSuperficieDeDibujo() {
		return superficieDeDibujo;
	}

	public void setSuperficieDeDibujo(SuperficieDeDibujo superficieDeDibujo) {
		this.superficieDeDibujo = superficieDeDibujo;
	}
	
	/*
	 * Se encarga de derivar el manejo del evento click al objeto vista correspondiente
	 */
	public void despacharMouseClick(int x, int y){
		MouseClickObservador mouseClickObservador;
		Iterator<MouseClickObservador> iterador = this.mouseClickObservadores.iterator();
		while(iterador.hasNext()){
			mouseClickObservador = iterador.next();
			mouseClickObservador.MouseClick(x, y);
		}
	}
	
	public void agregarMouseClickObservador(MouseClickObservador unMouseClickObservador){
		this.mouseClickObservadores.add(unMouseClickObservador);
	}
	
	public void removerMouseClickObservador(MouseClickObservador unMouseClickObservador){
		this.mouseClickObservadores.remove(unMouseClickObservador);
	}
	
	public void despacharTecla(int codigoTecla, int modificadores){
		TecladoObservador tecladoObservador;
		Iterator<TecladoObservador> iterador = this.tecladoObservadores.iterator();
		while(iterador.hasNext()){
			tecladoObservador = iterador.next();
			tecladoObservador.ManejarTecla(codigoTecla, modificadores);
		}
	}
	
	public void agregarTecladoObservador(TecladoObservador unTecladoObservador){
		this.tecladoObservadores.add(unTecladoObservador);
	}
	
	public void removerTecladoObservador(TecladoObservador unTecladoObservador){
		this.tecladoObservadores.remove(unTecladoObservador);
	}
}
