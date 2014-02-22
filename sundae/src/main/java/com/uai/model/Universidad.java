package com.uai.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Universidad {
	
	private int idUniversidad;
	private String nombre;
	private String calle;
	private int nro;
	private List<Carrera> carreas;
	
	public Universidad(){}
	
	public int getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}

	public List<Carrera> getCarreas() {
		return carreas;
	}

	public void setCarreas(List<Carrera> carreas) {
		this.carreas = carreas;
	}
}
