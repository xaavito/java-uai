package com.uai.dao;

import java.util.List;

import com.uai.model.Carrera;
import com.uai.model.Cursada;
import com.uai.model.Usuario;

public interface ICarreraDAO {

	List<Carrera> getMisCarreras(Usuario usr);

	List<Carrera> getAllCarreras();

	int nuevaCarrera(Carrera getnCarrera);

	List<Cursada> getMisMaterias(Usuario usr);

}
