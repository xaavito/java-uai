package com.uai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Examen;
import com.uai.model.Usuario;

@Named("examenDAO")
public class ExamenDAO implements IExamenDAO{

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
		Query query = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select ex from Examen as ex " +
						"where ex.cursada.usuario = :usr");

		//query.setInteger("usr", usr.getIdUsuario());
		query.setEntity("usr", usr);

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			examenes.add((Examen) obj);
		}

		return examenes;
	}

}
