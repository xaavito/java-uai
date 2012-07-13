package com.uai.parcial2;

public class LibroCientifico extends Libro {


	public LibroCientifico(String titulo, String ISBN, float precioBase, int hojas,
			String editorial, int edicion) {
		super(titulo, ISBN, precioBase, hojas, editorial, edicion);
	}

	@Override
	public float getDescuento() {
		float desc = 0f;
		if(getEdicion() < 2000) {
			desc = 0.5f;
		}
		if(getEdicion()>2001 && getEdicion()<2006){
			desc = 0.25f;
		}
		return desc;
	}
}
