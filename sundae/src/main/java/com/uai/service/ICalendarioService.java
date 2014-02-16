package com.uai.service;

import java.util.Date;
import java.util.List;

import com.uai.model.Calendario;
import com.uai.model.Usuario;

public interface ICalendarioService {

	public List<Calendario> getItemsCalendario(Date fechaInicio, Date fechaFinal, Usuario usr);
}
