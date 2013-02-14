package com.uai.usuario.dao;

import com.uai.model.Usuario;

public interface IUsuarioDAO {

	public Usuario login(String usr, String pass);
}
