package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Carrera {

	private int idCarrera;
	private String nombre;
	private int	notaMinima;
	private int cantidadMaxFinales;
	private int asistenciaMin;
	private int aniosMaxFinales;
	private Universidad universidad;
	private List<Plann> planes; 
	
	public Carrera() {
	}
	
	public Carrera(String string) {
		this.nombre = string;
	}

	@Id
	@GeneratedValue
    @Column(name="idCarrera", unique = true, nullable = false)
	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	@Column(name="nombre", unique = true, nullable = false)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name="notaMinima", unique = true, nullable = false)
	public int getNotaMinima() {
		return notaMinima;
	}

	public void setNotaMinima(int notaMinima) {
		this.notaMinima = notaMinima;
	}

	@Column(name="cantidadMaxFinales", unique = true, nullable = false)
	public int getCantidadMaxFinales() {
		return cantidadMaxFinales;
	}

	public void setCantidadMaxFinales(int cantidadMaxFinales) {
		this.cantidadMaxFinales = cantidadMaxFinales;
	}

	@Column(name="asistenciaMin", unique = true, nullable = false)
	public int getAsistenciaMin() {
		return asistenciaMin;
	}

	public void setAsistenciaMin(int asistenciaMin) {
		this.asistenciaMin = asistenciaMin;
	}

	@Column(name="aniosMaxFinales", unique = true, nullable = false)
	public int getAniosMaxFinales() {
		return aniosMaxFinales;
	}

	public void setAniosMaxFinales(int aniosMaxFinales) {
		this.aniosMaxFinales = aniosMaxFinales;
	}

	@ManyToOne
	@JoinColumn(name="idUniversidad")
	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	@OneToMany(mappedBy="carrera")
	public List<Plann> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plann> planes) {
		this.planes = planes;
	}
}
