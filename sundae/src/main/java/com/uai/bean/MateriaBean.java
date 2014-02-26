package com.uai.bean;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.model.Materia;
import com.uai.service.IMateriaService;

@Named("materiaBean")
@Scope("session")
public class MateriaBean {
	//Spring User Service is injected...
    @Inject
    @Named("materiaService")
    IMateriaService materiaService;
    
    @Inject
    @Named("usuarioBean")
    UsuarioBean usuarioBean;
    
    //private Examen examen;
    private List<Materia> materias;
    private List<Materia> allMaterias;
    
    public MateriaBean() { 
    	System.out.println("cococo");
    }  
    
    public String getInitializeMaterias() {
    	System.out.println("INICILIZANDO Examenes!!!!!-----------------------------------");
    	setMaterias(getMateriaService().getMaterias(usuarioBean.getUsr()));
    	setAllMaterias(getMateriaService().getAllMaterias(usuarioBean.getUsr()));
    	for (Materia mat : materias) {
    		for (Materia mat2 : mat.getMateriasCoRelativas()) {
    			System.out.println(mat2.getNombre());
				
			}
		}
    	return null;
    }
    
    public IMateriaService getMateriaService() {
        return materiaService;
    }
 
    @Autowired
    public void setMateriaService(IMateriaService materiaService) {
        this.materiaService = materiaService;
    }

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public List<Materia> getAllMaterias() {
		return allMaterias;
	}

	public void setAllMaterias(List<Materia> allMaterias) {
		this.allMaterias = allMaterias;
	}
}
