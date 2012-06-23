package com.uai.ejercicio4;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contacto> contactos;
	private ArrayList<Grupo> grupos;
	
	public Agenda() {
		contactos = new ArrayList<Contacto>();
		grupos = new ArrayList<Grupo>();
	}
	
	public void crearContacto(String nom, String ape, Long tel, String email) {
		agregarContacto(new Contacto(nom, ape, tel, email));
	}
	
	public void crearGrupo(String nom) {
		grupos.add(new Grupo(nom));
	}
	
	public void borrarGrupo(Grupo grupo) {
		grupos.remove(grupo);
	}
	
	public void editarGrupo(Grupo grupo, String nom) {
		findGrupo(grupo).setNombre(nom);
	}
	
	private void agregarContacto(Contacto contacto){
		contactos.add(contacto);
	}
	
	public void borrarContacto(Contacto contacto){
		contactos.remove(contacto);
	}
	
	public void setearNombre(Contacto contacto, String nom) {
		findContacto(contacto).setNombre(nom);
	}
	
	public void setearApellido(Contacto contacto, String ape) {
		findContacto(contacto).setApellido(ape);
	}
	
	public void setearTelefono(Contacto contacto, Long tel) {
		findContacto(contacto).setTelefono(tel);
	}
	
	public void setearEmail(Contacto contacto, String email) {
		findContacto(contacto).setEmail(email);
	}
	
	private Contacto findContacto(Contacto contacto) {
		for (Contacto iterable_element : contactos) {
			if (iterable_element.equals(contacto)) {
				return iterable_element;
			}
		}
		return null;
	}
	
	public Grupo findGrupo(Grupo grupo) {
		for (Grupo iterable_element : grupos) {
			if (iterable_element.equals(grupo)) {
				return iterable_element;
			}
		}
		return null;
	}
	
	public Grupo findGrupo(String grupo) {
		for (Grupo iterable_element : grupos) {
			if (iterable_element.getNombre().equalsIgnoreCase(grupo)) {
				return iterable_element;
			}
		}
		return null;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
}
