package com.facultad.ej1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	
	public static void main(String args[]) {
		String frase = "";
		int num = 1;
		List<Integer> pepe = new ArrayList<Integer>();
		int numMax=0;
		int cantNumMax=0;
		while(num != 0) {
			frase = JOptionPane.showInputDialog("Ingrese un Numero Entero, termina con 0");
			num = new Integer(frase);
			if (num != 0) {
				pepe.add(num);
			}
		}
		
		for(int j=0;j<pepe.size();j++) {
			int cantPares=0;
			int numero=0;
			numero = pepe.get(j);
			int digito=0;
			while (numero > 1) {
				System.out.println("****************************");
				System.out.println("Numero: "+ numero);
				digito = numero%10;
				System.out.println("Digito: "+ digito);
				if((digito%2) == 0){
					cantPares++;
				}
				numero = numero/10;
				System.out.println("Numero: "+ numero);
			}
			if (cantPares > cantNumMax){
				numMax = pepe.get(j);
				cantNumMax = cantPares;
			}
		}
		
		System.out.println("El numero con mayor cantidad de digitos enteros es: " + numMax);
		System.out.println("Con " + cantNumMax + " digitos pares");
	}
}
