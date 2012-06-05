package com.facultad.ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {
	
	private static String path = "";
	
	public static void main(String args[]) throws IOException {
		path = new File("").getCanonicalPath(); 
		BufferedReader matrizOriginalReader = new BufferedReader(new FileReader(path+"\\src\\com\\facultad\\ej9\\matrizOriginal.txt"));
		String line = matrizOriginalReader.readLine();
		BufferedWriter matrizTraspuestaWriter = new BufferedWriter(new FileWriter(path+"\\src\\com\\facultad\\ej9\\matrizTraspuesta.txt"));
		
		int cantidadFilasOriginal = 0;
		int cantidadColumnasOriginal = 0;
		
		//primera recorrida para sacar las filas
		while (line != null) {
			cantidadFilasOriginal++;
			cantidadColumnasOriginal = line.split("\\t").length;
			line = matrizOriginalReader.readLine();
		}
		System.out.println("Filas: " + cantidadFilasOriginal+ " Columnas:" + cantidadColumnasOriginal);
		//inicializacion de la matriz traspuesta.
		String [][] matrizTraspuesta = new String[cantidadColumnasOriginal][cantidadFilasOriginal];
		
		//Segunda recorrida para sacar los datos y armar la traspuesta
		matrizOriginalReader = new BufferedReader(new FileReader(path+"\\src\\com\\facultad\\ej9\\matrizOriginal.txt"));
		line = matrizOriginalReader.readLine();
		
		int filas = 0;
		
		while (line != null) {
			cantidadColumnasOriginal = line.split("\\t").length;
			String[] numeros = line.split("\\t");
			for (int i = 0; i < cantidadColumnasOriginal; i++) {
				matrizTraspuesta[i][filas] = numeros[i];
			}
			line = matrizOriginalReader.readLine();
			filas++;
		}
		String row = "";
		for (int i = 0; i < cantidadColumnasOriginal; i++) {
			for (int j = 0; j < filas; j++) {
				row+= "" + matrizTraspuesta[i][j] + "\t";
			}
			matrizTraspuestaWriter.write(row);
			matrizTraspuestaWriter.newLine();
			row="";
		}
		matrizTraspuestaWriter.close();
		matrizOriginalReader.close();
	}
}
