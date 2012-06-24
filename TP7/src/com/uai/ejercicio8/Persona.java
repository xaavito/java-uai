package com.uai.ejercicio8;

public class Persona {

	private String nombre;
	private String apellido;

	
	public Persona(String nom, String ape) {
		this.nombre = nom;
		this.apellido = ape;

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
