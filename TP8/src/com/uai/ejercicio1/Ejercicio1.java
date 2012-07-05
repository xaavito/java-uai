package com.uai.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	static List<Integer> numeros;
	
	public static void main(String[] args) {
		
		String frase = "";
		int num = 1;
		numeros = new ArrayList<Integer>();

		while(num != 0) {
			frase = JOptionPane.showInputDialog("Ingrese un Numero Entero, termina con 0");
			num = new Integer(frase);
			if (num != 0) {
				numeros.add(num);
			}
		}
		Mostrar();
	}
	
	static void Mostrar()
	{
		String texto;
		//a
		texto = "Cantidad de Elementos: " + String.valueOf(numeros.size());
		System.out.println(texto);
		
		//b
		texto = "Los Elementos son: " + numeros.toString();
		System.out.println(texto);	
		
		//c
		texto = "Primera ocurrencia de 7: " + String.valueOf(numeros.indexOf(7));
		System.out.println(texto);
		
		//d		
		texto = "Primera ocurrencia de 9: " + String.valueOf(numeros.indexOf(9));
		System.out.println(texto);
		
		//e
		texto = "Menor valor: " + String.valueOf(Collections.min(numeros));
		System.out.println(texto);
		
		//f
		texto = "Mayor valor: " + String.valueOf(Collections.max(numeros));
		System.out.println(texto);
		
		//g
		Collections.reverse(numeros);
		texto = "Los Elementos invertidos son: " + numeros.toString();
		System.out.println(texto);
		
		//h
		Collections.sort(numeros);
		texto = "Los Elementos en orden natural son: " + numeros.toString();
		System.out.println(texto);
		
		//i
		Collections.reverse(numeros);
		texto = "Los Elementos en orden mayor a menor son: " + numeros.toString();
		System.out.println(texto);		
		
		//j		
		texto = "Cantidad de veces que aparece 7: " + String.valueOf(Collections.frequency(numeros, 7));
		System.out.println(texto);		
		
		//k
		for (int i=5; i > numeros.size(); i--)
		{
			numeros.add(9999);
		}
		Collections.sort(numeros);	
		Collections.reverse(numeros);
		texto = "Los 4 Elementos mas grandes son: " + numeros.subList(0, 4).toString();
		System.out.println(texto);				
	}
	
}
