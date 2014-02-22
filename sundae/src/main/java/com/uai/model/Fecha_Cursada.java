package com.uai.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fecha_Cursada {

	private int idFechaCursada;
	private Date fecha;
	private Dia_Cursada dia_Cursada;
	
	public Fecha_Cursada(){}

	@Id
	@GeneratedValue
    @Column(name="idFechaCursada", unique = true, nullable = false)
	public int getIdFechaCursada() {
		return idFechaCursada;
	}

	public void setIdFechaCursada(int idFechaCursada) {
		this.idFechaCursada = idFechaCursada;
	}

    @Column(name="fecha", unique = true, nullable = false)
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@ManyToOne
	@JoinColumn(name="idDiaCursada")
	public Dia_Cursada getDia_Cursada() {
		return dia_Cursada;
	}

	public void setDia_Cursada(Dia_Cursada dia_Cursada) {
		this.dia_Cursada = dia_Cursada;
	}
}
