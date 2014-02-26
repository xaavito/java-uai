package com.uai.dao;

import java.util.List;

import com.uai.model.Materia;
import com.uai.model.Usuario;

public interface IMateriaDAO {

	List<Materia> getMaterias(Usuario usr);

	List<Materia> getAllMaterias(Usuario usr);
}
