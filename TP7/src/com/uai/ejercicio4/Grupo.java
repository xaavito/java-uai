package com.uai.ejercicio4;

import java.util.ArrayList;

public class Grupo {

	ArrayList<Contacto> contactos;
	private String nombre;
	
	public Grupo(String nom) {
		contactos = new ArrayList<Contacto>();
		this.setNombre(nom);
	}
	
	public void agregar(Contacto contacto) {
		this.contactos.add(contacto);
	}
	
	public void borrar(Contacto contacto) {
		for (Contacto iterable_element : contactos) {
			if (iterable_element.equals(contacto)) {
				contactos.remove(iterable_element);
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
