package com.uai.parcial2;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

public class Parcial2 {

	@Test
	public void testParcial2(){
		Libreria libreria = new Libreria();
		ArrayList<IProducto> lista = new ArrayList<IProducto>();
		
		Kindle kindleChico = new Kindle(TipoKindle.CHICO);
		Kindle kindleMediano = new Kindle(TipoKindle.MEDIANO);
		Kindle kindleGrande = new Kindle(TipoKindle.GRANDE);
		
		//Con descuento
		Novela novela = new Novela("Novela1", "5555", 100f, 202, "Ni IDea", 1990);
		
		//Libro en lista
		LibroPolitico libroPolitico = new LibroPolitico("Politica!", "1111", 100f, 202, "Ni IDea", 1990);
		
		LibroCientifico libroCientifico = new LibroCientifico("Ciencia!!!!", "1111", 100f, 202, "Ni IDea", 2005);
		
		LibroCientifico libroCientifico2 = new LibroCientifico("Ciencia2!!!!", "6666", 100f, 202, "Ni IDea", 2005);
		
		LibroPolitico libroPolitico2 = new LibroPolitico("Politica 2 for dummies", "1111", 100f, 202, "Ni IDea", 1990);
		
		libreria.getListaProductos().add(kindleChico);
		
		Assert.assertEquals(300f, Facturador.costo(kindleChico));
		
		Assert.assertEquals(500f, Facturador.costo(kindleMediano));
		
		Assert.assertEquals(700f, Facturador.costo(kindleGrande));
		
		Assert.assertEquals(80f, Facturador.costo(novela));
		
		Assert.assertEquals(90f, Facturador.costo(libroPolitico));
		
		Assert.assertEquals(75f, Facturador.costo(libroCientifico));
		
		Assert.assertEquals(75f, Facturador.costo(libroCientifico2));
		
		Assert.assertEquals(90f, Facturador.costo(libroPolitico2));
		
		lista.add(kindleChico);
		lista.add(kindleMediano);
		lista.add(kindleGrande);
		lista.add(novela);
		lista.add(libroPolitico);
		lista.add(libroCientifico);
		lista.add(libroCientifico2);
		lista.add(libroPolitico2);
		
		Assert.assertEquals(1871.8f, Facturador.costo(lista));
	}
}
