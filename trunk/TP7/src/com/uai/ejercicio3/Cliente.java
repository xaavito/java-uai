package com.uai.ejercicio3;

public abstract class Cliente {

	private int monto;
	private Cuenta cuenta;

	public void setMonto(int monto) {
		this.monto = monto;
	} 
	
	public int getMonto() {
		return this.monto;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
}
