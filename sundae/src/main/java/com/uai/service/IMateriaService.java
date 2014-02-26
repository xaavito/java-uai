package com.uai.service;

import java.util.List;

import com.uai.model.Materia;
import com.uai.model.Usuario;

public interface IMateriaService {

	List<Materia> getMaterias(Usuario usr);

	List<Materia> getAllMaterias(Usuario usr);

}
