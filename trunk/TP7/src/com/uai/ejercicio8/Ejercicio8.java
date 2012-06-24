package com.uai.ejercicio8;

public class Ejercicio8 {
	public static void main(String[] args) throws InterruptedException {
	
		Juego juego = new Juego();
		
		Persona p = new Persona("Juan","Perez");
		juego.agregarPersona(p);
		
		p = new Persona("Ricardo","Gonzales");
		juego.agregarPersona(p);	

		p = new Persona("Pepe","Lopez");
		juego.agregarPersona(p);
		
		p = new Persona("Rodrigo","Bueno");
		juego.agregarPersona(p);
		
		juego.jugar();
		
	}
}
