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
		//System.out.println("-----------" + chorroBank.getSaldoTotal());
		clienteComun.getCuenta(1).depositar(600);
		//System.out.println("-----------" + chorroBank.getSaldoTotal());
		Assert.assertEquals(chorroBank.getSaldoTotal(), Float.valueOf(594));
		//System.out.println("-----------" + chorroBank.getSaldoTotal());
		clienteVipInterior.getCuenta(1).depositar(600);
		//System.out.println("-----------" + chorroBank.getSaldoTotal());
		Assert.assertEquals(chorroBank.getSaldoTotal(), Float.valueOf(1194));
		//System.out.println("-----------" + chorroBank.getSaldoTotal());
	}
}
