package com.uai.ejercicio3;

public class Cuenta {
	
	private float saldo;
	private int pin;
	private Cliente cliente;
	
	public Cuenta(Cliente nuevoCliente) {
		this.cliente = nuevoCliente;
		this.cliente.addCuenta(this);
	}
	
	public void depositar(float monto) {
		this.saldo += monto;
		saldo -= cliente.getMonto();
	}
	
	public void extraer(float monto) {
		this.saldo -= monto;
		saldo -= cliente.getMonto();
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}

	public void cambiarPin(int pin) {
		this.setPin(pin);
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}
}
