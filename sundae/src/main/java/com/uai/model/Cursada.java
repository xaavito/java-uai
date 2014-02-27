package com.uai.model;

import java.util.Date;
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
public class Cursada {

	private int idCursada;
	private Materia materia;
	private Usuario usuario;
	private Date fechaInicioCursada;
	private Date fechaFinCursada;
	private Tipo_Cursada tipo_cursada;
	private List<Examen> examenes;
	
	public Cursada(){}

	@Id
	@GeneratedValue
    @Column(name="idCursada", unique = true, nullable = false)
	public int getIdCursada() {
		return idCursada;
	}

	public void setIdCursada(int idCursada) {
		this.idCursada = idCursada;
	}

	@ManyToOne
	@JoinColumn(name="idMateria")
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@ManyToOne
	@JoinColumn(name="idUsuario")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name="fechaInicioCursada", unique = true, nullable = false)
	public Date getFechaInicioCursada() {
		return fechaInicioCursada;
	}

	public void setFechaInicioCursada(Date fechaInicioCursada) {
		this.fechaInicioCursada = fechaInicioCursada;
	}

	@Column(name="fechaFinCursada", unique = true, nullable = false)
	public Date getFechaFinCursada() {
		return fechaFinCursada;
	}

	public void setFechaFinCursada(Date fechaFinCursada) {
		this.fechaFinCursada = fechaFinCursada;
	}

	@ManyToOne
	@JoinColumn(name="idTipoCursada")
	public Tipo_Cursada getTipo_cursada() {
		return tipo_cursada;
	}

	public void setTipo_cursada(Tipo_Cursada tipo_cursada) {
		this.tipo_cursada = tipo_cursada;
	}

	@OneToMany(mappedBy="cursada", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}
}
