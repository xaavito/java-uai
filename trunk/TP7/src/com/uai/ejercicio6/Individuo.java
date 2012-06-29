package com.uai.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Individuo {

	private Gen[] misGenes;
	private GenomaHumano miFactory;
	
	public Individuo(){
		this.setMisGenes(miFactory.getInstance().dameIndividuo());
	}

	public Gen[] getMisGenes() {
		return misGenes;
	}

	public void setMisGenes(Gen[] misGenes) {
		this.misGenes = misGenes;
	}
	
	public List<Gen> genesIguales(Individuo otroInidivudo) {
		List<Gen> diferencias = new ArrayList<Gen>();
		
		for (int i = 0; i < 50000; i++) {
			if (this.misGenes[i].asString().equals(otroInidivudo.misGenes[i].asString())) {
				diferencias.add(this.misGenes[i]);
			}
		}
		return diferencias;
	}
}
