package com.uai.ejercicio1;

public class NumeroComplejo {
	private int parteReal;
	private int parteImaginaria;
	
	public NumeroComplejo(int real,int imag) {
		this.setParteReal(real);
		this.setParteImaginaria(imag);
	}

	public void setParteReal(int parteReal) {
		this.parteReal = parteReal;
	}

	public int getParteReal() {
		return parteReal;
	}

	public void setParteImaginaria(int parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public int getParteImaginaria() {
		return parteImaginaria;
	}
	
	public NumeroComplejo sumar(NumeroComplejo sumando) {
		return new NumeroComplejo(this.getParteReal() + sumando.getParteReal(), this.getParteImaginaria() + sumando.getParteImaginaria());
	}
	
	public NumeroComplejo restar(NumeroComplejo sumando) {
		return new NumeroComplejo(this.getParteReal() - sumando.getParteReal(), this.getParteImaginaria() - sumando.getParteImaginaria());
	}
}
