package com.facultad.ej1;

import javax.swing.JOptionPane; 

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Ingrese un numero...");
		
		System.out.println("El resultado es: " + String.valueOf(factorial(Long.parseLong(num))));
	}
	
	public static long factorial( long numero )
	{
		 if ( numero <= 1 )
		 return 1;
		 else 
		 return numero * factorial( numero - 1 );
	 }
	
}
