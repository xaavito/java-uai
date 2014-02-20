package com.uai.bean;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.uai.model.Usuario;

@Named("baseBean")
@Scope("session")
public class BaseBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6040881424053253915L;
	private Usuario usr;

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		this.usr = usr;
	}
}
