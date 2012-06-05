package com.facultad.ej8;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String args[]) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de figuras..."));
		
		JFrame frame = new JFrame();
		Figuras panel = new Figuras(numero);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		frame.setSize(panel.getCantidad()*10+20, panel.getCantidad()*10+40);
		frame.setVisible(true);
		
	}
}
