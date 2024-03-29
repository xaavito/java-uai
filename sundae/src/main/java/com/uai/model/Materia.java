package com.uai.model;

import java.util.Date;
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
	private Dia	dia;
	private int horas;
	
	
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

	@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Materia_Correlatividad", 
                joinColumns={@JoinColumn(name="idMateria")}, 
                inverseJoinColumns={@JoinColumn(name="idMateriaCorr")})
	//@Fetch(value=FetchMode.SUBSELECT)
	public List<Materia> getMateriasCoRelativas() {
		return materiasCoRelativas;
	}

	
	public void setMateriasCoRelativas(List<Materia> materiasPreRelativas) {
		this.materiasCoRelativas = materiasPreRelativas;
	}
	
	@ManyToMany(mappedBy="materiasCoRelativas", fetch=FetchType.LAZY)
	//@Fetch(value=FetchMode.SUBSELECT)
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
		for (Cursada cur : getCursadas()) {
			Date hoy = new Date();
			//esto esta mal... si no la estoy cursando y estoy entre fechas las trae igual
			if (hoy.after(cur.getFechaInicioCursada()) && hoy.before(cur.getFechaFinCursada())) {
				estado = Estado_Materia_Enum.CURSANDO.getValue();
			}
		}
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToMany(mappedBy="materia", fetch=FetchType.LAZY)
	//@Fetch(value=FetchMode.SUBSELECT)
	public List<Cursada> getCursadas() {
		return cursadas;
	}

	public void setCursadas(List<Cursada> cursadas) {
		this.cursadas = cursadas;
	}

	@Transient
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
}
