package com.uai.ejercicio7;

public abstract class Asistente {
	private String nombre;
	private String apellido;
	private String trabajo;
	private double descuento;
	
	public Asistente(String nom, String ape, String trabajo2) {
		nombre = nom;
		apellido = ape;
		trabajo = trabajo2;
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
	public String getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(double valor) {
		descuento = valor;
	}
}
