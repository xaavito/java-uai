package com.uai.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Calendario;
import com.uai.model.Usuario;

@Named("calendarioDAO")
public class CalendarioDAO implements ICalendarioDAO {

	@Inject
	@Named("baseSession")
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory
	 *            - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Calendario> getItemsCalendario(Date fechaInicio,
			Date fechaFinal, Usuario usr) {
		List<Calendario> lista = new ArrayList<Calendario>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from Cursada as Cursada, Dia_Cursada as Dia_Cursada, Fecha_Cursada as Fecha_Cursada where Cursada.idCursada = Dia_Cursada.cursada and Fecha_Cursada.dia_Cursada = Dia_Cursada.idDiaCursada and Cursada.usuario = :usr and Fecha_Cursada.fecha between :inicio and :fin");
		
		query.setEntity("usr", usr);
		
		query.setDate("inicio", fechaInicio);
		query.setDate("fin", fechaFinal);
		List list = query.list();
		for (Object user : list) {
			user.toString();
		}
		
		return lista;
	}
}
