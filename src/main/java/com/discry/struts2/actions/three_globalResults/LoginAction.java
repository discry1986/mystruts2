package com.discry.struts2.actions.three_globalResults;

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

    public String login(){
        if(username.equalsIgnoreCase("zhoujp1"))
            return "success";
        else
            return "fail";
    }
}
