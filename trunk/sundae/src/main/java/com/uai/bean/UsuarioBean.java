package com.uai.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.uai.service.IUsuarioService;

@Named("usuarioBean")
@Scope("session")
@Component
public class UsuarioBean extends BaseBean implements Serializable {

	
    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";
 
    static Logger log = Logger.getLogger(UsuarioBean.class.getName());
    
    //Spring User Service is injected...
    @Inject
    @Named("usuarioService")
    IUsuarioService userService;
 
    private int id;
    private String name;
    private String pass;
    
    @SuppressWarnings("unused")
	private int idUsuario;
    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private String password;
    @SuppressWarnings("unused")
	private String tipo;
    
    public UsuarioBean(){
    	//System.out.println(getUserService());
    }
    /**
     * Add User
     *
     * @return String - Response Message
     */
    public String login() {
        try {
            setUsr(getUserService().login(getName(), getPass()));
            if (getUsr() != null) {
            	log.info(getUsr().getUsuario() + " conectado existosamente");
            	return SUCCESS;
            }
            else {
            	return ERROR;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        }   
 
        return ERROR;
    }
    
    /**
     * Reset Fields
     *
     */
    public void reset() {
        this.setId(0);
        this.setName("");
        this.setPass("");
    }
 
     /**
     * Get User Service
     *
     * @return IUserService - User Service
     */
    public IUsuarioService getUserService() {
        return userService;
    }
 
    /**
     * Set User Service
     *
     * @param IUserService - User Service
     */
    @Autowired
    public void setUserService(IUsuarioService userService) {
        this.userService = userService;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String initializeMisDatos() {
    	//System.out.println("INICILIZANDO Mis Datos - Usuario Bean!!!!!-----------------------------------");
    	log.info("INICILIZANDO Mis Datos - Usuario Bean!!!!!-----------------------------------");
    	
    	/*
    	if (null == getMisCarreras()) {
    		setMisCarreras(getCarreraService().getMisCarreras(usuarioBean.getUsr()));
    	}
    	if (null == getAllCarreras()) {
    		setAllCarreras(getCarreraService().getAllCarreras());
    	}
    	*/
    	return null;
    }
	
	public int getIdUsuario() {
		return getUsr().getIdUsuario();
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return getUsr().getUsuario();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return getUsr().getPassword();
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return getUsr().getTipo_Usuario().getDescripcion();
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String crearUsuario() {
        try {
        	setUsr(getUserService().crearUsuario(getName(), getPass()));
            if (getUsr() != null) {
            	log.info(getUsr().getUsuario() + " conectado existosamente");
            	return SUCCESS;
            }
            else {
            	return ERROR;
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        }   
 
        return ERROR;
    }
}
