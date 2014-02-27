package com.uai.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IMateriaDAO;
import com.uai.model.Materia;
import com.uai.model.Usuario;

@Named("materiaService")
public class MateriaService implements IMateriaService{

	@Inject
	@Named("materiaDAO")
	IMateriaDAO materiaDAO;
	
	public List<Materia> getMaterias(Usuario usr) {
		return materiaDAO.getMaterias(usr);
	}

	public List<Materia> getAllMaterias(Usuario usr) {
		return materiaDAO.getAllMaterias(usr);
	}
}
