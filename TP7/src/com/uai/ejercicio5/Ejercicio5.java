package com.uai.ejercicio5;

import junit.framework.Assert;

import org.junit.Test;

public class Ejercicio5 {

	@Test
	public void test() {
		Singleton test1 = Singleton.getInstance();
		Singleton test2 = Singleton.getInstance();
		
		Assert.assertEquals(test1, test2);
	}
}
