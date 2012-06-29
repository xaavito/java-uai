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
	
	public Grupo crearGrupo(String nom) {
		Grupo grupo = new Grupo(nom);
		grupos.add(grupo);
		return grupo;
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
		
		for (Grupo grups : grupos) {
			for (Contacto cont : grups.getContactos()) {
				if(cont.equals(contacto)) {
					grups.borrar(contacto);
				}
			}
		}
	}
	
	public void setearNombre(Contacto contacto, String nom) {
		findContacto(contacto.getApellido()).setNombre(nom);
	}
	
	public void setearApellido(Contacto contacto, String ape) {
		findContacto(contacto.getApellido()).setApellido(ape);
	}
	
	public void setearTelefono(Contacto contacto, Long tel) {
		findContacto(contacto.getApellido()).setTelefono(tel);
	}
	
	public void setearEmail(Contacto contacto, String email) {
		findContacto(contacto.getApellido()).setEmail(email);
	}
	
	public Contacto findContacto(String apellido) {
		for (Contacto iterable_element : contactos) {
			if (iterable_element.getApellido().equals(apellido)) {
				return iterable_element;
			}
		}
		for (Grupo grups : grupos) {
			for (Contacto cont : grups.getContactos()) {
				if(cont.getApellido().equals(apellido)) {
					return cont;
				}
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
