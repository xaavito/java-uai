package com.uai.bean;

import java.io.Serializable;

import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.uai.model.Usuario;

@Named("baseBean")
@Scope("session")
@Component
public class BaseBean implements Serializable{
	
	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = -6040881424053253915L;
	private Usuario usr;
	
	static Logger log = Logger.getLogger(BaseBean.class.getName());

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		this.usr = usr;
	}
}
