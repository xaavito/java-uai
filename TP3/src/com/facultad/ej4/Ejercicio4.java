package com.facultad.ej4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String args[]) {
		String frase = JOptionPane.showInputDialog("Ingrese formula...");
		String[] resultado;
		int asignacion=0;
		resultado = frase.split("\\s");

		if (resultado[1].equals("+")){
			asignacion = Integer.parseInt(resultado[0]) + Integer.parseInt(resultado[2]);
		}
		if (resultado[1].equals("*")){
			asignacion = Integer.parseInt(resultado[0]) * Integer.parseInt(resultado[2]);
		}
		if (resultado[1].equals("/")){
			asignacion = Integer.parseInt(resultado[0]) / Integer.parseInt(resultado[2]);
		}
		if (resultado[1].equals("-")){
			asignacion = Integer.parseInt(resultado[0]) - Integer.parseInt(resultado[2]);
		}
		System.out.println("El resultado es: " + asignacion);
	}
}
