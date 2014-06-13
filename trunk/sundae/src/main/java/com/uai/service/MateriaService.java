package com.uai.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IMateriaDAO;
import com.uai.model.Cursada;
import com.uai.model.Dia;
import com.uai.model.Dia_Cursada;
import com.uai.model.Fecha_Cursada;
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

	public void setCursada(List<Materia> cursadaActual, Usuario usr, Tipo_Cursada tipoCursada) {
		List<Cursada> cursada = new ArrayList<Cursada>();
		for (Materia materia : cursadaActual) {
			
			Cursada curs = new Cursada();
			curs.setMateria(materia);
			curs.setTipo_cursada(tipoCursada);
			curs.setUsuario(usr);
			curs.setFechaInicioCursada(new GregorianCalendar(2014, 03, 01).getTime());
			curs.setFechaFinCursada(new GregorianCalendar(2014, 06, 01).getTime());
			cursada.add(curs);
		}
		materiaDAO.setCursada(cursada);
		
		List<Dia_Cursada> diasCursadas = new ArrayList<Dia_Cursada>();
		for (Cursada cur : cursada) {
			Dia_Cursada diaCursada = new Dia_Cursada();
			diaCursada.setDia(cur.getMateria().getDia());
			diaCursada.setCursada(cur);
			
			diasCursadas.add(diaCursada);
		}
		materiaDAO.setDiasCursada(diasCursadas);
		
		List<Fecha_Cursada> fechasCursadas = new ArrayList<Fecha_Cursada>();
		for (Dia_Cursada diaCur : diasCursadas) {
			Date start = diaCur.getCursada().getFechaInicioCursada();
			Calendar cal = Calendar.getInstance();
			cal.setTime(diaCur.getCursada().getFechaInicioCursada());
			cal.add(Calendar.DATE, diaCur.getDia().getIdDia() - 1);
			start = cal.getTime();
			
			while (start.before(diaCur.getCursada().getFechaFinCursada())) {
				Fecha_Cursada fecha = new Fecha_Cursada();
				fecha.setFecha(start);
				fecha.setDia_Cursada(diaCur);
				
				fechasCursadas.add(fecha);
				
				cal = Calendar.getInstance();
				cal.setTime(start);
				cal.add(Calendar.DATE, 7);
				start = cal.getTime();
			}
		}
		materiaDAO.setFechasCursada(fechasCursadas);
	}

	public List<Tipo_Cursada> getTiposCursadas() {
		return materiaDAO.getTiposCursadas();
	}

	public List<Materia> getCursadaActual(Usuario usr) {
		return materiaDAO.getCursadaActual(usr);
	}

	public List<Dia> getDias() {
		return materiaDAO.getDias();
	}

	public List<Fecha_Cursada> getPresentismos() {
		return materiaDAO.getPresentismos();
	}
}
