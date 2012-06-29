package com.uai.ejercicio6;

import java.util.List;

import org.junit.Test;

public class Ejercicio6 {
	
	@Test
	public void test(){
		
		Individuo ind = new Individuo();
		
		Individuo ind2 = new Individuo();
		
		List<Gen> genesIguales = ind.genesIguales(ind2);
		
		for (Gen gen : genesIguales) {
			System.out.println("-------");
			System.out.println(gen.asString());
		}
		
		System.out.println("+++++++++++++++");
		System.out.println(genesIguales.size());
	}
}
