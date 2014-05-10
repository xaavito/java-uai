package com.uai.bean;

import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;

@Named("navigationBean")
@Scope("session")
public class NavigationBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8844844725194400356L;
	private String pageName = "test";

	public NavigationBean() {
	}
	static Logger log = Logger.getLogger(
            NavigationBean.class.getName());
	
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageName() {
		return pageName;
	}

	public void miCarrera() {
		this.pageName = "miCarrera";
		log.info("llamando a Mi Carrera");
		log.error("probando error");
	}

	public void nuevaCarrera() {
		this.pageName = "nuevaCarrera";
	}

	public void buscar() {
		this.pageName = "searchUser";
	}

	public void materias() {
		this.pageName = "materias";
	}

	public void misMaterias() {
		this.pageName = "misMaterias";
	}

	public void examenes() {
		this.pageName = "examenes";
	}

	public void cursada() {
		this.pageName = "cursada";
	}

	public void misDatos() {
		this.pageName = "misDatos";
	}

	public void presentismo() {
		this.pageName = "presentismo";
	}

	public void notas() {
		this.pageName = "notas";
	}

	public void agregarExamenes() {
		this.pageName = "agregarExamenes";
	}

}
