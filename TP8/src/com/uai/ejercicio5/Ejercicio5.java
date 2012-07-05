package com.uai.ejercicio5;

public class Ejercicio5 {
	public static void main(String[] args) {
	
		Persona p = new Persona("123456");
		p.setNombre("Juan");
		p.setApellido("Perez");
		p.setDireccion(new Direccion("lalala","123","Lanus"));
		
		System.out.println(p);
		
		
	}
}
