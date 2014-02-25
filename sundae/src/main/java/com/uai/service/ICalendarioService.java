package com.uai.service;

import java.util.Date;
import java.util.List;

import com.uai.model.Examen;
import com.uai.model.Usuario;

public interface ICalendarioService {

	public List<Examen> getItemsCalendario(Date fechaInicio, Date fechaFinal, Usuario usr);
}
