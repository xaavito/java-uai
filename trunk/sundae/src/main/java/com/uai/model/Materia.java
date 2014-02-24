package com.uai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Materia {

	private int idMateria;
	private String nombre;
	private Plann plan;
	private List<Materia> materiasPreRelativas;
	//private List<Materia> materiasPostRelativas;
	
	public Materia(){}

	@Id
	@GeneratedValue
    @Column(name="idMateria", unique = true, nullable = false)
	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

    @Column(name="nombre", unique = true, nullable = false)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne
	@JoinColumn(name="idPlan")
	public Plann getPlan() {
		return plan;
	}

	public void setPlan(Plann plan) {
		this.plan = plan;
	}

	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="Materia_Correlatividad", 
                joinColumns={@JoinColumn(name="idMateria")}, 
                inverseJoinColumns={@JoinColumn(name="idMateriaCorr")})
	public List<Materia> getMateriasPreRelativas() {
		return materiasPreRelativas;
	}

	public void setMateriasPreRelativas(List<Materia> materiasPreRelativas) {
		this.materiasPreRelativas = materiasPreRelativas;
	}
	/*
	 * INVESTIGAR ESTO... REALMENTE ME GUSTARIA QUE ANDE PARA ATRAS Y ADELANTE.
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="Materia_Correlatividad", 
                joinColumns={@JoinColumn(name="idMateria")}, 
                inverseJoinColumns={@JoinColumn(name="idMateriaPre")})
	public List<Materia> getMateriasPostRelativas() {
		return materiasPostRelativas;
	}

	public void setMateriasPostRelativas(List<Materia> materiasPostRelativas) {
		this.materiasPostRelativas = materiasPostRelativas;
	}
	*/
}
