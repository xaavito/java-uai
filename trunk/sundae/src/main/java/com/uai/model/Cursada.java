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
import javax.persistence.Transient;

import com.uai.estatico.Tipo_Examen_Enum;

@Entity
public class Cursada {

	private int idCursada;
	private Materia materia;
	private Usuario usuario;
	private Date fechaInicioCursada;
	private Date fechaFinCursada;
	private Tipo_Cursada tipo_cursada;
	private List<Examen> examenes;
	@SuppressWarnings("unused")
	private double primerExamen;
	@SuppressWarnings("unused")
	private double segundoExamen;
	@SuppressWarnings("unused")
	private double recuperatorioExamen;
	@SuppressWarnings("unused")
	private double finalExamen;
	
	
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

	@OneToMany(mappedBy="cursada", fetch=FetchType.LAZY)
	//@Fetch(value=FetchMode.SUBSELECT)
	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}
	@Transient
	public double getPrimerExamen() {
		for (Examen examen : this.examenes) {
			if (examen.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.PARCIAL1.getValue()){
				return examen.getNota();
			}
		}
		System.out.println("ESTO NO DEBERIA PASAR.. NOTA EN 0...");
		return 0;
	}

	public void setPrimerExamen(double primerExamen) {
		this.primerExamen = primerExamen;
	}
	
	@Transient
	public double getSegundoExamen() {
		for (Examen examen : this.examenes) {
			if (examen.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.PARCIAL2.getValue()){
				return examen.getNota();
			}
		}
		System.out.println("ESTO NO DEBERIA PASAR.. NOTA EN 0...");
		return 0;
	}

	public void setSegundoExamen(double segundoExamen) {
		this.segundoExamen = segundoExamen;
	}
	@Transient
	public double getRecuperatorioExamen() {
		for (Examen examen : this.examenes) {
			if (examen.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.RECUPERATORIO.getValue()){
				return examen.getNota();
			}
		}
		System.out.println("ESTO NO DEBERIA PASAR.. NOTA EN 0...");
		return 0;
	}

	public void setRecuperatorioExamen(double recuperatorioExamen) {
		this.recuperatorioExamen = recuperatorioExamen;
	}
	@Transient
	public double getFinalExamen() {
		for (Examen examen : this.examenes) {
			if (examen.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.FINAL.getValue()){
				return examen.getNota();
			}
		}
		System.out.println("ESTO NO DEBERIA PASAR.. NOTA EN 0...");
		return 0;
	}

	public void setFinalExamen(double finalExamen) {
		this.finalExamen = finalExamen;
	}
}
