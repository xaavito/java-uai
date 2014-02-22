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
				"from Cursada c, Dia_Cursada dc, Fecha_Cursada fc where c.idCursada = dc.idCursada and fc.idDiaCursada = dc.idDiaCursada and c.idUsuario = :usr and fc.fecha between :inicio and :fin");
		
		query.setLong("usr", usr.getIdUsuario());
		query.setDate("inicio", fechaInicio);
		query.setDate("fin", fechaFinal);
		List list = query.list();
		for (Object user : list) {
			user.toString();
		}
		
		return lista;
	}
}
