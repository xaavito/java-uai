package com.uai.model;

import java.util.List;

public class Carrera {

	private int idCarrera;
	private String nombre;
	private int	notaMinima;
	private int cantidadMaxFinales;
	private int asistenciaMin;
	private int aniosMaxFinales;
	private Universidad universidad;
	private List<Plan> planes; 
	
	public Carrera() {
	}
	
	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNotaMinima() {
		return notaMinima;
	}

	public void setNotaMinima(int notaMinima) {
		this.notaMinima = notaMinima;
	}

	public int getCantidadMaxFinales() {
		return cantidadMaxFinales;
	}

	public void setCantidadMaxFinales(int cantidadMaxFinales) {
		this.cantidadMaxFinales = cantidadMaxFinales;
	}

	public int getAsistenciaMin() {
		return asistenciaMin;
	}

	public void setAsistenciaMin(int asistenciaMin) {
		this.asistenciaMin = asistenciaMin;
	}

	public int getAniosMaxFinales() {
		return aniosMaxFinales;
	}

	public void setAniosMaxFinales(int aniosMaxFinales) {
		this.aniosMaxFinales = aniosMaxFinales;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public List<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}
}
