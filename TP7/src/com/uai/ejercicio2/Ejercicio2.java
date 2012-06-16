package com.uai.ejercicio2;

import junit.framework.Assert;

import org.junit.Test;


public class Ejercicio2 {

	@Test
	public void testPila() {
		PilaEstatica pilaEstatica = new PilaEstatica();
		PilaDinamica pilaDinamica = new PilaDinamica();

		pilaEstatica.push('a');
		pilaDinamica.push('a');
		
		pilaEstatica.push('b');
		pilaDinamica.push('b');
		
		Assert.assertEquals(pilaEstatica.isEmpty(), pilaDinamica.isEmpty());
		
		Assert.assertEquals(pilaEstatica.length(), pilaDinamica.length());
		
		Assert.assertEquals(pilaEstatica.pop(), pilaDinamica.pop());
		
		Assert.assertEquals(pilaEstatica.isEmpty(), pilaDinamica.isEmpty());
		
		Assert.assertEquals(pilaEstatica.length(), pilaDinamica.length());
		
	}
}
