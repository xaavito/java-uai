package com.uai.ejercicio7;

public class Alumno extends Asistente{
	private int anio;
	
	public Alumno(String nom, String ape, String trabajo, int anio) {
		super(nom,ape,trabajo);
		this.setAnio(anio);
		if (this.getAnio() >= 1 && this.getAnio() <= 3) {
			setDescuento(0.25);
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
