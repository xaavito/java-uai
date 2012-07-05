package com.uai.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeLasPersonas {

	List<Persona> personas;
	
	public RegistroDeLasPersonas ()
	{
		personas = new ArrayList<Persona>();
	}
	
	void agregarPersona(Persona p)
	{
		personas.add(p);
	}
	
	Persona recuperarPersona(String dni)
	{
		return personas.get(personas.indexOf(new Persona(dni)));
	}
	
	int cantidadPersonas()
	{
		return personas.size();
	}
	
	void imprimirListaDePersonas()
	{
		System.out.println(personas.toString());	
	}
}
