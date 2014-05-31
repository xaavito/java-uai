package com.uai.dao;

import java.util.List;

import com.uai.model.Cursada;
import com.uai.model.Examen;
import com.uai.model.Tipo_Examen;
import com.uai.model.Usuario;

public interface IExamenDAO {

	List<Examen> getMisExamenes(Usuario usr);

	List<Cursada> getCursadaActual(Usuario usr);

	List<Tipo_Examen> getTiposExamen();

	void saveExamen(Examen ex);

	void updateExamen(Examen examen);

}
