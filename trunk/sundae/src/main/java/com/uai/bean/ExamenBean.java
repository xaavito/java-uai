package com.uai.bean;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Examen;
import com.uai.service.IExamenService;

@Named("examenBean")
@Scope("session")
public class ExamenBean {
	//Spring User Service is injected...
    @Inject
    @Named("examenService")
    IExamenService examenService;
    
    @Inject
    @Named("usuarioBean")
    UsuarioBean usuarioBean;
    
    //private Examen examen;
    private List<Examen> examenes;
    
    public ExamenBean() { 
    	System.out.println("cococo");
    }  
    
    public String getInitializeMisExamenes() {
    	System.out.println("INICILIZANDO Examenes!!!!!-----------------------------------");
    	setExamenes(getExamenService().getExamenes(usuarioBean.getUsr()));
    	return null;
    }
    
    public IExamenService getExamenService() {
        return examenService;
    }
 
    @Autowired
    public void setExamenService(IExamenService carreraService) {
        this.examenService = carreraService;
    }

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}
}
