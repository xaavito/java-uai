package com.uai.ejercicio4;

public class Contacto {

	private String nombre;
	private String apellido;
	private Long telefono;
	private String email;
	
	public Contacto(String nom, String ape, Long tel, String email) {
		this.nombre = nom;
		this.apellido = ape;
		this.telefono = tel;
		this.setEmail(email);
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
	
	public Long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
