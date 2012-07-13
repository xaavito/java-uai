package com.uai.parcial2;

public class LibroPolitico extends Libro {

	public LibroPolitico(String titulo, String ISBN, float precioBase, int hojas,
			String editorial, int edicion) {
		super(titulo, ISBN, precioBase, hojas, editorial, edicion);
	}

	@Override
	public float getDescuento() {
		Libreria libreria = new Libreria();
		return 	libreria.findInLista(getISBN());
	}
}
