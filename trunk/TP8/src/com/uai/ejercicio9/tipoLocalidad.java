package com.uai.ejercicio9;

public enum tipoLocalidad {

	Atras(5), Medio(15), Adelante(30);
	
	private float monto;
	
	tipoLocalidad(float monto){
		      this.monto = monto;
		   }
		 
	public float getMonto(){
		return this.monto;
	}
	
	public float precioEnDolares(){
		return this.monto*4;
	}
	
	public float precioEnEuros(){
		return this.monto*5;
	}
	
}
