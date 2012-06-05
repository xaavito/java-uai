package com.facultad.ej2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Ingrese un numero...");
		
		System.out.println("El resultado es: " + String.valueOf(fibonacci(Long.parseLong(num))));
		
	}
	
	public static long fibonacci( long numero )
	{
		 if ( ( numero == 0 ) || ( numero == 1 ) )
		 return numero;
		 else
		 return fibonacci( numero - 1 ) + fibonacci( numero - 2 );
	}
	
}
