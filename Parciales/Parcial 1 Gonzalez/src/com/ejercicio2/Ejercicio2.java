package com.ejercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	static int buffer1 = 0;
	static int buffer2 = 0;
	
	public static void main(String[] args) {
		ArrayList<Integer> cadena = new ArrayList<Integer>();
		String[] pepe = JOptionPane.showInputDialog("Ingrese lista separada por comas sin espacios...").split("\\,");
		
		for(int i = 0; i < pepe.length ;i++) {
			cadena.add(Integer.parseInt(pepe[i]));
		}
		Ejercicio2.bubbleSort(cadena);
	}
	
	static ArrayList<Integer> bubbleSort(ArrayList<Integer> lista){
		int i;
		int reseteos = 1;
		System.out.println("Tamaño de la lista: " + lista.size());
		boolean sorted = true;
		for(i = 0;i < lista.size() - 1 ;i++) {
			if(lista.get(i).intValue() > lista.get(i+1).intValue()) {
				buffer1 = lista.get(i);
				buffer2 = lista.get(i+1);
				lista.remove(i);
				lista.add(i, buffer2);
				lista.remove(i + 1);
				lista.add(i+1, buffer1);
				System.out.println("Swap en la posicion: " + i + " y " + (i+1));
				sorted = false;
				
			}
			if (i+1 == (lista.size()-1) && !sorted){
				i=0;
				System.out.println("Reseteo: " + reseteos++);
				sorted = true;
			}
		}
		System.out.println(lista.toString());
		
		return lista;
	}
}
