package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Universidad {
	
	private int idUniversidad;
	private String nombre;
	private String calle;
	private int nro;
	private List<Carrera> carreas;
	
	public Universidad(){}
	
	@Id
	@GeneratedValue
    @Column(name="idUniversidad", unique = true, nullable = false)
	public int getIdUniversidad() {
		return idUniversidad;
	}
	
	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	@Column(name="nombre", unique = true, nullable = false)
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="calle", unique = true, nullable = false)
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	@Column(name="nro", unique = true, nullable = false)
	public int getNro() {
		return nro;
	}
	
	public void setNro(int nro) {
		this.nro = nro;
	}
	
	@OneToMany(mappedBy="universidad", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Carrera> getCarreas() {
		return carreas;
	}

	public void setCarreas(List<Carrera> carreas) {
		this.carreas = carreas;
	}
}
