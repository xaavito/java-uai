package com.uai.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.uai.model.Usuario;
import com.uai.usuario.service.IUsuarioService;


@ManagedBean(name="userMB")
@RequestScoped
public class UsuarioBean implements Serializable {

	
    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";
 
    //Spring User Service is injected...
    @ManagedProperty(value="#{UsuarioService}")
    IUsuarioService userService;
 
    private int id;
    private String name;
    private String pass;
 
    /**
     * Add User
     *
     * @return String - Response Message
     */
    public String login() {
        try {
            Usuario user = null;
            user = getUserService().login(getName(), getPass());
            return SUCCESS;
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
}
