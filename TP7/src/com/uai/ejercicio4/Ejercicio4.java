package com.uai.ejercicio4;

import org.junit.Test;

public class Ejercicio4 {

	@Test
	public void test() {
		Agenda agenda = new Agenda();
		agenda.crearGrupo("Amigos");
		agenda.crearContacto("Coco", "Sili", 3333333L, "coco@sili.com");
		agenda.findGrupo("Amigos").agregar(new Contacto("Pepe", "Lolo", 111111L, "a@b"));
	}
}
