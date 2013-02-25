package com.uai.usuario.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.uai.model.Usuario;
import com.uai.usuario.dao.IUsuarioDAO;

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
