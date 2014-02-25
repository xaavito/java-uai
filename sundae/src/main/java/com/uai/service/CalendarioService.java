package com.uai.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.ICalendarioDAO;
import com.uai.model.Examen;
import com.uai.model.Usuario;

@Named("calendarioService")
public class CalendarioService implements ICalendarioService{

	@Inject
	@Named("calendarioDAO")
	ICalendarioDAO calendarioDAO;
	
	public List<Examen> getItemsCalendario(Date fechaInicio,
			Date fechaFinal, Usuario usr) {
		return calendarioDAO.getItemsCalendario(fechaInicio, fechaFinal, usr);
	}

}
