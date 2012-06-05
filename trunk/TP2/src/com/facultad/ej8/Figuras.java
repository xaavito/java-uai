package com.facultad.ej8;

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
		int initpos = 5*cantidad;
		for (int i = 0; i < getCantidad(); i++) {
			g.drawRect(initpos-(i*5), initpos-(i*5), 10*i+1, 10*i+1);
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
