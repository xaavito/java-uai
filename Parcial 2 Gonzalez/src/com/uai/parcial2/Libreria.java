package com.uai.parcial2;

import java.util.ArrayList;
import java.util.HashMap;

public class Libreria {

	private ArrayList<IProducto> listaProductos = new ArrayList<IProducto>();
	private HashMap<String, Float> preciosLibros = new HashMap<String, Float>();
	
	public Libreria(){
		getPreciosLibros().put("1111", 0.1f);
		getPreciosLibros().put("2222", 0.2f);
		getPreciosLibros().put("3333", 0.3f);
	}
	
	public void setPreciosLibros(HashMap<String, Float> preciosLibros) {
		this.preciosLibros = preciosLibros;
	}

	public HashMap<String, Float> getPreciosLibros() {
		return preciosLibros;
	}
	
	public float findInLista(String ISBN) {
		return preciosLibros.get(ISBN);
	}

	public void setListaProductos(ArrayList<IProducto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ArrayList<IProducto> getListaProductos() {
		return listaProductos;
	}

}
