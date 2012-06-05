package com.facultad.ej7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static int intentos = 5;
	public static String selectedPalabra;
	static String path="";
	public static void main(String args[]) throws IOException {
		path = new File("").getCanonicalPath();
		Random randomGenerator = new Random();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path+"\\src\\com\\facultad\\ej7\\palabras.txt"));
		String line = bufferedReader.readLine();
		ArrayList<String> palabras = new ArrayList<String>();
		while (line != null) {
			palabras.add(line);
			line = bufferedReader.readLine();
		}
		
		int index = randomGenerator.nextInt(palabras.size());
		selectedPalabra = palabras.get(index);
		String[] palabra = new String[selectedPalabra.length()];
		for (int i = 0; i < palabra.length; i++) {
			palabra[i] = "-";
		}
		String palabraArmada = "";
		for (int i = 0; i < palabra.length; i++) {
			palabraArmada += palabra[i] + " ";
			//System.out.println(palabra[i]);
		}
		System.out.println(palabraArmada);
		//System.out.println(selectedPalabra);
		boolean foundALetter;
		while(intentos != 0) {
			foundALetter = false;
			String frase = JOptionPane.showInputDialog("Ingrese palabra o letra...");
			if (frase.length() > 1) {
				if(!frase.equalsIgnoreCase(selectedPalabra)) {
					System.out.println("Perdio!!!!!!!");
					intentos = 0;
					break;
				}
				else {
					System.out.println("Gano!!!!!!!!!");
					intentos = 0;
					break;
				}
			}
			int placeFound=0;
			placeFound = selectedPalabra.indexOf(frase);
			
			while (placeFound != -1) {
				palabra[placeFound] = frase;
				placeFound = selectedPalabra.indexOf(frase, placeFound+1);
				foundALetter = true;
			}
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			palabraArmada = "";
			for (int i = 0; i < palabra.length; i++) {
				palabraArmada += palabra[i] + " ";
			}
			System.out.println(palabraArmada);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			if (!foundALetter) {
				System.out.println("Quedan " + (intentos -1));
				intentos--;
			}
		}
	}
}
