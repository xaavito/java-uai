package com.uai.service;

import java.util.List;

import com.uai.model.Materia;
import com.uai.model.Tipo_Cursada;
import com.uai.model.Usuario;

public interface IMateriaService {

	List<Materia> getMaterias(Usuario usr);

	List<Materia> getAllMaterias(Usuario usr);

	void setCursada(List<Materia> cursadaActual, Usuario usuario, Tipo_Cursada tipoCursada);

	List<Tipo_Cursada> getTiposCursadas();

	List<Materia> getCursadaActual(Usuario usuario);
}
