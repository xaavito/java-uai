package com.uai.ejercicio10;

public class Lacteos extends ProductoAlimenticio {
	
	public float getPrecioVenta() {
		
		return this.getPrecio() - (this.getPrecio()*20/100);
	}
}
