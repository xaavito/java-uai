package com.facultad.ej6;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main(String args[]) {
		HashMap<Integer, Integer> mapaDeNumeros = new HashMap<Integer,Integer>();
		String frase = JOptionPane.showInputDialog("Ingrese secuencia...");
		String[] arrayString = frase.split("\\s");
		
		int smallestNumber = 0;
		int valueOfMap = 0;
		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 0; j < arrayString[i].length();j ++) {
				smallestNumber = Integer.parseInt(""+ arrayString[i].charAt(j));
				if (mapaDeNumeros.get(smallestNumber) != null) {
					valueOfMap = (Integer)mapaDeNumeros.get(smallestNumber);
					mapaDeNumeros.put(smallestNumber, valueOfMap + 1);
				} else {
					mapaDeNumeros.put(smallestNumber, 1);
				}
			}
		}
		System.out.println(mapaDeNumeros.toString());
	}
}
