package com.uai.ejercicio2;

public abstract class Pila {

	int posicion;
	
	public Pila() {}
	
	public Pila(int size) {
	}
	
	public abstract void push(char caracter);
	
	public abstract char pop();
	
	public abstract boolean isEmpty();
	
	public abstract int length();
}
