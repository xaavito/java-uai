package com.uai.ejercicio5;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		RegistroDeLasPersonas reg = new RegistroDeLasPersonas();
		
		Persona p = new Persona("29111999");
		p.setNombre("Luciano");
		p.setApellido("Perez");
		p.setDireccion(new Direccion("34","567","La Plata"));		
		reg.agregarPersona(p);
		
		p = new Persona("30333666");
		p.setNombre("Luciano");
		p.setApellido("Perez");
		p.setDireccion(new Direccion("34","567","La Plata"));		
		reg.agregarPersona(p);		
		
		System.out.println(String.valueOf(reg.cantidadPersonas()));
		
		System.out.println(reg.recuperarPersona("29111999"));
		
		p = new Persona("29111999");
		p.setNombre("Juan Andres");
		p.setApellido("Perez");
		p.setDireccion(new Direccion("34","567","La Plata"));		
		reg.agregarPersona(p);
		
		System.out.println(reg.recuperarPersona("29111999"));
	}
}
