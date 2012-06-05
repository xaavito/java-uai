package com.facultad.ej7;

import javax.swing.JOptionPane;

import com.facultad.numericUtils.NumericUtils;

public class Ejercicio7 {
	
	public static void main(String args[]) {
		boolean notFound = true;
		int numero = 0;
		int iterador = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero m..."));
		
		iterador = numero;
		while(notFound) {
			
			if(NumericUtils.isPrime(iterador)){
				if(NumericUtils.isPrime(iterador + 2)){
					System.out.println("M: "+ numero + " P: " + iterador + " Q: " + (iterador + 2));
					return;
				}
			}
			iterador++;
		}
	}
}
