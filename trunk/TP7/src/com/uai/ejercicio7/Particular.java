package com.uai.ejercicio7;

public class Particular extends Asistente{
	private String residencia;

	public Particular(String nom, String ape, String trabajo2, String baires) {
		super(nom, ape, trabajo2);
		setResidencia(baires);
		if(!getResidencia().equals("CABA")) {
			setDescuento(0.10);
		}
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
}
