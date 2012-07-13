package com.uai.parcial2;

public class Novela extends Libro {

	public Novela(String titulo, String ISBN, float precioBase, int hojas,
			String editorial, int edicion) {
		super(titulo, ISBN, precioBase, hojas, editorial, edicion);
	}

	@Override
	public float getDescuento() {
		float desc = 0;
		if(getHojas()>200) {
			desc = 0.2f;
		}
		return desc;
	}
}
