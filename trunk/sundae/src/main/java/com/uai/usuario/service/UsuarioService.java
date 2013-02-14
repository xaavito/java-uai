package com.uai.usuario.service;

import org.springframework.transaction.annotation.Transactional;

import com.uai.model.Usuario;
import com.uai.usuario.dao.IUsuarioDAO;

@Transactional(readOnly = true)
public class UsuarioService implements IUsuarioService{

	IUsuarioDAO userDAO;
	@Transactional(readOnly = false)
	public Usuario login(String usr, String pass) {
		return userDAO.login(usr, pass);
	}
}
