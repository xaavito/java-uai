package com.uai.dao;

import java.util.List;

import com.uai.model.Examen;
import com.uai.model.Usuario;

public interface IExamenDAO {

	List<Examen> getMisExamenes(Usuario usr);

}
