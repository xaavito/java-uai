package com.facultad.ej7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String args[]) {
		int numeroPosicion1 = 0;
		int numeroPosicion2 = 0;
		int cantidadMaxima = 0;
		int resta = 0;
		String frase = JOptionPane.showInputDialog("Ingrese Numero del vector...");
		int numeroDelArreglo = Integer.valueOf(frase);
		int[] arreglo = new int[numeroDelArreglo];
		
		int valor;
		for (int i = 0; i < arreglo.length; i++) {
			valor = Integer.valueOf(JOptionPane.showInputDialog("Ingrese Numero " + i + ":"));
			arreglo[i] = valor;
		}
		
		for (int i = 0; i < arreglo.length -1; i++) {
			if (arreglo[i] <= arreglo[i+1]) {
				resta = arreglo[i+1] - arreglo[i];
			}
			else {
				resta = arreglo[i] - arreglo[i+1];
			}
			if(cantidadMaxima < resta) {
				numeroPosicion1 = arreglo[i];
				numeroPosicion2 = arreglo[i+1];
				cantidadMaxima = resta;
			}
		}
		
		System.out.println("Numero Posicion 1: " + numeroPosicion1);
		System.out.println("Numero Posicion 2: " + numeroPosicion2);
		System.out.println("Diferencia mas grande: " + cantidadMaxima);
	}
}
