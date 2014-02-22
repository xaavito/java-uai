package com.uai.model;

import java.util.List;

public class Materia_Correlatividad {
	private int idMateriaPrevia;
	private int idMateriaPost;
	private List<Materia> pre;
	private List<Materia> post;
	
	public Materia_Correlatividad(){}

	public int getIdMateriaPrevia() {
		return idMateriaPrevia;
	}

	public void setIdMateriaPrevia(int idMateriaPrevia) {
		this.idMateriaPrevia = idMateriaPrevia;
	}

	public int getIdMateriaPost() {
		return idMateriaPost;
	}

	public void setIdMateriaPost(int idMateriaPost) {
		this.idMateriaPost = idMateriaPost;
	}

	//@ManyToMany(mappedBy="materiasPreRelativas")
	public List<Materia> getPre() {
		return pre;
	}

	public void setPre(List<Materia> pre) {
		this.pre = pre;
	}

	//@ManyToMany(mappedBy="materiasPostRelativas")
	public List<Materia> getPost() {
		return post;
	}

	public void setPost(List<Materia> post) {
		this.post = post;
	}
}
