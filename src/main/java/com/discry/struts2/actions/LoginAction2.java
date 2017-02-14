package com.discry.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Zhoujp1 on 2017-02-13.
 */
@ParentPackage("struts-default")
@Namespace("/mystruts2/twentyone_strutslabel")
public class LoginAction2 extends ActionSupport {
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

    @Action(value = "loginAction2",results = {@Result(location = "loginAction",type = "redirectAction",params = {"username","%{username}"})})
    public String execute(){
        return SUCCESS;
    }
}
