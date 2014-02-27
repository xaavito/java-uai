package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Dia_Cursada {
	private int idDiaCursada;
	private Dia dia;
	private int horas;
	private Cursada cursada;
	private List<Fecha_Cursada> fechasCursadas;
	
	public Dia_Cursada(){}

	@Id
	@GeneratedValue
    @Column(name="idDiaCursada", unique = true, nullable = false)
	public int getIdDiaCursada() {
		return idDiaCursada;
	}

	public void setIdDiaCursada(int idDiaCursada) {
		this.idDiaCursada = idDiaCursada;
	}

	@ManyToOne
	@JoinColumn(name="idDia")
	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

    @Column(name="horas", unique = true, nullable = false)
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@ManyToOne
	@JoinColumn(name="idCursada")
	public Cursada getCursada() {
		return cursada;
	}

	public void setCursada(Cursada cursada) {
		this.cursada = cursada;
	}

	@OneToMany(mappedBy="dia_Cursada", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Fecha_Cursada> getFechasCursadas() {
		return fechasCursadas;
	}

	public void setFechasCursadas(List<Fecha_Cursada> fechasCursadas) {
		this.fechasCursadas = fechasCursadas;
	}
}
