package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.uai.estatico.Estado_Materia_Enum;
import com.uai.estatico.Tipo_Examen_Enum;

@Entity
public class Materia {

	private int idMateria;
	private String nombre;
	private Plann plan;
	private List<Materia> materiasCoRelativas;
	private List<Materia> materiasPreRelativas;
	private String estado;
	private List<Cursada> cursadas;
	
	
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

	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="Materia_Correlatividad", 
                joinColumns={@JoinColumn(name="idMateria")}, 
                inverseJoinColumns={@JoinColumn(name="idMateriaCorr")})
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Materia> getMateriasCoRelativas() {
		return materiasCoRelativas;
	}

	
	public void setMateriasCoRelativas(List<Materia> materiasPreRelativas) {
		this.materiasCoRelativas = materiasPreRelativas;
	}
	
	@ManyToMany(mappedBy="materiasCoRelativas", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Materia> getMateriasPreRelativas() {
		return materiasPreRelativas;
	}

	public void setMateriasPreRelativas(List<Materia> materiasPostRelativas) {
		this.materiasPreRelativas = materiasPostRelativas;
	}

	@Transient
	public String getEstado() {
		estado = Estado_Materia_Enum.NO_DISPONIBLE.getValue();
		if (getMateriasPreRelativas().isEmpty()) {
			estado = Estado_Materia_Enum.DISPONIBLE.getValue();
		}
		for (Materia mat : getMateriasPreRelativas()) {
			for (Cursada cur : mat.cursadas) {
				for (Examen ex : cur.getExamenes()) {
					if (ex.getNota() >= 4 && ex.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.FINAL.getValue()) {
						estado = Estado_Materia_Enum.DISPONIBLE.getValue();
					}
				}
			}
		}
		for (Cursada cur : getCursadas()) {
			for (Examen ex : cur.getExamenes()) {
				if (ex.getNota() >= 4 && ex.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.FINAL.getValue()) {
					estado = Estado_Materia_Enum.APROBADA.getValue();
				}
			}
		}
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToMany(mappedBy="materia", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	public List<Cursada> getCursadas() {
		return cursadas;
	}

	public void setCursadas(List<Cursada> cursadas) {
		this.cursadas = cursadas;
	}
}
