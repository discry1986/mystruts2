package com.discry.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Zhoujp1 on 2017-02-12.
 */
@ParentPackage("struts-default")
@Namespace("/mystruts2/twentyone_strutslabel")
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Action(results = {@Result(location = "/twentyone_strutslabel/welcome.jsp")},value = "loginAction")
    public String execute(){
        return SUCCESS;
    }
}
