package com.discry.struts2.actions.one_login;

/**
 * Created by Zhoujp1 on 2016-11-19.
 */
public class LoginAction {
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

    public String execute(){
        System.out.println("username= "+ username);
        System.out.println("password= "+ password);
        return "success";
    }
}
