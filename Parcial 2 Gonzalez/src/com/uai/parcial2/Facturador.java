package com.uai.parcial2;

import java.util.ArrayList;

public class Facturador {

	public static float costo(IProducto iProducto){
		return iProducto.getPrecio();
	}
	
	public static float costo(ArrayList<IProducto> iProductos){
		float total = 0;
		int contadorLibros = 0;
		for (int i = 0; i < iProductos.size(); i++) {
			total += iProductos.get(i).getPrecio();
			if (iProductos.get(i).esAptoPromocionCantidad()){
				contadorLibros++;
			}
		}
		if (contadorLibros >=5) {
			total = total - (total * 0.02f);
		}
		return total;
	}
}
