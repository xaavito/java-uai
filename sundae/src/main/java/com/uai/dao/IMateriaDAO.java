package com.uai.dao;

import java.util.List;

import com.uai.model.Cursada;
import com.uai.model.Dia;
import com.uai.model.Dia_Cursada;
import com.uai.model.Fecha_Cursada;
import com.uai.model.Materia;
import com.uai.model.Tipo_Cursada;
import com.uai.model.Usuario;

public interface IMateriaDAO {

	List<Materia> getMaterias(Usuario usr);

	List<Materia> getAllMaterias(Usuario usr);

	void setCursada(List<Cursada> lista);

	List<Tipo_Cursada> getTiposCursadas();

	Tipo_Cursada find(String value);

	List<Materia> getCursadaActual(Usuario usr);

	List<Dia> getDias();

	void setDiasCursada(List<Dia_Cursada> diasCursadas);

	void setFechasCursada(List<Fecha_Cursada> fechasCursadas);
}
