package com.uai.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.ICarreraDAO;
import com.uai.model.Carrera;
import com.uai.model.Usuario;

@Named("carreraService")
public class CarreraService implements ICarreraService{

	@Inject
	@Named("carreraDAO")
	ICarreraDAO carreraDAO;
	
	public List<Carrera> getMisCarreras(Usuario usr) {
		return carreraDAO.getMisCarreras(usr);
	}

	public List<Carrera> getAllCarreras() {
		return carreraDAO.getAllCarreras();
	}
}
