package algo3.tp2;

import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ar.uba.fi.algo3.titiritero.vista.Panel;

public class VentanaJuego extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private Panel panel = null;
	
	public VentanaJuego() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(389, 283);
		this.setContentPane(getJContentPane());
		this.setTitle("Ejemplo pelotas");
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("windowClosing()"); // TODO Auto-generated Event stub windowClosing()
				System.exit(NORMAL);
			}
		});
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getSuperficieDeDibujo(), null);
		}
		return jContentPane;
	}
	
	public Panel getSuperficieDeDibujo() {
		if (panel == null) {
			panel = new Panel(200,200);
			panel.setLayout(new GridBagLayout());
			//panel.setBounds(new Rectangle(10, 43, 267, 114));
			panel.setBounds(new Rectangle(162, 38, 200, 200));
		}
		return panel;
	}

}
