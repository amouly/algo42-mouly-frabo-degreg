package algo3.tp2.vista;

import java.awt.Color;
import java.awt.Font;

import ar.uba.fi.algo3.titiritero.vista.TextoDinamico;
import algo3.tp2.modelo.auxiliares.InfoJugador;

public class InfoJugadorVista extends TextoDinamico
{
	private static Font fuente = new Font("SansSerif", Font.BOLD, 12);
	private static Color color = Color.WHITE;

	public InfoJugadorVista(InfoJugador unaInfo)
	{
		super(unaInfo, color, fuente);
	}
}
