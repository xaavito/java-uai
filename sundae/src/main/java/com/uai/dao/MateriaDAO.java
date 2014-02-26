package com.uai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Materia;
import com.uai.model.Usuario;

@Named("materiaDAO")
public class MateriaDAO implements IMateriaDAO{

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
     * @param SessionFactory - Hibernate Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Transactional
	public List<Materia> getMaterias(Usuario usr) {
    	List<Materia> materias = new ArrayList<Materia>();
		Query query = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select distinct(ex.cursada.materia) from Examen as ex " +
						"where ex.cursada.usuario = :usr");

		query.setEntity("usr", usr);

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			materias.add((Materia) obj);
		}

		return materias;
	}
    
    @Transactional
	public List<Materia> getAllMaterias(Usuario usr) {
    	List<Materia> materias = new ArrayList<Materia>();
		Query query = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"from Materia as mat where mat.plan.idPlan = :plan");

		query.setInteger("plan", usr.getPlan().getIdPlan());

		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object obj : list) {
			materias.add((Materia) obj);
		}

		return materias;
	}

}
