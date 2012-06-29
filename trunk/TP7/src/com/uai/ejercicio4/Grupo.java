package com.uai.ejercicio4;

import java.util.ArrayList;

public class Grupo {

	private ArrayList<Contacto> contactos;
	private String nombre;
	
	public Grupo(String nom) {
		setContactos(new ArrayList<Contacto>());
		this.setNombre(nom);
	}
	
	public void agregar(Contacto contacto) {
		this.getContactos().add(contacto);
	}
	
	public void borrar(Contacto contacto) {
		for (Contacto iterable_element : getContactos()) {
			if (iterable_element.equals(contacto)) {
				getContactos().remove(iterable_element);
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
}
