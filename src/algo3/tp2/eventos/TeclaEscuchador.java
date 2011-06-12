package algo3.tp2.eventos;

import java.awt.event.KeyEvent;

import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import ar.uba.fi.algo3.titiritero.KeyPressedObservador;

public class TeclaEscuchador implements KeyPressedObservador {

	private final Jugador jugador;
	
	public TeclaEscuchador(Jugador jugador){
		this.jugador = jugador;
	}
	
	@Override
	public synchronized void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			jugador.moverEnY(5);
			break;
			
		case KeyEvent.VK_LEFT:
			jugador.moverEnX(-5);
			break;
			
		case KeyEvent.VK_UP:
			jugador.moverEnY(-5);
			break;
		
		case KeyEvent.VK_RIGHT:
			jugador.moverEnX(5);
			break;
			
		case KeyEvent.VK_SPACE:
			jugador.disparar();
			break;

		default:
			System.out.println("No apreto una tecla posta: " + event.getKeyCode());
			break;
		}
	}
}
