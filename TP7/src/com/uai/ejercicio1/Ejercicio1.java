package com.uai.ejercicio1;

import junit.framework.Assert;
import org.junit.*;



public class Ejercicio1{

	@Test
	public void testNumeroComplejoSuma() {
		NumeroComplejo a = new NumeroComplejo(1, 1);
		NumeroComplejo b = new NumeroComplejo(2, 2);
		
		Assert.assertEquals(a.sumar(b).getParteReal(), 3);
		Assert.assertEquals(a.sumar(b).getParteImaginaria(), 3);
	}
	
	@Test
	public void testNumeroComplejoResta() {
		NumeroComplejo a = new NumeroComplejo(1, 1);
		NumeroComplejo b = new NumeroComplejo(2, 2);
		
		Assert.assertEquals(b.restar(a).getParteReal(), 1);
		Assert.assertEquals(b.restar(a).getParteImaginaria(), 1);
	}
}
