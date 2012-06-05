package com.facultad.ej4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		int numero = 5;
		int random = 0;
		
		/**
		 * Piedra 0
		 * Papel 1
		 * Tijera 2
		 */
		int cant = 0;
		random = new Random().nextInt(100);
		System.out.println("Numero de la maquina: " + random);
		while(numero != random) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero..."));
			if (numero > random) {
				System.out.println("Menor");
				cant++;
			}
			if (numero < random) {
				System.out.println("Mayor");
				cant++;
			}
			if (numero == random) {
				System.out.println("ganador!!!!! Cantidad de intentos: " + String.valueOf(cant));
			}
		}
	}
}
