package com.uai.ejercicio10;

import junit.framework.Assert;

import org.junit.Test;

public class Ejercicio10 {
	
	@Test
	public void testPepe (){  
	
		Carne carne = new Carne();
		carne.setPrecio(150);
		
		Cremas crema = new Cremas();
		crema.setPrecio(100);
		
		Indumentaria ropa = new Indumentaria();
		ropa.setPrecio(540);
		
		Chango chango1 = new Chango();
		chango1.AgregarProducto(carne);
		chango1.AgregarProducto(crema);
		chango1.AgregarProducto(ropa);
		
		
		carne = new Carne();
		carne.setPrecio(200);
		
		crema = new Cremas();
		crema.setPrecio(80);
		
		ropa = new Indumentaria();
		ropa.setPrecio(320);
		
		Chango chango2 = new Chango();
		chango2.AgregarProducto(carne);
		chango2.AgregarProducto(crema);
		chango2.AgregarProducto(ropa);
		
		
		Caja caja1 = new Caja();
		//System.out.println(String.valueOf("Factura 1: "+ caja1.facturar(chango1)));

		
		Assert.assertEquals(Float.valueOf(775),caja1.facturar(chango1));
		
		
		Caja caja2 = new Caja();
		//System.out.println(String.valueOf("Factura 2: "+ caja2.facturar(chango2)));		
		
		Assert.assertEquals(Float.valueOf(580),caja2.facturar(chango2));
		
		Supermercado sm = new Supermercado();
		sm.AgregarCaja(caja1);
		sm.AgregarCaja(caja2);
		
		//System.out.println("Liquidacion del Dia: "+ String.valueOf(sm.liquidacionDelDia()));
		
		Assert.assertEquals(Float.valueOf(1355), sm.liquidacionDelDia());
	}
	
}
