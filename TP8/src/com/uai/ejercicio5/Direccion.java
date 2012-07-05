package com.uai.ejercicio5;

public class Direccion {

	private String calle;
	private String nro;
	private String ciudad;
	
	public Direccion ()
	{
		
	}
	
	public Direccion (String calle, String nro, String ciudad)
	{
		this.calle = calle;
		this.nro = nro;
		this.ciudad = ciudad;
	}	
	
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
}
