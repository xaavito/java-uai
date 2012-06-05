package com.facultad.ej5;

public class Persona {
	private String nombre;
	private Persona padre;
	private Persona madre;
	
	//crea padre o madre
	public static Persona getInstance(String nombre){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		return persona;
	}
	//Crea hijo y asigna a padre
	public static Persona getInstanceAsFather(String nombre, Persona padre){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setPadre(padre);
		return persona;
	}
	//Crea hijo y asigna a madre
	public static Persona getInstanceAsMother(String nombre, Persona madre){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setMadre(madre);
		return persona;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public void imprimirPersona(){
		String padre = "Null";
		String madre = "Null";
		String resultado = "Nombre: " + this.getNombre();
		if(this.getPadre() != null) {
			padre = this.getPadre().getNombre();
		}
		if(this.getMadre() != null) {
			padre = this.getMadre().getNombre();
		}
		System.out.println(resultado + " Padre: " + padre + " Madre: " + madre);
	}
	
	public String getNombrePadre() {
		if (this.getPadre() != null) {
			return getPadre().getNombre();
		}
		return "" + Math.random();
	}
	
	public String getNombreMadre() {
		if (this.getMadre() != null) {
			return getMadre().getNombre();
		}
		return "" + Math.random();
	}
	
	public Persona getUnidadPaternalGenerica(int i) {
		if(i==0) {
			return this.getPadre();
		}
		else {
			return this.getMadre();
		}
	}
}
