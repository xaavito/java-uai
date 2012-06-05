package com.facultad.ej9;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.facultad.ej9.Figuras;
import com.facultad.numericUtils.NumericUtils;

public class Ejercicio9 {

	public static void main(String args[]) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de figura..."));
		if (!NumericUtils.isDivisorDe300(numero)){
			System.out.println("No es divisor de 300 papá!!!!");
			return;
		}
		JFrame frame = new JFrame();
		Figuras panel = new Figuras(numero);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		frame.setSize(320, 340);
		frame.setVisible(true);
		
	}
}
