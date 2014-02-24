package com.uai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Carrera;
import com.uai.model.Cursada;
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
						"select usr.plan.carrera from Usuario as usr " +
						"where usr.idUsuario = :usr");

		query.setInteger("usr", usr.getIdUsuario());

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			carreras.add((Carrera) obj);
		}
		if (carreras.isEmpty()) {
			carreras.add(new Carrera("No tiene carreras"));
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

	public int nuevaCarrera(Carrera getnCarrera) {
		getSessionFactory().getCurrentSession().save(getnCarrera);
		return 1;
	}

	public List<Cursada> getMisMaterias(Usuario usr) {
		List<Cursada> cursadas = new ArrayList<Cursada>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from Cursada where usuario = :usr");

		query.setEntity("usr", usr);
		
		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			cursadas.add((Cursada) obj);
		}

		return cursadas;
	}
}
