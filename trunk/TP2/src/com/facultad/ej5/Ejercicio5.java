package com.facultad.ej5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.facultad.numericUtils.NumericUtils;


public class Ejercicio5 {
	
	private static int paresCount;
	private static int imparesCount;
	private static String path = "";
	public static void main(String args[]) {
		
		int numero = 0;
		int paresTotal = 0;
		int imparesTotal = 0;
		try{
			path = new File("").getCanonicalPath(); 
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path+"\\src\\com\\facultad\\ej5\\numeros.txt"));
			String line = bufferedReader.readLine();
			BufferedWriter primosWriter = new BufferedWriter(new FileWriter(path+"\\src\\com\\facultad\\ej5\\primos.txt"));
			BufferedWriter divisoresDe3000Writer = new BufferedWriter(new FileWriter(path+"\\src\\com\\facultad\\ej5\\divisoresDe3000.txt"));
			BufferedWriter promediosWriter = new BufferedWriter(new FileWriter(path+"\\src\\com\\facultad\\ej5\\promedios.txt"));
			
			while (line != null) {
				System.out.println(line);
				numero = Integer.parseInt(line);
				
				if (NumericUtils.isPrime(numero)) {
					System.out.println("Este es primo: " + numero);
					try {
						primosWriter.write(String.valueOf(numero));
						primosWriter.newLine();
					} catch(IOException e) {
						e.printStackTrace();
					}
				}
				
				if (NumericUtils.isDivisorDe3000(numero)) {
					divisoresDe3000Writer.write(String.valueOf(numero));
					divisoresDe3000Writer.newLine();
				}
				if (numero%2==0) {
					paresTotal+=numero;
					paresCount++;
				}
				else{
					imparesTotal+=numero;
					imparesCount++;
				}
				line = bufferedReader.readLine();
			}
			promediosWriter.write("Promedio numeros pares: " + String.valueOf(paresTotal/paresCount));
			promediosWriter.newLine();
			promediosWriter.write("Promedio numeros impares: " + String.valueOf(imparesTotal/imparesCount));
			
			primosWriter.close();
			divisoresDe3000Writer.close();
			promediosWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
