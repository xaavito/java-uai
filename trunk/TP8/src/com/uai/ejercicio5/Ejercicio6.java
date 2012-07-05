package com.uai.ejercicio5;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		System.out.println(new Persona("123456") == new Persona("123456"));
		
		System.out.println(new Persona("123456").equals(new Persona("123456")));
	}
}
