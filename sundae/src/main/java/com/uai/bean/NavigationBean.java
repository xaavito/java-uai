package com.uai.bean;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("navigationBean")
@Scope("session")
public class NavigationBean extends BaseBean{

    private String pageName="test";

    public NavigationBean() {
    }

    public String getPageName() {
        return pageName;
    }

    public void miCarrera() {
    	this.pageName = "miCarrera";
    }
    
    public void nuevaCarrera() {
    	this.pageName = "nuevaCarrera";
    }
    
    public void buscar() {
    	this.pageName = "searchUser";
    }
    
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
}
