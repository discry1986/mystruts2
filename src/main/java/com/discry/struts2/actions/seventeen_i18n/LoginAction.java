package com.discry.struts2.actions.seventeen_i18n;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zhoujp1 on 2017-02-01.
 */
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

    public String login(){
        String[] args = {username};
        String msg = this.getText("page.welcome.msg",args);
        System.out.println(msg);
        return SUCCESS;
    }
}
