package com.uai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {

	private int idUsuario;
	private String usuario;
	private String password;
	private Tipo_Usuario tipo_Usuario;
	private Plann plan;
	
	public Usuario(){}
	
	@Id
	@GeneratedValue
    @Column(name="idUsuario", unique = true, nullable = false)
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	@ManyToOne
	@JoinColumn(name="idTipoUsuario")
	public Tipo_Usuario getTipo_Usuario() {
		return tipo_Usuario;
	}

	public void setTipo_Usuario(Tipo_Usuario tipo_Usuario) {
		this.tipo_Usuario = tipo_Usuario;
	}

	@ManyToOne
	@JoinColumn(name="idPlan")
	public Plann getPlan() {
		return plan;
	}

	public void setPlan(Plann plan) {
		this.plan = plan;
	}
}
