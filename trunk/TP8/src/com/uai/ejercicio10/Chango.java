package com.uai.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Chango {

	List<ProductoDeVenta> productos = new ArrayList<ProductoDeVenta>();
	
	void AgregarProducto(ProductoDeVenta prod)
	{
		productos.add(prod);
	}
	
	void QuitarProducto(ProductoDeVenta prod)
	{
		productos.remove(prod);
	}

	public List<ProductoDeVenta> getProductos() {
		return productos;
	}
	
}
