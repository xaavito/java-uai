package com.uai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Carrera;
import com.uai.model.Usuario;

@Named("carreraDAO")
public class CarreraDAO implements ICarreraDAO {

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
	public List<Carrera> getMisCarreras(Usuario usr) {
		List<Carrera> carreras = new ArrayList<Carrera>();
		Query query = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select cur.materia.plan.carrera from Cursada as cur " +
						"where cur.usuario = :usr");

		query.setEntity("usr", usr);

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			carreras.add((Carrera) obj);
		}

		return carreras;
	}

	@Transactional
	public List<Carrera> getAllCarreras() {
		List<Carrera> carreras = new ArrayList<Carrera>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from Carrera");

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			carreras.add((Carrera) obj);
		}

		return carreras;
	}
}
