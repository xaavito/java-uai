package com.uai.bean;

import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("navigationBean")
@Scope("session")
public class NavigationBean {

    private String pageName="test";

    public NavigationBean() {
    }

    public void doNav() {
    	System.out.println("Hello");
        String str = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("test");
        this.pageName = str;
    }

    public String getPageName() {
        return pageName;
    }

    public void miCarrera() {
    	System.out.println("Hello");
        String str = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("miCarrera");
        this.pageName = "miCarrera";
        //return "miCarrera.xhtml?faces-redirect=true";
    }
    
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
}
