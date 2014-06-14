package com.uai.dao;

import com.uai.model.Usuario;

public interface IUsuarioDAO {

	public Usuario login(String usr, String pass);

	public Usuario crearUsuario(String name, String pass);
}
