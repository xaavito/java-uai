package com.facultad.ej6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main(String args[]) {
		String frase = JOptionPane.showInputDialog("Ingrese Consulta...");
		String respuesta = "";
		
		respuesta += getIsTelefonoArgentino(frase);
		
		respuesta += getIsNumeroDeRangoDterminado(frase);
		
		respuesta += getIsPaginaWeb(frase);
		
		respuesta += getIsMail(frase);
		
		respuesta += getIsFecha(frase);
		
		if (respuesta.length() > 0){
			System.out.println(respuesta);
		}else {
			System.out.println("No matcheo nada con nada");
		}
		
	}

	private static String getIsFecha(String frase) {
		if (frase.matches("^[0-31]{2}/[0-12]{2}/[0-3000]{4}")) {
			return "Fecha con formato dd/mm/aaaa";
		}
		return "";
	}

	private static String getIsMail(String frase) {
		if (frase.matches("^\\S+@\\S+\\.{1}\\S+(.\\w)")) {	
			return "Mail";
		}
		return "";
	}

	private static String getIsPaginaWeb(String frase) {
		if (frase.matches("^(http\\://)?www.\\S+")) {
			return "Pagina web";
		}
		return "";
	}

	private static String getIsNumeroDeRangoDterminado(String frase) {
		if (frase.matches("^\\d{6}")) {
			return "Numero de rango determinado";
		}
		return "";
	}

	private static String getIsTelefonoArgentino(String frase) {
		if (frase.matches("^[4]\\d{3}-\\d{4}$")) {
			return "Es Telefono";
		}
		return "";
	}
}
