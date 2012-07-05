package com.uai.ejercicio10;

public class Caja {

	private float montoTotal = 0;

	public float facturar(Chango chango)
	{
		float monto = 0;
		for (ProductoDeVenta producto : chango.getProductos()) {
			monto += producto.getPrecioVenta();
		} 
		montoTotal += monto;
		return monto;
	}
	
	public float getMontoTotal() {
		return montoTotal;
	}

}
