package com.uai.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;

import com.uai.model.Usuario;
import com.uai.service.IUsuarioService;

@Named("usuarioBean")
@Scope("session")
public class UsuarioBean extends BaseBean implements Serializable {

	
    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";
 
    //Spring User Service is injected...
    @Inject
    @Named("usuarioService")
    IUsuarioService userService;
 
    private int id;
    private String name;
    private String pass;
 
    Usuario user = null;
    /**
     * Add User
     *
     * @return String - Response Message
     */
    public String login() {
        try {
            setUsr(getUserService().login(getName(), getPass()));
            if (getUsr() != null) {
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
    
    public String buscar() {
        return "searchUser.xhtml?faces-redirect=true";
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
}
