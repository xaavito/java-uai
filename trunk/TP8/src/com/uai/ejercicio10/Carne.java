package com.uai.ejercicio10;

public class Carne extends ProductoAlimenticio {

	public float getPrecioVenta() {
		
		return this.getPrecio() - (this.getPrecio()*10/100);
	}

}
