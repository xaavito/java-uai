package com.uai.bean;

import javax.faces.context.FacesContext;
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
	//DEFAULT
	private String pageName = "misMaterias";
	
	public NavigationBean() {
	}

	static Logger log = Logger.getLogger(NavigationBean.class.getName());

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageName() {
		return pageName;
	}

	//CARRERA
	public void nuevaCarrera() {
		log.info("llamando NUEVA CARRERA");
		this.pageName = "nuevaCarrera";
	}
	
	//MATERIAS
	
	public void materias() {
		log.info("llamando a MATERIAS");
		this.pageName = "materias";
	}

	public void misMaterias() {
		log.info("llamando a MIS MATERIAS");
		this.pageName = "misMaterias";
	}
	
	public void notas() {
		log.info("llamando a NOTAS");
		this.pageName = "notas";
	}
	
	public void presentismo() {
		log.info("llamando a PRESENTISMO");
		this.pageName = "presentismo";
	}

	//EXAMENES
	
	public void agregarExamenes() {
		log.info("llamando a AGREGAR EXAMENES");
		this.pageName = "agregarExamenes";
	}
	
	//CURSADA
	public void cursada() {
		log.info("llamando A CURSADA");
		this.pageName = "cursada";
	}
	
	//MIS DATOS
	
	public void misDatos() {
		log.info("llamando a MIS DATOS");
		this.pageName = "misDatos";
	}

	public String salir() {
		log.info("llamando a SALIR");
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "index.xhtml?faces-redirect=true";
	}
	
	public String registrarse() {
		log.info("llamando a registrarse");
		return "registro.xhtml";
	}
}
