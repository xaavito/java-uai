package com.uai.usuario.dao;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.uai.model.Usuario;

public class UsuarioDAO implements IUsuarioDAO{

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
    
	public Usuario login(String usr, String pass) {
		Query query = getSessionFactory().getCurrentSession().createQuery("select COUNT(*) from usuario where usuario = :usuario and password = :password");
		query.setParameter("usuario", usr);
		query.setParameter("password", pass);
		
		for(Iterator it=query.iterate();it.hasNext();) {
			 Object[] row = (Object[]) it.next();
			 System.out.println("ID: " + row[0]);
			 System.out.println("Name: " + row[1]);
			 System.out.println("Amount: " + row[2]);
		}
		return null;
	}

}
