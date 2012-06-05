package com.facultad.ej3;


public class Ejercicio3 {
	public static void main(String[] args) {
		
		combine("01", 3, new StringBuffer()); 
    }

	static void combine(String input, int k, StringBuffer output) { 
		if (k == 0) 
		{ 
			System.out.println(output); 
		} 
		else 
			{ 
				for (int i = 0; i < input.length(); i++) 
				{
					output.append(input.charAt(i));
					combine (input, k - 1, output); 
					output.deleteCharAt(output.length () - 1);
				}
			}
	} 
    
}


