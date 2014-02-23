package com.uai.service;

import java.util.List;

import com.uai.model.Carrera;
import com.uai.model.Usuario;

public interface ICarreraService {

	List<Carrera> getMisCarreras(Usuario usr);

	List<Carrera> getAllCarreras();

}
