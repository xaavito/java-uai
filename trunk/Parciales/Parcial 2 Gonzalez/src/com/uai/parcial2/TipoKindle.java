package com.uai.parcial2;

public enum TipoKindle {
	CHICO(300),MEDIANO(500),GRANDE(700);
	
	private int precio;

	TipoKindle(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}
}
