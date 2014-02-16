package com.uai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Calendario {
	private int idCalendario;
	private String usuario;
	private String password;
	
	@Id
    @Column(name="idCalendario", unique = true, nullable = false)
	public int getIdUsuario() {
		return idCalendario;
	}
	
	public void setIdUsuario(int idCalendario) {
		this.idCalendario = idCalendario;
	}
	
	@Column(name="usuario", unique = true, nullable = false)
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Column(name="password", unique = true, nullable = false)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
