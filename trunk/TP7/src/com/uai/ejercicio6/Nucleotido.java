package com.uai.ejercicio6;

public enum Nucleotido {
    A(1), C(2), G(3), T(4); 
    
    private int peso;
    
    Nucleotido(int peso) {
    	this.setPeso(peso);
    }

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
