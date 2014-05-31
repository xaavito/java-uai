package com.uai.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IExamenDAO;
import com.uai.model.Cursada;
import com.uai.model.Examen;
import com.uai.model.Tipo_Examen;
import com.uai.model.Usuario;

@Named("examenService")
public class ExamenService implements IExamenService{

	@Inject
	@Named("examenDAO")
	IExamenDAO examenDAO;
	
	public List<Examen> getExamenes(Usuario usr) {
		return examenDAO.getMisExamenes(usr);
	}

	public List<Cursada> getCursadaActual(Usuario usr) {
		return examenDAO.getCursadaActual(usr);
	}

	public void saveExamen(Cursada cursada, Usuario usr, Date fecha, Tipo_Examen tipoExamen) {
		Examen ex = new Examen();
		ex.setFecha(fecha);
		ex.setTipoExamen(tipoExamen);
		ex.setCursada(cursada);
		examenDAO.saveExamen(ex);
	}

	public List<Tipo_Examen> getTiposExamen() {
		return examenDAO.getTiposExamen();
	}

	public void saveNota(Examen examen, Usuario usr, int nota) {
		examen.setNota(nota);
		examenDAO.updateExamen(examen);
	}
}
