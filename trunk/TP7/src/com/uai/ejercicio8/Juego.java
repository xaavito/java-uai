package com.uai.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {
	
	List<Persona> personas = new ArrayList<Persona>();
	List<Silla> sillas = new ArrayList<Silla>();
	int ronda = 1;
	
	public void jugar() throws InterruptedException
	{
		sillas.removeAll(sillas);
		
		for(int i=0; i < personas.size()-1; i++)
		{
			Silla s = new Silla(i);
			sillas.add(s);
		}
		nuevaVuelta();
	}
	
	public void nuevaVuelta() throws InterruptedException
	{
		/*Suena la Musica*/
		Random tempGenerator = new Random();
		int tiempoMusica = tempGenerator.nextInt(10000)+1000;
		Thread.sleep(tiempoMusica);
		/*----------*/
		
		//Copio la lista original de personas
		List<Persona> personas_temp = new ArrayList<Persona>();
		for (Persona unapersona : personas) {
			personas_temp.add(unapersona);
		}	
		
		//De forma aleatoria se sientan las personas menos una
		for (Silla lasilla : sillas) {
			Random randomGenerator = new Random();
			int index = randomGenerator.nextInt(personas_temp.size());
			lasilla.setPersonaSentada(personas_temp.get(index));
			personas_temp.remove(index);
		}					
		//Tomo la persona que se quedó parada
		Persona perdio = personas_temp.get(0);		
		//Borro la persona que perdio
		quitarPersona(perdio);
		
		System.out.println("Ronda "+String.valueOf(ronda)+": La música sonó " + String.valueOf(tiempoMusica/1000) + " segundos y cuando paró la música perdió " + perdio.getNombre() + " " + perdio.getApellido());
		
		//Reseteo las sillas
		for (Silla lasilla : sillas) {
			lasilla.setPersonaSentada(null);
		}		
		//Saco una silla
		sillas.remove(0);
		
		//Si no hay mas sillas, hay un ganador
		if (sillas.size() == 0)
		{
			Persona gano = personas.get(0);
			System.out.println("El ganador del juego es " + gano.getNombre() + " " + gano.getApellido());
		}
		else
		{
			ronda++;
			nuevaVuelta();
		}
		
		
	}
	
	private void quitarPersona(Persona per)
	{
		personas.remove(per);
	}
	
	public void agregarPersona(Persona per)
	{
		personas.add(per);
	}
	
}
