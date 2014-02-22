package com.uai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tipo_Usuario {

	private int idTipoUsuario;
	private String descripcion;
	private List<Usuario> usuarios;
	
	public Tipo_Usuario(){}
	
	@Id
	@GeneratedValue
    @Column(name="idTipoUsuario", unique = true, nullable = false)
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	@Column(name="descripcion", unique = true, nullable = false)
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@OneToMany(mappedBy="tipo_Usuario")
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
