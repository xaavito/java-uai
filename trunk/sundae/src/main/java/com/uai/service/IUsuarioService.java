package com.uai.service;

import com.uai.model.Usuario;

public interface IUsuarioService {
	
	public Usuario login(String usr, String pass);

	public Usuario crearUsuario(String name, String pass);

}
