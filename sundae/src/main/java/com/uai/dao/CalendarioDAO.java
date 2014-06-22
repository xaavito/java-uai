package com.uai.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Examen;
import com.uai.model.Usuario;

@Named("calendarioDAO")
public class CalendarioDAO implements ICalendarioDAO {

	@Inject
	@Named("sessionFactory")
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
	public List<Examen> getItemsCalendario(Date fechaInicio,
			Date fechaFinal, Usuario usr) {
		List<Examen> lista = new ArrayList<Examen>();
		
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"select ex from Examen as ex " +
						"where ex.cursada.usuario = :usr " +
						"and ex.fecha > :inicio and ex.fecha <:fin");
		
		query.setEntity("usr", usr);
		
		query.setDate("inicio", fechaInicio);
		query.setDate("fin", fechaFinal);
		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			lista.add((Examen)obj);
		}
		
		return lista;
	}
}
