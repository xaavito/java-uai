package com.uai.ejercicio2;

public class PilaEstatica extends Pila{

	char[] pila;
	
	public PilaEstatica() {
		pila = new char[100];
		posicion = 0;
	}
	
	public PilaEstatica(int size) {
		pila = new char[size];
		posicion = 0;
	}
	
	public void push(char caracter) {
		pila[posicion++] = caracter;
	}
	
	public char pop() {
		return pila[--posicion];
	}
	
	public boolean isEmpty() {
		if (posicion == 0) {
			return true;
		}
		return false;
	}
	
	public int length() {
		return posicion;
	}
}
