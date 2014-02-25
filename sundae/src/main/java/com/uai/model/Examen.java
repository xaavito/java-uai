package com.uai.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Examen {

	private int idExamen;
	private Date fecha;
	private float nota;
	private Tipo_Examen tipoExamen;
	private Cursada cursada;
	
	public Examen(){}

	@Id
	@GeneratedValue
    @Column(name="idExamen", unique = true, nullable = false)
	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	@Column(name="fecha", unique = true, nullable = false)
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name="nota", unique = true, nullable = false)
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@ManyToOne
	@JoinColumn(name="idTipoExamen")
	public Tipo_Examen getTipoExamen() {
		return tipoExamen;
	}

	public void setTipoExamen(Tipo_Examen tipoExamen) {
		this.tipoExamen = tipoExamen;
	}

	@ManyToOne
	@JoinColumn(name="idCursada")
	public Cursada getCursada() {
		return cursada;
	}

	public void setCursada(Cursada cursada) {
		this.cursada = cursada;
	}
}
