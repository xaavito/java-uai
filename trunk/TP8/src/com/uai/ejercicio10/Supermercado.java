package com.uai.ejercicio10;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	List<Caja> cajas = new ArrayList<Caja>();
	
	void AgregarCaja (Caja c)
	{
		cajas.add(c);
	}
	
	void QuitarCaja (Caja c)
	{
		cajas.remove(c);
	}
	
	public float liquidacionDelDia()
	{
		float monto = 0;
		for (Caja caja : cajas) {
			monto += caja.getMontoTotal();
		} 
		return monto;
	}
}
