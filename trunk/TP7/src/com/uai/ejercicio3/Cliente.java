package com.uai.ejercicio3;

public abstract class Cliente {

	private int monto;
	private int numCuentas = 0;
	protected Cuenta[] cuentas;
	
	public Cliente() {
		cuentas = new Cuenta[3];
	}

	public void setMonto(int monto) {
		this.monto = monto;
	} 
	
	public int getMonto() {
		return this.monto;
	}

	public void addCuenta(Cuenta cuenta) {
		cuentas[numCuentas++] = cuenta;
	}

	public Cuenta getCuenta(int indice) {
		return cuentas[indice-1];
	}
}
