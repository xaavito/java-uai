package com.uai.ejercicio3;

import java.util.ArrayList;

public class Banco {
	
	ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	private float saldoTotal = 0;
	
	public float getSaldoTotal() {
		saldoTotal = 0;
		for (Cuenta cuenta : cuentas) {
			saldoTotal += cuenta.getSaldo();
		}
		return saldoTotal;
	}
	
	public void pushCuenta(Cuenta nuevaCuenta) {
		cuentas.add(nuevaCuenta);
	}
}
