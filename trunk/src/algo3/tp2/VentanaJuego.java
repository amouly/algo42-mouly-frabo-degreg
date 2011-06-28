package algo3.tp2;

import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ar.uba.fi.algo3.titiritero.vista.Panel;

public class VentanaJuego extends JFrame
{
	private static int ancho;
	private static int alto;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private Panel panel = null;

	public VentanaJuego(int unAncho, int unAlto)
	{
		super();
		this.ancho = unAncho;
		this.alto = unAlto;
		
		initialize();
	}
	
	private void initialize()
	{
		this.setSize(this.ancho, this.alto);
		this.setContentPane(getJContentPane());
		this.setTitle("Algo42");
		
		this.addWindowListener(new java.awt.event.WindowAdapter()
		{
			@Override
			public void windowClosing(java.awt.event.WindowEvent e)
			{
				System.out.println("windowClosing()"); // TODO Auto-generated Event stub windowClosing()
				System.exit(NORMAL);
			}
		});
	}

	private JPanel getJContentPane()
	{
		if (jContentPane == null)
		{
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getSuperficieDeDibujo(), null);
		}
		return jContentPane;
	}
	
	public Panel getSuperficieDeDibujo()
	{
		if (panel == null) 
		{
			panel = new Panel(this.ancho, this.alto);
			panel.setLayout(new GridBagLayout());
			panel.setBounds(new Rectangle(0, 0, this.ancho, this.alto));
		}
		return panel;
	}
}
