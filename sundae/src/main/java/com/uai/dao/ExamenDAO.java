package com.uai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Cursada;
import com.uai.model.Examen;
import com.uai.model.Tipo_Examen;
import com.uai.model.Usuario;

@Named("examenDAO")
public class ExamenDAO implements IExamenDAO {

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
	public List<Examen> getMisExamenes(Usuario usr) {
		List<Examen> examenes = new ArrayList<Examen>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"select ex from Examen as ex "
						+ "where ex.cursada.usuario = :usr");

		query.setEntity("usr", usr);

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			examenes.add((Examen) obj);
		}

		return examenes;
	}

	@Transactional
	public List<Cursada> getCursadaActual(Usuario usr) {
		List<Cursada> cursada = new ArrayList<Cursada>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"select cur from Cursada as cur " + "where cur.usuario = :usr");

		query.setEntity("usr", usr);

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			cursada.add((Cursada) obj);
		}
		return cursada;
	}

	@Transactional
	public List<Tipo_Examen> getTiposExamen() {
		List<Tipo_Examen> tiposExamen = new ArrayList<Tipo_Examen>();
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from Tipo_Examen");

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			tiposExamen.add((Tipo_Examen) obj);
		}
		return tiposExamen;
	}

	@Transactional
	public void saveExamen(Cursada cursada) {
		getSessionFactory().getCurrentSession().save(cursada);
	}

}
