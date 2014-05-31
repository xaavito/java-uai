package com.uai.bean;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Cursada;
import com.uai.model.Examen;
import com.uai.model.Tipo_Examen;
import com.uai.service.IExamenService;

@Named("examenBean")
@Scope("session")
public class ExamenBean {
	// Spring User Service is injected...
	@Inject
	@Named("examenService")
	IExamenService examenService;

	@Inject
	@Named("usuarioBean")
	UsuarioBean usuarioBean;

	private List<Examen> examenes;
	private Cursada cursada;
	private List<Cursada> cursadaActual;
	private Date fecha;
	private List<Tipo_Examen> tiposExamen;
	private Tipo_Examen tipoExamen;
	private Examen examen;
	private int nota;

	public ExamenBean() {
		System.out.println("EXAMEN BEAN!");
	}

	public String getInitializeMisExamenes() {
		System.out
				.println("INICILIZANDO Mis Examenes!!!!!-----------------------------------");
		if (null == getExamenes()) {
			setExamenes(getExamenService().getExamenes(usuarioBean.getUsr()));
		}
		if (null == getCursadaActual()) {
			setCursadaActual(getExamenService().getCursadaActual(
					usuarioBean.getUsr()));
		}

		if (null == getTiposExamen()) {
			setTiposExamen(getExamenService().getTiposExamen());
		}

		return null;
	}

	public String getInitializeExamenes() {
		System.out
				.println("INICILIZANDO Mis Examenes!!!!!-----------------------------------");
		if (null == getExamenes()) {
			setExamenes(getExamenService().getExamenes(usuarioBean.getUsr()));
		}

		return null;
	}

	public String getRefrescarExamanes() {
		System.out
				.println("REFRESCANDO Mis Examenes!!!!!-----------------------------------");

		setExamenes(getExamenService().getExamenes(usuarioBean.getUsr()));

		return null;
	}

	public String getRefrescarCursada() {
		System.out
				.println("REFRESCANDO Cursada!!!!!-----------------------------------");

		setCursadaActual(getExamenService().getCursadaActual(
				usuarioBean.getUsr()));

		return null;
	}

	public IExamenService getExamenService() {
		return examenService;
	}

	@Autowired
	public void setExamenService(IExamenService examenService) {
		this.examenService = examenService;
	}

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	public Cursada getCursada() {
		return cursada;
	}

	public void setCursada(Cursada cursada) {
		this.cursada = cursada;
	}

	public List<Cursada> getCursadaActual() {
		return cursadaActual;
	}

	public void setCursadaActual(List<Cursada> cursadaActual) {
		this.cursadaActual = cursadaActual;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String saveExamen() {
		System.out.println("GUARDANDO NUEVO EXAMEN!");
		getExamenService().saveExamen(cursada, usuarioBean.getUsr(), fecha,
				tipoExamen);
		return null;
	}

	public String saveNota() {
		System.out.println("GUARDANDO NOTA NUEVO EXAMEN!");
		getExamenService().saveNota(examen, usuarioBean.getUsr(), nota);
		return null;
	}

	public List<Tipo_Examen> getTiposExamen() {
		return tiposExamen;
	}

	public void setTiposExamen(List<Tipo_Examen> tiposExamen) {
		this.tiposExamen = tiposExamen;
	}

	public Tipo_Examen getTipoExamen() {
		return tipoExamen;
	}

	public void setTipoExamen(Tipo_Examen tipoExamen) {
		this.tipoExamen = tipoExamen;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
