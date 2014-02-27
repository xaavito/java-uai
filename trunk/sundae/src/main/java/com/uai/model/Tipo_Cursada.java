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
public class Tipo_Cursada {

	
	private int idTipoCursada;
	private String descripcion;
	private List<Cursada> cursadas;
	
	public Tipo_Cursada(){}

	@Id
	@GeneratedValue
    @Column(name="idTipoCursada", unique = true, nullable = false)
	public int getIdTipoCursada() {
		return idTipoCursada;
	}

	public void setIdTipoCursada(int idTipoCursada) {
		this.idTipoCursada = idTipoCursada;
	}

	@Column(name="descripcion", unique = true, nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(mappedBy="tipo_cursada", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Cursada> getCursadas() {
		return cursadas;
	}

	public void setCursadas(List<Cursada> cursadas) {
		this.cursadas = cursadas;
	}
}
