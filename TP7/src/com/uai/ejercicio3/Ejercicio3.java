package com.uai.ejercicio3;

import junit.framework.Assert;

import org.junit.Test;


public class Ejercicio3 {
	
	@Test
	public void testBanco(){
		//Prueba
		Banco chorroBank = new Banco();
		ClienteVipInterior clienteVipInterior = new ClienteVipInterior();
		Cuenta cuentaInterior = new Cuenta(clienteVipInterior);
		
		chorroBank.pushCuenta(cuentaInterior);
		
		ClienteVipCapital clienteVipCapital = new ClienteVipCapital();
		Cuenta cuentaCapital = new Cuenta(clienteVipCapital);
		
		chorroBank.pushCuenta(cuentaCapital);
		
		ClienteComun clienteComun = new ClienteComun();
		Cuenta cuentaComun = new Cuenta(clienteComun);
		
		chorroBank.pushCuenta(cuentaComun);
		
		Assert.assertEquals(chorroBank.getSaldoTotal(), Float.valueOf(0));
		
		clienteComun.getCuenta().depositar(600);
		
		Assert.assertEquals(chorroBank.getSaldoTotal(), Float.valueOf(594));
		
		clienteVipInterior.getCuenta().depositar(600);
		
		Assert.assertEquals(chorroBank.getSaldoTotal(), Float.valueOf(1194));
	}
	

}
