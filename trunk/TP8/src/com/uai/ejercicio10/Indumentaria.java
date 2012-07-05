package com.uai.ejercicio10;

public class Indumentaria implements ProductoDeVenta {

	private float precio;
	private String marca;
	private String talle;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getPrecioVenta() {
		
		return this.getPrecio();
	}
}
