package com.uai.ejercicio9;

public class Ticket {

	tipoLocalidad localidad;

	public tipoLocalidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(tipoLocalidad localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return localidad + ":" + String.valueOf(localidad.getMonto());
	}
	
}
