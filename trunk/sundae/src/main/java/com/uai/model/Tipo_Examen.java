package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tipo_Examen {
	private int idTipoExamen;
	private String descripcion;
	private List<Examen> examenes;
	
	@Id
	@GeneratedValue
    @Column(name="idTipoExamen", unique = true, nullable = false)
	public int getIdTipoExamen() {
		return idTipoExamen;
	}

	public void setIdTipoExamen(int idTipoExamen) {
		this.idTipoExamen = idTipoExamen;
	}

    @Column(name="descripcion", unique = true, nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(mappedBy="tipoExamen")
	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}



}
