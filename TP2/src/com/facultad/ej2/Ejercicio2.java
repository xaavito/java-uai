package com.facultad.ej2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String args[]) {
		String frase = "";
		int random = 0;
		/**
		 * Piedra 0
		 * Papel 1
		 * Tijera 2
		 */
		while(!frase.equalsIgnoreCase("salir")) {
			frase = JOptionPane.showInputDialog("Ingrese piedra, papel o tijera o salir (para salir)");
			random = new Random().nextInt(3);
			
			if (frase.equalsIgnoreCase("piedra")){
				if (random == 0){
					System.out.println("Vos sacaste piedra, Maquina saco piedra, Resultado Empate");
				}
				if (random == 1){
					System.out.println("Vos sacaste piedra, Maquina saco papel, Resultado Perdiste");
				}
				if (random == 2){
					System.out.println("Vos sacaste piedra, Maquina saco tijera, Resultado Ganaste");
				}
			}
			
			if (frase.equalsIgnoreCase("papel")){
				if (random == 0){
					System.out.println("Vos sacaste papel, Maquina saco piedra,Resultado Ganaste");
				}
				if (random == 1){
					System.out.println("Vos sacaste papel, Maquina saco papel,Resultado Empate");
				}
				if (random == 2){
					System.out.println("Vos sacaste papel, Maquina saco tijera,Resultado Perdiste");
				}
			}
			
			if (frase.equalsIgnoreCase("tijera")){
				if (random == 0){
					System.out.println("Vos sacaste tijera, Maquina saco piedra,Resultado Perdiste");
				}
				if (random == 1){
					System.out.println("Vos sacaste tijera, Maquina saco papel,Resultado ganaste");
				}
				if (random == 2){
					System.out.println("Vos sacaste tijera, Maquina saco tijera,Resultado Empate");
				}
			}
		}
	}
}
