package com.uai.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.dao.IUsuarioDAO;
import com.uai.model.Usuario;

//@Transactional(readOnly = true)
@Named("usuarioService")
public class UsuarioService implements IUsuarioService{
	
	@Inject
	@Named("usuarioDAO")
	IUsuarioDAO userDAO;
	
	//@Transactional(readOnly = false)
	
	public Usuario login(String usr, String pass) {
		return userDAO.login(usr, pass);
	}
}
