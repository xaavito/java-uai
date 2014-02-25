package com.uai.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IExamenDAO;
import com.uai.model.Examen;
import com.uai.model.Usuario;

@Named("examenService")
public class ExamenService implements IExamenService{

	@Inject
	@Named("examenDAO")
	IExamenDAO examenDAO;
	
	public List<Examen> getExamenes(Usuario usr) {
		return examenDAO.getMisExamenes(usr);
	}

}
