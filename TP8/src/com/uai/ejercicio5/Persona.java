package com.uai.ejercicio5;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;
	
	public Persona(String dni) {
		this.dni = dni;
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
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}	
	
	@Override
	public String toString() {
		
		return this.getApellido() + ", " + this.getNombre();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.dni.equals(((Persona)obj).dni);
	}
	
	@Override
	public int hashCode() {
		int r = 17;
		r = 37 * r + this.dni.hashCode();
		return r;
	}
}
