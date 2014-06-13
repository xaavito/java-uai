package com.uai.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.estatico.Tipo_Examen_Enum;
import com.uai.model.Cursada;
import com.uai.model.Dia;
import com.uai.model.Examen;
import com.uai.model.Fecha_Cursada;
import com.uai.model.Materia;
import com.uai.model.Tipo_Cursada;
import com.uai.service.IMateriaService;

@Named("materiaBean")
@Scope("session")
public class MateriaBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8450581343904432080L;

	// Spring User Service is injected...
	@Inject
	@Named("materiaService")
	IMateriaService materiaService;

	@Inject
	@Named("usuarioBean")
	UsuarioBean usuarioBean;

	// private Examen examen;
	private List<Materia> materias;
	private List<Materia> allMaterias;
	private List<Materia> materiasCursables;
	private List<Materia> cursadaActual;
	private Materia materia;
	private Tipo_Cursada tipoCursada;
	private List<Tipo_Cursada> tiposCursada;
	private List<Dia> dias;
	private List<Fecha_Cursada> presentismos;
	private List<Fecha_Cursada> presentismosSeleccionados;

	public MateriaBean() {
		System.out.println("INIT DE MATERIA BEAN");
	}

	public String getInitializeMaterias() {
		System.out
				.println("INICIALIZANDO Materia BEAN!!!!!-----------------------------------");
		if (null == getMaterias()) {
			setMaterias(getMateriaService().getMaterias(usuarioBean.getUsr()));
		}
		if (null == getAllMaterias()) {
			setAllMaterias(getMateriaService().getAllMaterias(
					usuarioBean.getUsr()));
		}
		if (null == getDias()) {
			setDias(getMateriaService().getDias());
		}
		
		return null;
	}

	public String getInitializeCursada() {
		getInitializeMisMaterias();
		System.out
				.println("INICILIZANDO Cursada!!!!!-----------------------------------");

		if (null == getTiposCursada()) {
			setTiposCursada(getMateriaService().getTiposCursadas());
		}
		if (null == getCursadaActual()) {
			setCursadaActual(getMateriaService().getCursadaActual(
					usuarioBean.getUsr()));
		}

		return null;
	}
	
	public String getInitializePresentismo() {
		System.out
				.println("INICILIZANDO Presentismo!!!!!-----------------------------------");

		if (null == getPresentismos()) {
			setPresentismos(getMateriaService().getPresentismos());
		}
		
		return null;
	}
	
	public String getInitializeMisMaterias() {
		System.out
				.println("INICILIZANDO Mis Materias!!!!!-----------------------------------");
		if (null == materiasCursables) {
			initializeMateriasCursables();
		}
		return null;
	}
	public IMateriaService getMateriaService() {
		return materiaService;
	}

	@Autowired
	public void setMateriaService(IMateriaService materiaService) {
		this.materiaService = materiaService;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public List<Materia> getAllMaterias() {
		return allMaterias;
	}

	public void setAllMaterias(List<Materia> allMaterias) {
		this.allMaterias = allMaterias;
	}

	public List<Materia> getMateriasCursables() {
		return materiasCursables;
	}

	public void setMateriasCursables(List<Materia> materiasCursables) {
		this.materiasCursables = materiasCursables;
	}

	public List<Materia> getCursadaActual() {
		return cursadaActual;
	}

	public void setCursadaActual(List<Materia> cursada) {
		this.cursadaActual = cursada;
	}

	public String actualizar() {
		System.out.println("Guardando cursada actual....");
		return null;
	}

	public String saveCursada() {
		getMateriaService().setCursada(cursadaActual, usuarioBean.getUsr(),
				tipoCursada);
		return null;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public List<Tipo_Cursada> getTiposCursada() {
		return tiposCursada;
	}

	public void setTiposCursada(List<Tipo_Cursada> tiposCursada) {
		this.tiposCursada = tiposCursada;
	}

	public Tipo_Cursada getTipoCursada() {
		return tipoCursada;
	}

	public void setTipoCursada(Tipo_Cursada tipoCursada) {
		this.tipoCursada = tipoCursada;
	}

	public void initializeMateriasCursables() {
		List<Materia> materias = getAllMaterias();
		if (materias.size() > 0) {
			materiasCursables = new ArrayList<Materia>();
			for (Materia materia : materias) {
				for (Cursada cur : materia.getCursadas()) {
					for (Examen ex : cur.getExamenes()) {
						if (ex.getNota() >= 4
								&& ex.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.FINAL
										.getValue()) {
							materiasCursables.addAll(materia
									.getMateriasCoRelativas());
						}
					}
				}
				if (materia.getMateriasPreRelativas().isEmpty()) {
					materiasCursables.add(materia);
				}
			}
		}
	}

	public List<Dia> getDias() {
		return dias;
	}

	public void setDias(List<Dia> dias) {
		this.dias = dias;
	}

	public List<Fecha_Cursada> getPresentismos() {
		return presentismos;
	}

	public void setPresentismos(List<Fecha_Cursada> presentismos) {
		this.presentismos = presentismos;
	}

	public List<Fecha_Cursada> getPresentismosSeleccionados() {
		return presentismosSeleccionados;
	}

	public void setPresentismosSeleccionados(
			List<Fecha_Cursada> presentismosSeleccionados) {
		this.presentismosSeleccionados = presentismosSeleccionados;
	}
}
