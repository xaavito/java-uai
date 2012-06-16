package com.uai.ejercicio2;

import java.util.ArrayList;

public class PilaDinamica extends Pila {
	
	ArrayList<Character> pila;
	
	public PilaDinamica(){
		pila = new ArrayList<Character>();
	}
	
	@Override
	public char pop() {
		char a = pila.get(pila.size()-1);
		pila.remove(pila.size() - 1);
		return a;
	}

	@Override
	public boolean isEmpty() {
		return pila.isEmpty();
	}

	@Override
	public int length() {
		return pila.size();
	}

	@Override
	public void push(char caracter) {
		pila.add(caracter);
	}
}
