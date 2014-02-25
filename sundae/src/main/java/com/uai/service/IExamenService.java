package com.uai.service;

import java.util.List;

import com.uai.model.Examen;
import com.uai.model.Usuario;

public interface IExamenService {

	public List<Examen> getExamenes(Usuario usr);

}
