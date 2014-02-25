package com.uai.dao;

import java.util.Date;
import java.util.List;

import com.uai.model.Examen;
import com.uai.model.Usuario;

public interface ICalendarioDAO {
	public List<Examen> getItemsCalendario(Date fechaInicio, Date fechaFinal, Usuario usr);
}
