package com.uai.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IMateriaDAO;
import com.uai.model.Cursada;
import com.uai.model.Materia;
import com.uai.model.Tipo_Cursada;
import com.uai.model.Usuario;

@Named("materiaService")
public class MateriaService implements IMateriaService{

	@Inject
	@Named("materiaDAO")
	IMateriaDAO materiaDAO;
	
	public List<Materia> getMaterias(Usuario usr) {
		return materiaDAO.getMaterias(usr);
	}

	public List<Materia> getAllMaterias(Usuario usr) {
		return materiaDAO.getAllMaterias(usr);
	}

	@SuppressWarnings("deprecation")
	public void setCursada(List<Materia> cursadaActual, Usuario usr, Tipo_Cursada tipoCursada) {
		List<Cursada> lista = new ArrayList<Cursada>();
		for (Materia materia : cursadaActual) {
			Cursada curs = new Cursada();
			curs.setMateria(materia);
			curs.setTipo_cursada(tipoCursada);
			curs.setUsuario(usr);
			curs.setFechaInicioCursada(new Date(2014,04,01));
			curs.setFechaFinCursada(new Date(2014,07,01));
			lista.add(curs);
		}
		materiaDAO.setCursada(lista);
	}

	public List<Tipo_Cursada> getTiposCursadas() {
		return materiaDAO.getTiposCursadas();
	}
}
