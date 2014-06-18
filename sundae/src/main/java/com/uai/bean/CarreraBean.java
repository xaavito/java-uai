package com.uai.bean;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;

import com.uai.model.Carrera;
import com.uai.model.Cursada;
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
    
    private Cursada cursada;
    private List<Cursada> materiasFull;
    
    private Carrera mCarrera;
    private List<Carrera> misCarreras;
    
    private Carrera nCarrera;
    private List<Carrera> allCarreras;
    
    public CarreraBean() { 
    	System.out.println("INIT DE CARRERA BEAN");
    }  
    
    public String getInitialize() {
    	System.out.println("INICILIZANDO Carreras Bean!!!!!-----------------------------------");
    		setMisCarreras(getCarreraService().getMisCarreras(usuarioBean.getUsr()));
    		setAllCarreras(getCarreraService().getAllCarreras());
    	
    	return null;
    }
    
    public String getInitializeMisMaterias() {
    	System.out.println("INICILIZANDO MATERIAS!!!!!-----------------------------------");
    		setMateriasFull(getCarreraService().getMisMaterias(usuarioBean.getUsr()));
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

	public Carrera getmCarrera() {
		return mCarrera;
	}

	public void setmCarrera(Carrera mCarrera) {
		this.mCarrera = mCarrera;
	}
	
	public String nuevaCarrera() {
        try {
        	getCarreraService().nuevaCarrera(getnCarrera());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }   
 
        return null;
    }

	public List<Cursada> getMateriasFull() {
		return materiasFull;
	}

	public void setMateriasFull(List<Cursada> materiasFull) {
		this.materiasFull = materiasFull;
	}

	public Cursada getCursada() {
		return cursada;
	}

	public void setCursada(Cursada cursada) {
		this.cursada = cursada;
	}
	
	public String getRefrescarNotas() {
    	System.out.println("refrescando MATERIAS!!!!!-----------------------------------");
    	setMisCarreras(getCarreraService().getMisCarreras(usuarioBean.getUsr()));
    	return null;
    }
}
