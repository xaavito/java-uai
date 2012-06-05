package com.facultad.ej8;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String args[]) {
		HashMap<Integer, String> cadenaDeApertura = new HashMap<Integer,String>();
		HashMap<Integer, String> cadenaDeCierre = new HashMap<Integer,String>();
		HashMap<String, String> cadenaDeCorrespondencia = new HashMap<String,String>();
		cadenaDeCorrespondencia.put("(", ")");
		cadenaDeCorrespondencia.put("{", "}");
		cadenaDeCorrespondencia.put("[", "]");
		String frase = JOptionPane.showInputDialog("Ingrese formula...");
		
		int contadorInicial = 0;
		int contadorDeCierre = 0;
		for (int i = 0; i < frase.length(); i++) {
			String caracter = "" + frase.charAt(i);
			if (caracter.equalsIgnoreCase("(") ||
				caracter.equalsIgnoreCase("{") ||
				caracter.equalsIgnoreCase("[")) {
				cadenaDeApertura.put(contadorInicial++, caracter);
			}
			
			if (caracter.equalsIgnoreCase(")") ||
				caracter.equalsIgnoreCase("}") ||
				caracter.equalsIgnoreCase("]")) {
				cadenaDeCierre.put(contadorDeCierre++, caracter);
			}
		}
		
		if(cadenaDeApertura.size() == cadenaDeCierre.size()) {
			int contadorTest = 0;
			for (int i = cadenaDeApertura.size() -1; i >= 0 ; i--) {
				if(!cadenaDeCorrespondencia.get(cadenaDeApertura.get(i)).equalsIgnoreCase(cadenaDeCierre.get(contadorTest++))){
					System.out.println("No balanceada");
					return;
				}
			}
			System.out.println("Balanceada!!!");
		}else {
			System.out.println("No balanceada");
		}
		
	}
}
