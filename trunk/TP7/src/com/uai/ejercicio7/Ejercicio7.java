package com.uai.ejercicio7;

import junit.framework.Assert;

import org.junit.Test;

public class Ejercicio7 {

	@Test
	public void test() {
		Congreso pepe = new Congreso("El mejor congreso de tu vida", 150);
		
		Asistente asistente1 = pepe.crearAsistenteAlumno("Coco", "Sili", 2, "Medife");
		pepe.adherirAsistente(asistente1);
		
		
		Assert.assertEquals(pepe.getPrecio(asistente1), 112.5);
		Asistente asistente2 = new Presentador("Meme", "Loperfido", "OSDE");
		pepe.adherirAsistente(asistente2);
		
		Assert.assertEquals(pepe.getPrecio(asistente2), 37.5);
		
		Asistente asistente3 = new Particular("Luli", "Fernandes", "OSDE", "CABA");
		pepe.adherirAsistente(asistente3);
		
		Assert.assertEquals(pepe.getPrecio(asistente3), 150.0);
		
		Asistente asistente4 = new Particular("Cirio", "Jesica", "OSDE", "Mendoza");
		pepe.adherirAsistente(asistente4);
		
		Assert.assertEquals(pepe.getPrecio(asistente4), 135.0);
		
		System.out.println(pepe.asistentesList());
		
		System.out.println(pepe.imprimirCredencial(asistente4));
		
	}
}
