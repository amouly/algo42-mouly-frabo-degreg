package algo3.tp2.eventos;

import java.awt.event.KeyEvent;

import algo3.tp2.modelo.moviles.naves.atacantes.Jugador;
import ar.uba.fi.algo3.titiritero.KeyPressedObservador;

public class TeclaEscuchador implements KeyPressedObservador {

	private final Jugador jugador;
	
	public TeclaEscuchador(Jugador jugador)
	{
		this.jugador = jugador;
	}
	
	@Override
	public void keyPressed(KeyEvent event)
	{
		switch (event.getKeyCode())
		{
			case KeyEvent.VK_DOWN:
				jugador.moverEnY(5);
				System.out.println("El Jugador se movió a la izquierda.");
			break;
			
			case KeyEvent.VK_LEFT:
				jugador.moverEnX(-5);
				System.out.println("El Jugador se movió a la derecha.");
			break;
			
			case KeyEvent.VK_UP:
				jugador.moverEnY(-5);
			break;
		
			case KeyEvent.VK_RIGHT:
				jugador.moverEnX(5);
			break;
			
			case KeyEvent.VK_1:
				jugador.cambiarArmaActiva(0);
			break;
			
			case KeyEvent.VK_2:
				jugador.cambiarArmaActiva(1);
			break;
			
			case KeyEvent.VK_3:
				jugador.cambiarArmaActiva(2);
			break;
			
			case KeyEvent.VK_4:
				jugador.cambiarArmaActiva(3);
			break;
			
			case KeyEvent.VK_SPACE:
				jugador.disparar();
				System.out.println("El Jugador disparó.");
			break;

			default:
				System.out.println("No apreto una tecla posta: " + event.getKeyCode());
			break;
		}
	}
	
	public void keyReleased(KeyEvent event)
	{
		System.out.println("Released: " + event.getKeyCode());
	}
}
