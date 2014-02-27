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
public class Dia {
	
	private int idDia;
	private String descripcion;
	private List<Dia_Cursada> dias_Cursada;
	
	public Dia(){}
	
	@Id
	@GeneratedValue
    @Column(name="idDia", unique = true, nullable = false)
	public int getIdDia() {
		return idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	@Column(name="descripcion", unique = true, nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(mappedBy="dia", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Dia_Cursada> getDias_Cursada() {
		return dias_Cursada;
	}

	public void setDias_Cursada(List<Dia_Cursada> dias_Cursada) {
		this.dias_Cursada = dias_Cursada;
	}
	
	
}
