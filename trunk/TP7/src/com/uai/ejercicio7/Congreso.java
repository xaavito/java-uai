package com.uai.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Congreso {
	private String nombre;
	private double precio;
	
	List<Asistente> asistentes;
	
	public Congreso(String nom, double precio) {
		setNombre(nom);
		setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void adherirAsistente(Asistente asistente) {
		if(asistentes == null){
			asistentes = new ArrayList<Asistente>();
		}
		asistentes.add(asistente);
	}
	
	public Asistente crearAsistenteAlumno(String ape, String nom, int anio, String trabajo) {
		return new Alumno(nom, ape, trabajo, anio);
	}
	
	public Asistente crearAsistentePresentador(String ape, String nom, String trabajo) {
		return new Presentador(nom, ape, trabajo);
	}
	
	public Asistente crearAsistenteParticular(String ape, String nom, String trabajo, String residencia) {
		return new Particular(nom, ape, trabajo, residencia);
	}
	
	public String asistentesList() {
		String pepe = "";
		for (Asistente asistente : asistentes) {
			pepe += asistente.getApellido() + " " + asistente.getNombre() + "\n";
		}
		return pepe;
	}
	
	public double getPrecio(Asistente asistente) {
		return precio - (precio*asistente.getDescuento());
		
	}
	
	public String imprimirCredencial(Asistente asistente) {
		return "-------------------------------------------------------\n" + 
				this.getNombre() + " "+ asistente.getApellido() + " "+ asistente.getNombre() + " "+asistente.getTrabajo() + "\n"+ 
				"------------------------------------------------------";
	}
}
