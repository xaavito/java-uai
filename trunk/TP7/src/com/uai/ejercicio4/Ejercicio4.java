package com.uai.ejercicio4;

import junit.framework.Assert;

import org.junit.Test;

public class Ejercicio4 {

	@Test
	public void test() {
		Agenda agenda = new Agenda();
		
//Agregar un contacto.
		agenda.crearContacto("Coco", "Sili", 3333333L, "coco@sili.com");
		Assert.assertEquals(agenda.findContacto("Sili").getApellido(), "Sili");
//Borrar un contacto.
		agenda.crearContacto("Pepe", "Pepe", 1111111L, "a@b.com");
		agenda.borrarContacto(agenda.findContacto("Pepe"));
		Assert.assertEquals(null,agenda.findContacto("Pepe"));
//Modificar un contacto.
		agenda.findContacto("Sili").setNombre("COCO");
		Assert.assertEquals(agenda.findContacto("Sili").getNombre(), "COCO");
//Crear una lista de contactos.
		agenda.crearGrupo("Amigos");
		Assert.assertEquals(agenda.findGrupo("Amigos").getNombre(), "Amigos");
//Modificar una lista de contactos.
		agenda.findGrupo("Amigos").setNombre("Amiguisimos");
		Assert.assertEquals(agenda.findGrupo("Amiguisimos").getNombre(), "Amiguisimos");
	}
}
