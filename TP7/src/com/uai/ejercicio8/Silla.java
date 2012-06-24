package com.uai.ejercicio8;

public class Silla {

	int id;
	Persona PersonaSentada;
	
	public Silla (int id)
	{
		this.id = id;
	}
	
	public Persona getPersonaSentada() {
		return PersonaSentada;
	}
	
	public void setPersonaSentada(Persona per) {
		this.PersonaSentada = per;
	}
}
