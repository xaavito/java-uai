package com.ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	static int tamanioNumero = 0;
	static int posicionNueva = 0;
	static int cola=0;
	
	public static void main(String[] args) {
		int numerito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero a testear..."));
		int numeritoBackup = numerito;
		Integer digito = 1;
		
		// para ver cuantos tiene.
		while(numerito >= 1) {
			digito = numerito%10;
			
			//System.out.println(digito);
			numerito = numerito/10;
			tamanioNumero++;
		}
		//System.out.println(tamanioNumero);
		Integer[] numeroParseado = new Integer[tamanioNumero];
		
		//Reasigno la variable
		numerito = numeritoBackup;
		int posicion = 0;
		//Recorro para insertar en el vector
		while(numerito >= 1) {
			digito = numerito%10;
			
			numerito = numerito/10;
			numeroParseado[posicion++] = digito;
		}
		
		//Empieza la comparacion total
		
		
		//solo por que el tamaño es -1 a la posicion...no me pegues..

		cola = tamanioNumero -1;
		boolean capicua = true;
		while(posicionNueva != tamanioNumero) {
			if(numeroParseado[posicionNueva++] != numeroParseado[cola--]){
				System.out.println("No capicua");
				capicua = false;
				break;
			}
		}
		if(capicua){
			System.out.println("Capicua!!!!");
		}
	}
}
