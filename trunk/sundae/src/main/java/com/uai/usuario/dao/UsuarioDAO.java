package com.uai.usuario.dao;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

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
		
		List list = query.list();
		for (Object user : list) {
			usuario = (Usuario)user;
		}
		/*
		for(Iterator it=query.iterate();it.hasNext();) {
			 usuario = (Usuario)it.next();
		}
		*/
    	//List<Usuario> result = (List<Usuario>) getSessionFactory().getCurrentSession().createQuery("from Usuario").list();
		return usuario;
	}
}
