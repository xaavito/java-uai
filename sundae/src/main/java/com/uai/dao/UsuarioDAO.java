package com.uai.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Plann;
import com.uai.model.Tipo_Usuario;
import com.uai.model.Usuario;

@Named("usuarioDAO")
public class UsuarioDAO implements IUsuarioDAO{

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
	public Usuario login(String usr, String pass) {
		Usuario usuario = null;
    	Query query = getSessionFactory().getCurrentSession().createQuery("from Usuario where usuario = :usr and password = :pass");
		query.setString("usr", usr);
		query.setString("pass", pass);
		
		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object user : list) {
			usuario = (Usuario)user;
		}
		return usuario;
	}

    @Transactional
	public Usuario crearUsuario(String name, String pass) {
    	Usuario usr = new Usuario();
    	usr.setUsuario(name);
    	usr.setPassword(pass);
    	usr.setTipo_Usuario(getDefaultTipoUsuario());
    	usr.setPlan(getDefaultPlan());
    	getSessionFactory().getCurrentSession().save(usr);
    	
		return login(name, pass);
	}
    
    @Transactional
    public Tipo_Usuario getDefaultTipoUsuario() {
    	Tipo_Usuario tipoUsuario = null;
    	Query query = getSessionFactory().getCurrentSession().createQuery("from Tipo_Usuario tp where tp.idTipoUsuario = 2");
		
		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object user : list) {
			tipoUsuario = (Tipo_Usuario)user;
		}
		return tipoUsuario;
	}
    
    @Transactional
    public Plann getDefaultPlan() {
    	Plann plan = null;
    	Query query = getSessionFactory().getCurrentSession().createQuery("from Plann p where p.idPlan = 1");
		
		@SuppressWarnings("rawtypes")
		List list = query.list();
		for (Object user : list) {
			plan = (Plann)user;
		}
		return plan;
	}
}
