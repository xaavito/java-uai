package com.uai.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Carrera;
import com.uai.service.ICarreraService;

@Named("carreraBean")
@Scope("session")
public class CarreraBean {
	//Spring User Service is injected...
    @Inject
    @Named("carreraService")
    ICarreraService carreraService;
    
    @Inject
    @Named("usuarioBean")
    UsuarioBean usuarioBean;
    
    private Carrera carrera;
    private List<Carrera> misCarreras;
    
    private Carrera nCarrera;
    private List<Carrera> allCarreras;
    
    public CarreraBean() { 
    	System.out.println("cococo");
    }  
    
    public String getInitialize() {
    	setMisCarreras(getCarreraService().getMisCarreras(usuarioBean.getUsr()));
    	setAllCarreras(getCarreraService().getAllCarreras());
    	return null;
    }
    
    public ICarreraService getCarreraService() {
        return carreraService;
    }
 
    @Autowired
    public void setCarreraService(ICarreraService carreraService) {
        this.carreraService = carreraService;
    }

	public List<Carrera> getMisCarreras() {
		return misCarreras;
	}

	public void setMisCarreras(List<Carrera> misCarreras) {
		this.misCarreras = misCarreras;
	}

	public List<Carrera> getAllCarreras() {
		return allCarreras;
	}

	public void setAllCarreras(List<Carrera> allCarreras) {
		this.allCarreras = allCarreras;
	}

	public Carrera getnCarrera() {
		return nCarrera;
	}

	public void setnCarrera(Carrera nCarrera) {
		this.nCarrera = nCarrera;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
}
