package com.uai.service;

import java.util.Date;
import java.util.List;

import com.uai.model.Cursada;
import com.uai.model.Examen;
import com.uai.model.Tipo_Examen;
import com.uai.model.Usuario;

public interface IExamenService {

	public List<Examen> getExamenes(Usuario usr);

	public List<Cursada> getCursadaActual(Usuario usr);

	public void saveExamen(Cursada cursada, Usuario usr,
			Date fecha, Tipo_Examen tipoExamen);

	public List<Tipo_Examen> getTiposExamen();

}
