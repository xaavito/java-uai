package com.facultad.ej10;


public class Ejercicio10 {
	
	public static void main(String args[]) {
		Integer[] original = {1,2,3,4,5,6,7,8,9};
		Integer[] inversa;
		
		inversa = invertirArray(original);
		
		System.out.println("originalllllllll");
		for (Integer integer : original) {
			System.out.println(integer);
		}
		
		System.out.println("invertidooooo");
		for (Integer integer : inversa) {
			System.out.println(integer);
		}
	}

	private static Integer[] invertirArray(Integer[] original) {
		Integer[] inversa = new Integer[original.length];
		
		int contadorNuevo=0;
		
		for (int i = original.length -1; i >= 0; i--) {
			inversa[contadorNuevo++] = original[i];
		}
		return inversa;
	}
}
