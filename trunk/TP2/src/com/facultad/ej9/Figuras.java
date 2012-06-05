package com.facultad.ej9;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Figuras extends JPanel {
	private int cantidad;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Figuras(int cant) {
		super();
		setCantidad(cant);
	}

	protected void paintComponent(Graphics g) {
		for (int i = 0; i < 300/getCantidad(); i++) {
			for (int j = 0; j < 300/getCantidad(); j++) {
				g.drawRect(i*getCantidad(), j*getCantidad(), getCantidad(), getCantidad());
			}
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
