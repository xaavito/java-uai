package com.uai.ejercicio6;

public class GenomaHumano {

	private static GenomaHumano genHumano = null;
	
	private Gen[] genes;
	Gen gen;
	
	
	private GenomaHumano() {	
	}
	
	public Gen[] dameIndividuo() {
		genes = new Gen[50000];
		for (int i = 0; i < 50000; i++) {
			int valor = (int)(Math.random()*10);
			gen = new Gen(i,valor==0?1:valor);
			genes[i] = gen;
		}
		return genes;
	}
	
	public static GenomaHumano getInstance() {
		if(genHumano == null) {
			genHumano = new GenomaHumano();
		}
		return genHumano;
	}
}
