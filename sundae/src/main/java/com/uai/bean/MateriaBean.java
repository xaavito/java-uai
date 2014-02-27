package com.uai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.uai.estatico.Tipo_Examen_Enum;
import com.uai.model.Cursada;
import com.uai.model.Examen;
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
    private List<Materia> materiasCursables;
    
    public MateriaBean() { 
    	System.out.println("cococo");
    }  
    
    public String getInitializeMaterias() {
    	System.out.println("INICILIZANDO Examenes!!!!!-----------------------------------");
    	setMaterias(getMateriaService().getMaterias(usuarioBean.getUsr()));
    	setAllMaterias(getMateriaService().getAllMaterias(usuarioBean.getUsr()));
    	List<Materia> materias = getAllMaterias();
    	if (materias.size() > 0) {
    		materiasCursables = new ArrayList<Materia>();
    		for (Materia materia : materias) {
				for (Cursada cur : materia.getCursadas()) {
					for (Examen ex : cur.getExamenes()) {
						if (ex.getNota() >= 4 && ex.getTipoExamen().getIdTipoExamen() == Tipo_Examen_Enum.FINAL.getValue()) {
							materiasCursables.add(materia);
						}
					}
				} 
				if (materia.getMateriasPreRelativas().isEmpty()) {
					materiasCursables.add(materia);
	    		}
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

	public List<Materia> getMateriasCursables() {
		return materiasCursables;
	}

	public void setMateriasCursables(List<Materia> materiasCursables) {
		this.materiasCursables = materiasCursables;
	}
}
