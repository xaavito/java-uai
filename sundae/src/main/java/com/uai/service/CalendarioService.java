package com.uai.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.ICalendarioDAO;
import com.uai.model.Calendario;
import com.uai.model.Usuario;

@Named("calendarioService")
public class CalendarioService implements ICalendarioService{

	@Inject
	@Named("calendarioDAO")
	ICalendarioDAO calendarioDAO;
	
	public List<Calendario> getItemsCalendario(Date fechaInicio,
			Date fechaFinal, Usuario usr) {
		// TODO Auto-generated method stub
		return null;
	}

}
